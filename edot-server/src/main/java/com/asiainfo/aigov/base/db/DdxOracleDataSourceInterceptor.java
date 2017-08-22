package com.asiainfo.aigov.base.db;

import com.asiainfo.aigov.core.database.MultDBContextHolder;

public class DdxOracleDataSourceInterceptor {
	public static final String WORK_ORACLE_DATA_SOURCE = "ddxOracleDataSource";
	
	public void setDataSourceOracle() {
		MultDBContextHolder.setDbType(WORK_ORACLE_DATA_SOURCE);
	}
}
