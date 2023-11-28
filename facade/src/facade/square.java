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
public class square implements shape {

    @Override
   public void draw() {
      System.out.println("square::draw()");
   }
   public void color() {
      System.out.println("green::color()");
   }
}