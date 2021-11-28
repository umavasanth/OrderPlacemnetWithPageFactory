package org.SpreePagesTestCases;

import SpreePagesWithPageFactory.*;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOrderPlacement extends BaseTest{


    @Test
    public void orderPlacementTest() throws InterruptedException {
        ExtentTest test=extent.createTest("VerifyOrderPlacement Testcase");


        LoginPage lp=new LoginPage(driver);

        lp.loginApp("testmail11@test.com","1234567");
        //lp.takeScreenShot(driver);
        HomePage hp=new HomePage(driver);
        hp.verifyMessage();
        Assert.assertEquals(hp.verifyMessage(),"Logged in successfully");
        CategoryPage cp=new CategoryPage(driver);
        cp.selectCategory();
        cp.selectProduct();
        ProductPage pp=new ProductPage(driver);
        pp.clickAddToCart();
        CartPage cartPage=new CartPage(driver);

        cartPage.getCartDetails();
        Assert.assertEquals(cartPage.getCartDetails(),"$15.99","CartTotal is Matching");
        test.info("Total is matching with Cart selected");
        cartPage.clickCheckOut();
        AddressPage ap=new AddressPage(driver);
        ap.fillAddressDetails("John","Peter","add1","Chennai",99501,890645789);
        ap.dropDownSelectCountry();
        ap.dropDownSelectState();
        ap.verifyBillingAddressCheckBox();
        ap.save();
        DeliveryPage dp=new DeliveryPage(driver);
        dp.selectUPSGround();
        dp.saveDelivery();
        PaymentPage paymentPage=new PaymentPage(driver);
        paymentPage.clickRadioButton();
        paymentPage.clickPaymentPageSaveButton();
        OrderPage orderPage=new OrderPage(driver);
        orderPage.verifyOrderSuccessMessage();
        Assert.assertEquals(orderPage.verifyOrderSuccessMessage(),"Your order has been processed successfully");
        test.info("Order Processed succesfully");
        orderPage.verifyOrderId();
        Assert.assertNotNull(orderPage.verifyOrderId(),"Order Id successfully created");
        test.info("Order Id Created");

        extent.flush();



    }
        }











