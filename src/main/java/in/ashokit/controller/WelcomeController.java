package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController 
{
	@GetMapping("/welcome") 
	public String getWelcomeMsg(Model model)
	{
		String msg = "Welcome to Rcb";
		model.addAttribute("msgkey",msg);
		String msg1= null;
		msg1.length();//Creating My own Exception
		return "index";
	}

	
}
