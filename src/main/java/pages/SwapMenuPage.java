package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class SwapMenuPage extends PageObject {


    @FindBy(xpath ="//*[@id='inventory_sidebar_link']")
    public WebElement inventory;

    @FindBy(xpath ="//*[@id='react-burger-menu-btn']")
    public WebElement burger_menu;

    @FindBy(xpath ="//*[@id='about_sidebar_link']")
    public WebElement about;


    @FindBy(xpath ="//*[@id='logout_sidebar_link']")
    public WebElement logout;


    @FindBy(xpath ="//*[@id='header_container']/div[2]/span")
    public WebElement header;

    @FindBy(id="checkout_complete_container")
    public WebElement CheckoutComplete;


    public void endPago() {

        String strMensaje = CheckoutComplete.getText();
        assertThat(strMensaje, containsString("THANK YOU FOR YOUR ORDER"));
    }


}
