/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Usuário
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        BPessoaF1 = new javax.swing.JButton();
        BPessoaJ1 = new javax.swing.JButton();
        BPessoaJ3 = new javax.swing.JButton();
        BPessoaJ4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Fechar = new javax.swing.JButton();
        BotaoCadastroF = new javax.swing.JButton();
        CadastroForne = new javax.swing.JButton();
        BotaoCadastroJ1 = new javax.swing.JButton();

        BPessoaF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPessoaF1.setText("Cadastrar Pessoa Fisica");
        BPessoaF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPessoaF1ActionPerformed(evt);
            }
        });

        BPessoaJ1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPessoaJ1.setText("Cadastrar Pessoa Juridica");
        BPessoaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPessoaJ1ActionPerformed(evt);
            }
        });

        BPessoaJ3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPessoaJ3.setText("Cadastrar Pessoa Juridica");
        BPessoaJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPessoaJ3ActionPerformed(evt);
            }
        });

        BPessoaJ4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPessoaJ4.setText("Cadastrar Pessoa Juridica");
        BPessoaJ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPessoaJ4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tela Inicial - Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Fechar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        BotaoCadastroF.setBackground(new java.awt.Color(255, 255, 255));
        BotaoCadastroF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoCadastroF.setText("Cadastrar Pessoa Fisica");
        BotaoCadastroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroFActionPerformed(evt);
            }
        });

        CadastroForne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CadastroForne.setText("Cadastrar Fornecedor");
        CadastroForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroForneActionPerformed(evt);
            }
        });

        BotaoCadastroJ1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoCadastroJ1.setText("Cadastrar Pessoa Juridica");
        BotaoCadastroJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroJ1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoCadastroF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CadastroForne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoCadastroJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BotaoCadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCadastroJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadastroForne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 620, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPessoaF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPessoaF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPessoaF1ActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_FecharActionPerformed

    private void BotaoCadastroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroFActionPerformed
    new CadastroPessoaF().setVisible(true);
    }//GEN-LAST:event_BotaoCadastroFActionPerformed

    private void BPessoaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPessoaJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPessoaJ1ActionPerformed

    private void CadastroForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroForneActionPerformed
    new Fornecedor().setVisible(true);
    
    }//GEN-LAST:event_CadastroForneActionPerformed

    private void BPessoaJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPessoaJ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPessoaJ3ActionPerformed

    private void BPessoaJ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPessoaJ4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPessoaJ4ActionPerformed

    private void BotaoCadastroJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroJ1ActionPerformed
     new CadastroPessoaJ().setVisible(true);  
    }//GEN-LAST:event_BotaoCadastroJ1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BPessoaF1;
    private javax.swing.JButton BPessoaJ1;
    private javax.swing.JButton BPessoaJ3;
    private javax.swing.JButton BPessoaJ4;
    private javax.swing.JButton BotaoCadastroF;
    private javax.swing.JButton BotaoCadastroJ1;
    private javax.swing.JButton CadastroForne;
    private javax.swing.JButton Fechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
