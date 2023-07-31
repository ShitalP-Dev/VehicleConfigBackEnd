package managerImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ModelDAO;
import manager.ModelManager;
import model.Models;

@Service
public class ModelManagerImpl implements ModelManager {

	@Autowired
	ModelDAO mdao;
	
	
	public List<Models> getMod() {
		return mdao.getList();
	}

	
	public void addMod(Models manufacturer) {
		mdao.addModels(manufacturer);
	}

	
	public void deleteMod(int id) {
		mdao.deleteModels(id);
	}

	
	public List<Models> getModList(int seg_id, int mid) {
		return mdao.getModelLists(seg_id, mid);
	}

	
	public Models getModelById(int id) {
		return mdao.getModelById(id);
	}


	public Models getModId(int segment_id, int mid) {
		return mdao.getModelId(segment_id,mid);
	}

}
