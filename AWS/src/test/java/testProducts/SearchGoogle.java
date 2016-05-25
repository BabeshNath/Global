package testProducts;

import org.testng.annotations.Test;
import productmenu.GetProducts;

/**
 * Created by bdebanat on 5/16/2016.
 */
public class SearchGoogle extends GetProducts {
    @Test
    public void TestGoogle()throws InterruptedException {
        GoogleHome page = new GoogleHome(driver);
        page.Search("javatpoint");
        JavaTPointPage tPointPage = page.ClickJavaTpoint();
        Thread.sleep(4000);
        tPointPage.ClickJavaTPoint();
        tPointPage.NavigateBackHome();
    }
}
