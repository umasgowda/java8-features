package datastructure.string;

public class StringRotationOfEachOther {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DABC";

        String concatenated = s1 + s1;


        if(concatenated.contains(s2)) {
            System.out.println("rotation of each other ");
        } else {
            System.out.println(" not rotation of each other ");
        }


    }


}
