package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupusFamiliaris extends CanisLupus implements Trainable{
  
  public CanisLupusFamiliaris() {
    System.out.println("CanisLupusFamiliaris::new"); 
    getData()[2] = 5;
    System.out.println(Arrays.toString(getData()));
  }

  @Override
  public void vocalize() {
    System.out.println("Bark!");
  }

  @Override
  public String toString() {
    return super.toString() + " and I am a good boy.";
  }

  public static void about() {
    System.out.println("Canis Lupus Familiaris is a subspecies of Canis Lupus, produced through selective breeding.");
  }

  @Override
  public void perform() {
    System.out.println("Play fetch.");
  }

}
