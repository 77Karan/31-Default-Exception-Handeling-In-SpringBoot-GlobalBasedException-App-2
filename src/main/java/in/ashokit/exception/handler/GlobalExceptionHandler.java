package in.ashokit.exception.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(value=NullPointerException.class)
	public String handleException(Model model)
	{
		model.addAttribute("errorkey","Please try later Some problem with infrastructure");
		return "error";
	}

}
