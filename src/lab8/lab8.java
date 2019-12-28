package lab8;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class lab8 {

    private static void wrFile(String fileName, String text) {
        try(FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(text);
        }
        catch(IOException e) {

        }
    }

    public static void changeFile(String fileN) {

        try(FileReader reader = new FileReader(fileN)) {
            String text;
            char[] buf = new char[512];
            int c;
            while((c = reader.read(buf))>0){
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }

            }
            text = String.copyValueOf(buf);
            System.out.println(text);

            System.out.println("Введите текст, который нужно вставить: ");
            Scanner in = new Scanner(System.in);
            text = text.replace("(insert text here)", in.nextLine());

            wrFile(fileN, text);

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        changeFile("test.txt");
    }
}
