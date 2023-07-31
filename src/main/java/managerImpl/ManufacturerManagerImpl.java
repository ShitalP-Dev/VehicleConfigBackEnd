package managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ManufacturerDAO;
import manager.ManufacturerManager;
import model.Manufacturer;

@Service
public class ManufacturerManagerImpl implements ManufacturerManager {

	@Autowired
	ManufacturerDAO mdao;
	
	
	public List<Manufacturer> getMan() {
		List<Manufacturer> list = mdao.getList();
		return list;
	}

	
	public void addMan(Manufacturer manufacturer) {
		mdao.addManufacturer(manufacturer);
	}

	
	public void deleteMan(int id) {
		mdao.deleteManufacturer(id);
	}

	public List<Manufacturer> getManList(int seg_id) {
		return mdao.getManLists(seg_id);
	}
	
	
}
