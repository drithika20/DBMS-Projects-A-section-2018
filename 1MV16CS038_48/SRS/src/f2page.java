
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class f2page extends javax.swing.JFrame {

    /**
     * Creates new form f2page
     */
    public f2page() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(350,100, 692, 500);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        ta = new javax.swing.JTextField();
        pb = new javax.swing.JTextField();
        da = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("UPDATE STUDENT FEE DETAILS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(211, 25, 342, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("RECEIPT ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(173, 139, 95, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("TOTAL AMT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 210, 97, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PAID BY");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 290, 67, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("DUE AMT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 350, 76, 22);

        rid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(rid);
        rid.setBounds(387, 133, 154, 28);

        ta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taActionPerformed(evt);
            }
        });
        jPanel1.add(ta);
        ta.setBounds(387, 208, 154, 28);

        pb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(pb);
        pb.setBounds(387, 286, 154, 28);

        da.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(da);
        da.setBounds(387, 340, 154, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(238, 421, 83, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(418, 421, 65, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Enter USN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(173, 75, 81, 22);

        usn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        usn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usnKeyPressed(evt);
            }
        });
        jPanel1.add(usn);
        usn.setBounds(387, 72, 154, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i9.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dolly");
             
             String sql;
             String n=null;
             
             sql="update fees set receipt_id=?,total_amtpaid=?,paid_by=?,due_amt=? where usn=?";
             PreparedStatement pst=conn.prepareStatement(sql);
            
             int a2=usn.getDocument().getLength();
             int a3=rid.getDocument().getLength();
             int a8=ta.getDocument().getLength();
             int a5=pb.getDocument().getLength();
             int a6=da.getDocument().getLength();
            
              
             if((a2==0)||(a5==0)||(a6==0)||(a3==0)||(a8==0))
             {
                   
                            JOptionPane.showMessageDialog(null, "Please Enter All The Details");
                     
             }
          
             else{             
                 pst.setString(1, rid.getText());
                 pst.setString(2, ta.getText());
                 pst.setString(3, pb.getText());
                 pst.setString(4, da.getText());
                 
                 pst.setString(5,usn.getText());
                  
                                 int k= pst.executeUpdate();
                                 if(k==1)
                                 {
                                 JOptionPane.showMessageDialog(null, "successfully Updated "+  usn.getText()+ " In Fees");
                                 usn.setText(null);
                                 
                                 rid.setText(null);
                                 ta.setText(null);
                                 da.setText(null);
                                 pb.setText(null);
                                 
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(null, "Not updated");
                              
                                 
                                usn.setText(null);
                                 
                                 rid.setText(null);
                                 ta.setText(null);
                                 da.setText(null);
                                 pb.setText(null);
                                 
                                 }
                                 
                             
                                 
                              
                                     
                                 
             }
        }
            
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        f1page f1=new f1page();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dolly");
            String sql="select * from fees where usn=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            int a1=usn.getDocument().getLength();
            if(a1==0)
            {
                JOptionPane.showMessageDialog(null,"Please enter usn");
                
            }
            else
            {
                pst.setString(1,usn.getText());
                ResultSet rs=pst.executeQuery();
                if(!rs.next())
                {
                    JOptionPane.showMessageDialog(null, "usn does not exist");
                    usn.setText(null);
                    
                }
                else
                {
                    rid.setText(rs.getString("receipt_id"));                   
                    ta.setText(rs.getString("total_amtpaid"));
                    pb.setText(rs.getString("paid_by"));
                    da.setText(rs.getString("due_amt"));
                   
                    conn.close();;
                }   
            }
}
        catch(Exception e)
            
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_usnKeyPressed
    }
    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed
    
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
            java.util.logging.Logger.getLogger(f2page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f2page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField da;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pb;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField ta;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
