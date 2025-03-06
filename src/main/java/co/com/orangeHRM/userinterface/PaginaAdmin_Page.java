package co.com.orangeHRM.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaAdmin_Page extends PageObject {

    public static final Target INPUT_USERNAME= Target.the("input_username")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");

    public static final Target BTN_SEARCH_ADMIN= Target.the("btn_search_admin")
            .locatedBy("//button[@type='submit']");

    public static final Target LABEL_USERNAME= Target.the("label_username")
            .locatedBy("//div[contains(text(),'Pepito')]");

    public static final Target LABEL_USER_ROLE= Target.the("label_user_role")
            .locatedBy("//div[contains(text(),'Admin')]");

    public static final Target BTN_DELETE_EMPLOYEE= Target.the("boton para eliminar empleado")
            .locatedBy("//i[@class='oxd-icon bi-trash']");

    public static final Target LABEL_CONFIRM_DELETE= Target.the("Boton para confirmar la eliminacion")
            .locatedBy("//button[normalize-space()='Yes, Delete']");












}
