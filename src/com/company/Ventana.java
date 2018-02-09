package com.company;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton Boton1=new JButton("1");
    private JButton Boton2=new JButton("3");
    private JButton Boton3=new JButton("4");
    private JButton Boton4=new JButton("5");
    private JButton Boton5=new JButton("2");
    public Ventana(){
        super("ejemplo de borderLayout");
        setLayout(new BorderLayout());
        add(Boton1, BorderLayout.NORTH);
        add(Boton2, BorderLayout.SOUTH);
        add(Boton3, BorderLayout.WEST);
        add(Boton4, BorderLayout.EAST);
        add(Boton5, BorderLayout.CENTER);
    }
}
