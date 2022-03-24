package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature,tag=@CasoAlterno")
//@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature,tag=@Regresion")

@CucumberOptions(features = "src/test/resources/features/Realizarcompra.feature",tags="@CasoExitoso",glue="definitions")

//@CucumberOptions (features ="src/test/resources/features/Nombre.feature", tags = "@CasoAlterno")
//@CucumberOptions(features = "src/test/resources/features/Realizarcompra.feature")

public class RunnerTags {
}
