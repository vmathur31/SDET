package FirstTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

public class ReadPropFileData {

	public static void main(String[] args) 
	{
		
		File file = new File("./Resources/Config.properties");
        
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        
        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Name of Trainig---->"+prop.getProperty("Training"));
        System.out.println("Batch no is--->"+prop.getProperty("Batch"));
        System.out.println("LoginPage1--->"+prop.getProperty("LoginPage1"));
        
        try {
            Properties properties = new Properties();
            properties.setProperty("Todayis-", "12");
            properties.setProperty("Wearein-", "3rd Week");
            properties.setProperty("ItsGoing-", "Good So far");

            File file1 = new File("./Resources/Config.properties");
            FileOutputStream fileOut = new FileOutputStream(file1, true);
            properties.store(fileOut, "Favorite Things");
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



}


	}


