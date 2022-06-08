package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read {
	public Properties pro;

	public Read() 
	{
		File src=new File("C:\\Users\\mindsdet166\\eclipse-workspace\\HybridCom\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String URl()
	{
		String src=pro.getProperty("URL");
		return src;	
	}


	public String Email()
	{
		String usern=pro.getProperty("Email");
		return usern;
	}
	public String password()
	{
		String pass=pro.getProperty("PassWord");
		return pass;
	}
	public String Browser()
	{
		String br=pro.getProperty("Browser");
		return br;
	}

}
