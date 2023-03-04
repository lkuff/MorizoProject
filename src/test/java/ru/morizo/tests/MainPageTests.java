package ru.morizo.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {

    @DisplayName("Check accept cookies")
    @Test
    public void checkAcceptCookies() {
        step("Click on close cookies button and check it disappear", () -> {
            mainPage.cookiesShodBeVisible();
            mainPage.clickOnAgreeButtonCookie();
            mainPage.cookiesShodBeHidden();
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
}
