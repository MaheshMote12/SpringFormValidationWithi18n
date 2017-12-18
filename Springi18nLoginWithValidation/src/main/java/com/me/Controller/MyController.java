package com.me.Controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.me.Model.LoginData;
import com.me.Model.RegistrationData;

@Controller
public class MyController 
{
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView indexPage()
	{ 
		LoginData ldata = new LoginData();
		return new ModelAndView("login","loginDataBean", ldata );
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView DisplayUser(@Valid @ModelAttribute("loginDataBean")LoginData ldata, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("login","loginDataBean", ldata );
		}
		else
		{
			return new ModelAndView("success"); 
		}
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public ModelAndView registerPage()
	{
		RegistrationData regdata = new RegistrationData();
		return new ModelAndView("registration", "registerDataBean", regdata);
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public ModelAndView DisplayRegUser(@Valid @ModelAttribute("registerDataBean")RegistrationData regdata, BindingResult result )
	{
		if(result.hasErrors())
		{
			return new ModelAndView("registration","registerDataBean", regdata); 
		}
		
		return new ModelAndView("success");
	}
	
	
	
}
