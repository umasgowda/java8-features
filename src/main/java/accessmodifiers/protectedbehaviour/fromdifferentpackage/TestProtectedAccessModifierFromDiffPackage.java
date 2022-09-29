package accessmodifiers.protectedbehaviour.fromdifferentpackage;

import accessmodifiers.protectedbehaviour.fromsamepackage.ClassHasProtectedKeyword;


/**
 * You can access protected access modifier when you subclass it, regardless of the package.
 * Meaning you can access protected modifier when you extend(subclass) the class in different package
 * @author piksel
 *
 */
public class TestProtectedAccessModifierFromDiffPackage extends ClassHasProtectedKeyword {


    public void doStuff() {
        System.out.println(" protected modifier " + name + " can be accessed from different package when you subclass it, regardless of package");
    }
}
