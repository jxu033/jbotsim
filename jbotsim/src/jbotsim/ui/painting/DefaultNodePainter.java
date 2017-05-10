package jbotsim.ui.painting;

import jbotsim.Node;
import jbotsim.Obstacle;
import jbotsim.Robot;
import jbotsim.ui.JNode;

import java.awt.*;

import sun.nio.cs.ext.ISCII91;

/**
 * Created by acasteig on 10/19/15.
 */
public class DefaultNodePainter implements NodePainter {
    @Override
    public void paintNode(Graphics2D g2d, Node node) {
       if(!(node instanceof Obstacle) && !(node instanceof Robot))
       {
    	   JNode jn=(JNode)node.getProperty("jnode");
    	   int drawSize = jn.getWidth()/2;
    	   if (node.getColor() != null){
    		   g2d.setColor(node.getColor());
    		   g2d.fillOval(drawSize/2, drawSize/2, drawSize, drawSize);
    	   }
       }
    }
}
