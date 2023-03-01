package ru.morizo.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static ru.morizo.tests.TestData.*;

public class MorizoTests extends TestBase{

    @BeforeEach
    void setUp() {
        open("https://morizo.ru/");
    }

    @DisplayName("Check accept cookies")
    @Test
    public void checkAcceptCookies() {
        step("Click on close cookies button and check it disappear", () -> {
            mainPage.cookiesShodBeVisible();
            mainPage.clickOnAgreeButtonCookie();
            mainPage.cookiesShodBeHidden();
        });
    }

    @DisplayName("Check Automation QA Vacancy")
    @Test
    public void checkAQAVacancy() {
        step("Hover over on career button and click on vacancies button", () -> {
            mainPage.hoverOverCareerButton();
            mainPage.checkDisplayNone();
            mainPage.clickOnVacanciesButton();
        });
        step("Check that the page has header with correct text", () -> {
            vacanciesPage.checkVacanciesHeader();
        });
        step("Click on QA and click on the open vacancy", () -> {
            vacanciesPage.clickOnQAButton();
            vacanciesPage.openVacancy(CareerUrl);
        });
        step("Check url", () -> {
            vacanciesPage.checkVacancyPageUrl(CareerUrl);
        });
    }

    @DisplayName("Check company contacts in footer of the page")
    @Test
    public void checkContactsInTheFooter() {
        step("Click on company contacts in Moscow", () -> {
            mainPage.clickOnMoscowButton();
            mainPage.checkMenuIsVisible();
        });
        step("Switch to iframe and check it has correct text", () -> {
            mainPage.switchToIframe();
            mainPage.checkHeaderInFrame();
        });
        step("Click on open in Yandex Maps button", () -> {
            mainPage.clickOnYandexMapsButton();
        });
        step("Switch to new window and check url", () -> {
            mainPage.switchToWindowOne();
            mainPage.checkYandexMapsUrl();
        });
    }

    @DisplayName("Check VK page icon from footer of the page")
    @Test
    public void checkVKIconInTheFooter() {
        step("Click on VK icon in footer of the page", () -> {
            mainPage.clickOnVKIcon();
        });
        step("Switch to new window and check url", () -> {
            mainPage.switchToWindowOne();
            mainPage.checkVKUrl();
        });
    }

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
