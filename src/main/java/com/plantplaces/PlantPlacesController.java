package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * Handle /start endpoint
 * @return
 */
@Controller 
public class PlantPlacesController {
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
	}
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
}
