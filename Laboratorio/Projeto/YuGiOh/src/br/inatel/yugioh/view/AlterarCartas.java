package br.inatel.yugioh.view;

import br.inatel.yugioh.control.Deck;
import br.inatel.yugioh.model.Carta;
import br.inatel.yugioh.model.CartaMagica;
import br.inatel.yugioh.model.CartaMonstro;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class AlterarCartas extends javax.swing.JFrame {

    private ArrayList<Carta> dck = new ArrayList<>();
    private Deck d = new Deck();
    public static int indiceSelecionado = 0;

    public AlterarCartas() {
        initComponents();
        this.setLocationRelativeTo(null);           // Centralizar a Tela
        dck = d.lerDeck();
        listarCartas();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_Carta = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_efeito = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_def = new javax.swing.JLabel();
        lbl_atk = new javax.swing.JLabel();
        lbl_atributo = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        lbl_fundo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Alterar Cartas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, -1, -1));

        lbl_Carta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/yugioh/img/card/carta_fundo.jpg"))); // NOI18N
        getContentPane().add(lbl_Carta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_id.setToolTipText("");
        lbl_id.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 30, 10));

        lbl_type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(lbl_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 140, 30));

        lbl_efeito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbl_efeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 260, 40));

        lbl_nome.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        lbl_nome.setToolTipText("");
        getContentPane().add(lbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 210, 40));
        getContentPane().add(lbl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DEF/");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ATK/");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, 20));

        lbl_def.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_def, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 40, 20));

        lbl_atk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lbl_atk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 40, 20));
        getContentPane().add(lbl_atributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 37, 37));
        getContentPane().add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 250, 250));

        btn_excluir.setText("Excluir Carta Selecionada");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, -1));

        btn_editar.setText("Editar Carta Selecionada");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/yugioh/img/wallpaper_35.png"))); // NOI18N
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 420, 477));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // Evento ao selecionar uma carta da tabela        
        // Mostrar a Carta Selecionada mostrarCarta();
    }//GEN-LAST:event_jList1MouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // Excluir carta selecionada
        excluir();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // Editar a carta selecionada
        editar();
    }//GEN-LAST:event_btn_editarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Carta;
    private javax.swing.JLabel lbl_atk;
    private javax.swing.JLabel lbl_atributo;
    private javax.swing.JLabel lbl_def;
    private javax.swing.JLabel lbl_efeito;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_type;
    // End of variables declaration//GEN-END:variables

    private void listarCartas() {
        DefaultListModel model = new DefaultListModel();
        int i = 0;

        for (Carta carta : dck) {
            model.addElement(dck.get(i).toString());
            i++;
        }

        jList1.setModel(model);
    }

    private void preencherDados() {

    }

    /*
    private void refleshTabela() {
        this.dtm.getDataVector().removeAllElements();
        pro = (arquivoPro.ler());
        if (pro.size() > 0) {
            for (Produtos produtos : pro) {

                dtm.insertRow(dtm.getRowCount(), new Object[]{
                    produtos.getTipo(),
                    produtos.getMarca(),
                    produtos.getTamanho(),
                    produtos.getCor(),
                    produtos.getDescricao()
                });
            }
        }
        else{
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                    "",
                    "",
                    "",
                    "",
                    ""
                });
            
        }
    }
     */
    private void mostrarCarta() {
        String nomeMonstro = jList1.getSelectedValue();

        for (Carta carta : dck) {
            if (carta.getNome().equals(nomeMonstro)) {

            }
        }
    }

    private void excluir() {
        String nomeMonstro = jList1.getSelectedValue();

        if (nomeMonstro != null) {
            for (Carta carta : dck) {
                if (carta.getNome().equals(nomeMonstro)) {
                    indiceSelecionado = dck.indexOf(carta);
                    // Confirmação
                    String msg = "Deseja remover a carta " + carta.getNome() + "?";

                    int op = JOptionPane.showConfirmDialog(rootPane, msg, "Excluir", JOptionPane.WARNING_MESSAGE);

                    if (op == 0) {
                        // OK: excluir o monstro
                        JOptionPane.showMessageDialog(rootPane, "Carta Removida com Sucesso!");
                        this.dck.remove(indiceSelecionado);
                        d.salvarDeck(dck);
                        this.listarCartas();
                        indiceSelecionado = 0;
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma Carta !!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void editar() {
        String nomeMonstro = jList1.getSelectedValue();

        if (nomeMonstro != null) {
            for (Carta carta : dck) {
                if (carta.getNome().equals(nomeMonstro)) {
                    indiceSelecionado = dck.indexOf(carta);
                    
                    // Confirmação
                    String msg = "Deseja editar a carta " + carta.getNome() + "?";
                    int op = JOptionPane.showConfirmDialog(rootPane, msg, "Editar", JOptionPane.WARNING_MESSAGE);

                    if (op == 0) {
                        // OK: editar
                        int opcao = JOptionPane.showConfirmDialog(rootPane, "Você deseja mudar o tipo da carta para Monstro?",
                                "Edição", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcao == 0) {
                            // Monstro
                            EditarMonstro em = new EditarMonstro();
                            em.setVisible(true);
                            this.setVisible(false);
                        } else {
                            // Magica
                            EditarMagica em = new EditarMagica();
                            em.setVisible(true);
                            this.setVisible(false);
                        }
                        this.dispose();
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma Carta !!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
