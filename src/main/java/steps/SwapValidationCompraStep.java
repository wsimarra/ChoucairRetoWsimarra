package steps;

import net.thucydides.core.annotations.Step;
import pages.SwapMenuPage;
import pages.SwapValidationCompraPage;

import java.util.List;

public class SwapValidationCompraStep {

    SwapValidationCompraPage  swapValidationCompraPage;
    SwapMenuPage swapMenuPage;
    @Step

    public void agregar_articulo_al_car()
    {
        swapValidationCompraPage.agregar_1();

    }

    @Step
    public void diligenciar_datos()
    {
        swapValidationCompraPage.carro_car();

    }

    @Step
    public void verificar_ingreso_datos_formulario_exitoso()
    {
        swapValidationCompraPage.form_sin_errores();

    }


    @Step
    public void ingresar_datos_de_comprador(List<List<String>>data, int id)
    {
        swapValidationCompraPage.checkout();
        swapValidationCompraPage.firstName(data.get(id).get(0).trim());
        swapValidationCompraPage.LastName(data.get(id).get(1).trim());
        swapValidationCompraPage.PostalCode(data.get(id).get(2).trim());
        swapValidationCompraPage.validate();
    }

@Step

    public  void  validarEndCompra(){
        swapValidationCompraPage.endPagobtn();
        swapMenuPage.endPago();

}

}
