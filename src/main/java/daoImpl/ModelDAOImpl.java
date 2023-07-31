package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.ModelDAO;
import model.Models;


@Repository
@Transactional
public class ModelDAOImpl implements ModelDAO{

	@Autowired
	HibernateTemplate template;
	
	
	public List<Models> getList() {
		List<Models> list = (List<Models>) template.find("from Models");
		return list;
	}

	
	public void addModels(Models manufacturer) {
		template.save(manufacturer);
	}

	
	public void deleteModels(int id) {
		System.out.println(id);
		template.delete(template.get(Models.class,id));
	}

	
	public List<Models> getModelLists(int seg_id, int mid) {
		System.out.println(seg_id +" "+mid);
		List<Models> list = (List<Models>)template.find("from Models m where m.mid=? and m.segment_id=?",mid,seg_id);
		return list;
	
	}

	
	public Models getModelById(int id) {
		Models model = (Models)template.find("from Models m where m.id=?", id).get(0);
		return model;
	}


	public Models getModelId(int segment_id, int mid) {
		Models m=(Models)template.find("from Models m where m.segment_id=? and m.mid=?", segment_id,mid).get(0);
		return m;
	}
		
	
}
