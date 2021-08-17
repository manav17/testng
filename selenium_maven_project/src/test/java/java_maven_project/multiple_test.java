


    package java_maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


    public class multiple_test {

        WebDriver driver;

        @BeforeClass
        void print() {
            System.out.println("before class demo");
        }

        @Test()
        void open_app() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://ems-qa-master.awsqa-gridpoint.com/login");
            Thread.sleep(10000);
        }

        //find username
        //USING XPATH

        @Test(dependsOnMethods = "open_app")
        void login_page() throws InterruptedException {
            WebElement txtbx_username = driver.findElement(By.xpath("//input[@id='username']"));

            txtbx_username.sendKeys("manav_admin");
            driver.findElement(By.name("nextBtn")).click();


            // wait command

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            //driver.manage().timeout().implicitWait(500);


            // find password

            WebElement txt_password = driver.findElement(By.id("current-password"));
            txt_password.sendKeys("P@ssword1!");

            // click to admin page
            driver.findElement(By.id("loginBtn")).click();

            //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            // for proper timeout use thread.sleep because for implicit and explicit it checks the condition before waiting and returns the previous
            //login page
            Thread.sleep(10000);}

@Test(dependsOnMethods = "login_page")
            void verify() throws InterruptedException {
                String expected_title = "GridPoint Admin";
                String actual_title = driver.getTitle();
                System.out.println(actual_title);

                if (expected_title.equals(actual_title)) {
                    System.out.println("login successful");

                } else {
                    System.out.println("not verified");
                }
                Thread.sleep(10000);

                driver.findElement(By.id("Users")).click();


                WebElement user_search = driver.findElement(By.id("usersSearchField"));
                user_search.sendKeys("manav_admin");
    Thread.sleep(5000);
            }

@Test(dependsOnMethods = "verify")
void log_out()
{
    driver.findElement(By.id("options")).click();
    driver.findElement(By.xpath("//a[@data-ng-controller = 'logoutCtrl']")).click();


}



        }

