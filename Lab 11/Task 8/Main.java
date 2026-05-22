import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        FileReader fr=new FileReader("Numbers.txt");
        BufferedReader br=new BufferedReader(fr);
        
        String line;
        int val;
        double sum=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        while((line=br.readLine())!=null){
            val=Integer.parseInt(line);

            sum+=val;
            count++;

            if(max<val)
                max=val;

            if(min>val){
                min=val;
            }

        }


        double avg=(sum/count);

        br.close();
        fr.close();


        FileWriter fw=new FileWriter("Report.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Total: "+sum);
        bw.newLine();
        
        bw.write("Average: "+avg);
        bw.newLine();

        bw.write("Maximum: "+max);
        bw.newLine();

        bw.write("Minimum: "+min);
        bw.newLine();

        bw.close();
        fw.close();
        
    }
}