package co.com.orangeHRM.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarEmpleado_Page extends PageObject {

    public static final Target BTN_ADMIN = Target.the("btn_Admin")
            .locatedBy("//span[normalize-space()='Admin']");

    public static final Target BTN_ADD = Target.the("btn_add")
            .locatedBy("//button[normalize-space()='Add']");

    public static final Target SELECT_USER_ROLE = Target.the("user_role")
            .locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");

    public static final Target INPUT_EMPLOYEE_NAME = Target.the("employee_name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");

    public static final Target CLIC_NAME = Target.the("clic_name")
            .locatedBy("//form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]");

    public static final Target CLIC_STATUS = Target.the("clic_status")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");

    public static final Target SELECT_STATUS = Target.the("select_status")
            .locatedBy("//span[contains(text(),'Enabled') and ancestor::*[@role='option']]");

    public static final Target STATUS_ENABLED = Target.the("status_enabled")
            .locatedBy("((//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[2]");

    public static final Target USERNAME_EMPLOYEE = Target.the("username_employee")
            .locatedBy("//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']");

    public static final Target PASSWORD_EMPLOYEE = Target.the("password_employee")
            .locatedBy("(//input[@type='password'])[1]");

    public static final Target CONFIRM_PASSWORD_EMPLOYEE = Target.the("confirm_password_employee")
            .locatedBy("(//input[@type='password'])[2]");

    public static final Target BTN_SAVE = Target.the("btn_save")
            .locatedBy("//button[normalize-space()='Save']");

}
