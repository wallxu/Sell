package com.le.isell.web;

import com.le.isell.entity.OrderDetailModel;
import com.le.isell.entity.OrderDetailQueryModel;
import com.le.isell.service.OrderDetailService;
import com.le.isell.util.json.JsonHelper;
import com.le.isell.util.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/orderDetail")
public class OrderDetailController {
	@Autowired
	private OrderDetailService iservice = null;
	
	@RequestMapping(value="toAdd",method=RequestMethod.GET)
	public String toAdd(){
		return "orderDetail/add";
	}

	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("m") OrderDetailModel m){
		iservice.create(m);
		return "orderDetail/success";
	}

	@RequestMapping(value="toUpdate/{uuid}",method=RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable("uuid") int uuid){
		OrderDetailModel m = iservice.getByUuid(uuid);
		model.addAttribute("m", m);
		return "orderDetail/update";
	}

	@RequestMapping(value="update",method=RequestMethod.POST)
	public String post(@ModelAttribute("m") OrderDetailModel m){
		iservice.update(m);
		return "orderDetail/success";
	}

	@RequestMapping(value="toDelete/{uuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("uuid") int uuid){
		OrderDetailModel m = iservice.getByUuid(uuid);
		model.addAttribute("m", m);
		return "orderDetail/delete";
	}

	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int uuid){
		iservice.delete(uuid);
		return "orderDetail/success";
	}

	@RequestMapping(value="toList",method=RequestMethod.GET)
	public String toList(@ModelAttribute("wm") com.le.isell.web.OrderDetailWebModel wm, Model model){
		OrderDetailQueryModel qm = null;
		if(wm.getQueryJsonStr()==null || wm.getQueryJsonStr().trim().length()==0){
			qm =  new OrderDetailQueryModel();
		}else{
			String s = wm.getQueryJsonStr();
			s = s.replace("-", "%");
			qm = (OrderDetailQueryModel)JsonHelper.str2Object(s, OrderDetailQueryModel.class);
		}
		
		qm.getPage().setNowPage(wm.getNowPage());
		if(wm.getPageShow() > 0){
			qm.getPage().setPageShow(wm.getPageShow());
		}
		
		Page dbPage = iservice.getByConditionPage(qm);
		
		//
		model.addAttribute("wm", wm);
		model.addAttribute("page", dbPage);
		return "orderDetail/list";
	}

	@RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "orderDetail/query";
	}	
}
