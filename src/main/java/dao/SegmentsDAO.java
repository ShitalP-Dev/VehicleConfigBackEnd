package dao;

import java.util.List;

import model.Segments;

public interface SegmentsDAO {
	void addSegment(Segments s);
	List<Segments> getSegments();
	//void delete(int id);
	//void update(Segments seg,int id);
	Segments fetchSingleSegments(int id);
	Segments getSegMinQty(int id);

}
