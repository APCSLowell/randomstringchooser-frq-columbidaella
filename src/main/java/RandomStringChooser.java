import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private List<String> words;
  public RandomStringChooser(String[] x){
    words = new ArrayList<String>();
    for(int i = 0; i < x.length; i++){
      words.add(x[i]);
  }}
  public String getNext(){
      if(words.size()==0){
        return "NONE";
     int x = (int)(Math.random()*words.size());
        return words.remove(x);}
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
