import java.util.Scanner;

public class Controller {
    //Constructor
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //the work methods
    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        model.generateRandomSecretNumber(model.getMax());

        while (model.checkNumberFromUser(inputIntValueWithScanner(scanner))) {
            view.printMessage(View.ANSWERS_ARR + model.getAnswersArr());
        };
        view.printMessage(View.TRUE_NUMBER + model.getSecretNumber());
    }

    public int inputIntValueWithScanner(Scanner sc) {
        int secretNumber = model.getSecretNumber();
        int temp = 0;

        view.printMessage(View.INPUT_NUMBER + model.getMin() + "-" + model.getMax());
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_NUMBER + model.getMin() + "-" + model.getMax());
                sc.next();
            }
            if ((temp = sc.nextInt()) <= model.getMin() || temp >= model.getMax()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA + View.WRONG_RANGE_ANSWERS + View.INPUT_NUMBER + model.getMin() + "-" + model.getMax());
                continue;
            }
            break;
        }

        if (secretNumber < temp) {
            view.printMessage(View.SMALL_NUMBER + temp);
        } else if (secretNumber > temp) {
            view.printMessage(View.BIG_NUMBER + temp);
        }

        return temp;
    }
}
