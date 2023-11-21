/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.lab;

/**
 *
 * @author fa20-bse-050
 */
public interface Item {
   public String name();
   public Packing packing();
   public float price();	
   public String sweetness();
   public boolean hasCream();
   public int spoonsCount();
  }

