package shoppingcart.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shoppingcart.model.User;

@Repository
public class UserDAO implements UserDAOInterface<User, Long> {

	private Session currentSession;
	private Transaction currentTransaction;

	public UserDAO() {
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		return configuration.buildSessionFactory(builder.build());
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {

		this.currentTransaction = currentTransaction;
	}

	public Session openCurrentSessionwithtransaction() {
		currentSession  = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	@Transactional
	public void add(User entity) {
		getCurrentSession().save(entity);

	}
	@Transactional
	public void update(User entity) {
		getCurrentSession().update(entity);
	}
	@Transactional
	public User findById(Long id) {
		return (User) getCurrentSession().get(User.class,id);
	}
	@Transactional
	public void delete(User entity) {
		getCurrentSession().delete(entity);

	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return (List<User>)getCurrentSession().createQuery("from User").list();
	}

}
