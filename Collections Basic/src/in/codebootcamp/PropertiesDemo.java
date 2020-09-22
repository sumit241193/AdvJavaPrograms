//Store in Properties content

package in.codebootcamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("config/db.properties");
		
		Properties pro=new Properties();
		
		pro.setProperty("host", "localhost");
		pro.setProperty("user", "root");
		pro.setProperty("password", "123");
		System.out.println(pro.setProperty("dbname", "DemoSumit"));
		
		pro.store(fos, "created db file by sumit");
		
		System.out.println("Done");

	}

}
