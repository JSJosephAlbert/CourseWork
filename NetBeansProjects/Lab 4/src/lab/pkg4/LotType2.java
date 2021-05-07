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
public class LotType2 extends Lot implements Comparable<Lot> {

    public String lotName;
    public double lotHeight;
    public double lotWidth;
    public double lotArea;

    public LotType2(String lotName, double lotHeight, double lotWidth) {
        this.lotName = lotName;
        this.lotHeight = lotHeight;
        this.lotWidth = lotWidth;
    }

    @Override
    public double calculateArea() {
        lotArea = lotWidth * lotHeight;
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
