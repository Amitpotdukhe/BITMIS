package mis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import mis.dao.UserRepository;
import mis.entity.User;

@Service
public class AdminService {
	
	
	
	@Autowired
	private UserRepository userRepo;
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
		userRepo.save(user);
	}

}
