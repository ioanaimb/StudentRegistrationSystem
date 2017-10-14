package com.cursjava.admitere;
/* Fereastra Register */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGUI extends JFrame {
    JButton exitButton,registerButton;
    JLabel firstNameLabel, lastNameLabel, yearLabel;
    JTextField firstNameField, lastNameField;
    JList anJList;
    DefaultListModel aniList = new DefaultListModel();

    public RegisterGUI() {
        // Seteaza fereastra Register: titlu, mod de inchidere, dimensiuni si pozitia
        this.setTitle("Student Registration System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        // Creaza main panel panel principal care contine toate celelalte elemente
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.CYAN);
        // Creaza regPanel pentru elementele principale din fereastra
        JPanel regPanel = new JPanel();
        regPanel.setBackground(Color.CYAN);
        regPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        // Creaza textul "First name"
        firstNameLabel = new JLabel("First Name");
        firstNameLabel.setFont(new Font("Arial",Font.BOLD,16));
        regPanel.add(firstNameLabel);
        // Creaza campul pentru a introduce prenumele
        firstNameField = new JTextField(30);
        firstNameField.setFont(new Font("Arial", Font.BOLD, 16));
        regPanel.add(firstNameField);
        // Creaza textul "Last Name"
        lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setFont(new Font("Arial",Font.BOLD,16));
        regPanel.add(lastNameLabel);
        // Creaza campul pentru a introduce numele
        lastNameField = new JTextField(30);
        lastNameField.setFont(new Font("Arial", Font.BOLD, 16));
        regPanel.add(lastNameField);
        // Creaza textul "Year"
        yearLabel = new JLabel("Year");
        yearLabel.setFont(new Font("Arial", Font.BOLD, 16));
        regPanel.add(yearLabel);

        Integer[] aniStudiu = {1,2,3,4,5};
        // Adauga lista la aniList
        for(Integer an:aniStudiu) {
            aniList.addElement(an);
        }
        // Creaza elementul anJList de tipul JList cu continutul aniList
        anJList = new JList(aniList);
        anJList.setFont(new Font("Arial", Font.BOLD, 16));
        // Specifica cate randuri sa fie vizibile
        anJList.setVisibleRowCount(5);
        // Adauga anJList la regPanel
        regPanel.add(anJList);
        // Adauga regPanel la mainPanel
        mainPanel.add(regPanel, BorderLayout.CENTER);

        // Creaza buttonPanel pentru butoane
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
        // Butonul "EXIT"
        exitButton = new JButton("EXIT");
        exitButton.setPreferredSize(new Dimension(150,40));
        exitButton.setFont(new Font("Arial", Font.PLAIN, 18));
        // Butonul "REGISTER"
        registerButton = new JButton("REGISTER");
        registerButton.setPreferredSize(new Dimension(150,40));
        registerButton.setFont(new Font("Arial", Font.PLAIN, 18));
        // Face ca butoanele sa poata fi receptive la events
        ListenForButton listenForButton = new ListenForButton();
        exitButton.addActionListener(listenForButton);
        registerButton.addActionListener(listenForButton);
        // Adauga butoanele la buttonPanel
        buttonPanel.add(exitButton);
        buttonPanel.add(registerButton);
        // adauga buttonPanel la mainPanel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        // Adauga mainPanel la Frame
        this.add(mainPanel);
        // Face fereastra vizibila
        this.setVisible(true);

    }
    // Pentru events
    private class ListenForButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // Sursa eventului este butonul "EXIT"
            if (e.getSource() == exitButton){
                // Inchide fereastra Register
                dispose();
            } else if (e.getSource() == registerButton) {
                //Aici vom adauga acces la baza de date in curand
                dispose();
            }
        }
    }
}
