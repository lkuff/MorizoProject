package ru.morizo.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MainPage {
    public void cookiesShodBeVisible() {
        $(withText("Продолжая использовать наш сайт")).shouldBe(visible);
    }

    public void clickOnAgreeButtonCookie() {
        $(".v-cookie-policy__close").click();
    }

    public void cookiesShodBeHidden() {
        $(withText("Продолжая использовать наш сайт")).shouldBe(hidden);
    }

    public void hoverOverCareerButton() {
        $$(".v-header-menu ul li").findBy(text("Карьера")).hover();
    }

    public void checkDisplayNone() {
        $(".v-header-menu__level-2").shouldNotHave(attribute("display", "none"));
    }

    public void clickOnVacanciesButton() {
        $$(".v-header-menu__level-2 li a").findBy(href("https://morizo.ru/jobs")).click();
    }

    public void clickOnMoscowButton() {
        $$(".v-collapse .v-collapse__title").findBy(text("Москва")).scrollTo().click();
    }

    public void checkMenuIsVisible() {
        $(".v-collapse--open").shouldBe(visible);
    }

    public void switchToIframe() {
        switchTo().frame($(".container iframe"));
    }

    public void checkHeaderInFrame() {
        $(".popup").shouldHave(text("улица Бутырский Вал, 10"));
    }

    public void clickOnYandexMapsButton() {
        $(".body").$(byText("Открыть в Яндекс Картах")).click();
    }

    public void switchToWindowOne() {
        switchTo().window(1);
    }

    public void checkYandexMapsUrl() {
        webdriver().shouldHave(url("https://yandex.ru/maps/213/moscow/house/" +
                "ulitsa_butyrskiy_val_10/Z04Ycw9mSUMPQFtvfXt2eXhlZQ==/" +
                "?from=mapframe&ll=37.586068%2C55.779755&source=mapframe&utm_source=mapframe&z=16"));
    }

    public void clickOnVKIcon() {
        $(".v-social-menu__list-item__link--vk").scrollTo().click();
    }

    public void checkVKUrl() {
        webdriver().shouldHave(url("https://vk.com/morizo_digital"));
    }

    public void clickOnAwardsButton() {
        $$(".v-section-benefits__awards .swiper-slide a")
                .findBy(href("https://morizo.ru/awards")).scrollTo().click();
    }

    public void clickOnPortfolioButton() {
        $(".v-button--link").scrollTo().click();
    }
    public void hoverOverOnAboutCompanyButton() {
        $$(".v-header-menu ul li").findBy(text("О компании")).hover();
    }

    public void clickOnAboutCompanyButton() {
        $$(".v-header-menu__level-2 li a").findBy(href("https://morizo.ru/about")).click();
    }
}
