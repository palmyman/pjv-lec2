/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.cv2.Components;

/**
 *
 * @author cuhellub
 */
public enum Type {
        BIG(6), SMALL(3);
    private final int SIZE;

    public int getVELIKOST() {
        return SIZE;
    }

    private Type(int SIZE) {
        this.SIZE = SIZE;
    }
}
