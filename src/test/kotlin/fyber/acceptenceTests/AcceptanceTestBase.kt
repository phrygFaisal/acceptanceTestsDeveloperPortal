package fyber.acceptenceTests

import fyber.acceptenceTests.AcceptanceTestsDeveloperPortalUtility
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import java.net.URI
import java.util.concurrent.TimeUnit

abstract class TestBase {

    lateinit var driver: WebDriver
        public set

    @BeforeTest
    fun setup() {
        System.setProperty(AcceptanceTestsDeveloperPortalUtility.getProperties("nameDriver"),
                AcceptanceTestsDeveloperPortalUtility.getProperties("pathDriver") +
                        AcceptanceTestsDeveloperPortalUtility.getProperties("exeDriver"))
        driver = ChromeDriver()
        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver?.manage()?.window()?.maximize()
        driver?.get(URI(AcceptanceTestsDeveloperPortalUtility.getProperties("pageURL")).toString())
    }

    @AfterTest
    fun driverClose() {
        driver?.close();
    }
}