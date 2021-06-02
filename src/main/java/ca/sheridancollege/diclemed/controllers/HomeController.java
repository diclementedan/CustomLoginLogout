package ca.sheridancollege.diclemed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {return"index";}
	
	@GetMapping("/secure")
	public String secureIndex() {return"/secure/index";}
	
	@GetMapping("/login")
	public String login() {return"login";}
	
	@GetMapping("/permission-denied")
	public String permissionDenied() {return"/error/permission-denied";}
}
