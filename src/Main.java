import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        File file1 = new File(Helper.PATHNAME + "new_file" + Helper.TXT);

//        try {
//            if (file1.createNewFile()){
//                System.out.println("new_file was created");
//            }else{
//                System.out.println("new_file already exists");
//            }
//        } catch (IOException e) {
//            System.out.println("pathname is incorrect");
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            File file2 = new File(Helper.PATHNAME + "file" + i + Helper.TXT);
//            try {
//                if(file2.createNewFile()){
//                    System.out.println("file" + i + " was created");
//                }else{
//                    System.out.println("file" + i + " already exists");
//                }
//                FileWriter writer = new FileWriter(file2);
//                writer.write("this is file" + i);
//                writer.close();
//            }catch(Exception e){
//                System.out.println(e);
//            }
//        }
        File folder = new File(Helper.PATHNAME + "new_folder");

//        if (folder.mkdir()){
//            System.out.println("folder new_folder was created");
//        }else{
//            System.out.println("folder new_folder already exists");
//        }
//        try {
//            FileWriter writer = new FileWriter(file1);
//            writer.write("Hi this is my file");
//            writer.close();
//        } catch (IOException e) {
//            System.out.println("didn't write anything");
//        }
        File file5 = new File(Helper.PATHNAME + "file5" + Helper.TXT);
//        try {
//            FileWriter writer5 = new FileWriter(file5,true);
//            writer5.write("\nfive");
//            writer5.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        file5.delete();
//        try {
//            Scanner scanner = new Scanner(file1);
//            while(scanner.hasNext()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("couldn't read the file");
//        }

//        createFile(Helper.PATHNAME, "123" + Helper.TXT, "My file is amazing " +
//                "\nAnd so much better than yours");

        String s = readFile(new File(Helper.PATHNAME + "new_file" + Helper.TXT));
        System.out.println(s);
//        System.out.println(readFile(new File(Helper.PATHNAME + "new_file" + Helper.TXT)));
    }

    public static void createFile(String pathname,String filename, String text){
        File file = new File(pathname + filename);
        try {
            if (file.createNewFile()){
                System.out.println("file was created");
            }else{
                System.out.println("file already exists");
            }
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static String readFile(File file){
        String result = "";
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                result += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return result;
    }

}
