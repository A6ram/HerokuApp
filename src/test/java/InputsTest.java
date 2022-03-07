import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest{
    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement element = driver.findElement(By.tagName("input"));

        element.sendKeys("3");
        String string = element.getAttribute("value");
        assertEquals(string, "3", "string not correct");
        element.sendKeys(Keys.ARROW_UP);
        string = element.getAttribute("value");
        assertEquals(string, "4", "string not correct");
        element.sendKeys(Keys.ARROW_DOWN);
        string = element.getAttribute("value");
        assertEquals(string, "3", "string not correct");
        element.clear();
        element.sendKeys("abcd");
        string = element.getAttribute("value");
        assertEquals(string, "", "string not correct");
        element.clear();
        element.sendKeys("9e2");
        string = element.getAttribute("value");
        assertEquals(string, "9e2", "string not correct");

    }
}
