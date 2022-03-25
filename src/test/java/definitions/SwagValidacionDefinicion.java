package definitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.SwapMenuPage;
import steps.SwagValidationStep;
import steps.SwapValidationCompraStep;
//import sun.net.www.protocol.http.AuthenticationHeader;

import java.util.List;

public class SwagValidacionDefinicion {


    @Steps
    SwagValidationStep swagValidationStep;

    @Steps
     SwapValidationCompraStep  swapValidationCompraStep;




    @Given("^Autentico en SWAGLABS con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autentico_en_SWAGLABS_usuario(String usuario, String clave)  {
        // Write code here that turns the phrase above into concrete actions
        swagValidationStep.login_Swag(usuario,clave);

    }

    @When("^Ingreso a la funcionalidad compra$")
    public void ingreso_a_la_funcionalidad_compra() {
        swagValidationStep.ingreso_a_la_funcionalidad_compra();
    }

    @When("^agregar articulo al car$")
    public void agregar_articulo_al_car()  {
        // Write code here that turns the phrase above into concrete actions
        swapValidationCompraStep.agregar_articulo_al_car();
        swapValidationCompraStep.diligenciar_datos();


    }
@And("^ingresar datos de comprador$")
public  void  ingresar_datos_de_comprador(DataTable dtDatosForm){

    List<List<String>> data=dtDatosForm.raw();
    for(int i=1; i<data.size();i++){
        swapValidationCompraStep.ingresar_datos_de_comprador(data,i);
    }
    try {

        Thread.sleep(10000);
    }catch (InterruptedException e){

    }
}

    @Then("^Compra exitosa$")
    public void compra_exitosa()  {

swapValidationCompraStep.validarEndCompra();

    }
}

