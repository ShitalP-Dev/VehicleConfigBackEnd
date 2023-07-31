package dao;
import java.util.List;

import model.*;
public interface ManufacturerDAO {

	List<Manufacturer> getList();
	void addManufacturer(Manufacturer manufacturer);
	void deleteManufacturer(int id);
	List<Manufacturer> getManLists(int seg_id);
}
