package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties ps;
	
	public ConfigurationReader() throws IOException {
		 File file = new File("src\\test\\java\\com\\helper\\launch.property");
		 FileInputStream fis = new FileInputStream(file);
		 ps = new Properties();
		 ps.load(fis);
	}
	
	public String getBrowser() {
		 String address = ps.getProperty("Browser");
		 return address;
	}
	public String getUrl() {
		String url = ps.getProperty("URL");
		return url;
	}
}