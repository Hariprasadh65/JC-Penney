package com.helper.jc;

public class FileReadManager {

	
	public static FileReadManager getInstanceFile() {
		
		FileReadManager helper = new FileReadManager();
		return helper;
		
	}
	
	
	
	
	public Configuration_Reader getInstanceCR() throws Throwable   {

		Configuration_Reader cr = new Configuration_Reader();
		return cr;
		
	}
	
	
	
	
	
	
	
	
}
