package serenitylabs.tutorials.vetclinic;

import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.*;
public class WhenAddingANewToDoItem {
	
	@Test
	public void should_add_new_item_to_list() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       //Given 
	        driver.get("https://todomvc.com/examples/angularjs/#/");
	        //When
	     WebElement input = driver.findElement(By.cssSelector("input.new-todo"));
	     input.sendKeys("Buy Milk");
	     input.sendKeys(Keys.RETURN);
	     //    //label[@class='ng-binding'][text()='Buy Milk']
	   //label[@class='ng-binding'][text()='buy plants']
	     WebElement todoListContents =  driver.findElement(By.xpath(" //label[@class='ng-binding'][text()='Buy Milk']"));
	     assertThat(todoListContents.getText(), containsString("Buy Milk"));
	     driver.quit();
	     
	}

}
