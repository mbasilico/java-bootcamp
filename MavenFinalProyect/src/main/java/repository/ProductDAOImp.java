package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import model.Product;

public class ProductDAOImp implements ProductDAO<Product, String> {

	private Session currentSession;

	private Transaction currentTransaction;

	public ProductDAOImp() {
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
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
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

	public void persist(Product entity) {
		getCurrentSession().save(entity);
	}

	public void update(Product entity) {
		getCurrentSession().update(entity);
	}

	public Product findById(String id) {
		Product product = (Product) getCurrentSession().get(Product.class, id);
		return product;
	}

	public void delete(Product entity) {
		getCurrentSession().delete(entity);
	}

	public List<Product> findAll() {
		@SuppressWarnings("unchecked")
		List<Product> productList = (List<Product>) getCurrentSession().createQuery("from Catalogue").list();
		return productList;
	}

	public void deleteAll() {
		List<Product> entityList = findAll();
		for (Product entity : entityList) {
			delete(entity);
		}
	}

	public Product findByName(String name) {
		Product product = (Product) getCurrentSession().get(Product.class, name);
		return product;
	}

}
