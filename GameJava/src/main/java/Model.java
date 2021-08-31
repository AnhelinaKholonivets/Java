import java.util.List;
import java.util.ArrayList;

public class Model {

    private int min = 0;
    private int max = 100;
    private int secretNumber;
    private final List<Integer> answersArr = new ArrayList<>();

    //the program logic
    public void generateRandomSecretNumber(int max) {
        secretNumber = (int) (Math.random() * max);
    }

    public int getSecretNumber() {
        return this.secretNumber;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public List<Integer> getAnswersArr() {
        return answersArr;
    }

    public boolean checkNumberFromUser(int number) {
        answersArr.add(number);
        if (number == secretNumber) {
            return false;
        } else if (number > secretNumber) {
            max = number;
        } else {
            min = number;
        }
        return true;
    }
}
