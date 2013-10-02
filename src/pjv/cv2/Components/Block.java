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
public class Block extends Component {
    double a, b ,c;

    public Block(double a, double b, double c, Color color, Type type) {
        super(color, type);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    

    @Override
    public double getSurface() {
        return 2*(a*b + b*c + a*c);       
        
    }

    @Override
    public double getVolume() {
        return a*b*c;
    }
    
}
