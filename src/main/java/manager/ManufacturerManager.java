package manager;


import java.util.List;

import model.Manufacturer;

public interface ManufacturerManager {

	List<Manufacturer> getMan();
	void addMan(Manufacturer manufacturer);
	void deleteMan(int id);
	List<Manufacturer> getManList(int s_id);
	
}
