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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darlan
 */
public class ConsultarCaixa extends javax.swing.JFrame {
    private EntradaControle entrada;
    private SaidaControle saida;
    private Double totalEntrada;
    private Double totalDinheiro;
    private Double totalcartao;
    private Double totalSaida;
    private Double total;
    /**
     * Creates new form ConsultarCaixa
     */
    public ConsultarCaixa() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.entrada = new EntradaControle();
        this.saida = new SaidaControle();
        lblTotal.setText("");
        lblTotalEntrada.setText("");
        lblTotalSaida.setText("");
    }
    public void carregaTabela(){
     DefaultTableModel modelo = (DefaultTableModel) tblCaixa.getModel();
         if(modelo.getRowCount()>0){
            modelo.setRowCount(0);
        }
         this.totalEntrada = 0.0;
          this.totalDinheiro = 0.0;
           this.totalcartao = 0.0;
           lbCartao.setText("");
           lbDinheiro.setText("");
          SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
          String data = sp.format(jcCalendario.getDate());
      
         List<Entrada>lista = this.entrada.listarEntradasData(data);
        for(Entrada e: lista){
            Object[] o = new Object[4];
            o[0] = e.getData();
            o[1] = e.getDescricao();
            o[2] = e.getValor();
            o[3] = e.getTipo_pgto();
            modelo.addRow(o);
            this.totalEntrada = this.totalEntrada +=e.getValor();    
        }
        lblTotalEntrada.setText(String.valueOf(this.totalEntrada)+" R$");
        lista = this.entrada.listarEntradasDataDinheiro(data);
        for(Entrada e: lista){
            this.totalDinheiro = this.totalDinheiro +=e.getValor();
            lbDinheiro.setText(String.valueOf(this.totalDinheiro)+" R$");
        }
        
        lista = this.entrada.listarEntradasDataCartao(data);
        for(Entrada e: lista){
            this.totalcartao = this.totalcartao +=e.getValor();
            lbCartao.setText(String.valueOf(this.totalcartao)+" R$");
        }
        
        
}
public void carregaTabelaSaida(){
    
     DefaultTableModel modelo = (DefaultTableModel) tblSaida.getModel();
         if(modelo.getRowCount()>0){
            modelo.setRowCount(0);
        }
         lblTotalSaida.setText("0.0");
         SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
          String data = sp.format(jcCalendario.getDate());
      
         this.totalSaida = 0.0;
        List<Saida>lista = this.saida.listarSaidasData(data);
        for(Saida e: lista){
            Object[] o = new Object[3];
            o[0] = e.getData();
            o[1] = e.getDescricao();
            o[2] = e.getValor();
            modelo.addRow(o);
            this.totalSaida = this.totalSaida+=e.getValor();
            lblTotalSaida.setText(String.valueOf(this.totalSaida)+" R$");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaixa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSaida = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcCalendario = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalEntrada = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalSaida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbDinheiro = new javax.swing.JLabel();
        lbCartao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Descricao", "Valor", "Tipo PGTO"
            }
        ));
        jScrollPane1.setViewportView(tblCaixa);
        if (tblCaixa.getColumnModel().getColumnCount() > 0) {
            tblCaixa.getColumnModel().getColumn(0).setMinWidth(90);
            tblCaixa.getColumnModel().getColumn(0).setPreferredWidth(90);
            tblCaixa.getColumnModel().getColumn(0).setMaxWidth(90);
            tblCaixa.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblCaixa.getColumnModel().getColumn(2).setMinWidth(70);
            tblCaixa.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblCaixa.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        tblSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Descrição", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tblSaida);
        if (tblSaida.getColumnModel().getColumnCount() > 0) {
            tblSaida.getColumnModel().getColumn(0).setMinWidth(90);
            tblSaida.getColumnModel().getColumn(0).setPreferredWidth(90);
            tblSaida.getColumnModel().getColumn(0).setMaxWidth(90);
            tblSaida.getColumnModel().getColumn(2).setMinWidth(70);
            tblSaida.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblSaida.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jLabel3.setText("Entrada");

        jLabel5.setText("Saida");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jLabel8.setText("Escolha a data:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Caixa"));

        jLabel1.setText("Total Entrada: ");

        lblTotalEntrada.setText("Entrada");

        jLabel2.setText("Total Saída:");

        lblTotalSaida.setText("Saida");

        jLabel4.setText("Total:");

        lblTotal.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalSaida)
                    .addComponent(lblTotalEntrada))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotalEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotalSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTotal))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhe Caixa"));

        lbDinheiro.setText("0,00 R$");

        lbCartao.setText("0,00 R$");

        jLabel6.setText("Dinheiro:");

        jLabel7.setText("Cartão:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDinheiro)
                    .addComponent(lbCartao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDinheiro)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCartao)
                    .addComponent(jLabel7))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel5))
                    .addComponent(btConsultar))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConsultar)
                    .addComponent(jcCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 197, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        carregaTabela();
        carregaTabelaSaida();
        this.total = this.totalEntrada - this.totalSaida;
        lblTotal.setText(String.valueOf(this.total)+" R$");
// TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jcCalendario;
    private javax.swing.JLabel lbCartao;
    private javax.swing.JLabel lbDinheiro;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalEntrada;
    private javax.swing.JLabel lblTotalSaida;
    private javax.swing.JTable tblCaixa;
    private javax.swing.JTable tblSaida;
    // End of variables declaration//GEN-END:variables
}