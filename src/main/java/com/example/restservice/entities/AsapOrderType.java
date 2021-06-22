package com.example.restservice.entities;

public enum AsapOrderType {
//    "1", "2", "3";
//    1, 2, 3
    ASAP("1"), ADVANCE("2"), BOTH("3");

    private String shortName;

    private AsapOrderType(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public static AsapOrderType fromShortName(String shortName) {
        switch (shortName) {
            case "1":
                return AsapOrderType.ASAP;
            case "2":
                return AsapOrderType.ADVANCE;
            case "3":
                return AsapOrderType.BOTH;
            default:
                throw new IllegalArgumentException("ShortName [" + shortName
                        + "] not supported.");
        }
    }
}
