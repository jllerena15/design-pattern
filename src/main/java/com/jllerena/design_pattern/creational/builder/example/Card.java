package com.jllerena.design_pattern.creational.builder.example;

public class Card {
    private final String cardType;
    private final String number;
    private final String name;
    private final int expires;
    private final boolean credit;

    private Card(CardBuilder cardBuilder) {
        this.cardType = cardBuilder.cardType;
        this.number = cardBuilder.number;
        this.name = cardBuilder.name;
        this.expires = cardBuilder.expires;
        this.credit = cardBuilder.credit;
    }

    public String getCardType() {
        return cardType;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getExpires() {
        return expires;
    }

    public boolean isCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "Card: " + cardType + " " + number + " " + name + " " + expires + " " + credit;
    }

    public static class CardBuilder {
        private String cardType;
        private String number;
        private String name;
        private int expires;
        private boolean credit;

        public CardBuilder(String cardType, String number) {
            this.cardType = cardType;
            this.number = number;
        }

        public CardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CardBuilder expires(int expires) {
            this.expires = expires;
            return this;
        }

        public CardBuilder credit(boolean credit) {
            this.credit = credit;
            return this;
        }

        public Card build() {
            return new Card(this);
        }
    }
}
