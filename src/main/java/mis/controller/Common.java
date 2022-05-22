package mis.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mis.dao.UserRepository;
import mis.entity.User;

@Controller
@RequestMapping("/")
public class Common {
	
	@Autowired
	UserRepository userRepo;
	
	private final String UPLOAD_DIR = "src/main/resources/static/profileimages/";
	
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
	
	
	
//	@RequestMapping("edituser")
//	public String edituser() {
//		return "admin/editUser";
//	}
	
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
	
	@PostMapping("/profileUpload")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes attributes, Principal principal) {

        // check if file is empty
        if (file.isEmpty()) {
            attributes.addFlashAttribute("message", "Please select a file to upload.");
            return "redirect:/home";
        }

        // normalize the file path
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String savePath = "/profileimages/"+fileName;
        System.out.println(savePath);

        // save the file on the local file system
        try {
            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
            String userName = principal.getName();
    		User user = userRepo.getUserByUserName(userName);
    		user.setImageUrl(savePath);
    		userRepo.save(user);
    		
        } catch (IOException e) {
        	
            e.printStackTrace();
            
        }

        // return success response
        attributes.addFlashAttribute("message", "You successfully uploaded " + fileName + '!');

        return "redirect:/profile";
    }

}
