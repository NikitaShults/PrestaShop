package BaseConfiguration;

import com.prestashop.pages.*;
import com.prestashop.steps.CreateAnAccountStep;
import com.prestashop.steps.FeedbackStep;
import com.prestashop.steps.LogInStep;
import com.prestashop.utils.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    private WebDriver driver;
    protected MainPage mainPage;
    protected FeedbackPage feedbackPage;
    protected LogInPage logInPage;
    protected CreateAnAccountPage createAnAccountPage;
    protected MyAccountPage myAccountPage;
    protected SearchPage searchPage;
    protected FeedbackStep feedbackStep;
    protected LogInStep logInStep;
    protected CreateAnAccountStep createAnAccountStep;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainPage = new MainPage(driver);
        feedbackPage = new FeedbackPage(driver);
        logInPage = new LogInPage(driver);
        createAnAccountPage = new CreateAnAccountPage(driver);
        myAccountPage = new MyAccountPage(driver);
        searchPage = new SearchPage(driver);
        feedbackStep = new FeedbackStep(driver);
        logInStep = new LogInStep(driver);
        createAnAccountStep = new CreateAnAccountStep(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}