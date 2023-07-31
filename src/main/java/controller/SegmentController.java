package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.SengmentsManager;
import model.Customers;
import model.Segments;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/seg")
public class SegmentController {
	@Autowired
	SengmentsManager sman;
	
	@GetMapping(value="/segments", headers="Accept=application/json")
	public String getSegments ()
	{
		return new Gson().toJson(sman.getSegments());
	}
	
	@PostMapping(value="/addSegment", headers="Accept=application/json")
	public void addSegment(@RequestBody Segments seg)
	{
		sman.addSegment(seg);
	}
	@GetMapping(value="/{id}", headers="Accept=application/json")
	public String retValue(@PathVariable int id)
	{
		System.out.println(id);
		Segments c = sman.getSingleSeg(id);
		return new Gson().toJson(c);
	}
	@GetMapping(value="/minQ/{id}", headers="Accept=application/json")
	public String getSegMinQty (@PathVariable int id)
	{
		Segments c =sman.getSegMinQty(id);
		return c.getMinQty();
		
	}

}
