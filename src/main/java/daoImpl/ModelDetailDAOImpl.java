package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.ModelDetail;
import dao.ModelDetailDAO;
@Repository
@Transactional
public class ModelDetailDAOImpl implements ModelDetailDAO{

	@Autowired
	HibernateTemplate template;
	

	
	public List<ModelDetail> getModelDetailLists(int id) {
		System.out.println(id);
		List<ModelDetail> list = (List<ModelDetail>)template.find("from ModelDetail m where m.model_id=?",id);
		return list;
	}

	public List<ModelDetail> getStdDetailLists(int id) {
		System.out.println(id);
		String model_config="default";
		String config_type="standard";
		List<ModelDetail> list = (List<ModelDetail>)template.find("from ModelDetail m where m.model_id=? and m.model_config=? and m.config_type=?",id,model_config,config_type);
		return list;
		
	}

	public List<ModelDetail> getIntDetailLists(int id) {
		System.out.println(id);
		String model_config="default";
		String config_type="interior";
		List<ModelDetail> list = (List<ModelDetail>)template.find("from ModelDetail m where m.model_id=? and m.model_config=? and m.config_type=?",id,model_config,config_type);
		return list;
	}

	public List<ModelDetail> getExtDetailLists(int id) {
		System.out.println(id);
		String model_config="default";
		String config_type="exterior";
		List<ModelDetail> list = (List<ModelDetail>)template.find("from ModelDetail m where m.model_id=? and m.model_config=? and m.config_type=?",id,model_config,config_type);
		return list;
	}
	public List<ModelDetail> getCoreDetailLists(int id) {
		System.out.println(id);
		String model_config="default";
		String config_type="core";
		List<ModelDetail> list = (List<ModelDetail>)template.find("from ModelDetail m where m.model_id=? and m.model_config=? and m.config_type=?",id,model_config,config_type);
		return list;
	}

}
