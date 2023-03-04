package ru.morizo.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutCompanyPage {
    public void checkHeaderOnAboutCompanyPage() {
        $(".v-section__header h2").shouldHave(text("О компании"));
    }
}
