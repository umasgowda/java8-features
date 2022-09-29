package constructor.rules;

/**
 * https://www.codejava.net/java-core/the-java-language/9-rules-about-constructors-in-java
 * @author piksel
 *
 */
public class Check9RulesOfConstructors {

    public static void main(String args[]) {
        ConstructorBehaviour constr1 = new ConstructorBehaviour();
        System.out.println(constr1);

        //Rule 5 - Constructors cannot be inherited unlike methods
        //Square sqaure = new Square("10", "20"); COMPILATION ERROR

    }

}
