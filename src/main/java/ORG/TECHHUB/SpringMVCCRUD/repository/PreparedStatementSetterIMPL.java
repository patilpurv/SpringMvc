package ORG.TECHHUB.SpringMVCCRUD.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class PreparedStatementSetterIMPL implements PreparedStatementSetter {
  String name;
  public void setName(String name)
   {
	this.name=name;
   }
	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
	ps.setString(1, name);
		
	}

   }
