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
	
	@RequestMapping("managerole")
	public String manageRole() {
		return "admin/managerole";
	}
	
	@RequestMapping("manageuser")
	public String manageUser() {
		return "admin/manageuser";
	}
	
	@RequestMapping("addleavebalance")
	public String addLeaveBalance() {
		return "admin/addleavebalance";
	}
	
	@RequestMapping("leavehistory")
	public String leaveHistory() {
		return "admin/leavehistory";
	}

}
