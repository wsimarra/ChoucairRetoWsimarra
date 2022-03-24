package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SwapMenuPage extends PageObject {


    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    public WebElement img1left;

    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div[2]/div[1]")
    public WebElement img2left;

    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")
    public WebElement img3left;

    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")
    public WebElement img4left;

    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")
    public WebElement img5left;

   @FindBy (xpath ="//*[@id='item_3_img_link']/img")
    public WebElement img6left;

}
