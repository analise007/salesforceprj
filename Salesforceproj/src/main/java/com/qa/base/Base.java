package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base 
{
	
  public static WebDriver driver;
  public static Properties prop;
  
  public Base() {
	  try {
		  prop= new Properties();
		  FileInputStream fip=new FileInputStream("C:\\Users\\DELL\\git\\repository2\\Salesforceproj\\src\\main\\java\\com\\qa\\sf\\config\\config.properties");
		  prop.load(fip);
		  
	  }
	  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	  
  }

}
