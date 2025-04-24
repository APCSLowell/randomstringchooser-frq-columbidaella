import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private String[] words;
  public RandomStringChooser(String[] x){
    words = x;}
  public String getNext(){
    int x = 0;
    String ans = "";
    for(int i = 0; i<words.length;i++){
      if(words[i].equals(""))
        x++;
    }
    if(x==words.length)
      return "NONE";
    x = (int)(Math.random()*words.length);
    if(!words[x].equals(ans)){
      ans = words[x];
      words[x] = "";
      return ans;
    }
    else{
      this.getNext();
        }}
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
