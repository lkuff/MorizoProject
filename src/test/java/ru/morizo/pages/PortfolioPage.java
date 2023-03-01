package ru.morizo.pages;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PortfolioPage {

    public void checkPortfolioHeader() {
        $(".v-section__header h2").shouldHave(text("Кейсы"));
    }

    public void clickOnGosvebButton() {
        $$(".v-form .v-radio-button").findBy(text("Госвеб")).click();
    }

    public void clickOnFirstProject() {
        $$(".v-card-portfolio a").findBy(href("https://old.morizo.digital/mosreg.html")).click();
    }

    public void checkPortfolioProjectHeader() {
        $(".content h1").shouldHave(text("Сайт правительства Московской области"));
    }
}
