package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	private List<Department> list = new ArrayList<>();
	
	public List<Department> findAll() {
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Notebooks"));
		list.add(new Department(3, "TV's"));
		
		return list;
	}
}
