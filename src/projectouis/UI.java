/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectouis;

/**
 *
 * @author dam1
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
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

        jPanel1 = new javax.swing.JPanel();
        pjPanel = new javax.swing.JPanel();
        pjImg = new javax.swing.JPanel();
        pj2Separator = new javax.swing.JSeparator();
        fightStats = new javax.swing.JPanel();
        hpText = new javax.swing.JLabel();
        manaText = new javax.swing.JLabel();
        degenseText = new javax.swing.JLabel();
        dmgText = new javax.swing.JLabel();
        hpStat = new javax.swing.JLabel();
        defStat = new javax.swing.JLabel();
        manaStat = new javax.swing.JLabel();
        dmgStat = new javax.swing.JLabel();
        charStats = new javax.swing.JPanel();
        pj3Separator = new javax.swing.JSeparator();
        strText = new javax.swing.JLabel();
        dexText = new javax.swing.JLabel();
        conText = new javax.swing.JLabel();
        wisText = new javax.swing.JLabel();
        itlText = new javax.swing.JLabel();
        chaText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        pj1Separator = new javax.swing.JSeparator();
        jobText = new javax.swing.JLabel();
        nameShowText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        abilities = new javax.swing.JButton();
        attack = new javax.swing.JButton();
        run = new javax.swing.JButton();
        defense = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 160, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pjPanel.setBackground(new java.awt.Color(150, 70, 200));
        pjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        pjImg.setOpaque(false);
        pjImg.setPreferredSize(new java.awt.Dimension(0, 250));

        pj2Separator.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pjImgLayout = new javax.swing.GroupLayout(pjImg);
        pjImg.setLayout(pjImgLayout);
        pjImgLayout.setHorizontalGroup(
            pjImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pj2Separator, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pjImgLayout.setVerticalGroup(
            pjImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pjImgLayout.createSequentialGroup()
                .addGap(0, 238, Short.MAX_VALUE)
                .addComponent(pj2Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fightStats.setBackground(setOpaque(false));
        fightStats.setAutoscrolls(true);
        fightStats.setOpaque(false);

        hpText.setText("HP :");

        manaText.setText("Mana :");

        degenseText.setText("Defense :");

        dmgText.setText("Damage :");

        hpStat.setText("jLabel2");

        defStat.setText("jLabel2");

        manaStat.setText("jLabel2");

        dmgStat.setText("jLabel8");

        javax.swing.GroupLayout fightStatsLayout = new javax.swing.GroupLayout(fightStats);
        fightStats.setLayout(fightStatsLayout);
        fightStatsLayout.setHorizontalGroup(
            fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fightStatsLayout.createSequentialGroup()
                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fightStatsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(defStat))
                    .addGroup(fightStatsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(degenseText)
                            .addComponent(dmgText)
                            .addComponent(manaText)
                            .addComponent(hpText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fightStatsLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manaStat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hpStat, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(dmgStat, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fightStatsLayout.setVerticalGroup(
            fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fightStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpText)
                    .addComponent(hpStat))
                .addGap(18, 18, 18)
                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manaText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manaStat))
                .addGap(18, 18, 18)
                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degenseText)
                    .addComponent(defStat))
                .addGap(18, 18, 18)
                .addGroup(fightStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dmgText)
                    .addComponent(dmgStat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        charStats.setOpaque(false);

        pj3Separator.setForeground(new java.awt.Color(255, 255, 255));

        strText.setText("Strenghth :");

        dexText.setText("Dexterity :");

        conText.setText("Constitution :");

        wisText.setText("Wisdom :");

        itlText.setText("Intelligence :");

        chaText.setText("Charisma :");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel2");

        jLabel4.setText("jLabel2");

        jLabel5.setText("jLabel2");

        jLabel6.setText("jLabel2");

        jLabel7.setText("jLabel2");

        javax.swing.GroupLayout charStatsLayout = new javax.swing.GroupLayout(charStats);
        charStats.setLayout(charStatsLayout);
        charStatsLayout.setHorizontalGroup(
            charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pj3Separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(charStatsLayout.createSequentialGroup()
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(charStatsLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dexText)
                            .addComponent(strText)))
                    .addGroup(charStatsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wisText)
                            .addComponent(conText)
                            .addComponent(itlText)
                            .addComponent(chaText))))
                .addGap(30, 30, 30)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        charStatsLayout.setVerticalGroup(
            charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pj3Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strText)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dexText)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conText)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wisText)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itlText)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(charStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaText)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41))
        );

        namePanel.setOpaque(false);

        pj1Separator.setForeground(new java.awt.Color(255, 255, 255));

        jobText.setText("jLabel9");

        nameShowText.setText("jLabel9");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pj1Separator)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobText, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePanelLayout.createSequentialGroup()
                .addComponent(nameShowText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jobText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pj1Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pjPanelLayout = new javax.swing.GroupLayout(pjPanel);
        pjPanel.setLayout(pjPanelLayout);
        pjPanelLayout.setHorizontalGroup(
            pjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pjImg, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addComponent(charStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(namePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fightStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pjPanelLayout.setVerticalGroup(
            pjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pjPanelLayout.createSequentialGroup()
                .addComponent(pjImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fightStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(charStats, javax.swing.GroupLayout.PREFERRED_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 5, 250, 700));

        jPanel3.setBackground(new java.awt.Color(114, 78, 233));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        abilities.setBackground(new java.awt.Color(22, 5, 80));
        abilities.setText("jButton1");
        abilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abilitiesActionPerformed(evt);
            }
        });

        attack.setBackground(new java.awt.Color(22, 5, 80));
        attack.setText("jButton1");
        attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackActionPerformed(evt);
            }
        });

        run.setBackground(new java.awt.Color(22, 5, 80));
        run.setText("jButton1");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });

        defense.setBackground(new java.awt.Color(22, 5, 80));
        defense.setText("jButton1");
        defense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(defense, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(attack, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(abilities, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(550, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abilities, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defense, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1000, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 240, 320));

        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 590, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abilitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abilitiesActionPerformed

    private void attackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attackActionPerformed

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runActionPerformed

    private void defenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defenseActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abilities;
    private javax.swing.JButton attack;
    private javax.swing.JLabel chaText;
    private javax.swing.JPanel charStats;
    private javax.swing.JLabel conText;
    private javax.swing.JLabel defStat;
    private javax.swing.JButton defense;
    private javax.swing.JLabel degenseText;
    private javax.swing.JLabel dexText;
    private javax.swing.JLabel dmgStat;
    private javax.swing.JLabel dmgText;
    private javax.swing.JPanel fightStats;
    private javax.swing.JLabel hpStat;
    private javax.swing.JLabel hpText;
    private javax.swing.JLabel itlText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel jobText;
    private javax.swing.JLabel manaStat;
    private javax.swing.JLabel manaText;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel nameShowText;
    private javax.swing.JSeparator pj1Separator;
    private javax.swing.JSeparator pj2Separator;
    private javax.swing.JSeparator pj3Separator;
    private javax.swing.JPanel pjImg;
    private javax.swing.JPanel pjPanel;
    private javax.swing.JButton run;
    private javax.swing.JLabel strText;
    private javax.swing.JLabel wisText;
    // End of variables declaration//GEN-END:variables
}
