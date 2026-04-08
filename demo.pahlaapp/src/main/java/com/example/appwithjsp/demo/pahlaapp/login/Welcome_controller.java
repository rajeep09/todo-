package com.example.appwithjsp.demo.pahlaapp.login;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class Welcome_controller {

	

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", "rajeev");
		return "welcome";
	}
	@RequestMapping(value="/",method = RequestMethod.POST)

	public String processWelcomePage(@ModelAttribute("name") String name, ModelMap model) {
	    // Process the posted data
	    model.put("name", name);
	    return "welcome";
	}
}
