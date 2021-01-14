// this is a reference class
class Apples
{
  //Instance Variables
  private String type;
  private double size; // inches diameter
  private boolean isTart;

  //Constructors
  public Apples()
  {
    type = null;
    size = 0;
    isTart = false;
  }

  //toString
  public String toString()
  {
    String output = "Type " + type +
                    "\nSize (inches diameter) " + size +
                    "\nIs it tart? " + isTart;
    return output;
  }
}//end class reference class