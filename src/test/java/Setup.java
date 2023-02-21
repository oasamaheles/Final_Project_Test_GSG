import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Setup {
    public static ChromeDriver driver;
    public static WebDriverWait wait;

    @Test
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 70);
        driver.get("https://www.worldmarket.com");
        driver.manage().window().setSize(new Dimension(1936, 1048));
        Setup.driver.manage().deleteAllCookies();

    }


}
