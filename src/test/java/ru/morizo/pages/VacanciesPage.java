package ru.morizo.pages;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class VacanciesPage {
    public void checkVacanciesHeader() {
        $(".v-section__header h2").shouldHave(text("Вакансии"));
    }

    public void clickOnQAButton() {
        $$(".v-jobs .v-jobs__item").findBy(text("QA")).click();
    }

    public void openVacancy(String CareerUrl) {
        $$(".v-collapse .v-collapse__body a").findBy(href(CareerUrl)).scrollTo().click();
    }

    public void checkVacancyPageUrl(String CareerUrl) {
        webdriver().shouldHave(url(CareerUrl));
    }
}
