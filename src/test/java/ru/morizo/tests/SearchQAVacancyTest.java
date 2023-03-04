package ru.morizo.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static io.qameta.allure.Allure.step;
import static ru.morizo.data.TestData.CareerUrl;

public class SearchQAVacancyTest extends TestBase {

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
}
