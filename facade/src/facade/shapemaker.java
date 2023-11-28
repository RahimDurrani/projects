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

   public void drawCircle(){
      circle.draw();
      circle.color();
   }
   public void drawRectangle(){
      rectangle.draw();
      rectangle.color();
   }
   public void drawSquare(){
      square.draw();
      square.color();
   }
}
