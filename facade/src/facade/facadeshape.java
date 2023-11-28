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
public class facadeshape {
   public static void main(String[] args) {
      shapemaker shapemaker = new shapemaker();

      shapemaker.drawCircle();
      shapemaker.drawRectangle();
      shapemaker.drawSquare();		
   }
}