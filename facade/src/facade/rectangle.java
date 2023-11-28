/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author fa20-bse-050
 */
public class rectangle implements shape {

   @Override
   public void draw(String...options) {
      System.out.println("Rectangle::draw()" + options);
   }
   public void color() {
      System.out.println("red::color()");
   }
}