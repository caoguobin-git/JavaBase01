package com.programming.chapter3.exercise;

public enum WeekDay {
    MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"), FRIDAY("friday"), SATURDAY("saturday"), SUNDAY("sunday");
    private String day;

    WeekDay(String day) {
        this.day = day;
    }

    WeekDay() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeekDay(int i) {
        switch (i) {
            case 1:
                return MONDAY.getDay();
            case 2:
                return TUESDAY.getDay();
            case 3:
                return WEDNESDAY.getDay();
            case 4:
                return THURSDAY.getDay();
            case 5:
                return FRIDAY.getDay();
            case 6:
                return SATURDAY.getDay();
            case 7:
                return SUNDAY.getDay();
            default:
                return null;
        }
    }
}
