package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {
    private final View view;

    public Controller(Model model, View view) {
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();
    }
}