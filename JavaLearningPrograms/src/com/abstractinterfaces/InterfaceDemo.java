package com.abstractinterfaces;

class OracleDB implements MyInter
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Oracle Database......");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnecting from Oracle.....");
		
	}
	
}

class SybaseDB implements MyInter
{

	@Override
	public void connect() {
		System.out.println("Conneting to the Sybase");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from the Sybase");
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		OracleDB oracleDB = new OracleDB();
		oracleDB.connect();
		oracleDB.disconnect();
		SybaseDB sybaseDB = new SybaseDB();
		sybaseDB.connect();
		sybaseDB.disconnect();
	}

}
