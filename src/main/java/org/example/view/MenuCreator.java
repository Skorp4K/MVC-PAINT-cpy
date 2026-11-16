package org.example.view;

import lombok.Setter;
import org.example.controller.Controller;
import org.example.model.factory.ShapeState;
import javax.swing.*;

public class MenuCreator {
    private static MenuCreator instance;
    private ShapeState shapeState;
    private Controller controller;

    private MenuCreator(){

    }
    public static MenuCreator getInstance(){
        synchronized (MenuCreator.class){
            if (instance == null){
                instance = new MenuCreator();
            }
            return instance;
        }
    }
    public JMenuBar createMenu() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu shapeMenu = createShapeMenu();
        return jMenuBar;
    }

    private JMenu createShapeMenu() {
        ButtonGroup group = new ButtonGroup();
        JMenu shapeMenu = new JMenu("Фигура");
        return null;
    }

}
