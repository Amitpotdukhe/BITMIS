package mis.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mis.dao.UserRepository;
import mis.entity.User;

@RestController
public class CommonRest {
	
	@Autowired
	UserRepository userRepository;
	
//	@GetMapping("/search/{query}")
//	public ResponseEntity<?> search(@PathVariable("query") String query,Principal principal)
//	{
//		System.out.println(query);		
//		User user=this.userRepository.getUserByName(principal.getName());		
//		List<User> contacts = this.userRepository.findByNameContainingAndUser(query, user);
//		return ResponseEntity.ok(contacts);
//	}
	
}
