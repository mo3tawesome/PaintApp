/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mustafa
 */
public class square extends MyShape{

	
	public square() {
		prop = new HashMap<String, Double>();
		prop.put("Side", 0.0);
	}
	



        @Override
	public void draw(Graphics canvas) {
            
            canvas.setColor(getFillColor());            
            canvas.fillRect((int)p.getX(), (int)p.getY(), (int)(prop.get("Side").doubleValue()), (int)(prop.get("Side").doubleValue()));
            
            canvas.setColor(getColor());
            canvas.drawRect((int)p.getX(), (int)p.getY(), (int)(prop.get("Side").doubleValue()), (int)(prop.get("Side").doubleValue()));		
	
        }
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		// You can implement that yourself using deep-clone technique
            square c1 = new square ();
            c1.p = this.p;
            c1.color = this.color;
            c1.fillcolor = this.fillcolor;
            c1.prop.putAll(prop);

                
                return c1;
	
        }


}
 

