package managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ModelDetailDAO;
import model.ModelDetail;
import manager.ModelDetailManager;;
@Service
public class ModelDetailManagerImpl implements ModelDetailManager{
	@Autowired
	ModelDetailDAO mdao;
	
	public List<ModelDetail> getModelDetailLists(int model_id){
		return mdao.getModelDetailLists(model_id);
	}

	public List<ModelDetail> getStdDetailLists(int id) {
		return mdao.getStdDetailLists(id);
	}

	public List<ModelDetail> getIntDetailLists(int id) {
		return mdao.getIntDetailLists(id);
	}

	public List<ModelDetail> getExtDetailLists(int id) {
		return mdao.getExtDetailLists(id);
	}

	public List<ModelDetail> getCoreDetailLists(int id) {
		return mdao.getCoreDetailLists(id);
	}

}
