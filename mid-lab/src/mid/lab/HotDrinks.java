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
public abstract class HotDrinks implements Item {

	@Override
	public Packing packing() {
       return new Cup();
	}

	@Override
	public abstract float price();
}