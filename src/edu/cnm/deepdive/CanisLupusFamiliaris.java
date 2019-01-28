package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.CanisLupus#vocalize()
   */
  @Override
  public void vocalize() {
    System.out.println("Bark!");
  }

  @Override
  public String toString() {
    return super.toString() + " and I am a good boy.";
  }

}