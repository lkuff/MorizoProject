package ru.morizo.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.morizo.helpers.Attach;
import ru.morizo.pages.AwardsPage;
import ru.morizo.pages.MainPage;
import ru.morizo.pages.PortfolioPage;
import ru.morizo.pages.VacanciesPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    MainPage mainPage = new MainPage();
    VacanciesPage vacanciesPage = new VacanciesPage();
    AwardsPage awardsPage = new AwardsPage();
    PortfolioPage portfolioPage = new PortfolioPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://morizo.ru/";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "100");
        Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}