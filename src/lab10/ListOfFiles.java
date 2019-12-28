package lab10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListOfFiles {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\smirn\\Desktop\\oopLABS3sem\\practice6\\src\\lab10\\task4Files");

        if (!f.isDirectory() || !f.exists())
            return;

        List<File> lOfF = new ArrayList<File>();

        for (File elem : f.listFiles())
            lOfF.add(elem);
        try {
            for (int i = 0; i < 5; i++)
                System.out.println(lOfF.get(i).getName());
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("In directory less than 5 files");
        }
    }
}