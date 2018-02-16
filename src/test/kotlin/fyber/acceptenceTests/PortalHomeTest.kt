package fyber.acceptenceTests

import fyber.acceptenceTests.AcceptanceTestsDeveloperPortalUtility
import fyber.acceptenceTests.Pages.PortalHome
import org.testng.Assert
import org.testng.annotations.Test
import kotlin.test.assertTrue


class PortalHomeTest : PortalHome(){

    @Test
    fun searchVideo() {

        val homePage = PortalHome(driver!!)

        assertTrue { homePage.isLogoPresent() }
    }
}
