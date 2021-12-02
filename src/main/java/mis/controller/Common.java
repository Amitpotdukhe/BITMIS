package mis.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mis.dao.UserRepository;
import mis.entity.User;

@Controller
@RequestMapping("/")
public class Common {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("home")
	public String home( Model model) {
		
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

	@RequestMapping("profile")
	public String profile(Principal principal, Model model)  {
		String userName = principal.getName();
		User user = userRepo.getUserByUserName(userName);
		System.out.println("USER " + user);
		model.addAttribute("user", user);
		return "common/profile";
	}

}
