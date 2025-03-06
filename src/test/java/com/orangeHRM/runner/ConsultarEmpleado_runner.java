package com.orangeHRM.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/3.Consultar_Empleado.feature",
        glue = "/com/orangeHRM/stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "",
        plugin = {"pretty"}
)

public class ConsultarEmpleado_runner {
}
