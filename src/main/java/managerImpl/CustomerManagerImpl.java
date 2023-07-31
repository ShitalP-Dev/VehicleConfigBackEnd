package managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CustomerDAO;
import manager.CustomerManager;
import model.Customers;

@Service
public class CustomerManagerImpl implements CustomerManager{

	@Autowired
	CustomerDAO cdao;
	
	
	public void addCustomer(Customers p) {
		cdao.addCustomers(p);
	}

	
	public List<Customers> getCustomers() {
		List<Customers> list = cdao.getCustomers();
		return list;
	}

	
	public void delete(int id) {
		cdao.delete(id);
	}

	
	public void update(Customers product, int id) {
		
	}

	
	public Customers getSingleCust(int id) {
		Customers customer = cdao.fetchSingleCustomer(id);
		return customer;
	}
	public Customers getSingleCust(Customers c) {
		Customers customer = cdao.fetchSingleCustomer(c);
		return customer;
	}

}
