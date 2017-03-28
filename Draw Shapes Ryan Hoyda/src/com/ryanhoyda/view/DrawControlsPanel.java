package com.ryanhoyda.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ryanhoyda.shapes.Line;
import com.ryanhoyda.shapes.Rectangle;
import com.ryanhoyda.shapes.Shape;
import com.ryanhoyda.shapes.Triangle;
import com.ryanhoyda.shapes.Oval;

@SuppressWarnings("serial")
public class DrawControlsPanel extends JPanel {
    private Shape[] shapes; // shapes to process
    private Shape currentShape;
    private int shapeCount;
    private int shapeType;
    private Color currentColor;
    private boolean filledShape;
    private JLabel statusLabel;

    public DrawControlsPanel(JLabel status) {
        shapes = new Shape[20]; // 20 maximum shapes to process
        shapeCount = 0; // no shapes initially to process

        setShapeType(0); // default shape type
        setDrawingColor(Color.BLACK); // default color
        setFilledShape(false); // default fill state
        currentShape = null;

        setBackground(Color.WHITE);

        // add the mouse listeners
        MouseHandler mouseHandler = new MouseHandler();
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);

        // set the status label for displaying mouse coordinates
        statusLabel = status;
    }

    // draw shapes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < shapeCount; i++)
            shapes[i].draw(g);

        if (currentShape != null)
            currentShape.draw(g);
    }

    // set shape type to draw
    public void setShapeType(int shapeType) {
        if (shapeType < 0 || shapeType > 3)
            shapeType = 0;

        this.shapeType = shapeType;
    }


    public void setDrawingColor(Color c) {
        currentColor = c;
    }

    public void clearLastShape() {
        if (shapeCount > 0) {
            shapeCount--;
            repaint();
        }
    }

    public void clearDrawing() {
        shapeCount = 0;
        repaint();
    }

    public void setFilledShape(boolean isFilled) {
        filledShape = isFilled;
    }

    // processes JPanel mouse events
    private class MouseHandler extends MouseAdapter
            implements MouseMotionListener {

        public void mousePressed(MouseEvent e) {
            //Finish drawing a triangle if we have one
            if(currentShape != null && currentShape instanceof Triangle){
                Triangle t = (Triangle) currentShape;
                t.setX3(e.getX());
                t.setY3(e.getY());
                t.setFilled(filledShape);
                currentShape = null;
                repaint();
                return;
            }
            
            if(currentShape != null && currentShape instanceof Oval){
            	Oval o = (Oval) currentShape;
            	o.setHeight(e.getX(), e.getY());
                o.setFilled(filledShape);
                currentShape = null;
                repaint();
                return;
            	
            }
               

            if (currentShape != null)
                return;
            // process shape
            switch (shapeType) {
                case 0:
                    currentShape = new Line(e.getX(), e.getY(),
                            e.getX(), e.getY(), currentColor);
                    break;
                case 1:
                    currentShape = new Rectangle(e.getX(), e.getY(),
                            e.getX(), e.getY(), currentColor, filledShape);
                    break;
                case 2:
                    currentShape = new Triangle(e.getX(), e.getY(), e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
                    break;
                case 3:
                	currentShape = new Oval(e.getX(), e.getY(), e.getX(), e.getY(), 10, 10, currentColor, filledShape);
                    break;
            }
        }

        // process shape
        public void mouseReleased(MouseEvent e) {
            if (currentShape == null)
                return;

            // set the second point on the shape
            currentShape.setX2(e.getX());
            currentShape.setY2(e.getY());

            // process shape if room in the array
            if (shapeCount < shapes.length) {
                shapes[shapeCount] = currentShape;
                shapeCount++;
            } // end if

            //Triangle has 3 points so we need to return here
            //The 3rd point will get set when the mouse is clicked again
            if(currentShape instanceof Triangle){
                return;
            }
            
            if(currentShape instanceof Oval) {
                Oval o = (Oval) currentShape;
                o.setWidth(e.getX(), e.getY());
                repaint();
                return;
            }

            currentShape = null; // clear the temporary drawing shape
            repaint();
        }

        // update shape based on mouse position
        public void mouseDragged(MouseEvent e) {
            if (currentShape != null) {
                currentShape.setX2(e.getX());
                currentShape.setY2(e.getY());

                //If the filled checkbox is checked, we won't see Triangle
                //getting drawn, so make sure the setFilled is false
                //for triangle objects
                if(currentShape instanceof Triangle){
                    ((Triangle) currentShape).setFilled(false);
                }
                if(currentShape instanceof Oval){
                    ((Oval) currentShape).setFilled(false);
                    ((Oval) currentShape).setWidth(e.getX(), e.getY());
                }    
                repaint();
            }
            mouseMoved(e);// update status bar
        }

        // updates the status bar to show the current mouse coordinates
        public void mouseMoved(MouseEvent e) {
            statusLabel.setText(
                    String.format("(%d,%d)", e.getX(), e.getY()));
        }
    }
}