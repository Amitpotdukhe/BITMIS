package mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff/")
public class StaffController {

	@RequestMapping("apply-for-leave")
	public String applyLeave() {
		
		return "staff/applyLeave";
	}
}
