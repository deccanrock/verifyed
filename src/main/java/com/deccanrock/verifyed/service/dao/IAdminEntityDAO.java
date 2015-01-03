package com.deccanrock.verifyed.service.dao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.deccanrock.verifyed.entity.AdminTasksEntity;



public interface IAdminEntityDAO {
	
	boolean Login ( String username, String pass) throws IOException, SQLException;
	List<AdminTasksEntity> GetAllTasks() throws IOException, SQLException;
	List<String> GetOrgList(String query) throws IOException, SQLException;
}