/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Graphics;
import java.util.HashMap;

/**
 *
 * @author Mustafa
 */
public class Triangle extends MyShape{
    
        private int[]X = new int[3];
        private int[]Y = new int[3];
    
        public Triangle() {
        this.prop = new HashMap<String, Double>();
        prop.put("X1", 0.0);
        prop.put("X2", 0.0);
        prop.put("X3", 0.0);
        prop.put("Y1", 0.0);
        prop.put("Y2", 0.0);
        prop.put("Y3", 0.0);

        // this.prop = new HashMap <"Side",0.0>();
    }
    
    
      private void ProptoArray() {
        
       X[0] = (int) prop.get("X1").doubleValue();
       X[1] = (int) prop.get("X2").doubleValue();
       X[2] = (int) prop.get("X3").doubleValue();
       
       Y[0] = (int) prop.get("Y1").doubleValue();
       Y[1] = (int) prop.get("Y2").doubleValue();
       Y[2] = (int) prop.get("Y3").doubleValue();

    }   
         
        @Override
        public void draw(Graphics canvas) {
            this.ProptoArray();
            
            canvas.setColor(this.getFillColor());
            canvas.fillPolygon(X , Y , 3);

            canvas.setColor(this.getColor());
            canvas.drawPolygon(X , Y , 3);
        }
        
        
       @Override
    	public Object clone() throws CloneNotSupportedException{
		// You can implement that yourself using deep-clone technique
                Triangle t = new Triangle();
                  t.prop = this.prop;
                
                return t;
        }
    
    
}
