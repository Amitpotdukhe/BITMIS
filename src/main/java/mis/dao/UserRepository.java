package mis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import mis.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.email = :email")
	public User getUserByUserName(@Param("email") String email);
	
	@Query(value = "select * from User u where u.name like %:keyword% or u.email like %:keyword% or u.id like %:keyword%", nativeQuery = true)
	public List<User> getUserByKeyword(@Param("keyword") String keyword);
	
	@Query("select u from User u where u.name = :name")
	public User getUserByName(@Param("name") String name);
	
	@Query(value="select * from User u where u.id like %:key% or u.email like %:key%", nativeQuery = true)
	public User getUserForRoleChange(@Param("key") String key);
	
//	@Query(value = "select * from User u where u.name like %:keyword% or u.email like %:keyword%", nativeQuery = true)
//	List<User> search(@Param("keyword") String keyword);
	//search
	//public List<User> findByNameContainingAndUser(String name,User user);
}
