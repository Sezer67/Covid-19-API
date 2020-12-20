package myProject;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import com.google.gson.JsonArray;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CovidFrame extends javax.swing.JFrame {

    DefaultTableModel modelTable;

    DateFormat dateForm = new SimpleDateFormat("dd/MM/YYYY");
    Date date = new Date();

    Jtable_Comparison jtRowData = new Jtable_Comparison();
    public CovidFrame() {
        initComponents();

        txt_date.setText(" "+dateForm.format(date));
        
        modelTable = (DefaultTableModel) jTable1.getModel();
        this.setTitle("Covid-19 Güncel Veriler");
        this.setResizable(false);
        
        JOptionPane.showMessageDialog(null,"Karşılaştırmaya başlarken ilk 2 satırla başlayın","DİKKAT",JOptionPane.PLAIN_MESSAGE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_comparison = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_alldel = new javax.swing.JButton();
        txt_date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_compare = new javax.swing.JButton();

        btn_comparison.setText("COMPARE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTree1.setBackground(new java.awt.Color(240, 240, 240));
        jTree1.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ülke", "Toplam Vaka", "Ölüm Sayısı", "İyileşen Hasta", "Aktif Vaka", "Seç"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_start.setText("START");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        jLabel1.setText("---->");

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_del.setText("DELETE");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        btn_alldel.setText("DELETE(ALL)");
        btn_alldel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alldelActionPerformed(evt);
            }
        });

        txt_date.setEnabled(false);

        jLabel2.setText("Date :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("COVİD-19");

        btn_compare.setText("COMPARE(1-1)");
        btn_compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_del)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_alldel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_compare)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_start)
                    .addComponent(jLabel1)
                    .addComponent(btn_add)
                    .addComponent(btn_del)
                    .addComponent(btn_alldel)
                    .addComponent(btn_compare))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
       DefaultMutableTreeNode root = new DefaultMutableTreeNode("Continents");
        
       DefaultMutableTreeNode avrupa = new DefaultMutableTreeNode("European");
       avrupa.add(new DefaultMutableTreeNode("Germany"));
       avrupa.add(new DefaultMutableTreeNode("France"));
       avrupa.add(new DefaultMutableTreeNode("United-Kingdom"));
       avrupa.add(new DefaultMutableTreeNode("Spain"));
       avrupa.add(new DefaultMutableTreeNode("Italy"));
       avrupa.add(new DefaultMutableTreeNode("Russia"));
       avrupa.add(new DefaultMutableTreeNode("Turkey"));
       
       DefaultMutableTreeNode amerika = new DefaultMutableTreeNode("America");
       amerika.add(new DefaultMutableTreeNode("United-States"));
       amerika.add(new DefaultMutableTreeNode("Brazil"));
       
       DefaultMutableTreeNode asya = new DefaultMutableTreeNode("Asia");
       asya.add(new DefaultMutableTreeNode("Iran"));
       
       root.add(avrupa);
       root.add(amerika);
       root.add(asya);
       
       DefaultTreeModel model = new DefaultTreeModel(root);
       jTree1.setModel(model);
       
       ImageIcon img = new ImageIcon("C:\\Users\\kenar\\Documents\\NetBeansProjects\\mavenproject6\\src\\image\\Adsız.png");
       DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
       renderer.setLeafIcon(img);
       
       jTree1.setCellRenderer(renderer);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        String country = node.getUserObject().toString(); // kullanıcının jTreeden  hangi veriyi seçtiğini gösterir
        
            CovidClient covidClient = new CovidClient();
            try {
                JsonArray covidArray = covidClient.getCovid(country); 
                Json myJson = new Json(covidArray);

                int index = covidArray.size() - 1; // bu en son günün toplam verilerine gitmek için

                modelTable.insertRow(modelTable.getRowCount(), new Object[]{
                    myJson.getKeyValue(index, "Country"), myJson.getKeyValue(index, "Confirmed"), myJson.getKeyValue(index, "Deaths"), 
                    myJson.getKeyValue(index, "Recovered"),myJson.getKeyValue(index, "Active")
                });

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            criticalColor();//durumu  kötü olan ülkeler kırmızı normal olanlar yeşil
        

    }//GEN-LAST:event_btn_addActionPerformed
    
    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        modelTable.removeRow(jTable1.getSelectedRow()); // seçilen satırı sil (teker teker)
    
        /*  MojoExecutionException hatası *****TEKRAR KONTROL ET******    
    int rowSize = modelTable.getRowCount();
        while (rowSize > 0) {
            for (int i = 0; i < modelTable.getRowCount(); i++) {
                Boolean del = Boolean.valueOf(jTable1.getValueAt(i, 5).toString());
                if (del == true) {
                    modelTable.removeRow(i);
                    rowSize--;
                }
            }
        }*/
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_alldelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alldelActionPerformed
        while (modelTable.getRowCount() > 0) {
            for (int i = 0; i < modelTable.getRowCount(); i++) {
                modelTable.removeRow(i);
            }
        }
    }//GEN-LAST:event_btn_alldelActionPerformed

    private void btn_compareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compareActionPerformed
       
        // sadece iki tane karşılaştırılacağı için aynı aynda 2 den fazla ülkeyi seçemez 
        int selectedTotal = 0; //seçilen satır adedi
        boolean continuation = true; // devam kontrolü
        
        for (int i = 0; i < modelTable.getRowCount(); i++) {
            Boolean checkBoxx = Boolean.valueOf(jTable1.getValueAt(i, 5).toString());
            if (checkBoxx == true) 
                selectedTotal++;
        }
        if (selectedTotal != 2) { // eğer seçilen satır adedi 2 den farklı ise kullanıcıyı uyar ve dur
            JOptionPane.showMessageDialog(null, "1-1 karşılaştırma yapmalısınız(2 Satır Seçin).", "Hata", JOptionPane.ERROR_MESSAGE);
            continuation = false;
        }
        
        if(continuation==true){
        int sayac =0 ; // true olan checkBox u sayacak ve ona göre karşılaştırmada 1. 2. seçileni ayırt edicez
        
        for (int i = 0; i < modelTable.getRowCount(); i++) { // satır kadar dön
            
            boolean check = Boolean.valueOf(jTable1.getValueAt(i,5).toString());
            
            if(check==true){
                sayac++;
                if(sayac == 1){ // bu demektir ki karşılaştırmak için seçilen ilk ülkenin verileri için
                    String countryName = modelTable.getValueAt(i, 0).toString();//1. ülkenin adı
                    String confirmed = modelTable.getValueAt(i, 1).toString();//1. ülkenin vaka
                    String deaths = modelTable.getValueAt(i, 2).toString();//1. ülkenin ölüm
                    String recovered = modelTable.getValueAt(i, 3).toString();//1. ülkenin iyilesen
                    String active = modelTable.getValueAt(i, 4).toString();//1. ülkenin aktif

                    jtRowData.setVisible(true);
                    jtRowData.pack();
                    jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    jtRowData.lbl_country1.setText(countryName);
                    jtRowData.txt1_vaka.setText(confirmed);
                    jtRowData.txt1_olum.setText(deaths);
                    jtRowData.txt1_iyilesen.setText(recovered);
                    jtRowData.txt1_aktif.setText(active);              
                }
                if(sayac == 2){
                    String countryName = modelTable.getValueAt(i, 0).toString();//2. ülkenin adı
                    String confirmed = modelTable.getValueAt(i, 1).toString();//2. ülkenin vaka
                    String deaths = modelTable.getValueAt(i, 2).toString();//2. ülkenin ölüm
                    String recovered = modelTable.getValueAt(i, 3).toString();//2. ülkenin iyilesen
                    String active = modelTable.getValueAt(i, 4).toString();//2. ülkenin aktif

                    jtRowData.setVisible(true);
                    jtRowData.pack();
                    jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    jtRowData.lbl_country2.setText(countryName);
                    jtRowData.txt2_vaka.setText(confirmed);
                    jtRowData.txt2_olum.setText(deaths);
                    jtRowData.txt2_iyilesen.setText(recovered);
                    jtRowData.txt2_aktif.setText(active);
                }
            }    
            }
        }
    }//GEN-LAST:event_btn_compareActionPerformed

    public void criticalColor() {
 
        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
            JLabel label =(JLabel) super.getTableCellRendererComponent(table, value,
                    isSelected, hasFocus, row, column);
            
            Color c = Color.PINK;
            Object texto = table.getValueAt(row, 2);
            int death = Integer.parseInt(texto.toString());
            if(death > 5000)
                c = Color.GREEN;
            if(death > 10000)
                c = Color.RED;
             
            label.setBackground(c);
            
            return label;
            }
            });
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
            java.util.logging.Logger.getLogger(CovidFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CovidFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CovidFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CovidFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CovidFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_alldel;
    private javax.swing.JButton btn_compare;
    private javax.swing.JButton btn_comparison;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField txt_date;
    // End of variables declaration//GEN-END:variables
}
