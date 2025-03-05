package co.com.orangeHRM.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class paginaPrincipalPage extends PageObject {

        public static final Target LABEL_AVISO_DASHBOARD=
            Target.the("label_dashboard")
                    .locatedBy("//span[@class=\"oxd-topbar-header-breadcrumb\"]");
}

