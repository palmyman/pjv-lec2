/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.cv2.Components;

import java.awt.Color;

/**
 *
 * @author cuhellub
 */
public class Roll extends Component {
    double height;
    double diameter;

    public Roll(double height, double diameter, Color color, Type type) {
        super(color, type);
        this.height = height;
        this.diameter = diameter;
    }

    @Override
    public double getSurface() {
        //TODO
        return 0;       
    }

    @Override
    public double getVolume() {
        //TODO
        return 0;
    }
}
