package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    private final Scanner scanner;
    private final View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStrValueWithScanner(String message, String regex) {
        String result;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return result;
    }
}
