package mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Common {

	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("test")
	public String test() {
		return "common/test";
	}
	
}
