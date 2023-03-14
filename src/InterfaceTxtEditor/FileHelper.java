package InterfaceTxtEditor;
import java.io.File;

public interface FileHelper {

    File retrieveFile(String filename);
    void writeToFile(String filename, String infoToWrite);





}
