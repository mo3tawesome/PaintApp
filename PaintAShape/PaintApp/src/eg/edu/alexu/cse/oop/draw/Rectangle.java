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
public class Rectangle extends MyShape{
        
        
        public Rectangle(){
            	prop = new HashMap<String, Double>();
		prop.put("Width", 0.0);
                prop.put("Length", 0.0);
            
        }


    @Override
    public void draw(Graphics canvas) {
       
        
        canvas.setColor(this.getFillColor());
        canvas.fillRect(p.x, p.y, (int)(prop.get("Width").doubleValue()), (int)(prop.get("Length").doubleValue()));
        
        canvas.setColor(this.getColor());
        canvas.drawRect(p.x, p.y, (int)(prop.get("Width").doubleValue()), (int)(prop.get("Length").doubleValue()));
        
    }
    
    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
    
        Rectangle R1 =new Rectangle();
     
        R1.p = this.p;
        R1.color = this.color;
        R1.fillcolor = this.fillcolor;
        R1.prop.putAll(prop);
     
     
        return R1;
        
    }
    
    
    
}
