package com.asiainfo.frame.mybatis;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * 针对MyBaits插入在Oracle下date类型无法保存时分秒的处理插件<br/>
 * mybatis中 jdbcType 时间类型<br/>
 * 当jdbcType = DATE 时, 只传入了 年月日<br/>
 * jdbcType = TIMESTAMP , 年月日+ 时分秒<br/>
 * 
 * @author Typhon Chens
 * 
 */
public class DateToTimestampPlugin extends PluginAdapter {

	private String dbType = "mysql";

	@Override
	public void setProperties(Properties properties) {
		super.setProperties(properties);

		String dbTypeProp = getContext().getProperty("DBType");
		if (dbTypeProp != null)
			this.dbType = dbTypeProp.toLowerCase();
	}

	private boolean isOracleDB() {
		return "oracle".equals(dbType);
	}

	private boolean isMysqlDB() {
		return "mysql".equals(dbType);
	}
	
	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		List<IntrospectedColumn> cols = table.getAllColumns();
		for (IntrospectedColumn col : cols) {
			if(col.isJDBCDateColumn()
        			&& "DATE".equalsIgnoreCase(col.getJdbcTypeName())) {				
				col.setJdbcTypeName("TIMESTAMP");
			}
		}
	}
}
