package com.le.isell.web;

import com.le.isell.entity.FileModel;
import com.le.isell.entity.FileQueryModel;
import com.le.isell.service.FileService;
import com.le.isell.util.json.JsonHelper;
import com.le.isell.util.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/file")
public class FileController {
	@Autowired
	private FileService iservice = null;
	
	@RequestMapping(value="toAdd",method=RequestMethod.GET)
	public String toAdd(){
		return "file/add";
	}

	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("m") FileModel m){
		iservice.create(m);
		return "file/success";
	}

	@RequestMapping(value="toUpdate/{uuid}",method=RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable("uuid") int uuid){
		FileModel m = iservice.getByUuid(uuid);
		model.addAttribute("m", m);
		return "file/update";
	}

	@RequestMapping(value="update",method=RequestMethod.POST)
	public String post(@ModelAttribute("m") FileModel m){
		iservice.update(m);
		return "file/success";
	}

	@RequestMapping(value="toDelete/{uuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("uuid") int uuid){
		FileModel m = iservice.getByUuid(uuid);
		model.addAttribute("m", m);
		return "file/delete";
	}

	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int uuid){
		iservice.delete(uuid);
		return "file/success";
	}

	@RequestMapping(value="toList",method=RequestMethod.GET)
	public String toList(@ModelAttribute("wm")FileWebModel wm,Model model){
		FileQueryModel qm = null;
		if(wm.getQueryJsonStr()==null || wm.getQueryJsonStr().trim().length()==0){
			qm =  new FileQueryModel();
		}else{
			String s = wm.getQueryJsonStr();
			s = s.replace("-", "%");
			qm = (FileQueryModel)JsonHelper.str2Object(s, FileQueryModel.class);
		}
		
		qm.getPage().setNowPage(wm.getNowPage());
		if(wm.getPageShow() > 0){
			qm.getPage().setPageShow(wm.getPageShow());
		}
		
		Page dbPage = iservice.getByConditionPage(qm);
		
		//
		model.addAttribute("wm", wm);
		model.addAttribute("page", dbPage);
				
		return "file/list";
	}

	@RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "file/query";
	}	
}
