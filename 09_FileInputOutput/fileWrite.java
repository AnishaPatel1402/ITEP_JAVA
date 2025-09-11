import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test{
    public static void main(String args[]){
        
        try{
            File f = new File("xyz.txt");
            FileOutputStream fout = new FileOutputStream(f);
        
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the text : ");
            String data = sc.nextLine();

            byte b[] = data.getBytes();
            fout.write(b);
            System.out.println("Operation Success....");
        } 
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}