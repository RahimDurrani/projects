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
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new bottle();
	}

	@Override
	public abstract float price();
}