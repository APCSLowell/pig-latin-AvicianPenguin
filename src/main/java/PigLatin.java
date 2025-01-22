import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String word){
	if(word.length()>0){
  	    	for(int i = 0; i<word.length(); i++){
    			if(word.substring(i+0,i+1).equals("a"))
      				return i;
    			else if(word.substring(i+0,i+1).equals("e"))
     				return i;
    			else if(word.substring(i+0,i+1).equals("i"))
     		 		return i;
    			else if(word.substring(i+0,i+1).equals("o"))
     				return i;
    			else if(word.substring(i+0,i+1).equals("u"))
     		 		return i;
       			}
 	}
 	return -1;
    }

public void setup(){
  String [] lines = {"beast", "dough", "happy", "question", "star", "three", "eagle", "try"};
  for (int i = 0 ; i < lines.length; i++){
    System.out.println(pigLatin(lines[i]));
   }
}
public void draw()
{
        //not used
}
public int findFirstVowel(String word){
if(word.length()>0){
  for(int i = 0; i<word.length(); i++){
    if(word.substring(i+0,i+1).equals("a"))
      return i;
    else if(word.substring(i+0,i+1).equals("e"))
      return i;
    else if(word.substring(i+0,i+1).equals("i"))
      return i;
    else if(word.substring(i+0,i+1).equals("o"))
      return i;
    else if(word.substring(i+0,i+1).equals("u"))
      return i;
  }
 }
 return -1;
}

public String pigLatin(String word){
if(word.length()>0){
//postcondition: returns the pig latin equivalent of sWord

    if(findFirstVowel(word) == -1)
    
      return word + "ay";
    
    if(findFirstVowel(word) == 0)
    
      return word + "way";
    
    if(word.substring(0,2).equals("qu"))
 
      return word.substring(2,word.length()) + "quay";
    for(int i = 0; i<word.length(); i++){
      if(findFirstVowel(word) == i){
        return(word.substring(i,word.length())+word.substring(0,i)+"ay");     
      }
    }   
  }
  return "ERROR!";
 }
}
	
