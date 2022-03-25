package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginSwaglabsPage;


public class SwagValidationStep {

    LoginSwaglabsPage loginSwaglabsPage;


@Step
    public void login_Swag(String strUsuario,String strPass) {
//      a. Abrir navegador con la url de prueba
        loginSwaglabsPage.open();
/*      b. ingresar usuario demo
        c. Ingresar password demo
        d. Click en botón Sign in */
        loginSwaglabsPage.ingresarDatos(strUsuario, strPass);

    }

     @Step
        public  void ingreso_a_la_funcionalidad_compra()
    {
        loginSwaglabsPage.VerificaHome();

    }



}