/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author fa20-bse-050
 */
public class ProxyPattern {
	
   public static void main(String[] args) {
      image image = new ProxyImage("test_10mb.jpg");

      image.display(); 
      System.out.println("");
      image.display(); 	
   }
}