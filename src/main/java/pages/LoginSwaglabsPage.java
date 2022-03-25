package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.saucedemo.com/inventory.html")

public class LoginSwaglabsPage extends PageObject{



    @FindBy(id="user-name")
    public   WebElement txtUserName;

    @FindBy(id="password")
    public    WebElementFacade txtPassword;

    @FindBy(name="login-button")
    public    WebElement btnSubmit;

    // label del home verificar
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    public WebElementFacade iblHomePpal;
        public  void ingresarDatos(String strUsuario, String strPass) {
        txtUserName.sendKeys(strUsuario);
        txtPassword.sendKeys(strPass);
        btnSubmit.click();
    }

    public void VerificaHome() {
        String labelv = "PRODUCTS";
        String strMensaje = iblHomePpal.getText();
        assertThat(strMensaje, containsString(labelv));
    }

}