package manager;


import java.util.List;

import model.Segments;

public interface SengmentsManager {
	void addSegment(Segments p);
	List<Segments> getSegments();
	//void delete(int id);
	//void update(Segments seg,int id);
	Segments getSingleSeg(int id);
	Segments getSegMinQty(int id);

}
