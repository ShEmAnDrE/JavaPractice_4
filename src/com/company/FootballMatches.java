package com.company;

import javax.swing.*;
import java.awt.*;

public class FootballMatches extends JFrame {

    private JPanel panel = new JPanel();
    private JButton acMilanButton = new JButton("AC Milan");
    private JButton realMadridButton = new JButton("Real Madrid");
    private JLabel resultLabel = new JLabel("Result: ");
    private JLabel lastScorerLabel = new JLabel("Last Scorer: ");
    private JLabel winnerlabel = new JLabel("Winner: DRAW");
    private int realMadrid = 0;
    private int acMilan = 0;

    private void update(String lastCommand) {
        lastScorerLabel.setText("Last Scorer: " + lastCommand);
        resultLabel.setText("Result: " + acMilan + " X " + realMadrid);
        if (acMilan > realMadrid) {
            winnerlabel.setText("Winner: AC Milan");
        } else if (realMadrid > acMilan) {
            winnerlabel.setText("Winner: Real Madrid");
        } else {
            winnerlabel.setText("Winner: DRAW");
        }
    }

    public FootballMatches () {
        super ("Football Matches");
        setSize(650, 500);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        acMilanButton.setBounds(100,0,200,100);
        realMadridButton.setBounds(350,0,200, 100);
        acMilanButton.setFont(new Font("Calibri",Font.PLAIN,20));
        realMadridButton.setFont(new Font("Calibri",Font.PLAIN,20));
        add(acMilanButton);
        add(realMadridButton);
        resultLabel.setBounds(210,100,200,100);
        lastScorerLabel.setBounds(210,130,300,100);
        winnerlabel.setBounds(210,160,300,100);
        resultLabel.setFont(new Font("Serif", Font.PLAIN,25));
        lastScorerLabel.setFont(new Font("Serif",Font.PLAIN,25));
        winnerlabel.setFont(new Font("Serif",Font.PLAIN,25));
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerlabel);
        acMilanButton.addActionListener(e -> {
            acMilan++;
            update("AC Milan");
        });
        realMadridButton.addActionListener(e -> {
            realMadrid++;
            update("Real Madrid");
        });
        setVisible(true);
    }
}
