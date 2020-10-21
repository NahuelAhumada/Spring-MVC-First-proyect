package org.studyeasy;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.model.User;


@Controller
public class MainController {
		@GetMapping("/")
		public ModelAndView home() {
			ModelAndView modelAndView=new ModelAndView("userFormView");
			User user=new User();
			//Gender Map
			Map<String, String> genderMap=new HashMap<String,String>();
			genderMap.put("male", "Male");
			genderMap.put("female", "Female");
			//Country Map
			Map<String,String> countryMap=new HashMap<String,String>();
			countryMap.put("Argentina", "Argentina");
			countryMap.put("USA", "United States");
			countryMap.put("Uruguay", "Uruguay");
			countryMap.put("Bolivia", "Bolivia");
			countryMap.put("Ecuador", "Ecuador");
			
			modelAndView.addObject("countryMap", countryMap);
			modelAndView.addObject("genderMap",genderMap);
			modelAndView.addObject("user",user);
			return modelAndView;
		}
		@PostMapping("/displayUserInfo")
		public ModelAndView displayUserInfo(@ModelAttribute User user) {
			ModelAndView modelAndView=new ModelAndView("displayUserInfo");
			modelAndView.addObject("user",user);
			return modelAndView;
		}
		
}
