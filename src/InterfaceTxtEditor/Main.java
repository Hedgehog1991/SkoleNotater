package InterfaceTxtEditor;

public class Main {

    public static void main(String[] args) {
        FileHelper xmlFileHelper = new XMLFileHelper();
        xmlFileHelper.retrieveFile("my xml file name");
        xmlFileHelper.writeToFile("xml file name", "my awesome xml file");

        FileHelper textFileHelper = new TextFileHelper();
        textFileHelper.retrieveFile("my text file name");
        textFileHelper.writeToFile("text file name","my awesome text file");
    }



}
