import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
class Test{
    public static void main(String args[]){
        File f = new File("xyz.txt");
        if(f.exists()){
            System.out.println("File Found...");
            System.out.println("File name = "+ f.getName());
            System.out.println("File absolute path = "+ f.getAbsolutePath());
            
            // long timeStamp = f.lastModified();
            // Date d = new Date(timeStamp);
            // SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
            // String date = sd.format(timeStamp);

            String date = new SimpleDateFormat("dd/MM/yy hh:mm:ss").format(new Date(f.lastModified()));
            System.out.println("Last Modified = "+ date);
        }
        else{
            //if file is not exists
            System.out.println("File not found");
            try{
                f.createNewFile();  //it may throw exception so we will write it inside try catch block
            }
            catch(IOException e){
                e.printStackTrace();
            }
            
        }

        // System.out.println(f);  //xyz.txt

    }
}