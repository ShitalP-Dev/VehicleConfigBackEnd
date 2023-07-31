package dao;

import java.util.List;

import model.Customers;

public interface CustomerDAO {
	
	void addCustomers(Customers p);
	List<Customers> getCustomers();
	void delete(int id);
	void update(Customers customer,int id);
	Customers fetchSingleCustomer(int id);
	Customers fetchSingleCustomer(Customers c);
}
