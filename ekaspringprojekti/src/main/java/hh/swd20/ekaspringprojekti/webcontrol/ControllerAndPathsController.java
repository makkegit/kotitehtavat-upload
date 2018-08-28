package hh.swd20.ekaspringprojekti.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class ControllerAndPathsController {

	//http://localhost:8080/index
	@RequestMapping("/index")
	public String indexPage() {
		return "This is the index page";
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "This is the contact page";
	}
	
	//http://localhost:8080/hello?firstname=Markus&lastname=Hakala
	@RequestMapping("/hello")
	public String helloLocationAndName(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
