package hh.swd20.ekaspringprojekti.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HelloWorldController {

	//http://localhost:8080/mitävaan
	@RequestMapping("*")
	public String sayHello() {
		return "Hello World and Markus!!";
	}
	
	//http://localhost:8080/hello?firstname=Markus&lastname=Hakala
	@RequestMapping("/helloyou")
	public String helloYou(@RequestParam(name="firstname") String etunimi, @RequestParam(name="lastname") String sukunimi) {
		return "Hello " + etunimi + " " + sukunimi;
	}

}
