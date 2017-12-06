import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Day4Q1
{
   public static void main(String [] args)
   {
     ArrayList<String> phrase = new ArrayList<String>();
     boolean flag=true;
     int count=0;
   
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
   
      
      for(int i=0;i<phrase.size();i++)
      {
         
         String[] s = phrase.get(i).split(" "); //split each line into an array 
         flag=true;
         for(int j=0;j<s.length;j++)
         {
            for(int x=1;x<s.length;x++)
            {
                  if(s[j].equals(s[x]) && j!=x) // check if phrase contains identical words
                     flag=false;//Set false if phrase is invalid
                     
            }
         
         }
         if(flag)//count each valid phrase
         count++;
         
      } 
      //Display answer
      System.out.println(count);
   }
}