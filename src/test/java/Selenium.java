
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(MockitoJUnitRunner.class)
public class Selenium {

    WebDriver driver;

    /*
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\MoK\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hallur.dk/SeleniumTestPage.html?fbclid=IwAR374t9vuCmv3lWqmVoL15gnhAlxRiFgErflULi-CZ1LC7jWsYaOEvurWt8");
    } 
        WebDriver driver;
     */
    public Selenium() {
    }

    @Before
    public void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MoK\\Downloads\\chromedriver.exe");//add your driver.
        driver = new ChromeDriver();
        driver.get("http://hallur.dk/SeleniumTestPage.html?fbclid=IwAR374t9vuCmv3lWqmVoL15gnhAlxRiFgErflULi-CZ1LC7jWsYaOEvurWt8");

    }

    @Test
    public void getInitialPageTest() {
        WebElement element = driver.findElement(By.tagName("b"));
        assertEquals("Hello", element.getText());
    }

    @Test
    public void clickButton() {
        WebElement element = driver.findElement(By.tagName("button"));
        WebElement element2 = driver.findElement(By.tagName("b"));
        element.click();
        assertEquals("Bye", element2.getText());
    }
/*
    @Test
    public void mockitoTest() {
    when("how").thenReturn("how");

    }
*/
    @After
    public void cleanUpClass() throws Exception {
        driver.quit();
    }
}
