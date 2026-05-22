import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{
        
        FileReader fr=new FileReader("Raw.txt");
        BufferedReader br=new BufferedReader(fr);

        FileWriter fw=new FileWriter("Cleaned.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        String line;

        while((line=br.readLine())!=null){
            if(line.length()!=0){

                bw.write(line);
                bw.newLine();
            }

        }

        bw.close();
        fw.close();

        br.close();
        fr.close();

    }
}