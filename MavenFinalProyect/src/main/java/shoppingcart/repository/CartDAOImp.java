//package shoppingcart.repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.hibernate.Session;
//import org.springframework.stereotype.Repository;
//import shoppingcart.model.Cart;
//
//@Repository
//public class CartDAOImp implements CartDAO {
//	
//	static {
//		System.out.println("Inici� CartDAO");
//	}		
//	
//	@PersistenceContext
//	EntityManager entityManager;
//	
//	Session session = entityManager.unwrap(Session.class);
//
//	public CartDAOImp() {
//	}
//
//	public void persist(Cart entity) {
//		// using just entityManager you can do
//		// entityManager.persist(entity);
//		session.getSessionFactory().getCurrentSession().persist(entity);		
//	}
//
//	public void update(Cart entity) {
//		session.getSessionFactory().getCurrentSession().update(entity);
//		
//	}
//
//	public void delete(Cart entity) {
//		session.getSessionFactory().getCurrentSession().delete(entity);		
//	}
//	
//	public Cart findById(Long id) {		
//		return session.getSessionFactory().getCurrentSession().get(Cart.class, id);
//	}
//
//}
