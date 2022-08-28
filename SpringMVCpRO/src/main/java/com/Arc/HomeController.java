package com.Arc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
	//Redirect to another url Below
	/*
	 * @RequestMapping("/") public String home() {
	 * 
	 * return "redirect:http://www.yahoo.com"; }
	 */
	
	//3!!ModelAndView Mapping ,below.
	@RequestMapping("/PuneBus")
	public ModelAndView pune(@RequestParam("StudentName")String thestudent) 
	{
			
		thestudent = "hello   " +thestudent.toUpperCase();
	
		return new ModelAndView("goa","stud", thestudent);
	} 

	
	/*1 & 2!! We used Model and ModelMap in below coding
	 * @RequestMapping("/PuneBus") public String
	 * pune(@RequestParam("StudentName")String thestudent, Model theModel) {
	 * //public String pune(@RequestParam("StudentName")String thestudent, ModelMap
	 * theModel) { thestudent = "hello   " +thestudent.toLowerCase();
	 * 
	 * theModel.addAttribute("stud", thestudent);
	 * 
	 * return "goa"; } 
	 */
	
	/*
	 * Note: Model is interface, modelMap is class both works same ANd ModelMap is
	 * class with return type of itself and here we need to pass three parameters in
	 * return
	 */
	
	
}
