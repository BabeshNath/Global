package testProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import productmenu.GetProducts;

/**
 * Created by bdebanat on 5/23/2016.
 */
public class GoogleHome extends GetProducts {

    public GoogleHome(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "q")
    public static WebElement textSearch;

    @FindBy(name = "btnG")
    public static WebElement buttonSearch;

    @FindBy(linkText = "Javatpoint - A Solution of all Technology")
    public WebElement lnkJavatpoint;

    public void Search(String searchAnything) {
        textSearch.sendKeys(searchAnything);
        buttonSearch.click();
    }

    public JavaTPointPage ClickJavaTpoint() {
        lnkJavatpoint.click();
        return new JavaTPointPage();
    }

}
