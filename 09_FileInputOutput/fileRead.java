import java.io.FileInputStream;
import java.io.IOException;
class Test{
    public static void main(String args[]){
        try{
            FileInputStream fin = new FileInputStream("xyz.txt");

            String data = "";
            while(true){
                int x = fin.read();
                if(x==-1){   //end of file
                    break;
                }
                data += (char) x;
            }
            System.out.println(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}