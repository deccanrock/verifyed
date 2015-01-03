package com.deccanrock.verifyed.service.dao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.deccanrock.verifyed.entity.OrgEntity;

public interface IOrgEntityDAO {
	
	Map<String, Object> createOrg( OrgEntity org) throws IOException, SQLException;
	boolean OrgExists( String orgname) throws IOException, SQLException;
	OrgEntity GetOrgDetails( String orgidname) throws IOException, SQLException;
}