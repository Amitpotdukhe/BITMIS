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
	
	@RequestMapping("login")
	public String login() {
		return "common/login";
	}
	
	@RequestMapping("adduser")
	public String adduser() {
		return "admin/adduser";
	}
	
	@RequestMapping("edituser")
	public String edituser() {
		return "admin/editUser";
	}
	
	@RequestMapping("reset")
	public String reset() {
		return "common/reset";
	}
	
	@RequestMapping("forgetpassword")
	public String forgetpassword() {
		return "common/forgetpassword";
	}
	
}
