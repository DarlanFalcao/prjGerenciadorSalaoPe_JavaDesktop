/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.EntradaControle;
import controle.SaidaControle;
import dominio.Entrada;
import dominio.Saida;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darlan
 */
public class Caixa_altera extends javax.swing.JFrame {

    /**
     * Creates new form Caixa
     */
    private EntradaControle entCtrl;
    private List<Entrada> e;
    private SaidaControle saiCtrl;
    private List<Saida>s;
    private String desc_entrada;
    
    
    public Caixa_altera() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.e = new ArrayList<Entrada>();
        this.entCtrl = new EntradaControle();
        this.s = new ArrayList<Saida>();
        this.saiCtrl = new SaidaControle();
    }
    
    
    public void carregarTabelaEntrada(){
          
        DefaultTableModel modelo = (DefaultTableModel) tblCaixa.getModel();
         if(modelo.getRowCount()>0){
            modelo.setRowCount(0);
        }
            double total = 0;
          SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
          String datainicio = sp.format(dcData.getDate());
            
                  e = entCtrl.listarEntradasData(datainicio);
          
        for(Entrada e1: e){
            Object[] o = new Object[4];
            o[0] = e1.getData();
            o[1] = e1.getDescricao();
            o[2] = e1.getValor();
            o[3] = e1.getTipo_pgto();
           
            modelo.addRow(o);
           
        }  
    }
    
    public void carregarTabelaSaida(){
          
        DefaultTableModel modelo = (DefaultTableModel) tblCaixa.getModel();
         if(modelo.getRowCount()>0){
            modelo.setRowCount(0);
        }
            double total = 0;
          SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
          String datainicio = sp.format(dcData.getDate());
            
                  s = saiCtrl.listarSaidasData(datainicio);
          
        for(Saida e1: s){
            Object[] o = new Object[4];
            o[0] = e1.getData();
            o[1] = e1.getDescricao();
            o[2] = e1.getValor();
            o[3] = "Dinheiro";
           
            modelo.addRow(o);
           
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaixa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cbSelecao = new javax.swing.JComboBox();
        dcData = new com.toedter.calendar.JDateChooser();
        tfdata = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrDinheiro = new javax.swing.JRadioButton();
        jrCartao = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Descrição", "Valor", "Tipo de Pagamento"
            }
        ));
        tblCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCaixaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCaixa);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Caixa"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbSelecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Entrada", "Saída" }));
        cbSelecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSelecaoItemStateChanged(evt);
            }
        });
        cbSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecaoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSelecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 145, -1));
        jPanel1.add(dcData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 146, -1));

        try {
            tfdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(tfdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 84, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Data:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        jPanel1.add(tfDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Descrição:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));
        jPanel1.add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 500, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Valor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de Pagamento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        bgTipo.add(jrDinheiro);
        jrDinheiro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jrDinheiro.setText("Dinheiro");
        jPanel1.add(jrDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        bgTipo.add(jrCartao);
        jrCartao.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jrCartao.setText("Cartão");
        jPanel1.add(jrCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Pago:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton1.setText("Sim");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton2.setText("Não");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icones/save-icon.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icones/alterar.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icones/deletar.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Selecione a data:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        String descricao,data,valor,tipo;
        
        descricao = tfDescricao.getText();
        data = tfdata.getText();
        valor = tfValor.getText();
        if(jrCartao.isSelected()){
            tipo = "Cartão";
        }else{
            tipo = "Dinheiro";
        }
        try {
            if(cbSelecao.getSelectedIndex()==0){
                Entrada entrada = new Entrada();
                entrada = entCtrl.buscaIdEntrada(this.desc_entrada);
            entCtrl.AlterarEntrada(entrada.getId(),descricao, data, valor, 1, tipo);
            }else{
                Saida s = new Saida();
                s = saiCtrl.buscaIdSaida(this.desc_entrada);
                saiCtrl.alterarSaida(s.getId(),data, descricao, valor);
            }
// TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(Caixa_altera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Caixa_altera.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitarcampos();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void cbSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecaoActionPerformed
            desabilitarcampos();
            SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
            String datainicio = null;
            
            try{
            datainicio = sp.format(dcData.getDate());
            if(cbSelecao.getSelectedIndex() == 0){
            carregarTabelaEntrada();
            
        }else{
           carregarTabelaSaida();
        }
            }catch(Exception e){
               JOptionPane.showMessageDialog(null,"Selecione uma Data!");
            }
     
    }//GEN-LAST:event_cbSelecaoActionPerformed

    public void habilitarcampos(){
        tfdata.setEnabled(true);
        tfDescricao.setEnabled(true);
        tfValor.setEnabled(true);
        jrCartao.setEnabled(true);
        jrDinheiro.setEnabled(true);
        
        
    }
    public void desabilitarcampos(){
        tfdata.setEnabled(false);
        tfDescricao.setEnabled(false);
        tfValor.setEnabled(false);
        jrCartao.setEnabled(false);
        jrDinheiro.setEnabled(false);
        
    }
    
    private void cbSelecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSelecaoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSelecaoItemStateChanged

    private void tblCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCaixaMouseClicked
       
        int pos = tblCaixa.getSelectedRow();
        if(cbSelecao.getSelectedIndex()==0){
        tfDescricao.setText(this.e.get(pos).getDescricao());
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        String datainicio;
        datainicio = sp.format(this.e.get(pos).getData());
        tfdata.setText(datainicio);
        tfValor.setText(this.e.get(pos).getValor().toString());
        }else{
            tfDescricao.setText(this.s.get(pos).getDescricao());
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        String datainicio;
        datainicio = sp.format(this.s.get(pos).getData());
        tfdata.setText(datainicio);
        tfValor.setText(this.s.get(pos).getValor().toString());
        }
        
    }//GEN-LAST:event_tblCaixaMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
    
        habilitarcampos();
        this.desc_entrada = tfDescricao.getText();


    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        
        
        if(cbSelecao.getSelectedIndex()==0){
           int pos = tblCaixa.getSelectedRow();
            Entrada e1 = this.e.get(pos);
         
            entCtrl.deletarEntrada(e1);
        }else{
            int pos = tblCaixa.getSelectedRow();
            Saida e1 = this.s.get(pos);
            saiCtrl.deletarSaida(e1);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Caixa_altera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa_altera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa_altera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa_altera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa_altera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbSelecao;
    private com.toedter.calendar.JDateChooser dcData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrCartao;
    private javax.swing.JRadioButton jrDinheiro;
    private javax.swing.JTable tblCaixa;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfValor;
    private javax.swing.JFormattedTextField tfdata;
    // End of variables declaration//GEN-END:variables
}
