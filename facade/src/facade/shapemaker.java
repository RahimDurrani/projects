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
public class shapemaker {
   private shape circle;
   private shape rectangle;
   private shape square;

   public shapemaker() {
      circle = new circle();
      rectangle = new rectangle();
      square = new square();
   }

   public void drawCircle(String...options){
      circle.draw(options);
      circle.color();
   }
   public void drawRectangle(String...options){
      rectangle.draw(options);
      rectangle.color();
   }
   public void drawSquare(String...options){
      square.draw(options);
      square.color();
   }
}
