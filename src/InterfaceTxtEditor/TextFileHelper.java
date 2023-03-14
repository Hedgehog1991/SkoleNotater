package InterfaceTxtEditor;

import java.io.File;

public class TextFileHelper implements FileHelper{


    @Override
    public File retrieveFile(String filename) {
        System.out.println("retrieving text file");
        return new File("textfile");
    }

    @Override
    public void writeToFile(String filename, String infoToWrite) {
        System.out.println("writing to text file");

    }
}
