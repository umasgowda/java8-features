package bjss;

/**
 * @author piksel
 */
public class FindProgramOutput {

    public static void main(String[] args) {
        FindProgramOutput fpo = new FindProgramOutput();
        fpo.aMethod1(13);
        fpo.aMethod2(13);
    }

    private void aMethod1(int number) {
        System.out.println(number + "-" + number % 2);

        while (number > 0) {
            aMethod1(number / 2);
        }
    }

    private void aMethod2(int number) {
        System.out.println(number + " - " + (number / 2));

        while (number > 0) {
            aMethod1(number % 2);
        }
    }
}
