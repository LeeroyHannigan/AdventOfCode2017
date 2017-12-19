import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Day4Q2
{
   public static void main(String [] args)
   {
      ArrayList<String> phrase = new ArrayList<String>();
      ArrayList<String> sorted = new ArrayList<String>();
      boolean flag=true;
      int count=0;
      
      String[] str={"hello","lee"};
      
   
      //read in file and  add to arraylist
      try{
         FileReader in = new FileReader("C:/Users/leero/Desktop/passphrase.txt");
         BufferedReader br = new BufferedReader(in);
         String line;
         while ((line = br.readLine()) != null) {
            phrase.add(line);   
         }   
      } catch (IOException e) {
         e.printStackTrace();
      }
    
    
    String[] s = phrase.get(0).split(" ");
    
    for(int i=0;i<s.length;i++)
    {
    char ch[] = s[i].toCharArray();
    System.out.print(ch[i]);
    }
    
   
 
     
      
     
   }
}