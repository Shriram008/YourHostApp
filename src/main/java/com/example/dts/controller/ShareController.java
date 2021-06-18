package com.example.dts.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dts.entity.ShareModel;
import com.example.dts.repository.ShareRepository;

@Controller
public class ShareController {
	
	@Autowired
	ShareRepository sharepo;
	
	@RequestMapping(value = "/Trade/add " , method = RequestMethod.GET)
	public String CreateNewShare (ModelMap model,  ShareModel shareModel, BindingResult result){
		
		if (result.hasErrors()) {
            return "todo";
        }
		
		ShareModel s1 = new ShareModel();
		s1.setShareName("TCS");
		s1.setOpeningValue(1500);
		s1.setTradeDate(new Date());
		sharepo.save(shareModel);
		return "redirect:/list-shares";
		}
	
	@RequestMapping(value = "/listShares", method = RequestMethod.GET)
    public String showAllShares(ModelMap model) {
        model.put("allShares", sharepo.findAll());
        // model.put("todos", service.retrieveTodos(name));
        return "list-shares";
    }
	
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String showWelcomePage(ModelMap model) {
	      
	        return "welcome";
	    }

	    

}
