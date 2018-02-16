package fyber.acceptenceTests


import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeTest
import java.net.URI
import java.util.concurrent.TimeUnit

abstract class AcceptanceTestBase {

    lateinit var driver: WebDriver
        set

    @BeforeClass
    fun setup() {
        System.setProperty(AcceptanceTestsDeveloperPortalUtility.getProperties("nameDriver"),
                AcceptanceTestsDeveloperPortalUtility.getProperties("pathDriver") +
                        AcceptanceTestsDeveloperPortalUtility.getProperties("exeDriver"))
        driver = ChromeDriver()
        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver?.manage()?.window()?.maximize()
        driver?.get(URI(AcceptanceTestsDeveloperPortalUtility.getProperties("pageURL")).toString())
    }



    @AfterClass
    fun driverClose() {
        driver?.close();
    }
}