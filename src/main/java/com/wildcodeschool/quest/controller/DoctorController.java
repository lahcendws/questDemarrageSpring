package com.wildcodeschool.quest.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DoctorController {
	
	@GetMapping("/doctor")
	@ResponseBody
	public String index() {
		return " <ul> "
				+ "      <li><a href='http://localhost:8080/doctor/1'>William lahcen</a></li>"
				+ "     <li><a href='http://localhost:8080/doctor/10'>David Tennant</a></li>\r\n"
				+ "     <li><a href='http://localhost:8080/doctor/13'>Jodie Whittaker</a></li>\r\n"
				+ "    </ul>";
	}
	@GetMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}
	@GetMapping("/doctor/10")
	@ResponseBody
	public String doctor10() {
		return "David Tennant";
	}
	@GetMapping("/doctor/13")
	@ResponseBody
	public String doctor13() {
		return "Jodie Whittake";
	}

}
