/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JordanDevuyst_lab10;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author C0512737
 */
public class ListenerGUI {
    
    public JButton add;
    public JButton remove;
    
    private JTextField first;
    private JTextField last;
    private JTextField id;
    
//    PersonHandler listener;
    
        public static void main(String[] args) {
        ListenerGUI instance = new ListenerGUI();
//        PersonHandler listener = new PersonHandler(instance);
//        instance.listener = listener;
        instance.initialize();
    }

    public void initialize() {
        GridBagLayout layout = new GridBagLayout();
        JFrame frame = new JFrame("GUI with no ActionListeners");
        frame.setLayout(layout);
        frame.add(infoPanel());
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel infoPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(360,360));
        panel.setBackground(Color.GREEN);
        panel.setBorder(new TitledBorder("Personal Information"));

        addInput(panel);
        addView(panel);
        addCreate(panel);
        return panel;
    }

    public void addInput(JPanel panel) {
        JPanel input = new JPanel(new GridLayout(3,1));
        JLabel firstL, lastL, idL;

        firstL = new JLabel("First Name: ");
        lastL = new JLabel("Last Name: ");
        idL = new JLabel("ID #: ");

        first = new JTextField();
        last = new JTextField();
        id = new JTextField();

        input.add(firstL); input.add(first);
        input.add(lastL); input.add(last);
        input.add(idL); input.add(id);
        
        input.setPreferredSize(new Dimension(320, input.getMinimumSize().height));
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        panel.add(input, c);
    }

    public void addView(JPanel panel) {
//        JList list = new JList(listener.students.toArray());
        JPanel p = new JPanel();
        p.setBackground(Color.MAGENTA);
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        panel.add(p, c);
    }

    public void addCreate(JPanel panel) {
        JPanel create = new JPanel(new GridLayout(1,2));
        
        add = new JButton("Add");
//        add.addActionListener(listener);
        remove = new JButton("Remove");
//        remove.addActionListener(listener);
        
        create.add(add); create.add(remove);
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        panel.add(create, c);
    }
    
    public String getFirst() {
        return first.getText();
    }
    
    public String getLast() {
        return last.getText();
    }
    
    public String getID() {
        return id.getText();
    }
    
}
