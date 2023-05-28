package com.pvt;

public enum ZodiacSigns {
    Aries("https://horo.mail.ru/prediction/aries/today/"), Taurus("https://horo.mail.ru/prediction/taurus/today/" ),
    Gemini("https://horo.mail.ru/prediction/gemini/today/"), Cancer("https://horo.mail.ru/prediction/cancer/today/"),
    Leo("https://horo.mail.ru/prediction/leo/today/"), Virgo("https://horo.mail.ru/prediction/virgo/today/"),
    Libra("https://horo.mail.ru/prediction/libra/today/"), Scorpio("https://horo.mail.ru/prediction/scorpio/today/"),
    Sagittarius("https://horo.mail.ru/prediction/sagittarius/today/"), Capricorn("https://horo.mail.ru/prediction/capricorn/today/"),
    Aquarius("https://horo.mail.ru/prediction/aquarius/today/"), Pisces("https://horo.mail.ru/prediction/pisces/today/");

    private String link;

    ZodiacSigns(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

}