package mis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mis.entity.User;
import mis.services.AdminService;



@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("adduser")
	public String adduser() {
		
		return "admin/adduser";
	}
	
	@RequestMapping("managerole")
	public String manageRole() {
		return "admin/managerole";
	}
	
	@RequestMapping("manageuser")
	public String manageUser() {
		return "admin/manageuser";
	}
	
	@RequestMapping(value = "do_register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		adminService.addUser(user);
		return "redirect:/admin/adduser";

	}
	
}
