package utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class MetodosJSON extends PageObject
{
    public void abrirSitioWeb(String url)
    {
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    public void escribir(By elemento, String texto)
    {
        for (int i = 0; i < texto.length(); i++)
        {
            char cadena = texto.charAt(i);
            String s = String.valueOf(cadena);
            getDriver().findElement(elemento).sendKeys(s);
        }
    }

    public void cliquear(By elemento)
    {
        getDriver().findElement(elemento).click();
    }

    public void validarMensajeElemento(By elemento, String texto)
    {
        assertThat(getDriver().findElement(elemento).getText(), CoreMatchers.containsString(texto));
    }

    public void tomarPantallazo(By elemento, String texto)
    {
        Serenity.takeScreenshot();
    }

    public void cambiarPestana(String params)
    {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(Integer.parseInt(params)));
    }

    public void scrollAElemento(By elemento)
    {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(elemento));
        waitFor(5).seconds();
    }

    public void tiempoDeEspera(int segundos)
    {
        waitFor(segundos).seconds();
    }

    public void cerrarVentana()
    {
        getDriver().close();
    }

    public void cerrarNavegador()
    {
        getDriver().quit();
    }

    public void bajarPantallaPixeles(String intPixeles)
    {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0," + intPixeles + ");", "");
    }

    public void subirPantallaPixeles(String intPixeles)
    {
        ((JavascriptExecutor) getDriver())
                .executeScript("window.scrollBy(0," + -1 * Integer.parseInt(intPixeles) + ");", "");
    }

    public void esperarElementoVisible(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getDriver().findElement(elemento)));
    }

    public void esperarElementoExista(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(getDriver().findElement(elemento)));
    }

    public void esperarElementoClicleable(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void esperarElementoDesaparesca(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(elemento)));
    }
}