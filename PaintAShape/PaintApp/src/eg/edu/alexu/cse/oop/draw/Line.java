/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;

/**
 *
 * @author Mustafa
 */
public class Line extends MyShape{
 
    
    
            public Line() {
           
        this.prop = new HashMap<String, Double>();
        prop.put("X1", 0.0);
        prop.put("X2", 0.0);

        prop.put("Y1", 0.0);
        prop.put("Y2", 0.0);


    }
            
            
    @Override
    public void setFillColor(Color color) {
       this.color = color;
    }

    @Override
    public Color getFillColor() {
        return color;
        }    
    
        @Override
    public void draw(Graphics canvas) {
      canvas.setColor(this.getFillColor());
      canvas.drawLine((int) prop.get("X1").doubleValue(), (int) prop.get("Y1").doubleValue(),(int) prop.get("X2").doubleValue(),  (int) prop.get("Y2").doubleValue());

    }
    
  
   

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    	public Object clone() throws CloneNotSupportedException{
		// You can implement that yourself using deep-clone technique
                Line l = new Line();
                l.prop = this.prop;
                l.fillcolor = this.fillcolor;

                
                return l;
        }
    
}
