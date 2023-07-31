package controller;

import java.util.List;

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

import manager.ModelDetailManager;
import model.ModelDetail;
import model.Models;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/mdet")
public class ModelDetailController {
	@Autowired
	ModelDetailManager manager;
	
	
	@GetMapping(value="/getModelByid/{id}", headers="Accept=application/json")
	public String getModelById(@PathVariable int id)
	{		
		return new Gson().toJson(manager.getModelDetailLists(id));
	}
	@GetMapping(value="/getStdByid/{id}", headers="Accept=application/json")
	public String getStdById(@PathVariable int id)
	{		
		return new Gson().toJson(manager.getStdDetailLists(id));
	}
	@GetMapping(value="/getIntByid/{id}", headers="Accept=application/json")
	public String getIntById(@PathVariable int id)
	{		
		return new Gson().toJson(manager.getIntDetailLists(id));
	}
	@GetMapping(value="/getExtByid/{id}", headers="Accept=application/json")
	public String getExtById(@PathVariable int id)
	{		
		return new Gson().toJson(manager.getExtDetailLists(id));
	}
	@GetMapping(value="/getCoreByid/{id}", headers="Accept=application/json")
	public String geCoreById(@PathVariable int id)
	{		
		return new Gson().toJson(manager.getCoreDetailLists(id));
	}


	
}
