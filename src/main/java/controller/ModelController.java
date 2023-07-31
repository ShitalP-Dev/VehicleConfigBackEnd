package controller;

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

import manager.ModelManager;
import model.Models;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/model")
public class ModelController {

	@Autowired
	ModelManager manager;
	
	@GetMapping(value="/models", headers="Accept=application/json")
	public String getManufacturers()
	{
		return new Gson().toJson(manager.getMod());
	}
	
	@PostMapping(value="/addModel", headers="Accept=application/json")
	public void addManufacturer(@RequestBody Models model)
	{
		manager.addMod(model);
	}
	
	@DeleteMapping(value="/deleteModel/{id}", headers="Accept=application/json")
	public void delManufacturer(@PathVariable int id)
	{
		manager.deleteMod(id);
	}
	
	@GetMapping(value="/{segment_id}/{mid}", headers="Accept=application/json")
	public String getManufacturerBySegmentManufacturer(@PathVariable int segment_id, @PathVariable int mid)
	{
		System.out.println(segment_id +" "+mid);
		return new Gson().toJson(manager.getModList(segment_id,mid));
	}
	
	
	@GetMapping(value="/getModelByid/{id}", headers="Accept=application/json")
	public String getModelById(@PathVariable int id)
	{
		Models model =  manager.getModelById(id);
		return new Gson().toJson(model);
	}
	@GetMapping(value="/id/{segment_id}/{mid}", headers="Accept=application/json")
	public String getModelId(@PathVariable int segment_id, @PathVariable int mid)
	{
		System.out.println(segment_id +" "+mid);
		return new Gson().toJson(manager.getModId(segment_id,mid));
	}
	
	
}
