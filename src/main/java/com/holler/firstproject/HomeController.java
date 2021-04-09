package com.holler.firstproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	public String date () {
		LocalDateTime currDateU = LocalDateTime.now();
		DateTimeFormatter currDate = DateTimeFormatter.ofPattern("E, 'the' d 'of' MMMM");
		String currDateF = currDateU.format(currDate);
		return currDateF; 
	}
	public String time () {
		LocalDateTime currTimeU = LocalDateTime.now(); 
		DateTimeFormatter currTime = DateTimeFormatter.ofPattern("hh:mm:a");
		String currTimeF = currTimeU.format(currTime);
		return currTimeF; 
	}
	
	@RequestMapping ("/")
	public String index () {
		return "index.jsp";
	}
	@RequestMapping ("/date")
	public String date (Model model) {
		model.addAttribute("date", date());
		return "date.jsp"; 
	}
	@RequestMapping ("/time")
	public String time (Model model) {
		model.addAttribute("time", time());
		return "time.jsp";
	}

}

