package br.inatel.yugioh.view;

import br.inatel.yugioh.control.Deck;
import br.inatel.yugioh.model.Carta;
import br.inatel.yugioh.model.CartaMonstro;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CadastroMonstro extends javax.swing.JFrame {

    private Deck d = new Deck();
    private ArrayList<Carta> baralho;

    public CadastroMonstro() {
        initComponents();
        baralho = d.lerDeck();
        this.setLocationRelativeTo(null);           // Centralizar a Tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        efeito = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        lbl_Carta = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        atributo = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();
        atk = new javax.swing.JLabel();
        txt_atk = new javax.swing.JTextField();
        def = new javax.swing.JLabel();
        txt_def = new javax.swing.JTextField();
        lbl_tipoMonstro = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        desc = new javax.swing.JLabel();
        scr_efeito = new javax.swing.JScrollPane();
        txt_desc = new javax.swing.JTextArea();
        btn_img = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        combo_nivel = new javax.swing.JComboBox<>();
        combo_atributo = new javax.swing.JComboBox<>();
        btn_ok = new javax.swing.JButton();
        combo_tipo = new javax.swing.JComboBox<>();
        btn_cancelar = new javax.swing.JButton();
        lbl_Fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setMinimumSize(new java.awt.Dimension(780, 552));
        setResizable(false);
        setSize(new java.awt.Dimension(780, 552));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_id.setToolTipText("");
        lbl_id.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 30, 10));

        lbl_type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lbl_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 30));

        lbl_efeito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbl_efeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 260, 40));

        lbl_nome.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        lbl_nome.setToolTipText("");
        jPanel1.add(lbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 210, 40));
        jPanel1.add(lbl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DEF/");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ATK/");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, 20));

        lbl_def.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lbl_def, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 40, 20));

        lbl_atk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lbl_atk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 40, 20));
        jPanel1.add(lbl_atributo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 37, 37));

        lbl_Carta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/yugioh/img/card/monsterPNG.png"))); // NOI18N
        jPanel1.add(lbl_Carta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        nome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nome.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        atributo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        atributo.setText("Atributo");

        nivel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nivel.setText("Nível");

        atk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        atk.setText("ATK");

        txt_atk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_atk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_atkActionPerformed(evt);
            }
        });

        def.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        def.setText("DEF");

        txt_def.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_def.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_defActionPerformed(evt);
            }
        });

        lbl_tipoMonstro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tipoMonstro.setText("Tipo da Carta");

        lbl_tipo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tipo.setText("Tipo");

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
            }
        });

        desc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        desc.setText("Efeito ou Descrição");

        txt_desc.setColumns(20);
        txt_desc.setRows(5);
        scr_efeito.setViewportView(txt_desc);

        btn_img.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_img.setText("Selecionar Imagem");
        btn_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imgActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        id.setText("ID");

        txt_ID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        combo_nivel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        combo_nivel.setSelectedIndex(-1);
        combo_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_nivelActionPerformed(evt);
            }
        });

        combo_atributo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_atributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trevas", "Terra", "Fogo", "Luz", "Água", "Vento", "Divino" }));
        combo_atributo.setSelectedIndex(-1);
        combo_atributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_atributoActionPerformed(evt);
            }
        });

        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        combo_tipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Efeito", "Ritual", "Fusão" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_img)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ok))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(atk)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_atk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(def)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_def))
                                .addComponent(desc)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(scr_efeito))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(atributo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(combo_atributo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_tipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nivel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_ID))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_tipoMonstro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atributo)
                    .addComponent(nivel)
                    .addComponent(combo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_atributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoMonstro)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_efeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_def, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(def))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(atk)
                        .addComponent(txt_atk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_img)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ok)
                        .addComponent(btn_cancelar)))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 390, 480));

        lbl_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/yugioh/img/wallpaper_35.png"))); // NOI18N
        jPanel1.add(lbl_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        botaoOK();          // botão OK
    }//GEN-LAST:event_btn_okActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed

    }//GEN-LAST:event_txt_IDActionPerformed

    private void btn_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imgActionPerformed
        escolherImagem();       // Selecionar Imagem da Carta
    }//GEN-LAST:event_btn_imgActionPerformed

    private void txt_defActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_defActionPerformed

    }//GEN-LAST:event_txt_defActionPerformed

    private void combo_atributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_atributoActionPerformed
        setarIconeAtributo();   // Atributo selecionado
    }//GEN-LAST:event_combo_atributoActionPerformed

    private void combo_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nivelActionPerformed
        setarNivel();           // Nivel selecionado
    }//GEN-LAST:event_combo_nivelActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed

    }//GEN-LAST:event_txt_nomeActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        setarTipoCarta();       // Tipo da carta
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void txt_atkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_atkActionPerformed

    }//GEN-LAST:event_txt_atkActionPerformed

    private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed

    }//GEN-LAST:event_txt_tipoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMonstro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atk;
    private javax.swing.JLabel atributo;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_img;
    private javax.swing.JButton btn_ok;
    private javax.swing.JComboBox<String> combo_atributo;
    private javax.swing.JComboBox<String> combo_nivel;
    private javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel def;
    private javax.swing.JLabel desc;
    private javax.swing.ButtonGroup efeito;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Carta;
    private javax.swing.JLabel lbl_Fundo;
    private javax.swing.JLabel lbl_atk;
    private javax.swing.JLabel lbl_atributo;
    private javax.swing.JLabel lbl_def;
    private javax.swing.JLabel lbl_efeito;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_tipoMonstro;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel nivel;
    private javax.swing.JLabel nome;
    private javax.swing.JScrollPane scr_efeito;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_atk;
    private javax.swing.JTextField txt_def;
    private javax.swing.JTextArea txt_desc;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables

    private void botaoOK() {
        // Variáveis auxiliares
        int atk = 0;
        int def = 0;

        if (!txt_atk.getText().equals("")
                && !txt_def.getText().equals("")
                && !txt_ID.getText().equals("")
                && !txt_nome.getText().equals("")
                && !txt_desc.getText().equals("")
                && !txt_tipo.getText().equals("")
                && combo_atributo.getSelectedItem() != null
                && combo_nivel.getSelectedItem() != null
                && combo_tipo.getSelectedItem() != null) {

            // Verifica se alguns dados são numéricos
            // Ataque
            try {
                atk = Integer.parseInt(txt_atk.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Insira um valor numérico para o ATK!!");
                txt_atk.setText("");
            }
            // Defesa
            try {
                def = Integer.parseInt(txt_def.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Insira um valor numérico para a DEF!!");
                txt_def.setText("");
            }

            // Chama a proxima tela e salva as informações
            CartaMonstro m = new CartaMonstro();
            m.setAtk(atk);
            m.setAtributo(combo_atributo.getSelectedItem() + "");
            m.setDef(def);
            m.setID(txt_ID.getText());
            m.setNivel(combo_nivel.getSelectedIndex() + 1);
            m.setNome(txt_nome.getText());
            m.setTipo(combo_tipo.getSelectedItem() + "");
            m.seteMonstro(true);
            m.setImg(lbl_img.getIcon());

            // Efeito do monstro
            if (m.getTipo().equals("Normal")) {
                m.setDescricao(txt_desc.getText());
            } else {
                m.setEfeito(txt_desc.getText());
            }

            baralho.add(m);

            d.salvarDeck(baralho);

            JOptionPane.showMessageDialog(jPanel2, "Monstro Cadastrado com Sucesso!");

            // Sai da tela e volta pro menu
            Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
        }
    }

    public void limparDados() {
        txt_ID.setText("");
        txt_atk.setText("");
        txt_def.setText("");
        txt_desc.setText("");
        txt_nome.setText("");
        txt_tipo.setText("");
        combo_atributo.setSelectedItem(null);
        lbl_atributo.setIcon(null);
        combo_nivel.setSelectedIndex(0);
        lbl_nivel.setIcon(null);
        combo_tipo.setSelectedItem("Normal");
        lbl_img.setIcon(null);
    }

    private void escolherImagem() {
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // Diretorio padrão
        File dir = new File("src\\br\\inatel\\yugioh\\content");
        file.setCurrentDirectory(dir);

        int i = file.showSaveDialog(null);

        if (i == 1) {
            lbl_img.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            ImageIcon img = new ImageIcon(arquivo.getAbsolutePath());
            lbl_img.setIcon(img);
            preencherDados();
        }
    }

    private void setarIconeAtributo() {

        // Referenciando as imagens
        ImageIcon trevas = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_dark.png");
        ImageIcon terra = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_earth.png");
        ImageIcon fogo = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_fire.png");
        ImageIcon luz = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_light.png");
        ImageIcon agua = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_water.png");
        ImageIcon vento = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_wind.png");
        ImageIcon god = new ImageIcon("src\\br\\inatel\\yugioh\\img\\atr\\atr_divine.png");

        // Se o atributo for selecionado, muda o label
        if (combo_atributo.getSelectedItem().equals("Trevas")) {
            lbl_atributo.setIcon(trevas);
        }

        if (combo_atributo.getSelectedItem().equals("Divino")) {
            lbl_atributo.setIcon(god);
        }

        if (combo_atributo.getSelectedItem().equals("Terra")) {
            lbl_atributo.setIcon(terra);
        }

        if (combo_atributo.getSelectedItem().equals("Fogo")) {
            lbl_atributo.setIcon(fogo);
        }

        if (combo_atributo.getSelectedItem().equals("Luz")) {
            lbl_atributo.setIcon(luz);
        }

        if (combo_atributo.getSelectedItem().equals("Água")) {
            lbl_atributo.setIcon(agua);
        }

        if (combo_atributo.getSelectedItem().equals("Vento")) {
            lbl_atributo.setIcon(vento);
        }
    }

    private void setarNivel() {
        ImageIcon nv1 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel1.png");
        ImageIcon nv2 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel2.png");
        ImageIcon nv3 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel3.png");
        ImageIcon nv4 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel4.png");
        ImageIcon nv5 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel5.png");
        ImageIcon nv6 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel6.png");
        ImageIcon nv7 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel7.png");
        ImageIcon nv8 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel8.png");
        ImageIcon nv9 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel9.png");
        ImageIcon nv10 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel10.png");
        ImageIcon nv11 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel11.png");
        ImageIcon nv12 = new ImageIcon("src\\br\\inatel\\yugioh\\img\\nv\\nivel12.png");

        if (combo_nivel.getSelectedItem().equals("1")) {
            lbl_nivel.setIcon(nv1);
        }

        if (combo_nivel.getSelectedItem().equals("2")) {
            lbl_nivel.setIcon(nv2);
        }

        if (combo_nivel.getSelectedItem().equals("3")) {
            lbl_nivel.setIcon(nv3);
        }

        if (combo_nivel.getSelectedItem().equals("4")) {
            lbl_nivel.setIcon(nv4);
        }

        if (combo_nivel.getSelectedItem().equals("5")) {
            lbl_nivel.setIcon(nv5);
        }

        if (combo_nivel.getSelectedItem().equals("6")) {
            lbl_nivel.setIcon(nv6);
        }

        if (combo_nivel.getSelectedItem().equals("7")) {
            lbl_nivel.setIcon(nv7);
        }

        if (combo_nivel.getSelectedItem().equals("8")) {
            lbl_nivel.setIcon(nv8);
        }

        if (combo_nivel.getSelectedItem().equals("9")) {
            lbl_nivel.setIcon(nv9);
        }

        if (combo_nivel.getSelectedItem().equals("10")) {
            lbl_nivel.setIcon(nv10);
        }

        if (combo_nivel.getSelectedItem().equals("11")) {
            lbl_nivel.setIcon(nv11);
        }

        if (combo_nivel.getSelectedItem().equals("12")) {
            lbl_nivel.setIcon(nv12);
        }
    }

    private void setarTipoCarta() {
        // Referenciando as imagens
        ImageIcon monster = new ImageIcon("src\\br\\inatel\\yugioh\\img\\card\\monsterPNG.png");
        ImageIcon effect = new ImageIcon("src\\br\\inatel\\yugioh\\img\\card\\effectPNG.png");
        ImageIcon fusion = new ImageIcon("src\\br\\inatel\\yugioh\\img\\card\\fusionPNG.png");
        ImageIcon ritual = new ImageIcon("src\\br\\inatel\\yugioh\\img\\card\\ritualPNG.png");

        // Mudando a imagem da carta de acordo com a opção do usuário
        if (combo_tipo.getSelectedItem().equals("Normal")) {
            lbl_Carta.setIcon(monster);
        }
        if (combo_tipo.getSelectedItem().equals("Efeito")) {
            lbl_Carta.setIcon(effect);
        }
        if (combo_tipo.getSelectedItem().equals("Ritual")) {
            lbl_Carta.setIcon(ritual);
        }
        if (combo_tipo.getSelectedItem().equals("Fusão")) {
            lbl_Carta.setIcon(fusion);
        }
    }

    private void preencherDados() {
        // Setando o tipo da carta (Desenho)
        lbl_type.setText("[" + txt_tipo.getText() + " / " + combo_tipo.getSelectedItem() + "]");
        // Ataque da Carta
        lbl_atk.setText(txt_atk.getText());   // Ataque da Carta (Desenho)
        // Defesa da Carta
        lbl_def.setText(txt_def.getText());   // Defesa da Carta (Desenho)
        // Nome da Carta
        lbl_nome.setText(txt_nome.getText());
        // Efeito ou descrição
        lbl_efeito.setText(txt_desc.getText());
        // Id da carta
        lbl_id.setText(txt_ID.getText());
    }
}
