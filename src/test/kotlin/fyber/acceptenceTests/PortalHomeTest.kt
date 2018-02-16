package fyber.acceptenceTests

import fyber.acceptenceTests.AcceptanceTestsDeveloperPortalUtility
import fyber.acceptenceTests.Pages.PortalHome
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.testng.annotations.Test
import kotlin.test.assertTrue

@Test
class PortalHomeTest() : AcceptanceTestBase() {

    @Test
    fun searchLogo() {

        val homePage = PortalHome(driver!!)

        assertTrue { homePage.isLogoPresent() }
    }
}
