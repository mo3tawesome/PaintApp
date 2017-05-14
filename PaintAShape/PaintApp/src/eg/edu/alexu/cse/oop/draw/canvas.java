package eg.edu.alexu.cse.oop.draw;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class canvas extends Canvas implements DrawingEngine {
    private int undocounter;
    public static int selected;
    public  ArrayList<Shape> shapes;
    public Stack undoStack = new MyStack(20);
    public Stack redoStack = new MyStack(20);
    public List<Class<? extends Shape>>SupportedShapes;
    
    
    public canvas() {
        setBackground(Color.WHITE);
        shapes = new ArrayList<>();
        SupportedShapes =  new ArrayList(); 
       
    }
    
    //*/
    @Override
    public void paint(Graphics g) {

            for (Shape s : shapes) {
            s.draw(g);
            }
        //*/
               
    }

    @Override
    public void addShape(Shape shape) {
        ArrayList<Shape> Temp = new ArrayList<>();
        Temp.addAll( NewJFrame.canvas1.shapes);
        this.undoStack.push(Temp);
        Temp = new ArrayList<>();
        this.redoStack.clear();
        
        shapes.add(shape);
    }

    @Override
    public void removeShape(Shape shape) {
        ArrayList<Shape> Temp = new ArrayList<>();
        Temp.addAll( NewJFrame.canvas1.shapes);
        NewJFrame.canvas1.undoStack.push(Temp);
        Temp = new ArrayList<>();    
        
     shapes.remove(shape);
    }

    @Override
    public Shape[] getShapes() {
        Shape []shapearray =  shapes.toArray(new Shape[shapes.size()]);
        return shapearray;
    
    }

    @Override
    public void refresh(java.awt.Graphics canvas) {
        
      NewJFrame.canvas1.repaint();
        
        NewJFrame.jComboBox1.removeAllItems();
        int i =1;
        for(Shape s : NewJFrame.canvas1.shapes ){
                     
            NewJFrame.jComboBox1.addItem(s.getClass().getSimpleName()+"#"+i);
             i ++; 
        } 
        
    }
   

    @Override
    public void undo() {

        ArrayList<Shape> Temp = new ArrayList<>();       
        Temp.addAll((ArrayList<Shape>) undoStack.pop());
        redoStack.push(shapes);
        shapes = new ArrayList<>();
        shapes.addAll(Temp);
        Temp = new ArrayList<>();
        this.refresh(null);
         
        
    
    }


    @Override
    public void redo() {

    ArrayList<Shape> Temp = new ArrayList<>();     
    Temp.addAll((ArrayList<Shape>) redoStack.pop());
    undoStack.push(shapes);
    shapes  = new ArrayList<>();   
    shapes.addAll(Temp);
    Temp= new ArrayList<>();   
    this.refresh(null);

    }
     

   
    @Override
    public List<Class<? extends Shape>> getSupportedShapes() {
        return SupportedShapes;
    }

    @Override
    public void installPluginShape(Class<? extends Shape> shapeClass) {
     SupportedShapes.add(shapeClass);

    }  
    //*/
    
    
}
