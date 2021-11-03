package mis.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mis.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminHome {
	
	AdminService adminService = new AdminService();
	
	@RequestMapping("home")
	public String AdminHome() {
		return "AdminHome";
	}
	
	@RequestMapping("/admin/add")
	public String AddUser() {
		adminService.addUser();
		return "addUser";
	}
}
