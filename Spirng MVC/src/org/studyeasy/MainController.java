package org.studyeasy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
			modelAndView.addObject("user",user);
			return modelAndView;
		}
		@PostMapping("/displayUserInfo")
		public ModelAndView displayUserInfo() {
			return null;
		}
		
}
