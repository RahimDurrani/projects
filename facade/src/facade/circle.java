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
public class circle implements shape {

      @Override
   public void draw(String...options) {
      System.out.println("circle::draw()"+ options);
   }
   public void color() {
      System.out.println("black::color()");
   }
}