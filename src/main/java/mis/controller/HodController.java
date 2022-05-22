package mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hod/")
public class HodController {
	
	@RequestMapping("viewLeaves")
	public String applyLeave() {
		
		return "hod/viewLeaves";
	}
	
}
