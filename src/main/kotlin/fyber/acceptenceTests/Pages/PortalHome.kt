package fyber.acceptenceTests.Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

open class PortalHome(val driver: WebDriver){

    @FindBy(xpath = "//*[@id=\"header\"]/div/h1/a")
    private val logoMain : WebElement ?=null;

    init {
        PageFactory.initElements(driver,this)
    }



    fun isLogoPresent(): Boolean {

        if (logoMain != null)
            return logoMain.isDisplayed

        else
            return false
        }
}
