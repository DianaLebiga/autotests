package dmsDws.settings.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.ConfigurationManager;
import utility.Page;

/**
 * Created by Julia on 19.04.2017.
 */
public class UserEditor extends Page {

    /*declare elements on the page*/
    @FindBy(how = How.ID, using = "user_editor_tab4")
    private WebElement accessTab;

    @FindBy(how = How.XPATH, using = "//div[@class='access_group']/span[contains(text(), 'Tools')]")
    private WebElement toolsItem;

    @FindBy(how = How.XPATH, using = "//div[@class='access_group']/span[contains(text(), 'Customers')]")
    private WebElement customersItem;

    @FindBy(how = How.XPATH, using = "//div[@class='access_group']/span[contains(text(), 'Settings Website')]")
    private WebElement settingsWebsiteItem;

    @FindBy(how = How.ID, using = "addon_make_a_page_2")
    private WebElement map2Checkbox;

    @FindBy(how = How.ID, using = "addon_make_a_page_custom_pages")
    private WebElement mapCustomCheckbox;

    @FindBy(how = How.ID, using = "settings_leads_email")
    private WebElement leadsEmailCheckbox;

    @FindBy(how = How.ID, using = "settings_website")
    private WebElement websiteSettingsCheckbox;

    @FindBy(how = How.ID, using = "crm_leads")
    private WebElement leadsCustomersCheckbox;

    @FindBy(how = How.ID, using = "addon_webmail")
    private WebElement webMailCheckbox;

    @FindBy(how = How.XPATH, using = "//span[@id='user_editor_save']//a")
    private WebElement saveBtn;

    @FindBy(how = How.ID, using = "login")
    private WebElement loginInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.ID, using = "cpass")
    private WebElement confirmpwInput;

    @FindBy(how = How.ID, using = "name")
    private WebElement userDealerNameInput;

    @FindBy(how = How.ID, using = "role_id")
    private WebElement roleSelect;

    @FindBy(how = How.ID, using = "active")
    private WebElement activeCheckbox;

    public UserEditor(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public void turnOnMap2() throws InterruptedException {
        Thread.sleep(1000);
        accessTab.click();
        toolsItem.click();
        if (map2Checkbox.getAttribute("checked") == null) {
            map2Checkbox.click();
        }
        saveBtn.click();
    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public void turnOnMap2Checkbox() throws InterruptedException {
        Thread.sleep(500);
        toolsItem.click();
        Thread.sleep(500);
        if (map2Checkbox.getAttribute("checked") == null) {
            map2Checkbox.click();
        }
        Thread.sleep(500);
        toolsItem.click();
    }

    /*turn on MAP2 checkbox in Access tab(if it is off)*/
    public void turnOnMapCustomCheckbox() throws InterruptedException {
        Thread.sleep(500);
        toolsItem.click();
        Thread.sleep(500);
        if (mapCustomCheckbox.getAttribute("checked") == null) {
            mapCustomCheckbox.click();
        }
        Thread.sleep(500);
        toolsItem.click();
    }

    /*turn on Leads Email checkbox in Access tab(if it is off)*/
    public void turnOnLeadsEmail() throws InterruptedException {
        Thread.sleep(500);
        settingsWebsiteItem.click();
        Thread.sleep(500);
        if (leadsEmailCheckbox.getAttribute("checked") == null) {
            leadsEmailCheckbox.click();
        }
        Thread.sleep(500);
        settingsWebsiteItem.click();
    }
    /*turn on Leads CRM checkbox in Access tab(if it is off)*/
    public void turnOnLeadsCRM() throws InterruptedException {
        Thread.sleep(500);
        customersItem.click();
        Thread.sleep(500);
        if (leadsCustomersCheckbox.getAttribute("checked") == null) {
            leadsCustomersCheckbox.click();
        }
        Thread.sleep(500);
        customersItem.click();
    }

    /*turn on Website Settings checkbox in Access tab(if it is off)*/
    public void turnOnWebsiteSettings() throws InterruptedException {
        Thread.sleep(500);
        settingsWebsiteItem.click();
        Thread.sleep(500);
        if (websiteSettingsCheckbox.getAttribute("checked") == null) {
            websiteSettingsCheckbox.click();
        }
        Thread.sleep(500);
        settingsWebsiteItem.click();
    }

    /*turn on Webmail checkbox in Access tab(if it is off)*/
    public void turnOnWebmail() throws InterruptedException {
        Thread.sleep(500);
        toolsItem.click();
        Thread.sleep(500);
        if (webMailCheckbox.getAttribute("checked") == null) {
            webMailCheckbox.click();
        }
        Thread.sleep(500);
        toolsItem.click();
    }

    /*create new user with manager role*/
    public void addNewManager(String login, String pw, String role){
        loginInput.clear();
        loginInput.sendKeys(login);
        passwordInput.clear();
        passwordInput.sendKeys(pw);
        confirmpwInput.clear();
        confirmpwInput.sendKeys(pw);
        userDealerNameInput.clear();
        userDealerNameInput.sendKeys(login);
        activeCheckbox.click();
        WebElement select = roleSelect;
        Select options = new Select(select);
        options.selectByValue(role);
        saveBtn.click();
    }

    /*click on Save*/
    public void clickSaveBtn(){
        saveBtn.click();
    }

    /*go to Access tab*/
    public void clickAccessTab(){
        accessTab.click();
    }
}
