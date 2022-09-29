package filehandling;

import java.io.File;

/**
 * @author piksel
 */
public class FindFileSize {

    private static final String FILE_PATH = "/Users/umashivalingaiah/dev/learning-java8/src/main/resources/employee.csv";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or it is not a file ");
            System.exit(1);
        }
        System.out.println("File Size in bytes " + getFileSizeInBytes(file));
    }

    private static String getFileSizeInBytes(File file) {
        return file.length() + " bytes";
    }


}

class Postbox {


}
