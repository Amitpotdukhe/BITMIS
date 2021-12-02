package mis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import mis.dao.UserRepository;
import mis.entity.User;

@Service
public class AdminService {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepo;
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepo.save(user);
	}

	public List<User> viewAll() {
		return userRepo.findAll();
		
	}

	public Object getUserByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return userRepo.getUserByKeyword(keyword);
	}

}
