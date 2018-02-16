package fyber.acceptenceTests

import fyber.acceptenceTests.Pages.PortalHome
import org.testng.annotations.Test
import kotlin.test.assertTrue


class PortalHomeTest() : AcceptanceTestBase() {

    @Test(priority = 1)
    fun checkFyberLogo() {

        val homePage = PortalHome(driver!!)
        assertTrue { homePage.isFyberLogoDisplayed() }
    }

    @Test(priority = 2)
    fun checkAndroidDevPortalNavigateButton() {

        val homePage = PortalHome(driver!!)
        assertTrue { homePage.isAndroidPortalButtonDisplayed() }
    }

    @Test(priority = 3)
    fun checkUnityDevPortalNavigateButton() {
        val homePage = PortalHome(driver!!)
        assertTrue { homePage.isUnityPortalButtonDisplayed() }
    }

    @Test(priority = 4)
    fun checkAirDevPortalNavigateButton() {

        val homePage = PortalHome(driver!!)
        assertTrue { homePage.isAirPortalButtonDisplayed() }
    }
}
