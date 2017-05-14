/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Mustafa
 */
public class MyShape implements Shape {
    	Point p;
	Map<String, Double> prop;
	Color color = Color.black;
	Color fillcolor = Color.white;
    
    @Override
    public void setPosition(Point position) {
        p = position;
    }
    
    @Override
    public java.awt.Point getPosition() {
    
        return p;
      
    }
    
    
        
    
    @Override
    public void setProperties(java.util.Map<String, Double> properties) {
        prop = properties;
            
     }

    @Override
    public Map<String, Double> getProperties() {
        return prop;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
        
    }

    @Override
    public Color getColor() {
     return color;
    }

    @Override
    public void setFillColor(Color color) {
        fillcolor = color;
    }

    @Override
    public Color getFillColor() {
        return fillcolor;
        }

    @Override
    public void draw(Graphics canvas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    	public Object clone() throws CloneNotSupportedException{
		// You can implement that yourself using deep-clone technique
        

                
                return null;
        }
    
}
