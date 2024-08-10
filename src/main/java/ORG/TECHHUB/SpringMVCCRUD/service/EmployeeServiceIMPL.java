package ORG.TECHHUB.SpringMVCCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ORG.TECHHUB.SpringMVCCRUD.model.Employee;
import ORG.TECHHUB.SpringMVCCRUD.model.Employee1;
import ORG.TECHHUB.SpringMVCCRUD.repository.EmployeeRepository;

@Service("empserv")
public class EmployeeServiceIMPL implements EmployeeService{
  
	 @Autowired
	 EmployeeRepository emprepo;
	

	public Boolean saveEmployee(Employee employee) {
	
		return emprepo.saveEmployee(employee);
	}


	@Override
	public boolean isLogin(Employee emp) {
		boolean b=emprepo.isLogin(emp);
		return b;
		
	}


	@Override
	public boolean isAddEmployee1(Employee1 emp) {
		boolean b= emprepo.isAddEmployee1(emp);
		return b;
	}


	@Override
	public List<Employee1> getAllEmployee1() {
	
		return emprepo.getAllEmployee1();
	}


	@Override
	public boolean isDelete(Integer id) {
	return emprepo.isDelete(id);
		
	}


	@Override
	public Boolean isUpdate(Employee1 emp) {
		return emprepo.isUpdate(emp);
		
	}


	@Override
	public List<Employee1> searchDataByUsingName(String name) {
	return emprepo.searchDataByUsingName(name);
	
	}


	@Override
	public List<Employee1> getAllEmployee1Names() {
	
		return emprepo.getAllEmployee1Names();
	}
}