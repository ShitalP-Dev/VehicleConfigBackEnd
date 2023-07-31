package dao;
import java.util.List;

import model.Items;
import model.Items;

public interface ProductDetailDAO {
	
	List<Items>	getDefaultDetails(int id);
	List<Items>	getDetails(int id, String configType);
	List<Items>	getEDetails(int id, String configType);
	List<Items>	getIDetails(int id, String configType);
	List<Items>	getSDetails(int id, String configType);
	List<Items>	getCDetails(int id);

	
}
