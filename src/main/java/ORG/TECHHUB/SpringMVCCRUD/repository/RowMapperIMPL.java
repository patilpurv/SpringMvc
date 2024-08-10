package ORG.TECHHUB.SpringMVCCRUD.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ORG.TECHHUB.SpringMVCCRUD.model.Employee1;

public class RowMapperIMPL implements RowMapper<Employee1>{

	@Override
	public Employee1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee1 emp=new Employee1();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setEmail(rs.getString(3));
		emp.setContact(rs.getString(4));
		return emp;
	}

}
