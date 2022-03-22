import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.assertTrue;

public class FileDownloadTest extends BaseTest {

    @Test
    public void fileDownload() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
        String fileName = "1.txt";
        driver.findElement(By.linkText(fileName)).click();
        Thread.sleep(5000);
        assertTrue(Files.exists(Paths.get("/Users/user/Downloads/" + fileName)));
    }
}
