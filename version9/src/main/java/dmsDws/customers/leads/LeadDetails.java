package dmsDws.customers.leads;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ConfigurationManager;
import utility.Page;

import java.util.List;

/**
 * Created by Julia on 18.04.2017.
 */
public class LeadDetails extends Page {

    /*declare elements on the page*/

    @FindBy(how = How.XPATH, using = "//span[@class='FormName']/b")
    private WebElement formName;

    @FindBy(how = How.XPATH, using = "//span[@id='first_name']")
    private WebElement firstName;

    @FindBy(how = How.ID, using = "last_name")
    private WebElement lastName;

    @FindBy(how = How.ID, using = "phone")
    private WebElement phoneNum;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'International Phone Number:')]//../following-sibling::td//span")
    private WebElement intPhoneNum;

    @FindBy(how = How.XPATH, using = "//span[@id='email']/a/b")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "((//table[@class='templateMail']//table)[15]//td)[4]/span")
    private WebElement street;

    @FindBy(how = How.XPATH, using = "((//table[@class='templateMail']//table)[17]//td)[4]/span")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "((//table[@class='templateMail']//table)[19]//td)[4]/span")
    private WebElement state;

    @FindBy(how = How.XPATH, using = "((//table[@class='templateMail']//table)[21]//td)[4]/span")
    private WebElement zip;

    @FindBy(how = How.XPATH, using = "(//table[@class='templateMail']//table)[27]//span")
    private WebElement comments;

    @FindBy(how = How.XPATH, using = "(//table[@class='templateMail']//table)[43]//span")
    private WebElement tradeInComments;

    @FindBy(how = How.XPATH, using = "//b[contains(text(), 'Comments')]")
    private WebElement tradeInCommentsTitle;

    @FindBy(how = How.XPATH, using = "(//table[@class='templateMail']//table)[35]//span")
    private WebElement source;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Vin:')]//../following-sibling::td//span")
    private WebElement vin;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Year:')]//../following-sibling::td//span")
    private WebElement year;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Asking Price:')]//../following-sibling::td//span")
    private WebElement askingPrice;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Mileage:')]//../following-sibling::td//span")
    private WebElement odometer;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Motorized Type:')]//../following-sibling::td//span")
    private WebElement motorizedType;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Make:')]//../following-sibling::td//span")
    private WebElement make;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Model:')]//../following-sibling::td//span")
    private WebElement model;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Trim:')]//../following-sibling::td//span")
    private WebElement trim;

    @FindBy(how = How.XPATH, using = "(//b[contains(text(),'User Image')]/../../../../../../../../../../../following-sibling::tr)[2]//img")
    private List<WebElement> userImage;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'User Image')]/../../../../../../../../../../..")
    private WebElement userImageTitle;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Request Time:')]//../following-sibling::td//span")
    private WebElement requestTime;

    public LeadDetails(ConfigurationManager manager, WebDriver driver) {
        super(manager, driver);
    }

    /*methods for getting values of fields*/

    public String getFirstName(){ return firstName.getText(); }

    public String getLastName()
    {
        return lastName.getText();
    }

    public String getPhoneNum()
    {
        return phoneNum.getText();
    }

    public String getIntPhoneNum()
    {
        return intPhoneNum.getText();
    }

    public String getEmail()
    {
        return email.getText();
    }

    public String getZip() { return zip.getText();  }

    public String getStreet()
    {
        return street.getText();
    }

    public String getCity()
    {
        return city.getText();
    }

    public String getState()
    {
        return state.getText();
    }

    public String getSource()
    {
        return source.getText();
    }

    public String getComments()
    {
        return comments.getText();
    }

    public String getTradeInComments() {
        return tradeInComments.getText();
    }

    public String getVin() {return vin.getText();}

    public String getYear() { return year.getText(); }

    public String getAskingPrice() { return askingPrice.getText(); }

    public String getOdometer() {
        return odometer.getText();
    }

    public String getMotorizedType() {
        return motorizedType.getText();
    }

    public String getMake() {
        return make.getText();
    }

    public String getModel() {
        return model.getText();
    }

    public String getTrim() {
        return trim.getText();
    }

    public String getRequestTime() {
        return requestTime.getText();
    }

    public boolean isIntPhoneFieldExist(){
        try {
            intPhoneNum.isDisplayed();
            return true;
        }
        catch (NoSuchElementException ex){
            return false;
        }
    }

    public boolean isTradeInCommentsExist(){
        try {
            tradeInCommentsTitle.isDisplayed();
            return true;
        }
        catch (NoSuchElementException ex){
            return false;
        }
    }

    public int getUserImageNumber() {
        try {
            return userImage.size();
        } catch (NoSuchElementException ex) {
            return 0;
        }
    }

    public boolean isUserImageTitleExist() {
        try {
            userImageTitle.isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
