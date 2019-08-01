/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.EntradaControle;
import controle.SaidaControle;
import dominio.Excecao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author darlan
 */
public class CaixaVisao extends javax.swing.JFrame {

    /**
     * Creates new form CaixaVisao
     */
    private boolean nEntrada,nSaida;
    private EntradaControle entrada;
    private SaidaControle saida;
    private Date data;
    public CaixaVisao() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        desabilitar();
        entrada = new EntradaControle();
        saida = new SaidaControle();
        this.nEntrada = false;
        this.nSaida = false;
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBotoes = new javax.swing.ButtonGroup();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        bgdesconto = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDataAtual = new javax.swing.JLabel();
        lblHoraAtual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfdata = new javax.swing.JFormattedTextField();
        tfdescricao = new javax.swing.JTextField();
        jrSIm = new javax.swing.JRadioButton();
        jrNAo = new javax.swing.JRadioButton();
        tfvalor = new javax.swing.JFormattedTextField();
        cbtipoPgto = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jrdesc_sim = new javax.swing.JRadioButton();
        jrdesc_nao = new javax.swing.JRadioButton();
        tfdesconto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btdesconto = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        tfvalorPago = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbltroco = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        btsaida = new javax.swing.JButton();
        btEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentação do Caixa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Data: ");

        jLabel2.setText("Hora:");

        lblDataAtual.setText("Data Atual");

        lblHoraAtual.setText("Hora Atual");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Caixa"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Descrição:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 15));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Data:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Valor:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Pagamento:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Pago?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        try {
            tfdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdata.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(tfdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 170, -1));

        tfdescricao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(tfdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 440, -1));

        bgBotoes.add(jrSIm);
        jrSIm.setSelected(true);
        jrSIm.setText("SIm");
        jrSIm.setEnabled(false);
        jPanel2.add(jrSIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        bgBotoes.add(jrNAo);
        jrNAo.setText("Não");
        jrNAo.setEnabled(false);
        jPanel2.add(jrNAo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        tfvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        tfvalor.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(tfvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 103, -1));

        cbtipoPgto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cbtipoPgto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão" }));
        jPanel2.add(cbtipoPgto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 174, -1));

        btSalvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icones/save-icon.png"))); // NOI18N
        btSalvar.setText("Finalizar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 171, 45));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Incluir Desconto?"));

        bgdesconto.add(jrdesc_sim);
        jrdesc_sim.setText("Sim");
        jrdesc_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdesc_simActionPerformed(evt);
            }
        });

        bgdesconto.add(jrdesc_nao);
        jrdesc_nao.setSelected(true);
        jrdesc_nao.setText("Não");
        jrdesc_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdesc_naoActionPerformed(evt);
            }
        });

        tfdesconto.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Valor Desconto:");

        btdesconto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btdesconto.setText("Calcular Desconto");
        btdesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdescontoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(tfdesconto)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel17)
                            .addGap(25, 25, 25)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jrdesc_sim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrdesc_nao))
                        .addComponent(jLabel16)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdesc_sim)
                    .addComponent(jrdesc_nao))
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btdesconto))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 370, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular Troco"));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Calcular troco");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfvalorPago.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Valor pago:");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setText("Troco:");

        lbltroco.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbltroco.setText("0");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setText("R$");

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setText("R$");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltroco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfvalorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(102, 102, 102))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfvalorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lbltroco)
                    .addComponent(jLabel12)
                    .addComponent(jLabel21))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 370, 160));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setText("R$");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimentação do Caixa"));

        btsaida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btsaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icones/saida_G.png"))); // NOI18N
        btsaida.setText("Saída");
        btsaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaidaActionPerformed(evt);
            }
        });

        btEntrada.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icones/entrada_G.png"))); // NOI18N
        btEntrada.setText("Entrada");
        btEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btsaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(lblDataAtual))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(lblHoraAtual)))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblDataAtual))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblHoraAtual))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntradaActionPerformed
        this.nEntrada = true;
        habilitar();
        limparCampos();
        this.data = new Date();
        this.data.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        tfdata.setText(sdf.format(this.data));
        
        
    }//GEN-LAST:event_btEntradaActionPerformed

    private void btsaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaidaActionPerformed
       this.nSaida = true;
       habilitarSaida();
       limparCampos();
       this.data = new Date();
        this.data.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        tfdata.setText(sdf.format(this.data));
    }//GEN-LAST:event_btsaidaActionPerformed

    private void btdescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdescontoActionPerformed

        int desconto = Integer.valueOf(tfdesconto.getText());
        Double valor = Double.parseDouble(tfvalor.getText().replace(",", "."));
        Double valor_final =Math.abs(valor - (valor * desconto)/100);
        tfvalor.setText(String.valueOf(valor_final));
    }//GEN-LAST:event_btdescontoActionPerformed

    private void jrdesc_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdesc_naoActionPerformed
        tfdesconto.setEnabled(false);
    }//GEN-LAST:event_jrdesc_naoActionPerformed

    private void jrdesc_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdesc_simActionPerformed
        tfdesconto.setEnabled(true);
    }//GEN-LAST:event_jrdesc_simActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String valorpago = tfvalorPago.getText().replace(",",".");
        String valor = tfvalor.getText().replace(",", ".");
        Double troco = Double.parseDouble(valorpago)- Double.parseDouble(valor) ;
        lbltroco.setText(String.valueOf(troco));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(this.nEntrada){

            try{
                String descricao,data,valor,tipoPgto;
                int pgto;
                descricao = tfdescricao.getText();
                valor = tfvalor.getText();
                data = tfdata.getText();
                if(cbtipoPgto.getSelectedIndex()== 1){
                    tipoPgto = "Dinheiro";
                }else{
                    tipoPgto = "Cartão";
                }
                if(jrSIm.isSelected()){
                    pgto = 1;
                }else{
                    pgto = 2;
                }
                entrada.salvarEntrada(descricao, data, valor, pgto, tipoPgto);
                desabilitar();
                limparCampos();
                this.nEntrada = false;

            }catch(Excecao ex){
                this.nEntrada = true;
                JOptionPane.showMessageDialog(null,ex.getMessage());
            } catch (Exception ex) {
                this.nEntrada = true;
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }else if(this.nSaida){
            String descricao,data,valor;
            descricao = tfdescricao.getText();
            data = tfdata.getText();
            valor = tfvalor.getText();
            desabilitar();
            try {
                this.saida.salvarSaida(data, descricao, valor);
                limparCampos();

                this.nSaida = false;

            } catch (Excecao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                this.nSaida = true;
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                this.nSaida = true;
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    public void habilitar(){
        tfdata.setEnabled(true);
        tfdescricao.setEnabled(true);
        tfvalorPago.setEnabled(true);
        //jrSIm.setEnabled(true);
        //jrNAo.setEnabled(true);
        cbtipoPgto.setEnabled(true);
        tfvalor.setEnabled(true);
        if(jrdesc_nao.isSelected()){
            tfdesconto.setEnabled(false);
        }else{
            tfdesconto.setEnabled(true);
        }
    }
    public void desabilitar(){
        tfdata.setEnabled(false);
        tfdescricao.setEnabled(false);
        tfvalorPago.setEnabled(false);
        jrSIm.setEnabled(false);
        jrNAo.setEnabled(false);
        cbtipoPgto.setEnabled(false);
        tfvalor.setEnabled(false);
        if(jrdesc_sim.isSelected()){
            jrdesc_sim.setSelected(false);
            jrdesc_nao.setSelected(true);
            tfdesconto.setEnabled(false);
        }else{
            tfdesconto.setEnabled(false);
        }
    }
    public void limparCampos(){
        tfdata.setText("");
        tfdescricao.setText("");
        tfvalorPago.setText("");
        tfvalor.setText("");
        tfdesconto.setText("");
    }
    public void habilitarSaida(){
        tfdata.setEnabled(true);
        tfdescricao.setEnabled(true);
        tfvalor.setEnabled(true);
        tfvalorPago.setEnabled(false);
        cbtipoPgto.setEnabled(false);
        jrSIm.setEnabled(false);
        jrNAo.setEnabled(false);
    }
    
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
            java.util.logging.Logger.getLogger(CaixaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBotoes;
    private javax.swing.ButtonGroup bgdesconto;
    private javax.swing.JButton btEntrada;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btdesconto;
    private javax.swing.JButton btsaida;
    private javax.swing.JComboBox cbtipoPgto;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jrNAo;
    private javax.swing.JRadioButton jrSIm;
    private javax.swing.JRadioButton jrdesc_nao;
    private javax.swing.JRadioButton jrdesc_sim;
    private javax.swing.JLabel lblDataAtual;
    private javax.swing.JLabel lblHoraAtual;
    private javax.swing.JLabel lbltroco;
    private javax.swing.JFormattedTextField tfdata;
    private javax.swing.JTextField tfdesconto;
    private javax.swing.JTextField tfdescricao;
    private javax.swing.JFormattedTextField tfvalor;
    private javax.swing.JTextField tfvalorPago;
    // End of variables declaration//GEN-END:variables
}
