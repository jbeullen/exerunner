package be.upgrade.it.exerunner;

import java.io.IOException;

public class ExeRunner {

    private static final String PATH_TO_EXE = "C:\\crx\\XmlCardioFlex.exe";

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec(new String[]{PATH_TO_EXE, ""});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
