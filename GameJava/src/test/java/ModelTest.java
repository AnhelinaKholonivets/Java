import org.junit.Assert;
import org.junit.Test;


public class ModelTest {

    private static final Model model = new Model();

    @Test
    public void checkNumberFromUserShouldReturnFalseIFSecretNumberEqualsToInputNumber() {
        model.generateRandomSecretNumber(100);
        int generatedNumber = model.getSecretNumber();
        boolean res = model.checkNumberFromUser(generatedNumber);
        Assert.assertFalse(res);
    }

    @Test
    public void checkNumberFromUserShouldReturnFalseIFSecretNumberNotEqualsToInputNumber() {
        model.generateRandomSecretNumber(100);
        int generatedNumber = model.getSecretNumber();
        boolean res = model.checkNumberFromUser(generatedNumber + 1);
        Assert.assertTrue(res);
    }

}
