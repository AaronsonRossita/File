import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File( Helper.PATHNAME + "new_file" + Helper.TXT);
        File file2 = new File("C:\\Users\\User\\Desktop\\MyFiles\\new_file2.txt");
//        try {
//            if (file.createNewFile()){
//                System.out.println("file was created");
//            }else{
//                System.out.println("file already exists");
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
        for (int i = 1; i <= 5; i++) {
            File f = new File(Helper.PATHNAME + "file" + i + Helper.TXT);
            try{
                if (f.createNewFile()){
                    System.out.println("file" + i + " was created");
                }else{
                    System.out.println("file" + i + " already exists");
                }
            }catch (Exception e){

            }
        }

    }


}
