package com.thetestingacademy.vwo.Testing;

import com.thetestingacademy.basetest.CommonToAllTest;
import com.thetestingacademy.pages.PageObjectModel.DashboardPage_POM;
import com.thetestingacademy.pages.PageObjectModel.LoginPage_POM;
import com.thetestingacademy.pages.PageObjectModel.TestingPage_POM;
import com.thetestingacademy.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class ABReport extends CommonToAllTest {
    @Test
    public void CSVReportDownload() throws Exception {
        TestingPage_POM tom = new TestingPage_POM();
        LoginPage_POM pagePom = new LoginPage_POM();
        pagePom.openURL(PropertyReader.readKey("url"));
        DashboardPage_POM dashboardPagePom = pagePom.loginToVWOPositive().afterLogin();
        String expected_username = dashboardPagePom.loggedInUserName();
        Assertions.assertThat(expected_username)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("expected_username"));
        tom.TestingABReport();

    }



}
