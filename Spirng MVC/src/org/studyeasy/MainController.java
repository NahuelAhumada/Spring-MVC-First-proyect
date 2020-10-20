package org.studyeasy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		@RequestMapping(value = "displayname")
		public ModelAndView displayName(@RequestParam("firstName") String firstName) {
			ModelAndView modelAndView = new ModelAndView("displayName");
			modelAndView.addObject("name",firstName);
			return modelAndView;
		}
}
