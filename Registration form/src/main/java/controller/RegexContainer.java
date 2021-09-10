package controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_COMMENT_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{0,200}$";
    String REGEX_COMMENT_LAT = "^[A-Z][a-z]{0,200}$";
    String REGEX_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REGEX_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    String REGEX_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    String REGEX_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    String REGEX_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    String REGEX_INDEX = "^[\\d]{5}$";
    String REGEX_CITY = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    String REGEX_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    String REGEX_NUMBER_HOUSE = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    String REGEX_NUMBER_APARTMENT = "^[\\d]{1,3}";

}