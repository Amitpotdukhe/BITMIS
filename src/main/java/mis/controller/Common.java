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
	
	@RequestMapping("signin")
	public String login() {
		return "common/login";
	}
	
	
	
	@RequestMapping("edituser")
	public String edituser() {
		return "admin/editUser";
	}
	
	@RequestMapping("resetpass")
	public String reset() {
		return "common/resetpass";
	}
	
	@RequestMapping("forgotpass")
	public String forgetpassword() {
		return "common/forgotpass";
	}
	
	@RequestMapping("adminHome")
	public String adminHome() {
		return "admin/adminHome";
	}
	
	@RequestMapping("addleavebalance")
	public String addleavebalance() {
		return "admin/addleavebalance";
	}
	
	@RequestMapping("adduser")
	public String adduser() {
		return "admin/adduser";
	}
	
	@RequestMapping("leavehistory")
	public String leavehistory() {
		return "admin/leavehistory";
	}
	
	@RequestMapping("managerole")
	public String managerole() {
		return "admin/managerole";
	}
	
	@RequestMapping("manageuser")
	public String manageuser() {
		return "admin/manageuser";
	}

}
