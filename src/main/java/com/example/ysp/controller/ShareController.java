package com.example.ysp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ysp.entity.ShareModel;
import com.example.ysp.repository.ShareRepository;

@Controller
public class ShareController {
	
	@Autowired
	ShareRepository sharepo;
	
	@RequestMapping(value = "/addNewShare " , method = RequestMethod.POST)
	public String CreateNewShare (ModelMap model,  ShareModel shareModel, BindingResult result){
		
		if (result.hasErrors()) {
            return "todo";
        }
		
		
		return "redirect:/shareHomePage";
		}
	
	@RequestMapping(value = "/shareHomePage", method = RequestMethod.GET)
	public String showHomePage() {
		System.out.println("Launching share Home Page");

		return "ShareHomePage";
	}
	
	@RequestMapping(value = "/createNewShare")
    public String createNewSharePageShares() {
		System.out.println("redirecting to new share creation page");
       
        return "createNewShare";
    }
	
	 

	    

}
