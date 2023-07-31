package managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDetailDAO;
import manager.ProductDetailManager;
import model.Items;

@Service
public class ProductDetailManagerImpl implements ProductDetailManager{

	@Autowired
	ProductDetailDAO pdao;

	
	public List<Items> getDefaultDetails(int id) {
		return pdao.getDefaultDetails(id);
	}

	
	public List<Items> getDetails(int id, String configType) {
		return pdao.getDetails(id, configType);
	}


	public List<Items> getEDetails(int id, String configType) {
		return pdao.getEDetails(id, configType);
	}


	public List<Items> getIDetails(int id, String configType) {
		return pdao.getIDetails(id, configType);
	}


	public List<Items> getSDetails(int id, String configType) {
		return pdao.getSDetails(id, configType);
	}


	public List<Items> getCDetails(int id) {
		return pdao.getCDetails(id);
	}
	

}
