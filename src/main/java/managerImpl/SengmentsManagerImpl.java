package managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SegmentsDAO;
import manager.SengmentsManager;
import model.Segments;

@Service
public class SengmentsManagerImpl implements SengmentsManager {
	@Autowired
	SegmentsDAO sdao;

	
	public void addSegment(Segments s) {
		sdao.addSegment(s);
		
	}

	
	public List<Segments> getSegments() {
		List<Segments> list = sdao.getSegments();
		return list;
		
	}

	
	public Segments getSingleSeg(int id) {
		return sdao.fetchSingleSegments(id);
	}


	public Segments getSegMinQty(int id) {
		return sdao.getSegMinQty(id);
	}

	

}
