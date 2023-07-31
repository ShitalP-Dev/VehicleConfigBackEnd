package manager;

import java.util.List;


import model.Models;


public interface ModelManager {
	List<Models> getMod();
	void addMod(Models manufacturer);
	void deleteMod(int id);
	List<Models> getModList(int s_id,int manufacturer_id);
	Models getModelById(int id);
	Models getModId(int segment_id, int mid);
}
