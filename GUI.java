import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main instance = new Main();
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

        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        panel.add(inputInfo(), c);
        panel.add(viewInfo(), c);
        panel.add(addInfo(), c);
        return panel;
    }

    public JPanel inputInfo() {
        JPanel panel = new JPanel(new GridLayout(3,1));
        JLabel firstL, lastL, idL;
        JTextField firstF, lastF, idF;

        firstL = new JLabel("First Name: ");
        lastL = new JLabel("Last Name: ");
        idL = new JLabel("ID #: ");

        firstF = new JTextField();
        lastF = new JTextField();
        idF = new JTextField();

        panel.add(firstL); panel.add(firstF);
        panel.add(lastL); panel.add(lastF);
        panel.add(idL); panel.add(idF);

//        panel.setPreferredSize(new Dimension(panel.getMaximumSize().width, 20));
        panel.setPreferredSize(new Dimension(300,200));
        return panel;
    }

    public JPanel viewInfo() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.MAGENTA);
        panel.setPreferredSize(panel.getMaximumSize());
        return panel;
    }

    public JPanel addInfo() {
        JPanel panel = new JPanel(new GridLayout(1,2));
        JButton add = new JButton("Add");
        JButton clear = new JButton("Clear");
        panel.add(add); panel.add(clear);
        return panel;
    }

//    JFrame frame;
//    GridBagLayout layout;
//    Container left;
//    Container right;
//    Container center;
//
//    private Main() {
//        layout = new GridBagLayout();
//        frame = new JFrame("GUI with no ActionListeners");
//        frame.setLayout(layout);
//
//        left = personalInfoPanel();
//        left.add(createPerson());
//        left.add(spacer());
//        left.add(confirmPerson());
//
//        center = createPanel("Display Results", GridBagConstraints.CENTER, Color.YELLOW);
//
//        right = createPanel("Calculator", GridBagConstraints.EAST, Color.PINK);
//
//        frame.setSize(1250,550);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Main();
//    }
//
//    private JPanel createPerson() {
//        GridLayout layout = new GridLayout(3,2);
//        JPanel panel = new JPanel(layout);
//        JLabel firstLabel, lastLabel, idLabel;
//        JTextField firstField, lastField, idField;
//
//        firstLabel = new JLabel("First Name: ");
//        lastLabel = new JLabel("Last Name: ");
//        idLabel = new JLabel("ID #: ");
//
//        firstField = new JTextField(32);
//        lastField = new JTextField(32);
//        idField = new JTextField(32);
//
//        panel.add(firstLabel); panel.add(firstField);
//        panel.add(lastLabel); panel.add(lastField);
//        panel.add(idLabel); panel.add(idField);
//
//        panel.setPreferredSize(new Dimension(panel.getMaximumSize()));
//        return panel;
//    }
//
//    private JPanel confirmPerson() {
//        GridLayout layout = new GridLayout(1, 2);
//        JPanel panel = new JPanel(layout);
//        JButton add, clear;
//
//        add = new JButton("Add");
//        clear = new JButton("Clear");
//
//        panel.add(add);
//        panel.add(clear);
//
//        panel.setPreferredSize(new Dimension(panel.getMaximumSize()));
//        return panel;
//    }
//
//    private JPanel spacer() {
//        FlowLayout layout = new FlowLayout();
//        JPanel panel = new JPanel(layout);
//        panel.setBackground(Color.MAGENTA);
//        panel.setPreferredSize(new Dimension(200, 400));
//        return panel;
//    }
//
//    private Container createPanel(String name, int anchor, Color color) {
//        JPanel panel = new JPanel(layout);
//        panel.setBackground(color);
//        panel.setBorder(new TitledBorder(name));
//        panel.setPreferredSize(new Dimension(400, 500));
//        GridBagConstraints constraints = new GridBagConstraints();
//        constraints.anchor = anchor;
//        layout.setConstraints(panel, constraints);
//        frame.add(panel);
//        return panel;
//    }
//
//    private Container personalInfoPanel() {
//        JPanel panel = new JPanel(new GridLayout(3, 1));
//        panel.setBackground(Color.GREEN);
//        panel.setBorder(new TitledBorder("Personal Information"));
//        panel.setPreferredSize(new Dimension(400, 500));
//        frame.add(panel);
//        return panel;
//    }

//    private static final int INFO_WIDTH = 320;
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Test");
//        frame.setResizable(false);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add(personalInfo());
//        frame.pack();
//    }
//
//    private static JPanel personalInfo() {
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        panel.setPreferredSize(new Dimension(360,360));
//        panel.setBackground(Color.GREEN);
//        panel.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY), "Personal Information"));
//        panel.add(inputInfo());
//        panel.add(addInfo());
//        return panel;
//    }
//
//    private static JPanel inputInfo() {
//        JPanel panel = new JPanel(new GridLayout(3, 1, 1, 3));
//        panel.setPreferredSize(new Dimension(INFO_WIDTH, 50));
//        panel.setBackground(Color.LIGHT_GRAY);
//        panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
//        panel.add(new JLabel("First Name: "));
//        panel.add(new JTextField(16));
//        panel.add(new JLabel("Last Name: "));
//        panel.add(new JTextField(16));
//        panel.add(new JLabel("ID #: "));
//        panel.add(new JTextField(16));
//        return panel;
//    }
//
//    private static JPanel addInfo() {
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
//        panel.setPreferredSize(new Dimension(INFO_WIDTH, 35));
//        panel.setBackground(Color.CYAN);
//        panel.setBorder(new LineBorder(Color.CYAN, 4));
//        panel.add(new JButton("Add"));
//        panel.add(new JButton("Clear"));
//        return panel;
//    }
}
