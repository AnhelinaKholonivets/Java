import java.util.Scanner;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        inputValueWithScanner(sc);
        view.printMessage(model.getFirstWord() + " " + model.getSecondWord());
    }

    public void inputValueWithScanner(Scanner sc) {
        String firstWord;
        String secondWord;

        view.printMessage(View.FIRST_INPUT);
        firstWord = sc.next();
        while (!firstWord.equals(model.getFirstWord())) {
            view.printMessage(View.ERROR + View.FIRST_INPUT);
            firstWord = sc.next();
        }
        view.printMessage(View.SECOND_INPUT);
        secondWord = sc.next();
        while (!secondWord.equals(model.getSecondWord())) {
            view.printMessage(View.ERROR + View.SECOND_INPUT);
            secondWord = sc.next();
        }

    }
}
