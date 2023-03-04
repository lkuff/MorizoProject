package ru.morizo.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CheckCompanyAwardsTest extends TestBase {

    @DisplayName("Check company RUWARD awards ")
    @Test
    public void checkCompanyAwards() {
        step("Click on company awards", () -> {
            mainPage.clickOnAwardsButton();
            awardsPage.checkAwardsHeader();
        });
        step("Click on RUWARD button", () -> {
            awardsPage.clickOnRuwardButton();
        });
    }
}
