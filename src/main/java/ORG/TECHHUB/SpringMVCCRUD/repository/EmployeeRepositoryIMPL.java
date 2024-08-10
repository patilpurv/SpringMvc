package ORG.TECHHUB.SpringMVCCRUD.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ORG.TECHHUB.SpringMVCCRUD.model.Employee;
import ORG.TECHHUB.SpringMVCCRUD.model.Employee1;

@Repository("emprepo")
public class EmployeeRepositoryIMPL implements EmployeeRepository {
	@Autowired
	JdbcTemplate template;
	

	@Override
	public boolean saveEmployee(final Employee emp) {

	int	val = template.update("insert into employee value('0',?,?,?,?,?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, emp.getName());
				ps.setString(2, emp.getEmail());
				ps.setString(3, emp.getContact());
				ps.setString(4, emp.getUname());
				ps.setString(5, emp.getPass());
			}

		});
		if (val > 0) {
			return true;

		} else {
			return false;

		}
	}

	@Override
	public boolean isLogin(Employee emp) {
		
		List<Employee> list = template.query("select * from employee where uname=? and password=?",
				new PreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						ps.setString(1, emp.getUname());
						ps.setString(2, emp.getPass());

					}

				}, new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employee emp = new Employee();
						emp.setId(rs.getInt(1));
						emp.setName(rs.getString(2));
						emp.setEmail(rs.getString(3));
						emp.setContact(rs.getString(4));
						emp.setUname(rs.getString(5));
						emp.setPass(rs.getString(6));
						return emp;

					}

				});
		if(list.size()>0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	@Override
	public boolean isAddEmployee1(Employee1 emp) {
	
	int val=template.update("insert into employee1 value('0',?,?,?)",new Object [] {emp.getName(),emp.getEmail(),emp.getContact()});
	if(val>0)
	{
		return true;
		
	}
	else
	{
		return false;
	}
	
	}

	@Override
	public List<Employee1> getAllEmployee1() {
	
	List<Employee1> list=template.query("select * from employee1", new RowMapper<Employee1>() {

		@Override
		public Employee1 mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee1 emp=new Employee1();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setContact(rs.getString(4));
			return emp;
		}
		
	});
	return list;
	}

	@Override
	public boolean isDelete(Integer id) {
		int val=template.update("delete from employee where id=?",new Object[] {id});
		if(val>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Boolean isUpdate(Employee1 emp) {
	int val=template.update("update employee set name=?,email=?,contact=? where id=?",new Object[] {emp.getName(),emp.getEmail(),emp.getContact(),emp.getId()});
	if(val>0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}

	@Override
	public List<Employee1> searchDataByUsingName(String name) {
		//PreparedStatementSetterIMPL psi=new PreparedStatementSetterIMPL();
		//psi.setName(name);5+
		RowMapperIMPL r=new RowMapperIMPL();
	
		List<Employee1> list=template.query("select * from employee1  where name like '" + name + "%'",r);
		return list;
	}

	@Override
	public List<Employee1> getAllEmployee1Names() {
	List<Employee1> list=template.query("select id,name from employee",new RowMapper<Employee1>()
			{

				@Override
				public Employee1 mapRow(ResultSet rs, int rowNum) throws SQLException {
					Employee1 emp=new Employee1();
					emp.setId(rs.getInt(1));
					emp.setName(rs.getString(2));
					return emp;
				}
		
			});
		return list;
	}

}
