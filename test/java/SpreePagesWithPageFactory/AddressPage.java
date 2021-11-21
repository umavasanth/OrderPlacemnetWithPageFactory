package SpreePagesWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
    @FindBy(id = "order_bill_address_attributes_firstname")
    private WebElement firstName;

    @FindBy(id = "order_bill_address_attributes_lastname")
    private WebElement lastName;

    @FindBy(id = "order_bill_address_attributes_address1")
    private WebElement address1;

    @FindBy(id = "order_bill_address_attributes_city")
    private WebElement city;

    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement state;

    @FindBy(id = "order_bill_address_attributes_zipcode")
    private WebElement zipcode;

    @FindBy(id = "order_bill_address_attributes_country_id")
    private WebElement country;

    @FindBy(id = "order_bill_address_attributes_phone")
    private WebElement phone;

    @FindBy(css = "label#use_billing")
    private WebElement useBillingAddressCheckBox;

    @FindBy(name = "commit")
    private WebElement saveAndContinue;

    @FindBy(id = "order_ship_address_attributes_country_id")
    private WebElement shippingAddressCountry;

    @FindBy(id = "order_ship_address_attributes_zipcode")
    private WebElement shippingAddressZip;

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillAddressDetails(String fname,String lname,String address,String cityName,int zip,int phoneNumber){
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        address1.sendKeys(address);
        city.sendKeys(cityName);
        zipcode.sendKeys(""+zip);
        phone.sendKeys(""+phoneNumber);
        System.out.println(zip);

    }
    public void dropDownSelectCountry() throws InterruptedException {
        Select countryDropDown=new Select(country);
        countryDropDown.selectByValue("233");
        Thread.sleep(3000);
    }
    public void dropDownSelectState(){
        Select stateDropDown=new Select(state);
        stateDropDown.selectByValue("2817");
    }
 public void verifyBillingAddressCheckBox(){
     Boolean billingchkBox=useBillingAddressCheckBox.isEnabled();
     System.out.println(billingchkBox);
 }
    public void save() throws InterruptedException {
        saveAndContinue.click();
        Thread.sleep(3000);
    }

}
