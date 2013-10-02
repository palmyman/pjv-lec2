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
public abstract class Component {
    protected Color color;
    protected Type type;

    public Component(Color color, Type type) {
        this.color = color;
        this.type = type;
    }
    
    public abstract double getSurface();
    public abstract double getVolume();
}
