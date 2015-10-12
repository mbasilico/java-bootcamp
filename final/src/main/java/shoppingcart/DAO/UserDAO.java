package shoppingcart.DAO;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shoppingcart.model.User;

@Repository

	@Transactional
	public interface UserDAO extends CrudRepository<User, Long> {
	
		User findByNameAndPass(String name,String pass);
		
	}