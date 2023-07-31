package manager;

import java.util.List;

import model.Customers;

public interface CustomerManager {

	void addCustomer(Customers p);
	List<Customers> getCustomers();
	void delete(int id);
	void update(Customers product,int id);
	Customers getSingleCust(int id);
	public Customers getSingleCust(Customers c);
}
