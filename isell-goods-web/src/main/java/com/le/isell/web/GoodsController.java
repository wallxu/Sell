package com.le.isell.web;

import com.le.isell.entity.GoodsModel;
import com.le.isell.entity.GoodsQueryModel;
import com.le.isell.service.GoodsService;
import com.le.isell.util.json.JsonHelper;
import com.le.isell.util.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/goods")
public class GoodsController {
	@Autowired
	private GoodsService iservice;
	
	@RequestMapping(value="toAdd",method=RequestMethod.GET)
	public String toAdd(){
		return "goods/add";
	}

	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("m") GoodsModel m){
		iservice.create(m);
		return "goods/success";
	}

	@RequestMapping(value="toUpdate/{uuid}",method=RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable("uuid") int uuid){
		GoodsModel m = iservice.getByUuid(uuid);
		model.addAttribute("m", m);
		return "goods/update";
	}

	@RequestMapping(value="update",method=RequestMethod.POST)
	public String post(@ModelAttribute("m") GoodsModel m){
		iservice.update(m);
		return "goods/success";
	}

	@RequestMapping(value="toDelete/{uuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("uuid") int uuid){
		GoodsModel m = iservice.getByUuid(uuid);
		model.addAttribute("m", m);
		return "goods/delete";
	}

	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int uuid){
		iservice.delete(uuid);
		return "goods/success";
	}

	@RequestMapping(value="toList",method=RequestMethod.GET)
	public String toList(@ModelAttribute("wm") GoodsWebModel wm, Model model){
		GoodsQueryModel qm = null;
		if(wm.getQueryJsonStr()==null || wm.getQueryJsonStr().trim().length()==0){
			qm =  new GoodsQueryModel();
		}else{
			String s = wm.getQueryJsonStr();
			s = s.replace("-", "%");
			qm = (GoodsQueryModel)JsonHelper.str2Object(s, GoodsQueryModel.class);
		}
		
		qm.getPage().setNowPage(wm.getNowPage());
		if(wm.getPageShow() > 0){
			qm.getPage().setPageShow(wm.getPageShow());
		}
		
		Page dbPage = iservice.getByConditionPage(qm);
		
		//
		model.addAttribute("wm", wm);
		model.addAttribute("page", dbPage);
		return "goods/list";
	}

	@RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "goods/query";
	}	
}
