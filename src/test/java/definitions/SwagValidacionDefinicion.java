package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.SwagValidationStep;
public class SwagValidacionDefinicion {

    @Steps
    public SwagValidationStep swagValidationStep;


    @Given("^Autentico en SWAGLABS con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autentico_en_SWAGLABS_usuario(String usuario, String clave) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swagValidationStep.login_Swag(usuario,clave);
        throw new PendingException();
    }

    @When("^Ingreso a la funcionalidad PRODUCTS$")
    public void ingresoALaFuncionalidadProducts() {
    }

    @And("^Ingreso a la funcionalidad Forms Validation producto$")
    public void ingresoALaFuncionalidadFormsValidation() throws Throwable {
        swagValidationStep.ingresar_form_validation();

                //.ingresar_form_validation();
    }

    @Then("^Verifico ingreso exitoso$")
    public void verificoIngresoExitoso() throws Throwable  {
        throw new PendingException();
    }

    @When("^verificoIngresoExitoso$")
    public void Exitoso() {
    }
}