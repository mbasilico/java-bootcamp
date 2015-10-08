package com.shopping.cart.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.shopping.cart.dao.UserDao;
import com.shopping.cart.main.User;
@JsonAutoDetect
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUser(int idUser) {
		return sessionFactory.getCurrentSession().createQuery("from User u where u.id= :uId").setParameter("uId",idUser).list();
		
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int idUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getUserName(String username) {
		return sessionFactory.getCurrentSession().createQuery("from User u where u.username= :uName").setParameter("uName",username).list().isEmpty();
	}

	
	@Override
	public boolean getUserLogin(String username, String password) {
		
		return sessionFactory.getCurrentSession().createQuery("from User u where u.username= :uName and u.password= :uPass").setParameter("uName",username).setParameter("uPass",password).list().isEmpty();
	}
	

}
