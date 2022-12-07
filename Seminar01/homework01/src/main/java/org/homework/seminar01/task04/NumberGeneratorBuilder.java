package org.homework.seminar01.task04;

public class NumberGeneratorBuilder {
    private String numberMask;

    public NumberGeneratorBuilder setNumberMask(String numberMask) {
        this.numberMask = numberMask;
        return this;
    }

    public NumberGenerator createNumberGenerator() {
        return new NumberGenerator(numberMask);
    }
}