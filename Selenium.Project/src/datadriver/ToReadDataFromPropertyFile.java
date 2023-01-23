package datadriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class ToReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		//step 1: creating input stream type object 
		File absPath=new File("./TestData/configuration.properties");
		FileInputStream fis = new FileInputStream(absPath);
		
		//step2: creating object of file type
		Properties properties = new Properties();
	     properties.load(fis);
	   
	    //step3: Read methods
	      String name = properties.get("name").toString();//we have to use this to create link with configuration properties 
	      System.out.println(name);
	      
	      System.out.println(properties.get("url").toString());
	      System.out.println(properties.getProperty("browser").toString());
	      
	      //String browser=properties.getProperty("browser").toString();
	    //  System.out.println(browser); we can do like this 

}
}