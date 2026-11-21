package dao;

import java.sql.SQLException;

import entities.Profilo;

public interface ProfiloDAO {

	Profilo getProfiloByUsername(String username) throws SQLException;
}
