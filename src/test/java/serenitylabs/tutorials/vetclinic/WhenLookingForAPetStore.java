package serenitylabs.tutorials.vetclinic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.serenitybdd.core.annotations.findby.By;

public class WhenLookingForAPetStore {
	 @Test
	    public void should_find_petStore(){
//	        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
//	        WebDriver driver = new FirefoxDriver();
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://duckduckgo.com/");
	        driver.findElement(By.id("search_form_input_homepage")).sendKeys("pet store");

	        driver.findElement(By.id("search_button_homepage")).click();
	        assertThat(driver.getTitle(),equalTo("pet store at DuckDuckGo"));
	        driver.quit();
	    }
}
                      