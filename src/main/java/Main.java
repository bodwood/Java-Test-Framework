import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;
import utils.FrameworkProperties;

public class Main {
    public static void main(String[] args) {
        FrameworkProperties frameworkProperties = new FrameworkProperties();
        DriverSingleton driverSingleton = DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("https://bitheap.tech");

        SignInPage signInPage = new SignInPage();
        signInPage.logIn("bb@g.com", "123456");


    }
}
