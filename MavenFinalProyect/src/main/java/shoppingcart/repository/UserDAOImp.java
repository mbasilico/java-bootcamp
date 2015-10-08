package shoppingcart.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shoppingcart.model.Product;
import shoppingcart.model.User;

@Repository
public class UserDAOImp implements UserDAO {

	private SessionFactory sessionFactory;

	public UserDAOImp() {         
    }

//	@Autowired
	public UserDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Transactional
	public List<User> userList() {
//		@SuppressWarnings("unchecked")
//		List<User> userList = (List<User>) sessionFactory.getCurrentSession()
//				.createCriteria(User.class)
//				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();	 
//	        return userList;
		List<User> userList = (List<User>) sessionFactory.getCurrentSession().createQuery("FROM User").list();
		return userList;
		
	}

	@Transactional
	public User getUser(Long id) {
		String hql = "from User where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<User> userList = (List<User>) query.list();

		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdateUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Transactional
	public void deleteUser(Long id) {
		User userToDelete = new User();
        userToDelete.setUserID(id);
        sessionFactory.getCurrentSession().delete(userToDelete);

	}

}
