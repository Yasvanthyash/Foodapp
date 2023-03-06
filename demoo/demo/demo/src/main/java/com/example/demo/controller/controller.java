package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.foodservice;

import com.example.demo.model.food;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class controller {

	@Autowired
	foodservice f1;
	
	@GetMapping("/get")
	public Iterable<food> getDetails()
	{
		return f1.get();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		f1.Delete(id);
		return "Id : "+id+" is deleted";
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody food b1)
	{
		return f1.Post(b1);
		
	}
	
	@PutMapping("/put/{id}")
	public food updatefoodDetails(@RequestBody food b)
	{
		
		return f1.Update(b);
		
	}
	
	
}
