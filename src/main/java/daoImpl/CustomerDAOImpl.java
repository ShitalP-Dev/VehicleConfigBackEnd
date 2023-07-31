package daoImpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import dao.CustomerDAO;
import model.Customers;

@Repository
@Transactional

public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	HibernateTemplate template;
	public void addCustomers(Customers p) {
		template.save(p);
	}
	public List<Customers> getCustomers() {
		
		List<Customers> list = (List<Customers>)template.find("from Customers");
		return list;
	}
	public void delete(int id) {
		template.delete(template.get(Customers.class,id));
	}
	public void update(Customers customer, int id) {
	
	}
	public Customers fetchSingleCustomer(int id) {
		Customers customer = (Customers)template.find("from Customers c where c.id =?", id).get(0);
		//Product temp=(Product)template.find("from Product p where p.id=?",id).get(0);
		return customer;
	}
	public Customers fetchSingleCustomer(Customers c) {
		System.out.println("out"+c.getUsername()+"   "+c.getPassword());
		Customers customer = (Customers)template.find("from Customers c where c.username =? and c.password=?", c.getUsername(),c.getPassword()).get(0);
		return customer;	
		}

}
