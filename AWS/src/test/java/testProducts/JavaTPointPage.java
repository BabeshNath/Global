package testProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by bdebanat on 5/23/2016.
 */
public class JavaTPointPage {
    public JavaTPointPage() {

    }

    public JavaTPointPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText ="JavaTPoint")
    public WebElement lnkJavaTPoint;
    @FindBy(xpath = ".//div[@id='link']/div/ul/li[1]/a")
    public WebElement LnkJavaTPointHome;

    public void ClickJavaTPoint() {
        lnkJavaTPoint.click();
    }
    public void NavigateBackHome() {
        LnkJavaTPointHome.click();
    }


}
