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
		user.setEnabled(true);
		userRepo.save(user);
	}

	public List<User> viewAll() {
		return userRepo.findAll();
		
	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.getById(id);
	}

	public List<User> getUser(String keyword) {
		// TODO Auto-generated method stub
		return userRepo.getUserByKeyword(keyword);
	}

	public User getRoleMethod(String key) {
		// TODO Auto-generated method stub
		return userRepo.getUserForRoleChange(key);
	}

}
