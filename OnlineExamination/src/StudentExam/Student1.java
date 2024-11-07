package StudentExam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student1 {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String studentcode=p.getProperty("studentcode");
		String password=p.getProperty("password");
		System.out.println(url);
		System.out.println(studentcode);
		System.out.println(password);
		
	}

}
