package dao;

import java.util.List;

import model.Models;

public interface ModelDAO {

	List<Models> getList();
	void addModels(Models manufacturer);
	void deleteModels(int id);
	List<Models> getModelLists(int seg_id, int manufacturer_ids);
	Models getModelById(int id);
	Models getModelId(int segment_id, int mid);
	
}
