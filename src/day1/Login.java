package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("qshore");
		
		driver.findElement(By.name("password")).sendKeys("qshore123");
		
		driver.findElement(By.name("login")).click();
		
		String expTitle="Find a Flight: Mercury Tours: ";
		
		String actTitle=driver.getTitle();
		
		if(actTitle.equalsIgnoreCase(expTitle))
		{
			System.out.println("Login Validated");
		}
		
		else
		{
			System.out.println("Login failed");
		}
		
		

	}

}
