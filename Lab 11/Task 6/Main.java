import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        FileReader fr=new FileReader("Data.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        String[] arr;

        int count=0;
        int lineNum=0;
        boolean isFound=false;

        while ((line=br.readLine())!=null&&!isFound) { 
            count=0;
            arr=line.split(" ");

            for(String val:arr){
                isFound=val.equals("Java");
                if(!isFound){
                    count++;
                }
            }
            if(!isFound)
                lineNum++;
        }

        System.out.println("Found at "+lineNum+" "+count);


    }
}