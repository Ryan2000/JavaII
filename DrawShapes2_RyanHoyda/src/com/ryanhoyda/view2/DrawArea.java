package com.ryanhoyda.view2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawArea extends JFrame implements ItemListener, ActionListener {
    // Current shapes in application
    private String[] shapes = {"Line", "Rectangle", "Triangle", "Oval"};
    // Current color choices in application
    private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN,
            Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.RED, Color.YELLOW
    };
    // Color names associated with color choices
    private String[] colorNames = {"Black", "Blue", "Cyan", "Green",
            "Magenta", "Orange", "Red", "Yellow"};
    private DrawControlsPanel drawPanel; // panel that handles the drawing
    private JButton clearButton; // button to clear all shapes
    private JCheckBox filledCheckBox; // check box to toggle filled shapes
    @SuppressWarnings("rawtypes")
	private JComboBox colorChoices; // combo box for selecting the color
    @SuppressWarnings("rawtypes")
	private JComboBox shapeChoices; // combo box for selecting shapes

    // constructor
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public DrawArea() {
        super("Draw Shapes");
        // create component panel
        JPanel topPanel = new JPanel();
        // button to clear shape drawings
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        topPanel.add(clearButton);
        // choose colors
        colorChoices = new JComboBox(colorNames);
        colorChoices.addItemListener(this);
        topPanel.add(colorChoices);
        // choose shapes
        shapeChoices = new JComboBox(shapes);
        shapeChoices.addItemListener(this);
        topPanel.add(shapeChoices);
        // create a checkbox to determine whether the shape is filled
        filledCheckBox = new JCheckBox("Filled");
        filledCheckBox.addItemListener(this);
        topPanel.add(filledCheckBox);
        // add the top panel to the frame
        add(topPanel, BorderLayout.NORTH);
        // create a label for the status bar
        JLabel statusLabel = new JLabel("(0,0)");
        // add the status bar at the bottom
        add(statusLabel, BorderLayout.SOUTH);
        // create the DrawClontrolsPanel with its status bar label
        drawPanel = new DrawControlsPanel(statusLabel);
        add(drawPanel); // add the drawing area to the center
    }
    
 // handle combobox or checkbox selections
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == shapeChoices) // shape chice
            drawPanel.setShapeType(shapeChoices.getSelectedIndex());
        else if (e.getSource() == colorChoices) // choose color
            drawPanel.setDrawingColor(colors[colorChoices.getSelectedIndex()]);
        else if (e.getSource() == filledCheckBox) // shape filled/unfilled
            drawPanel.setFilledShape(filledCheckBox.isSelected());
    }

    // handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton)
            drawPanel.clearDrawing();
    }
    
    
}
