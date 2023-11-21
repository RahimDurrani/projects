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
public class Tea extends HotDrinks {
     private String sweetnessType;
    private boolean hasCream;
    private int spoonsCount;

    public Tea(String sweetnessType, boolean hasCream, int spoonsCount) {
        this.sweetnessType = sweetnessType;
        this.hasCream = hasCream;
        this.spoonsCount = spoonsCount;
    }

    Tea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public String sweetness() {
        return sweetnessType;
    }

    @Override
    public boolean hasCream() {
        return hasCream;
    }

    @Override
    public int spoonsCount() {
        return spoonsCount;
    }

    @Override
    public float price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}