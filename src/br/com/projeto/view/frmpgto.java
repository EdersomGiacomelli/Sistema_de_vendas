package br.com.projeto.view;

import br.com.projeto.dao.ItemVendaDao;
import br.com.projeto.dao.ProdutosDao;
import br.com.projeto.dao.VendasDao;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.ItensVenda;
import br.com.projeto.model.Produto;
import br.com.projeto.model.Vendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edersom Denir Giacomelli
 */
public class frmpgto extends javax.swing.JFrame {

    Cliente client = new Cliente();
    DefaultTableModel listacompras;
    
    public frmpgto() {
        initComponents();
        cxCartao.setText("0");
        cxCheque.setText("0");
        cxDinheiro.setText("0");
        cxDesconto.setText("0");
        cxTroco.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cxDinheiro = new javax.swing.JTextField();
        cxCartao = new javax.swing.JTextField();
        cxCheque = new javax.swing.JTextField();
        cxTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cxDesconto = new javax.swing.JTextField();
        cxValorDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cxTroco = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cxObs = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela pagamento");

        jPanel1.setBackground(new java.awt.Color(199, 223, 226));

        jPanel2.setBackground(new java.awt.Color(169, 199, 208));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Cartão:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Dinheiro:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Total:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Cheque:");

        cxDinheiro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDinheiroActionPerformed(evt);
            }
        });

        cxCartao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCartaoActionPerformed(evt);
            }
        });

        cxCheque.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxChequeActionPerformed(evt);
            }
        });

        cxTotal.setEditable(false);
        cxTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Desconto %");

        cxDesconto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDescontoActionPerformed(evt);
            }
        });

        cxValorDesconto.setEditable(false);
        cxValorDesconto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxValorDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxValorDescontoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Total c/ desc:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Troco:");

        cxTroco.setEditable(false);
        cxTroco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cxTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrocoActionPerformed(evt);
            }
        });

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFinalizar.setText("Finalizar a Venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        cxObs.setColumns(20);
        cxObs.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cxObs.setRows(5);
        jScrollPane1.setViewportView(cxObs);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Obs:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cxCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cxCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cxCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cxTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // Btn finalizar venda
        
        Double dinheiro, cartao, cheque, troco, totalpgto, totalvenda,totalparcial, desconto;
        
        dinheiro = Double.parseDouble(cxDinheiro.getText());
        cartao = Double.parseDouble(cxCartao.getText());
        cheque = Double.parseDouble(cxCheque.getText());
        desconto = Double.parseDouble(cxDesconto.getText());
        totalvenda = Double.parseDouble(cxTotal.getText());
        
        //cálculo do troco
        totalparcial = totalvenda - (totalvenda * (desconto/100));
        
        totalpgto = dinheiro + cheque + cartao;
        cxValorDesconto.setText(String.valueOf(totalparcial));
        
        troco = totalpgto - totalparcial;
        
        cxTroco.setText(String.valueOf(troco));
        
        Vendas obj_vendas = new Vendas();
        
        //JOptionPane.showMessageDialog(null,"Cliente " + client.getId());

        //dados do cliente
        obj_vendas.setCliente(client);
        
        //Carrega a data do sistema
        Date atual = new Date();
        //cria máscara de data com o formato adequado
        SimpleDateFormat dataUsa = new SimpleDateFormat("yyyy-MM-dd");
        String datamysql = dataUsa.format(atual);
        
        obj_vendas.setData_venda(datamysql);
        
        //total da venda
        obj_vendas.setTotal_venda(totalparcial);
        
        //observações
        obj_vendas.setObs(cxObs.getText());
        
        VendasDao dao_vendas = new VendasDao();
        dao_vendas.cadastroDeVenda(obj_vendas);
        
        //retornar o id da venda
        obj_vendas.setId(dao_vendas.retornaVenda());
        
        //System.out.println("Id da ultima venda = " + obj_vendas.getId());
        
        //cadastrar dados da venda no bd
        for(int i = 0; i<listacompras.getRowCount(); i++){
            
            int qtd_estoque, qtd_adquirida, qtd_atualizada;
            ProdutosDao dao_produto = new ProdutosDao();
            
            Produto obj_produto = new Produto();
            
            ItensVenda item = new ItensVenda();
            
            item.setVenda(obj_vendas);
            //seleciona a linha
            obj_produto.setId(Integer.parseInt(listacompras.getValueAt(i, 0).toString()));
            item.setProduto(obj_produto);
            item.setQtd(Integer.parseInt(listacompras.getValueAt(i, 2).toString()));
            item.setSubtotal(Double.parseDouble(listacompras.getValueAt(i, 4).toString()));
            
            //Baixa do estoque
            qtd_estoque = dao_produto.retornarEstoque(obj_produto.getId());
            qtd_adquirida = Integer.parseInt(listacompras.getValueAt(i, 2).toString());
            qtd_atualizada = qtd_estoque - qtd_adquirida;
            
            dao_produto.baixarEstoque(obj_produto.getId(), qtd_atualizada);
            
            ItemVendaDao daoItem = new ItemVendaDao();
            daoItem.cadastraItem(item);
            
             
        }
        
        JOptionPane.showMessageDialog(null,"Venda registrada.");
        ///abre o pdv novamente
         this.dispose();
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void cxDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDinheiroActionPerformed

    private void cxCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCartaoActionPerformed

    private void cxChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxChequeActionPerformed

    private void cxTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTrocoActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void cxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTotalActionPerformed

    private void cxDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDescontoActionPerformed

    private void cxValorDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxValorDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxValorDescontoActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmpgto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpgto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpgto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpgto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpgto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JTextField cxCartao;
    private javax.swing.JTextField cxCheque;
    private javax.swing.JTextField cxDesconto;
    private javax.swing.JTextField cxDinheiro;
    private javax.swing.JTextArea cxObs;
    public javax.swing.JTextField cxTotal;
    private javax.swing.JTextField cxTroco;
    private javax.swing.JTextField cxValorDesconto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
