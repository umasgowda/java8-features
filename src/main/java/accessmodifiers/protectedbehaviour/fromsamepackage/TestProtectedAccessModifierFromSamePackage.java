package accessmodifiers.protectedbehaviour.fromsamepackage;


/**
 * There are two types of access modifiers:
 * 1. Top-level access modifiers: public and default (default is when no access
 * modifier is used). These access modifiers apply to types only (classes, interfaces, enums and annotations).
 * 2. Member-level access modifiers: public, protected, default and private. These access modifiers apply to fields,
 * constructors and methods.
 *
 */
public class TestProtectedAccessModifierFromSamePackage {


    public void checkProtectedKeyWord() {
        ClassHasProtectedKeyword protectedModifier = new ClassHasProtectedKeyword();
        System.out.println(" protected modifier " + protectedModifier.name
                + "can be accessed when classes are in the same package");

    }

}
