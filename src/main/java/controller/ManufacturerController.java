package controller;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.ManufacturerManager;
import model.Manufacturer;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/menu")
public class ManufacturerController {

	@Autowired
	ManufacturerManager manager;
	
	@GetMapping(value="/manufacturer", headers="Accept=application/json")
	public String getManufacturers()
	{
		return new Gson().toJson(manager.getMan());
	}
	
	@PostMapping(value="/add", headers="Accept=application/json")
	public void addManufacturer(@RequestBody Manufacturer manufacturer)
	{
		manager.addMan(manufacturer);
	}
	
	@DeleteMapping(value="/delete/{id}", headers="Accept=application/json")
	public void delManufacturer(@PathVariable int id)
	{
		manager.deleteMan(id);
	}
	
	@GetMapping(value="/{seg_id}", headers="Accept=application/json")
	public String getManufacturerBySegment(@PathVariable int seg_id)
	{
		return new Gson().toJson(manager.getManList(seg_id));
	}
	
	
}
