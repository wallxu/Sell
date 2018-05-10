package com.le.isell.web;

import com.le.isell.entity.CartModel;
import com.le.isell.entity.CartQueryModel;
import com.le.isell.service.CartService;
import com.le.isell.util.json.JsonHelper;
import com.le.isell.util.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/cart")

public class CartController {
	@Autowired
	private CartService cartService;
	
	@RequestMapping(value="toAdd",method=RequestMethod.GET)
	public String toAdd(){
		return "cart/add";
	}

	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("m") CartModel m){
		cartService.create(m);
		return "cart/success";
	}

	@RequestMapping(value="toUpdate/{uuid}",method=RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable("uuid") int uuid){
		CartModel m = cartService.getByUuid(uuid);
		model.addAttribute("m", m);
		return "cart/update";
	}

	@RequestMapping(value="update",method=RequestMethod.POST)
	public String post(@ModelAttribute("m") CartModel m){
		cartService.update(m);
		return "cart/success";
	}

	@RequestMapping(value="toDelete/{uuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("uuid") int uuid){
		CartModel m = cartService.getByUuid(uuid);
		model.addAttribute("m", m);
		return "cart/delete";
	}

	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int uuid){
		cartService.delete(uuid);
		return "cart/success";
	}

	@RequestMapping(value="toList",method=RequestMethod.GET)
	public String toList(@ModelAttribute("cm") CartWebModel cm, Model model){
		CartQueryModel qm = null;
		if(cm.getQueryJsonStr()==null || cm.getQueryJsonStr().trim().length()==0){
			qm =  new CartQueryModel();
		}else{
			String s = cm.getQueryJsonStr();
			s = s.replace("-", "%");
			qm = (CartQueryModel)JsonHelper.str2Object(s, CartQueryModel.class);
		}
		
		qm.getPage().setNowPage(cm.getNowPage());
		if(cm.getPageShow() > 0){
			qm.getPage().setPageShow(cm.getPageShow());
		}
		
		Page dbPage = cartService.getByConditionPage(qm);
		
		//
		model.addAttribute("cm", cm);
		model.addAttribute("page", dbPage);
				
		return "cart/list";
	}

	@RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "cart/query";
	}	
}
