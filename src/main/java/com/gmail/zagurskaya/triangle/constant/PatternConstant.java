package com.gmail.zagurskaya.triangle.constant;

public class PatternConstant {
    /**
     * Шаблон проверки строки: не пустого значения, цифры от 0 до 9
     */
    public static final String NUMBER_VALIDATE_PATTERN = "[0-9]{1,}";
    /**
     * Шаблон проверки строки: числа формата "ХХ.Х"
     */
    public static final String NUMBER_WITH_DELIMITER_POINT_VALIDATE_PATTERN = "\\d{0,2}+(\\.\\d{1})?";

    private PatternConstant() {
    }
}
