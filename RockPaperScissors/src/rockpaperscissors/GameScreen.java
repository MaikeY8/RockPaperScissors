/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rockpaperscissors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author mikex
 */
public class GameScreen extends javax.swing.JFrame {

    private int computerMove;
    private int userMove;
    
    private int computerWins;
    private int userWins;

    private Timer delayer;
    private Timer delayer1;
    private final static String QUESTION_IMAGE = "/Images/QuestionMark.png";
    private final static String PAPER_IMAGE = "/Images/Paper.png";
    private final static String ROCK_IMAGE = "/Images/Rock.png";
    private final static String SCISSORS_IMAGE = "/Images/Scissors.png";

    /**
     * Creates new form GameScreen
     */
    public GameScreen() {
        setFrame();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rockButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();
        scissorsButton = new javax.swing.JButton();
        userImage = new javax.swing.JLabel();
        computerImage = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        userScore = new javax.swing.JLabel();
        computerScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rockButton.setText("Rock");
        rockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rockButton);
        rockButton.setBounds(100, 470, 140, 70);

        paperButton.setText("Paper");
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });
        getContentPane().add(paperButton);
        paperButton.setBounds(400, 470, 120, 70);

        scissorsButton.setText("Scissors");
        scissorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(scissorsButton);
        scissorsButton.setBounds(700, 470, 120, 70);
        getContentPane().add(userImage);
        userImage.setBounds(90, 140, 294, 248);
        getContentPane().add(computerImage);
        computerImage.setBounds(560, 140, 294, 248);
        getContentPane().add(output);
        output.setBounds(420, 70, 80, 50);
        getContentPane().add(userScore);
        userScore.setBounds(120, 70, 170, 40);
        getContentPane().add(computerScore);
        computerScore.setBounds(680, 70, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtonActionPerformed
        userMove = 1;
        setMoves(1, userImage);
    }//GEN-LAST:event_rockButtonActionPerformed

    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        userMove = 2;
        setMoves(2, userImage);
    }//GEN-LAST:event_paperButtonActionPerformed

    private void scissorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtonActionPerformed
        userMove = 3;
        setMoves(3, userImage);
    }//GEN-LAST:event_scissorsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel computerImage;
    private javax.swing.JLabel computerScore;
    private javax.swing.JLabel output;
    private javax.swing.JButton paperButton;
    private javax.swing.JButton rockButton;
    private javax.swing.JButton scissorsButton;
    private javax.swing.JLabel userImage;
    private javax.swing.JLabel userScore;
    // End of variables declaration//GEN-END:variables

    private void setFrame() {
        this.setTitle("Rock Paper Scissors");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private void setMoves(int move, JLabel labelName) {
        buttonSwitch(false);
        if (move == 1) {
            changeLabel(labelName, QUESTION_IMAGE);
        } else if (move == 2) {
            changeLabel(labelName, QUESTION_IMAGE);
        } else {
            changeLabel(labelName, QUESTION_IMAGE);
        }
        delayer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computerMove();
                delayer.stop();
            }
        });
        delayer.start();
    }
    
    private void buttonSwitch(boolean on) {
        rockButton.setEnabled(on);
        paperButton.setEnabled(on);
        scissorsButton.setEnabled(on);
    }

    private void computerMove() {
        changeLabel(computerImage, QUESTION_IMAGE);
        computerMove = random(1, 3);
        revealMove();
    }

    private void changeLabel(JLabel label, String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        label.setIcon(icon);
    }

    /**
     * Generate a random number (a double) in a range
     *
     * @param low the lowest double in the range
     * @param high the highest double in the range
     * @return random double in the range
     */
    private static double random(double low, double high) {
        return (high - low + 1d) * Math.random() + low;
    }

    /**
     * Generate a random number (an integer) in a range
     *
     * @param low the lowest integer in the range
     * @param high the highest integer in the range
     * @return random integer in the range
     */
    private static int random(int low, int high) {
        return (int) (random((double) low, (double) high));
    }

    private void revealMove() {
        delayer1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revealUser();
                revealComputer();
                calculateWin();
                buttonSwitch(true);
                delayer1.stop();
            }
        });
        delayer1.start();
    }
    
    private void revealUser() {
        if (userMove == 1) {
            changeLabel(userImage, ROCK_IMAGE);
        } else if (userMove == 2) {
            changeLabel(userImage, PAPER_IMAGE);
        } else {
            changeLabel(userImage, SCISSORS_IMAGE);
        }
    }
    
    private void revealComputer() {
        if (computerMove == 1) {
            changeLabel(computerImage, ROCK_IMAGE);
        } else if (computerMove == 2) {
            changeLabel(computerImage, PAPER_IMAGE);
        } else {
            changeLabel(computerImage, SCISSORS_IMAGE);
        }
    }
    
    private void calculateWin() {
        if (userMove == computerMove) output.setText("Tie");
        else if (userMove == 1) {
            if (computerMove == 2) {
                showResults("Lose");
            }
            else if (computerMove == 3) {
                showResults("Win");
            }
        }
        else if (userMove == 2) {
            if (computerMove == 1) {
                showResults("Win");
            }
            else if (computerMove == 3) {
                showResults("Lose");
            }
        }
        else if (userMove == 3) {
            if (computerMove == 2) {
                showResults("Win");
            }
            else if (computerMove == 1) {
                showResults("Lose");
            }
        }
    }
    
    private void showResults(String text) {
        output.setText(text);
        if (text == "Win") {
            userWins++;
            userScore.setText("User's Wins = " + userWins);
        }
        else {
            computerWins++;
            computerScore.setText("Computer's Wins = " + computerWins);
        }
        
    }
}
