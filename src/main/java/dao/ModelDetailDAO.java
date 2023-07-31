package dao;

import java.util.List;

import model.ModelDetail;

public interface ModelDetailDAO {
	public List<ModelDetail> getModelDetailLists(int modelid);

	public List<ModelDetail> getStdDetailLists(int id);

	public List<ModelDetail> getIntDetailLists(int id);

	public List<ModelDetail> getExtDetailLists(int id);

	public List<ModelDetail> getCoreDetailLists(int id);


}
