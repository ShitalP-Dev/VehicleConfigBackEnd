package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.ProductDetailDAO;
import model.Items;
import model.Items;
import model.Models;

@Repository
@Transactional
public class ProductDetailDAOImpl implements ProductDetailDAO{

	@Autowired
	HibernateTemplate template;
	

	
	public List<Items> getDefaultDetails(int id) {
		List <Items> i=(List<Items>) template.find("from Items i where i.modelid=?",id);
		return i;
	}


	
	public List<Items> getDetails(int id, String configType) {
		List <Items> i=(List<Items>) template.find("from Items i where i.modelid=? and i.configtype=?",id,configType);
		return i;
	}



	public List<Items> getEDetails(int id, String configType) {
		String m="exterior";
		List <Items> i=(List<Items>) template.find("from Items i where i.modelid=? and i.configtype=? and i.modelconfig=?",id,configType,m);
		return i;
	}



	public List<Items> getIDetails(int id, String configType) {
		String m="interior";
		List <Items> i=(List<Items>) template.find("from Items i where i.modelid=? and i.configtype=? and i.modelconfig=?",id,configType,m);
		return i;
	}



	public List<Items> getSDetails(int id, String configType) {
		String m="standard";
		List <Items> i=(List<Items>) template.find("from Items i where i.modelid=? and i.configtype=? and i.modelconfig=?",id,configType,m);
		return i;
	}



	public List<Items> getCDetails(int id) {
		String m="core";
		List <Items> i=(List<Items>) template.find("from Items i where i.modelid=? and i.modelconfig=?",id,m);
		return i;
	}
	
	

}
