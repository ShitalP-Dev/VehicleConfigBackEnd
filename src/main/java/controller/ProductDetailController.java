package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import manager.ProductDetailManager;
import model.Items;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/items")
public class ProductDetailController {

	@Autowired
	ProductDetailManager manager;
	
	
	@GetMapping(value = "/getdefaultitems/{id}", headers = "Accept=application/json")
	public String getDefaultItems(@PathVariable int id)
	{
		
		return new Gson().toJson(manager.getDefaultDetails(id));
	}
	 
	@GetMapping(value = "/getitems/{id}/{configtype}", headers = "Accept=application/json")
	public String getItems(@PathVariable int id,@PathVariable String configtype )
	{
		
		return new Gson().toJson(manager.getDetails(id,configtype));
	}
	@GetMapping(value = "/getextitems/{id}/{configtype}", headers = "Accept=application/json")
	public String getEItems(@PathVariable int id,@PathVariable String configtype )
	{
		
		return new Gson().toJson(manager.getEDetails(id,configtype));
	}
	@GetMapping(value = "/getintitems/{id}/{configtype}", headers = "Accept=application/json")
	public String getIItems(@PathVariable int id,@PathVariable String configtype )
	{
		
		return new Gson().toJson(manager.getIDetails(id,configtype));
	}
	@GetMapping(value = "/getstditems/{id}/{configtype}", headers = "Accept=application/json")
	public String getSItems(@PathVariable int id,@PathVariable String configtype )
	{
		
		return new Gson().toJson(manager.getSDetails(id,configtype));
	}
	@GetMapping(value = "/getcoreitems/{id}", headers = "Accept=application/json")
	public String getCItems(@PathVariable int id )
	{
		
		return new Gson().toJson(manager.getCDetails(id));
	}
	
}
