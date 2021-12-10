package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String displayCount(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		if (currentCount == null) {
			session.setAttribute("count", 0);
		}
		model.addAttribute("counter", session.getAttribute("count"));
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String incrementTwo(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (Integer) session.getAttribute("count") + 2);
		}
		return "two.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, Model model) {
		session.invalidate();
		return "redirect:/counter";
	}
}
