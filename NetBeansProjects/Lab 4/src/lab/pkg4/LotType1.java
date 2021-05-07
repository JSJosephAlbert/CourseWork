/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

/**
 *
 * @author joseph
 */
public class LotType1 extends Lot implements Comparable<Lot> {

    public String lotName;
    public double lotHeight;
    public double lotBase;
    public double lotArea;

    public LotType1(String lotName, double lotBase, double lotHeight) {
        this.lotName = lotName;
        this.lotBase = lotBase;
        this.lotHeight = lotHeight;
    }

    @Override
    public double calculateArea() {
        lotArea = (lotBase * lotHeight) / 2;
        return lotArea;
    }

    @Override
    public String getID() {
        return lotName;
    }

    @Override
    public int compareTo(Lot t) {
        if (this.calculateArea() == t.calculateArea()) {
            return 0;
        } else if (this.calculateArea() > t.calculateArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
