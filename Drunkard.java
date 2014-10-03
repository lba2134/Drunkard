//************************************************
//
//  Drunkard.java
//
//  This class models the random  path traveled by a drunk
//  man as he travels to subsequent intersections. 
//
//  Author: lyndsie anderson
//**************************************************

public class Drunkard
{
  //here i initialize the instance variables
  public int avenue;
  public int street;
  private int currentAvenue = avenue;
  private int currentStreet= street;
  
  public Drunkard(int a,int s) { //constructor
    avenue = a;
    street = s;

  }
 
  public void step()
  {
    int random = (int)(Math.random()*4)+1;
    if(random == 1) //move up 
    currentStreet = currentStreet + 1;  // street++;
    if(random == 2) //move right 
    currentAvenue = currentAvenue + 1; //avenue++;
    if(random == 3) //move down 
    currentStreet= currentStreet - 1; // street--;
    if(random == 4) //move left 
    currentAvenue= currentAvenue- 1; //avenue--;
  }

  public void fastForward (int steps)
  {

    for (int i = 0; i < steps; i++){
    step(); 
  }
} 

  public String getLocation()
  {
   return  currentAvenue + " avenue, " + currentStreet + " street";
  }

  public int howFar()
  {
    int x = Math.abs(avenue - currentAvenue);
    int y= Math.abs (street  - currentStreet);

   return x + y;
}
  }
