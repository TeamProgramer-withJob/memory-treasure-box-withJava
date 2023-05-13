package com.memorytreasurebox.comn.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 谷渕弘和 <br>
 *このクラスはDBの共通処理を記載
 */

public class dbBean {
	
	/** DBのurl */
	private String url;
	/** DBのユーザー名*/
	private String username;
	/** DBのパスワード */
	private String password;
	
	dbBean(){
		try(InputStream input = getClass().getClassLoader().getResourceAsStream("dbBean.properties")){
			Properties prop = new Properties();
			prop.load(input);
			this.url = prop.getProperty("database.url");
			this.username = prop.getProperty("database.username");
            this.password = prop.getProperty("database.password");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * DBの接続
	 * @return Connection
	 * @throws SQLException
	 */
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	
	
	/**
	 * @param rs executeQuery後のResultSet
	 * @return DBから取得した複数レコードを各MapにしてListに格納
	 * @throws SQLException
	 */
	
	public List<Map<String,String>> resultSetToList(ResultSet rs) throws SQLException {
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		List<Map<String,String>> rows = new ArrayList<>();
		while(rs.next()) {
			Map<String, String> row = new HashMap<>(columns);
			for(int i = 1; i <= columns; ++i) {
				row.put(md.getColumnName(i), rs.getString(i));
			}
			rows.add(row);
		}
		return rows;
	}
	

}
