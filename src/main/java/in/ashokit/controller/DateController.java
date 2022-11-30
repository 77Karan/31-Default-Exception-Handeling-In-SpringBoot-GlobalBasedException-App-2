package in.ashokit.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController 
{
	@GetMapping("/date")
	public String displayDateController(Model model)
	{
		model.addAttribute("datekey",LocalDate.now());
		String msg=null;
		msg.length();  //Creating My own Exception
		return "datedisplay";
	}

}
