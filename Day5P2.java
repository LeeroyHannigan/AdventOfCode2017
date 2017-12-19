import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Day5P2
{
   public static void main(String [] args)
   {
      //Arraylist to hold intger values
      ArrayList<Integer> nums = new ArrayList<Integer>();
      //our position in the array, current position to increment and steps taken.
      int pos=0, current, steps=0;
      //Are we out of the list?
      boolean flag=false;
   
      //read in file and  add to arraylist
      try{
         FileReader in = new FileReader("C:/Users/leero/Desktop/numList.txt");
         BufferedReader br = new BufferedReader(in);
         String line;
         while ((line = br.readLine()) != null) {
            nums.add(Integer.parseInt(line));  //convert String to integer 
         }   
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      try{
         while(!flag)
         {
            current=pos;//start at the beginning
            pos += nums.get(pos);//move by the value of the positon
            
            //check if position is less than 3
            if(nums.get(current)<3)
            nums.set(current, nums.get(current)+1);//increment position before we move
            else
            nums.set(current, nums.get(current)-1);//decrement position before we move
            
            steps++;//count steps taken
         
            //out of bounds check
            if(current>nums.size()-1 || current<0)
               flag=true;       
         }
      }catch(IndexOutOfBoundsException e)
      {
         System.out.println(e.getMessage());
      }
      //Display answer to the console
      System.out.println(steps);     
   }
}