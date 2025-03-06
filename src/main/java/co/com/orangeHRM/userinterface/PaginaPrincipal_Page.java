package co.com.orangeHRM.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal_Page extends PageObject {

        public static final Target LABEL_AVISO_DASHBOARD=
            Target.the("label_dashboard")
                    .locatedBy("//span[@class=\"oxd-topbar-header-breadcrumb\"]");

        public static final Target LABEL_ADMIN_SYSTEM_USERS=
                Target.the("label_dashboard")
                        .locatedBy("//h5[contains(normalize-space(), 'System Users')]");

        public static final Target USER_MENU=
                Target.the("Boton del usuario para abrir el menu")
                        .locatedBy("//span[@class='oxd-userdropdown-tab']");

        public static final Target BTN_LOGOUT=
                Target.the("Opcion de cerrar sesion")
                        .locatedBy("//a[normalize-space()='Logout']");






}

