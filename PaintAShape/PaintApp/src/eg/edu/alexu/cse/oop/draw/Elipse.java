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
public class Elipse extends MyShape {
    
        
    public Elipse(){
    prop = new HashMap<String, Double>();
    prop.put("Width", 0.0);
    prop.put("Length", 0.0);        
        
        
    }    
        
    

  

    @Override
    public Object clone() throws CloneNotSupportedException{
    
        Elipse c1 = new Elipse();
     
        c1.p = this.p;
        c1.color = this.color;
        c1.fillcolor = this.fillcolor;
        c1.prop.putAll(prop);
     
     return c1;
        
    }
    
    
    
    @Override
    public void draw(Graphics canvas) {

        canvas.setColor(getFillColor());
        canvas.fillOval(p.x, p.y, (int)(prop.get("Width").doubleValue()), (int)(prop.get("Length").doubleValue()));

        canvas.setColor(getColor());
        canvas.drawOval(p.x, p.y, (int)(prop.get("Width").doubleValue()), (int)(prop.get("Length").doubleValue()));

    
    }
 
}
