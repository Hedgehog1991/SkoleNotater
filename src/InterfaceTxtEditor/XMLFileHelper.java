package InterfaceTxtEditor;

import java.io.File;

public class XMLFileHelper implements FileHelper {

    @Override
    public File retrieveFile(String filename) {
        System.out.println("Retrieving XML file " + filename);
        return new File("example");
    }

    @Override
    public void writeToFile(String filename, String infoToWrite) {
        System.out.println("writing to XML file");
    }
}
