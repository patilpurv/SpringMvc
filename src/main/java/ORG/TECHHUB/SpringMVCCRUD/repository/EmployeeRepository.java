package ORG.TECHHUB.SpringMVCCRUD.repository;

import java.util.List;

import ORG.TECHHUB.SpringMVCCRUD.model.Employee;
import ORG.TECHHUB.SpringMVCCRUD.model.Employee1;

public interface EmployeeRepository {
	public boolean saveEmployee(Employee emp);

	public boolean isLogin(Employee emp);

	public boolean isAddEmployee1(Employee1 emp);

	public List<Employee1> getAllEmployee1();

	public boolean isDelete(Integer id);

	public Boolean isUpdate(Employee1 emp);

	public List<Employee1> searchDataByUsingName(String name);

	public List<Employee1> getAllEmployee1Names();

}
