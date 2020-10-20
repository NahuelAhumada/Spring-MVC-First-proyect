package org.studyeasy;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
		@RequestMapping(value="/", method=RequestMethod.GET)
		public String welcome() {
			return "hello";
		}
		@GetMapping(value = "displayname")
		public ModelAndView displayName(@RequestParam("firstName") String firstName) {
			ModelAndView modelAndView = new ModelAndView("displayName");
			Date date = new Date();
			modelAndView.addObject("name",firstName);
			modelAndView.addObject("date", date);
			return modelAndView;
		}
}
