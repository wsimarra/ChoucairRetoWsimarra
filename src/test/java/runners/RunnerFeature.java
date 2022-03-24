package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/Realizarcompra.feature")
//@CucumberOptions(features ="src/test/resources/features/Realizarcompra.feature")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/nombre.feature")
class RunnerFeature {

}
