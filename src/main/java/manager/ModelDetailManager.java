package manager;

import java.util.List;

import com.google.gson.JsonElement;

import model.ModelDetail;

public interface ModelDetailManager {
	public List<ModelDetail> getModelDetailLists(int modelid);

	public List<ModelDetail> getStdDetailLists(int id);

	public List<ModelDetail> getIntDetailLists(int id);

	public List<ModelDetail> getExtDetailLists(int id);

	public List<ModelDetail> getCoreDetailLists(int id);


}
