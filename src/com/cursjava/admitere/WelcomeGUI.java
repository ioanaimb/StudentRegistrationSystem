package com.cursjava.admitere;
/* Prima fereastra - Welcome */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeGUI extends JFrame {
    JButton exitButton, registerButton, listButton;

    public WelcomeGUI() {
        // Titlul ferestrei
        this.setTitle("Student Registration System");
        // Modalitatea de inchidere a ferestrei
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Marimea ferestrei
        this.setSize(700,400);
        // Pozitioneaza fereastra in centrul ecranului
        this.setLocationRelativeTo(null);
        // Creaza mainPanel - panel principal care include toate elementele
        JPanel mainPanel = new JPanel();
        // Textul din fereastra principala
        JLabel welcomeLabel = new JLabel("Student Registration System",JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 28));
        // Precizeaza layout pentru mainPanel
        mainPanel.setLayout(new BorderLayout());
        // Culoarea de fond
        mainPanel.setBackground(Color.CYAN);
        // Creaza buttonPanel care va contine butoanele
        JPanel buttonPanel = new JPanel();
        // Precizeaza layout pentru buttonPanel
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
        // Butonul exit
        exitButton = new JButton("EXIT");
        exitButton.setPreferredSize(new Dimension(150,40));
        exitButton.setFont(new Font("Arial", Font.PLAIN, 18));
        //Butonul register
        registerButton = new JButton("REGISTER");
        registerButton.setPreferredSize(new Dimension(150,40));
        registerButton.setFont(new Font("Arial", Font.PLAIN, 18));
        // Butonul list
        listButton = new JButton("LIST");
        listButton.setPreferredSize(new Dimension(150,40));
        listButton.setFont(new Font("Arial", Font.PLAIN, 18));
        // Face ca butoanele sa poata fi receptive la events
        ListenForButton listenForButton = new ListenForButton();
        exitButton.addActionListener(listenForButton);
        registerButton.addActionListener(listenForButton);
        listButton.addActionListener(listenForButton);
        // Adauga butoanele la buttonPanel
        buttonPanel.add(exitButton);
        buttonPanel.add(registerButton);
        buttonPanel.add(listButton);
        // Adauga buttonPanel la mainPanel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        // Adauga textul la mainPAnel
        mainPanel.add(welcomeLabel);
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
                // Inchide fereastra Welcome
                dispose();

            }// Sursa eventului este butonul "REGISTER"
            else if (e.getSource() == registerButton) {
                // Deschide fereastra Register
                new RegisterGUI();
                // Inchide fereastra Welcome
                dispose();

            }// Sursa eventului este butonul "LIST"
            else if (e.getSource() == listButton) {
                // Deschide fereastra List
                new ListGUI();
                // Inchide fereastra Welcome
                dispose();
            }
        }
    }
}
