package ru.morizo.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CheckCompanyPortfolioTest extends TestBase {

    @DisplayName("Check company portfolio")
    @Test
    public void checkCompanyPortfolio() {
        step("Click on portfolio button and check page has header with correct text", () -> {
            mainPage.clickOnPortfolioButton();
            portfolioPage.checkPortfolioHeader();
        });
        step("Click on 'GOSVEB' button and click on the first project", () -> {
            portfolioPage.clickOnGosvebButton();
            portfolioPage.clickOnFirstProject();
        });
        step("Switch to new window and check header", () -> {
            mainPage.switchToWindowOne();
            portfolioPage.checkPortfolioProjectHeader();
        });
    }
}
