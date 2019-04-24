package maven1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test
	public void ctest() throws InterruptedException {
	    ChromeDriver driver = new ChromeDriver();
	    Thread.sleep(5000);
	    driver.close();
	}

}
