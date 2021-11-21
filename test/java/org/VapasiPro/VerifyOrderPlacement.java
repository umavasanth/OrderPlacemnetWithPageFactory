package org.VapasiPro;

import SpreePagesWithPageFactory.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class VerifyOrderPlacement extends BaseTest{

    @Test
    public void orderPlacementTest() throws InterruptedException {
        LoginPage lp=new LoginPage(driver);

        lp.loginApp("testmail10@test.com","1234567");
        HomePage hp=new HomePage(driver);
        hp.verifyMessage();
        CategoryPage cp=new CategoryPage(driver);
        cp.selectCategory();
        cp.selectProduct();
        ProductPage pp=new ProductPage(driver);
        pp.clickAddToCart();
        CartPage cartPage=new CartPage(driver);
        cartPage.getCartDetails();
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

        orderPage.verifyOrderId();

            }
        }











