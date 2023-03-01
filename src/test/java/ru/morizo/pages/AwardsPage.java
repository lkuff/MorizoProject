package ru.morizo.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AwardsPage {
    public void checkAwardsHeader() {
        $(".v-section__header h2").shouldHave(text("Награды и рейтинги"));
    }

    public void clickOnRuwardButton() {
        $$(".v-form .v-radio-button").findBy(text("RUWARD")).click();
    }
}
