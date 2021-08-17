package java_maven_project;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class validate {

@Test
 void function()
    {
 ChromeDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
 driver.get("https://ems-qa-master.awsqa-gridpoint.com/login");
        String expected_title = "Gridpoint Energy Manager: Login";
        String actual_title = driver.getTitle();
        String expected_text = "username";
        WebElement actual_text = driver.findElement(By.xpath("//input[@id='username']"));

                Assert.assertEquals(actual_title,expected_title);

      Assert.assertEquals(actual_text,expected_text,"successful");
        driver.quit();
    }



}
