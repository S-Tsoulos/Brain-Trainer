/**
 *Sotiris Tsoulos icsd13190
 * 
 */
package braintrainer.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

/**
 * dimiourgia antikeimenou kiklou me tis analoges zografikes
 */
public class Kiklos extends Tiles_Btn {

    private Insets insets;

    /**
     * Constructor for objects of class Kiklos
     *
     * @param index_flag
     * @param idShapeOnTile
     */
    public Kiklos(int index_flag, String idShapeOnTile) {
        super(index_flag,idShapeOnTile);
        insets = this.getInsets();
    }

    /**
     *
     * @param g
     */
    @Override
    void shapeOne(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillOval((insets.left + insets.right) / 2, (insets.top + insets.bottom) / 2, 60, 60);
    }

    /**
     *
     * @param g
     */
    @Override
    void shapeTwo(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.YELLOW);
        g2d.fillOval((insets.left + insets.right) / 2, (insets.top + insets.bottom) / 2, 60, 60);
    }

    public long getUniqID() {
        return this.atomic_id;
    }
}