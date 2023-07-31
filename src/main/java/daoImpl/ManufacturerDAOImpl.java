package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.ManufacturerDAO;
import model.Customers;
import model.Manufacturer;


@Repository
@Transactional
public class ManufacturerDAOImpl implements ManufacturerDAO{

	@Autowired
	HibernateTemplate template;
	
	
	public List<Manufacturer> getList() {

		@SuppressWarnings("unchecked")
		List<Manufacturer> list = (List<Manufacturer>)template.find("from Manufacturer");
		return list;
	}

	
	public void addManufacturer(Manufacturer manufacturer) {
		template.save(manufacturer);
	}

	
	public void deleteManufacturer(int id) {
		template.delete(template.get(Manufacturer.class, id));
	}
	
	public List<Manufacturer> getManLists(int seg_id) {
		List<Manufacturer> list = (List<Manufacturer>)template.find("from Manufacturer m where m.segid=? ",seg_id);
		return list;
	
	}

}
