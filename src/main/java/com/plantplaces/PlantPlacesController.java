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
	
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
	}
	
	/**
	 * 
	 * Handle the / endpoint
	 * @return
	 */
	
	@RequestMapping("/index")
	public String index(){
		
		return "start";
	}
}
