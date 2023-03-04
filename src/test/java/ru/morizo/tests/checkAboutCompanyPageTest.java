package ru.morizo.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static io.qameta.allure.Allure.step;

public class checkAboutCompanyPageTest extends TestBase {

    @DisplayName("Check about company page")
    @Test
    public void checkAboutCompanyPage() {
        step("Hover over on about company button", () -> {
            mainPage.hoverOverOnAboutCompanyButton();
            mainPage.checkDisplayNone();
        });
        step("Click on about company button and check header", () -> {
            mainPage.clickOnAboutCompanyButton();
            aboutCompanyPage.checkHeaderOnAboutCompanyPage();
        });
    }
}
