package daoImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.SegmentsDAO;
import model.Customers;
import model.Segments;

@Repository
@Transactional
public class SegmentsDaoImpl implements SegmentsDAO {
	@Autowired
	HibernateTemplate template;

	
	public void addSegment(Segments s) {
		template.save(s);
		
	}

	
	public List<Segments> getSegments() {
		List<Segments> list = (List<Segments>) template.find("from Segments");
		return list;
	}

	
	public Segments fetchSingleSegments(int id) {
		Segments seg = (Segments)template.find("from Segments c where c.id =?", id).get(0);
		//Product temp=(Product)template.find("from Product p where p.id=?",id).get(0);
		return seg;
	}


	public Segments getSegMinQty(int id) {
		Segments seg = (Segments)template.find("from Segments c where c.id =?", id).get(0);
		//Product temp=(Product)template.find("from Product p where p.id=?",id).get(0);
		return seg;
	}

	
}
