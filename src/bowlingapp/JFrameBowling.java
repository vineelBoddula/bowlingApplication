/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingapp;

/**
 *
 * @author Vineel
 */
public class JFrameBowling extends javax.swing.JFrame {

    /**
     * Creates new form JFrameBowiling
     */
    public JFrameBowling() {
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

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLblPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(530, 410, 100, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(950, 220, 100, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(650, 220, 300, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(170, 220, 260, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(430, 220, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 120, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 30, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(150, 140, 930, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(150, 50, 930, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(150, 20, 930, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(150, 110, 930, 40);

        jLblPicture.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLblPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bowlingapp/scoreWork.png"))); // NOI18N
        jPanel2.add(jLblPicture);
        jLblPicture.setBounds(100, 0, 1190, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int value;//local variable used in do loop to get random value

        int[] framePoints = new int[21];// skips 0 and there are 20 frames
        int playerOneTotalPoints = 0; //total points of player 1
        int playerTwoTotalPoints = 0;// total points of player 2

        int frame = 0;// frame counter
        int counter = 0;// array counter used for arrays
        String[] throwingPoints = new String[41]; //skips 0, points for each throw and in two there are 40

        do {
            frame += 1;// counter
            int throwing = 0; //counter for throwing
            int totalpinsleft = 10; //total pins
            int points = 0; //points
            do {
                counter += 1;//counter
                value = (int) (totalpinsleft * Math.random() + 1);//getting random value

                totalpinsleft = totalpinsleft - value; //total pins left 

                points = points + value;//used for the if statement

                /*if throwing is equal to 0 and points is equal to 10 then
                 points is assign the value of 20, throwingPoint array is given 
                 a value "X" 
                 */
                if ((throwing == 0) && (points == 10)) {
                    points = 20; //20 is assigned to point
                    throwingPoints[counter] = "X"; //x is assign to the array
                    counter = counter + 1; //counter is increased because the throw is automatical going to be zero
                    throwingPoints[counter] = "-";//0 (-) is assigned
                    throwing += 1;//throw 2 is going to be zero

                    /* else if throwing is equal to 1 and points is equal to 10
                     then points is equal to 15 and throwingPoints is equal to a spare
                     */
                } else if ((throwing == 1) && (points == 10)) {
                    points = 15;
                    throwingPoints[counter] = "/";
                    /*else just add points to throwingPoints array*/
                } else {

                    throwingPoints[counter] = Integer.toString(value);
                }
                throwing += 1; //counter

                /*do this loop until throwing is equal to 2 and totalpinsleft is equal to 0*/
            } while ((throwing != 2) && (totalpinsleft != 0));
            framePoints[frame] = points;//assign the frame points
/*do this loop until frame is equal to 20*/
        } while (frame != 20);

        /*add player one total points*/
        for (int i = 1; i <= 10; i++) {
            playerOneTotalPoints += framePoints[i];
        }

        /*add player two total points*/
        for (int i = 11; i <= 20; i++) {
            playerTwoTotalPoints += framePoints[i];
        }

        /*output player 1 throwingPoints in each frame*/
        jLabel1.setText((throwingPoints[1]) + "       " + (throwingPoints[2])
                + "       " + (throwingPoints[3]) + "      " + (throwingPoints[4])
                + "      " + (throwingPoints[5]) + "      " + (throwingPoints[6])
                + "      " + (throwingPoints[7]) + "       " + (throwingPoints[8])
                + "       " + (throwingPoints[9]) + "      " + (throwingPoints[10])
                + "       " + (throwingPoints[11]) + "      " + (throwingPoints[12])
                + "      " + (throwingPoints[13]) + "      " + (throwingPoints[14])
                + "      " + (throwingPoints[15]) + "      " + (throwingPoints[16])
                + "      " + (throwingPoints[17]) + "      " + (throwingPoints[18])
                + "      " + (throwingPoints[19]) + "      " + (throwingPoints[20])
        );
        /*output player 2 throwingPoints in each frame*/
        jLabel2.setText((throwingPoints[21]) + "       " + (throwingPoints[22])
                + "       " + (throwingPoints[23]) + "      " + (throwingPoints[24])
                + "      " + (throwingPoints[25]) + "      " + (throwingPoints[26])
                + "      " + (throwingPoints[27]) + "       " + (throwingPoints[28])
                + "       " + (throwingPoints[29]) + "      " + (throwingPoints[30])
                + "       " + (throwingPoints[31]) + "      " + (throwingPoints[32])
                + "      " + (throwingPoints[33]) + "      " + (throwingPoints[34])
                + "      " + (throwingPoints[35]) + "      " + (throwingPoints[36])
                + "      " + (throwingPoints[37]) + "      " + (throwingPoints[38])
                + "      " + (throwingPoints[39]) + "       " + (throwingPoints[40])
        );

        /*Output total frame points of player 1*/
        jLabel3.setText((framePoints[1]) + "                 " + (framePoints[2])
                + "                " + (framePoints[3]) + "                " + (framePoints[4])
                + "                " + (framePoints[5]) + "                 " + (framePoints[6])
                + "                " + (framePoints[7]) + "                " + (framePoints[8])
                + "               " + (framePoints[9]) + "                " + (framePoints[10])
        );
        /*Output total frame points of player 2*/
        jLabel4.setText((framePoints[11]) + "                 " + (framePoints[12])
                + "                " + (framePoints[13]) + "                " + (framePoints[14])
                + "                " + (framePoints[15]) + "                 " + (framePoints[16])
                + "                " + (framePoints[17]) + "                " + (framePoints[18])
                + "              " + (framePoints[19]) + "                 " + (framePoints[20])
        );

        jLabel9.setText(String.valueOf(playerOneTotalPoints)); //output player 1 totalpoints
        jLabel11.setText(String.valueOf(playerTwoTotalPoints));// output player 2 totalpoints
        


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameBowling.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBowling.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBowling.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBowling.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBowling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblPicture;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
