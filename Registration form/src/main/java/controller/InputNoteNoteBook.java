package controller;

import view.View;

import java.util.Scanner;

import static controller.RegexContainer.*;
import static controller.RegexContainer.REGEX_LOGIN;
import static view.TextConstant.*;
import static view.TextConstant.LOGIN_DATA;

public class InputNoteNoteBook {
    private final View view;
    private final Scanner sc;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        String firstName = utilityController.inputStrValueWithScanner
                (FIRST_NAME, str);
        String login = utilityController.inputStrValueWithScanner
                (LOGIN_DATA, REGEX_LOGIN);
    }
}