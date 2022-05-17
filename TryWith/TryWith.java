package TryWith;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWith  {


    public static void main(String[] args) throws IOException {
        String str= "Hello World";
        try(FileOutputStream fos = new FileOutputStream("C:/Users/SAed/Desktop/ReadMe.txt")){
            fos.write(str.getBytes());

        }catch (IOException e){
            throw new IOException("File not found Exception ");

//            System.err.println("File not found Exception");
        }
//        FileOutputStream fos = null;
//        try{
//            fos= new FileOutputStream("C:/Users/SAed/Desktop/ReadMe.txt");
//            fos.write(str.getBytes());
//        }catch (IOException e ){
//            throw new IOException("File not found Exception ");
//        }
//        finally {
//            fos.close();
//        }




    }
}
