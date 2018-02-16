package fyber.acceptenceTests.Pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

open class PortalHome(public val driver: WebDriver){

    //Fyber Logo
    @FindBy(xpath = "//*[@id=\"header\"]/div/h1/a")
    private val logoMain : WebElement ?=null;

    //Image link to Android Portal
    @FindBy(xpath = "/html/body/div/div/div/a[2]/img")
    private val logoAndroidPortal : WebElement ?=null

    //Image link to Unity Portal
    @FindBy(xpath = "/html/body/div/div/div/a[3]/img")
    private val logoUnityPortal : WebElement ?=null

    //Image link to Air Portal
    @FindBy(xpath = "/html/body/div/div/div/a[4]/img")
    private val logoAirPortal : WebElement ?=null


    init {
        PageFactory.initElements(driver,this)
    }

    fun isFyberLogoDisplayed(): Boolean {


        return logoMain!!.isDisplayed

    }

    fun isAndroidPortalButtonDisplayed(): Boolean {


        return logoAndroidPortal!!.isDisplayed


    }

    fun isAirPortalButtonDisplayed(): Boolean {

        return logoAirPortal!!.isDisplayed

    }

    fun isUnityPortalButtonDisplayed(): Boolean {

         return logoUnityPortal!!.isDisplayed

    }

    fun clickOnAndroidPortalButton(){

        logoAndroidPortal!!.click()

    }

    fun clickOnUnityPortalButton(){

        logoUnityPortal!!.click()

    }

    fun clickOnAirPortalButton(){

        logoAirPortal!!.click()

    }


}
