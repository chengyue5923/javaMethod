package Flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPool {

	
	private Vector<Connection> pool;
	
	private String url="jdbc:mysql://localhost:3306/test";
	private String username="root";
	private String password="root";
	private String drivrtClassName="com.mysql.jdbc.Driver";
	
	private int poolSize=100;
	private static ConnectionPool instance=null;
	
	Connection conn=null;
	
	/**
	 * 构造方法
	 */
	private ConnectionPool(){
		pool=new Vector<Connection>(poolSize);
		
		for(int i=0;i<poolSize;i++){
			
			try{
				Class.forName(drivrtClassName);
				conn=DriverManager.getConnection(url,username,password);
				pool.add(conn);
			}
			catch(Exception e){
				
			}
		}
		
	}
	/**
	 * 返回到连接池
	 */
	
	public synchronized void release(){
		pool.add(conn);
	}
	
	/**
	 * 返回连接池中的一个数据库连接
	 */
	public synchronized Connection getConnection(){
		
		if(pool.size()>0){
			Connection conn=pool.get(0);
			pool.remove(conn);
			return conn;
		}else{
			return null;
		}
	}
	
	
}
