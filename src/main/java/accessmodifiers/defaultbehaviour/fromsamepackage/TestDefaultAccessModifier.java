package accessmodifiers.defaultbehaviour.fromsamepackage;

import accessmodifiers.defaultbeahviour.fromdifferentpackage.DefaultClassInDifferentPackage;

public class TestDefaultAccessModifier  {

    private void doStuff() {
        DefaultClassInSamePackage defaultAccess = new DefaultClassInSamePackage();
        String result = defaultAccess.name;
        System.out.println(" you can access the fields such as variables and methods (which have default access modifier) when their class are in same package " + result);

        DefaultClassInDifferentPackage  diffPackage = new DefaultClassInDifferentPackage(); // when you access default field "name" from DefaultClassInDifferentPackage class
        // results in COMPILATION ERROR.

        System.out.println("you can NOT access the fields such as variables and methods (which have default access modifier) when their are in different package ");
    }

}
