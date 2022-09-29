/**
 * Copyright 2020 Liberty Global (http://www.libertyglobal.com) and produced by Piksel (http://www.piksel.com)
 ******************************************************************************/
package accessmodifiers.enumbehaviour;

/**
 * @author piksel
 */
public enum ExampleEnum {

    RED("1"),
    BLUE("2"),
    WHITE("3");

    private String code;

    ExampleEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}

class TestEnum {

    public static void main(String[] args) {

        for(ExampleEnum exampleEnum: ExampleEnum.values()) {
            System.out.println(exampleEnum.getCode());

        }
    }
}