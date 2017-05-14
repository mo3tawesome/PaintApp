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
public class Circle extends MyShape{
   
    
    Circle(){
    	prop = new HashMap<String, Double>();
	prop.put("Radius", 0.0);
        
    }


 
    @Override
    public Object clone() throws CloneNotSupportedException{
    
        Circle c1 = new Circle();
     
        c1.p = this.p;
        c1.color = this.color;
        c1.fillcolor = this.fillcolor;
        c1.prop.putAll(prop);
     
     return c1;
        
    }
    
    
    
    @Override
    public void draw(Graphics canvas) {

        canvas.setColor(getFillColor());
        canvas.fillOval((int)p.getX(), (int)p.getY(), (int)(prop.get("Radius").doubleValue()) ,(int)(prop.get("Radius").doubleValue()));
    
        canvas.setColor(getColor());
        canvas.drawOval((int)p.getX(), (int)p.getY(), (int)(prop.get("Radius").doubleValue()) ,(int)(prop.get("Radius").doubleValue()));

    
    }



}
