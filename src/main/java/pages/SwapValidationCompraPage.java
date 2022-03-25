package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SwapValidationCompraPage extends PageObject {


    @FindBy(xpath ="//*[@id='react-burger-menu-btn']")
    public WebElementFacade burger_menu;

    @FindBy(xpath ="//*[@id='react-burger-cross-btn']")
    public WebElementFacade close_menu;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    public WebElementFacade addtocar_1;

    @FindBy(id="checkout")
    public WebElementFacade checkout;

    @FindBy(xpath ="//*[@id='remove-sauce-labs-backpack']")
    public WebElementFacade remove_1;

    @FindBy(xpath ="//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    public WebElementFacade addtocar_2;

    @FindBy(xpath ="//*[@id='remove-sauce-labs-bolt-t-shirt']")
    public WebElementFacade remove_2;

    @FindBy(xpath ="//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    public WebElementFacade addtocar_3;

    @FindBy(xpath ="//*[@id='remove-test.allthethings()-t-shirt-(red)']")
    public WebElementFacade remove_3;


    @FindBy(id="continue")
    public WebElementFacade btncontinue;

    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    public WebElementFacade carro;


    @FindBy(id="finish")
    public WebElementFacade btnFinish;

    @FindBy(xpath = "//*[@id='checkout_complete_container']")
    public WebElementFacade globoInformativo;

    @FindBy(id="first-name")
    public WebElementFacade txtFirstname;

    @FindBy(id="last-name")
    public WebElementFacade txtLastname;

    @FindBy(id="postal-code")
    public WebElementFacade txtPostalcode;

   public void firstName(String datos){
       txtFirstname.click();
       txtFirstname.clear();
       txtFirstname.sendKeys(datos);
   }
      public void LastName(String datos){
       txtLastname.click();
       txtLastname.clear();
       txtLastname.sendKeys(datos);
   }
public  void PostalCode(String datos){

       txtPostalcode.click();
       txtPostalcode.clear();
       txtPostalcode.sendKeys(datos);
}

    public  void checkout(){
        checkout.click();
    }

    public  void agregar_1(){
        addtocar_1.click();
    }

    public  void carro_car(){
       this.carro.click();
    }

    public  void agregar_2(){
        addtocar_2.click();
    }

    public  void agregar_3(){
        addtocar_3.click();
    }

public void  remove_1 ()
{
remove_1.click();
}

public void  remove_2 ()
    {
        remove_2.click();
    }

public void  remove_3 ()
    {
       remove_3.click();
    }

    public void endPagobtn() {
        btnFinish.click();
    }


    public void burger_menu_select(String datos) {
        burger_menu.click();
        burger_menu.selectByValue(datos);
    }

    public void form_sin_errores() {
     assertThat(globoInformativo.isCurrentlyVisible(),is(false));


    }

    public void validate() {
        btncontinue.click();
    }


}
