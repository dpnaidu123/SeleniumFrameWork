package com.thetestingacademy.pages.PageObjectModel;

import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.driver.DriverManagerTL;
import org.openqa.selenium.By;

public class TestingPage_POM extends CommonToAllPage {
    public TestingPage_POM() {

    }
    By Testing = By.xpath("//span[text()='Testing']");
    By AB = By.xpath("//span[text()='A/B']");
    By ViewReport = By.xpath("//a[text()=' View Sample Report ']");
    By Moreicon = By.xpath("//button[@class='icon-button Pos(r) D(f) Fxd(c) Fz(10px) ng-scope']");
    By DownloadCSV = By.xpath("//h6[text()=' Download CSV ']");




    public TestingPage_POM TestingABReport() throws Exception {
        clickElement(Testing);
        clickElement(AB);
        visibilityOfElement(ViewReport);
        clickElement(ViewReport);
        visibilityOfElement(Moreicon);
        clickElement(Moreicon);
        visibilityOfElement(DownloadCSV);
        clickElement(DownloadCSV);

        return this;



    }
    public void openURL(String url){
        DriverManagerTL.getDriver().get(url);
    }


}
