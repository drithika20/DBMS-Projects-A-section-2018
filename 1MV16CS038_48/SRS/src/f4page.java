
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
public class f4page extends javax.swing.JFrame {

    /**
     * Creates new form f4page
     */
    public f4page() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(100,50, 900, 650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jusn = new javax.swing.JLabel();
        jsname = new javax.swing.JLabel();
        jgender = new javax.swing.JLabel();
        jdob = new javax.swing.JLabel();
        jaddress = new javax.swing.JLabel();
        jaddress1 = new javax.swing.JLabel();
        jaddress2 = new javax.swing.JLabel();
        jaddress3 = new javax.swing.JLabel();
        jaddress4 = new javax.swing.JLabel();
        jaddress5 = new javax.swing.JLabel();
        jaddress6 = new javax.swing.JLabel();
        jaddress7 = new javax.swing.JLabel();
        jaddress8 = new javax.swing.JLabel();
        jaddress10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pphone = new javax.swing.JTextField();
        gaurdian = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        parent = new javax.swing.JTextField();
        sphone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        presentsem = new javax.swing.JTextField();
        gphone = new javax.swing.JTextField();
        branchid = new javax.swing.JTextField();
        rank = new javax.swing.JTextField();
        courseid = new javax.swing.JTextField();
        aadharno = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        staytype = new javax.swing.JTextField();
        yearofjoin = new javax.swing.JTextField();
        puc = new javax.swing.JTextField();
        tenth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        usn1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jusn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jusn.setText("USN");
        jPanel2.add(jusn);
        jusn.setBounds(49, 71, 34, 22);

        jsname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jsname.setText("S_NAME");
        jPanel2.add(jsname);
        jsname.setBounds(49, 123, 67, 22);

        jgender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jgender.setText("GENDER");
        jPanel2.add(jgender);
        jgender.setBounds(49, 169, 67, 22);

        jdob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdob.setText("DOB");
        jPanel2.add(jdob);
        jdob.setBounds(49, 220, 36, 22);

        jaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress.setText("ADDRESS");
        jPanel2.add(jaddress);
        jaddress.setBounds(350, 260, 76, 22);

        jaddress1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress1.setText("S_PHONE");
        jPanel2.add(jaddress1);
        jaddress1.setBounds(350, 210, 77, 22);

        jaddress2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress2.setText("PARENT_NAME");
        jPanel2.add(jaddress2);
        jaddress2.setBounds(250, 420, 122, 22);

        jaddress3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress3.setText("P_PHONE");
        jPanel2.add(jaddress3);
        jaddress3.setBounds(350, 310, 77, 22);

        jaddress4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress4.setText("GUARDIAN_NAME");
        jPanel2.add(jaddress4);
        jaddress4.setBounds(250, 460, 145, 22);

        jaddress5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress5.setText("G_PHONE");
        jPanel2.add(jaddress5);
        jaddress5.setBounds(350, 370, 79, 22);

        jaddress6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress6.setText("BRANCH_ID");
        jPanel2.add(jaddress6);
        jaddress6.setBounds(567, 587, 97, 22);

        jaddress7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress7.setText("COURSE_ID");
        jPanel2.add(jaddress7);
        jaddress7.setBounds(567, 70, 96, 22);

        jaddress8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress8.setText("AADHAR_NO");
        jPanel2.add(jaddress8);
        jaddress8.setBounds(567, 108, 103, 22);

        jaddress10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jaddress10.setText("STAY TYPE");
        jPanel2.add(jaddress10);
        jaddress10.setBounds(567, 169, 89, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("AGE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(567, 220, 33, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("YEAR OF JOIN");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(567, 273, 116, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PRESENT SEM");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(567, 420, 114, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CATEGORY OF EXAM");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(567, 479, 168, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("RANK OF EXAM");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(567, 537, 124, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("PUC%");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(567, 316, 51, 22);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("TENTH%");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(567, 368, 74, 22);

        pphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pphoneActionPerformed(evt);
            }
        });
        jPanel2.add(pphone);
        pphone.setBounds(450, 310, 95, 28);

        gaurdian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gaurdian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaurdianActionPerformed(evt);
            }
        });
        jPanel2.add(gaurdian);
        gaurdian.setBounds(440, 460, 95, 28);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(234, 120, 85, 28);

        parent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        parent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentActionPerformed(evt);
            }
        });
        jPanel2.add(parent);
        parent.setBounds(440, 410, 100, 28);

        sphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sphoneActionPerformed(evt);
            }
        });
        jPanel2.add(sphone);
        sphone.setBounds(450, 210, 85, 28);

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address);
        address.setBounds(450, 260, 85, 28);

        dob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        jPanel2.add(dob);
        dob.setBounds(234, 217, 85, 28);

        gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel2.add(gender);
        gender.setBounds(234, 166, 85, 28);

        usn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        jPanel2.add(usn);
        usn.setBounds(234, 65, 85, 28);

        category.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(category);
        category.setBounds(772, 476, 95, 28);

        presentsem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        presentsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentsemActionPerformed(evt);
            }
        });
        jPanel2.add(presentsem);
        presentsem.setBounds(772, 420, 95, 28);

        gphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(gphone);
        gphone.setBounds(450, 370, 95, 28);

        branchid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(branchid);
        branchid.setBounds(772, 584, 95, 28);

        rank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(rank);
        rank.setBounds(772, 534, 95, 28);

        courseid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(courseid);
        courseid.setBounds(772, 67, 99, 28);

        aadharno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aadharno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharnoActionPerformed(evt);
            }
        });
        jPanel2.add(aadharno);
        aadharno.setBounds(772, 108, 99, 28);

        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel2.add(age);
        age.setBounds(772, 217, 99, 28);

        staytype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(staytype);
        staytype.setBounds(772, 166, 99, 28);

        yearofjoin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(yearofjoin);
        yearofjoin.setBounds(772, 270, 99, 28);

        puc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(puc);
        puc.setBounds(772, 316, 99, 28);

        tenth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenthActionPerformed(evt);
            }
        });
        jPanel2.add(tenth);
        tenth.setBounds(772, 362, 99, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("UPDATE STUDENT DETAILS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(406, 6, 295, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(442, 539, 79, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(442, 589, 61, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Enter USN");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(275, 35, 81, 22);

        usn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usn1KeyPressed(evt);
            }
        });
        jPanel2.add(usn1);
        usn1.setBounds(438, 38, 107, 21);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i9.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 980, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pphoneActionPerformed

    private void gaurdianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaurdianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaurdianActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void parentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentActionPerformed

    private void sphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sphoneActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed

    private void presentsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentsemActionPerformed

    private void aadharnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadharnoActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void tenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenthActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        f1page f1=new f1page();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usn1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dolly");
            String sql="select * from student where usn=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            int a1=usn1.getDocument().getLength();
            if(a1==0)
            {
                JOptionPane.showMessageDialog(null,"Please usn");
                
            }
            else
            {
                pst.setString(1,usn1.getText());
                ResultSet rs=pst.executeQuery();
                if(!rs.next())
                {
                    JOptionPane.showMessageDialog(null, "usn does not exist");
                    usn1.setText(null);
                    
                }
                else
                {
                    usn.setText(rs.getString("usn"));                   
                    name.setText(rs.getString("s_name"));
                    gender.setText(rs.getString("gender"));
                    courseid.setText(rs.getString("course_id"));
                    branchid.setText(rs.getString("branch_id"));
                    sphone.setText(rs.getString("s_phone"));
                    staytype.setText(rs.getString("stay_type"));
                    gaurdian.setText(rs.getString("guardian_name"));
                    
                    gphone.setText(rs.getString("g_phone"));                   
                    parent.setText(rs.getString("parent_name"));
                    pphone.setText(rs.getString("p_phone"));
                    presentsem.setText(rs.getString("present_sem"));
                    tenth.setText(rs.getString("tenth"));
                    puc.setText(rs.getString("puc"));
                    category.setText(rs.getString("category_of_exam"));
                    dob.setText(rs.getString("dob"));
                    
                    address.setText(rs.getString("address"));                   
                    aadharno.setText(rs.getString("aadhar_no"));
                    age.setText(rs.getString("age"));
                    yearofjoin.setText(rs.getString("year_of_join"));
                    rank.setText(rs.getString("cet_comedk_other_rank"));
                    
                    conn.close();
                }   
            }
}
        catch(Exception e)
            
        {
            JOptionPane.showMessageDialog(null, e);
        }
         
        }
        
    }//GEN-LAST:event_usn1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "dolly");
             
             String sql;
             String n=null;
            // String usn2=usn1.getText();
             sql="update student set s_name=?,gender=?,dob=?,address=?,s_phone=?,parent_name=?,p_phone=?,guardian_name=?,g_phone=?,branch_id=?,course_id=?,aadhar_no=?,stay_type=?,age=?,year_of_join=?,present_sem=?,category_of_exam=?,cet_comedk_other_rank=?,puc=?,tenth=? where usn=?";
             PreparedStatement pst=conn.prepareStatement(sql);
            
             int a1=usn1.getDocument().getLength();
             int a2=name.getDocument().getLength();
             int a3=gender.getDocument().getLength();
             int a4=dob.getDocument().getLength();
             int a5=address.getDocument().getLength();
             int a6=sphone.getDocument().getLength();
             int a7=parent.getDocument().getLength();
              int a8=pphone.getDocument().getLength();
              
              
              
             int a10=gaurdian.getDocument().getLength();
             int a11=gphone.getDocument().getLength();
             int a12=branchid.getDocument().getLength();
             int a13=courseid.getDocument().getLength();
             int a14=aadharno.getDocument().getLength();
             int a15=staytype.getDocument().getLength();
             int a16=age.getDocument().getLength();
              int a17=yearofjoin.getDocument().getLength();
              
              
               int a18=presentsem.getDocument().getLength();
             int a19=category.getDocument().getLength();
             int a20=rank.getDocument().getLength();
             int a21=puc.getDocument().getLength();
              int a22=tenth.getDocument().getLength();
              
             if((a1==0)||(a2==0)||(a3==0)||(a4==0)||(a5==0)||(a6==0)||(a7==0)||(a8==0)||(a10==0)||(a11==0)||(a12==0)||(a13==0)||(a14==0)||(a15==0)||(a16==0)||(a17==0)||(a18==0)||(a19==0)||(a20==0)||(a21==0)||(a22==0))
             {
                   
                            JOptionPane.showMessageDialog(null, "Please Enter All The Details");
                     
             }
          
             else{             
                 pst.setString(1, name.getText());
                 pst.setString(2, gender.getText());
                 pst.setString(3, dob.getText());
                 pst.setString(4, address.getText());
                 pst.setString(5, sphone.getText());
                 pst.setString(6, parent.getText());
                 pst.setString(7, pphone.getText());
                 pst.setString(8,gaurdian.getText());
                 
                 
                 pst.setString(9, gphone.getText());
                 pst.setString(10, branchid.getText());
                 pst.setString(11, courseid.getText());
                 pst.setString(12, aadharno.getText());
                 pst.setString(13, staytype.getText());
                 pst.setString(14, age.getText());
                 pst.setString(15, yearofjoin.getText());
                 pst.setString(16,presentsem.getText());
                 
                 
                 pst.setString(17, category.getText());
                 pst.setString(18, rank.getText());
                 pst.setString(19, puc.getText());
                 pst.setString(20, tenth.getText());
                 pst.setString(21,usn1.getText());
                 
                  
                                 int k= pst.executeUpdate();
                                 if(k==1)
                                 {
                                 JOptionPane.showMessageDialog(null, "successfully Updated "+  this.usn1.getText()+ " In Student basic details");
                                 this.usn.setText(null);
                                 
                                                   
                    name.setText(null);
                    gender.setText(null);
                    courseid.setText(null);
                    branchid.setText(null);
                    sphone.setText(null);
                    staytype.setText(null);
                    gaurdian.setText(null);
                    
                    gphone.setText(null);                   
                    parent.setText(null);
                    pphone.setText(null);
                    presentsem.setText(null);
                    tenth.setText(null);
                    puc.setText(null);
                    category.setText(null);
                    dob.setText(null);
                    
                    address.setText(null);                   
                    aadharno.setText(null);
                    age.setText(null);
                    yearofjoin.setText(null);
                    rank.setText(null);
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(null, "Not updated");
                                 this.usn.setText(null);
                                 
                                 name.setText(null);
                    gender.setText(null);
                    courseid.setText(null);
                    branchid.setText(null);
                    sphone.setText(null);
                    staytype.setText(null);
                    gaurdian.setText(null);
                    
                    gphone.setText(null);                   
                    parent.setText(null);
                    pphone.setText(null);
                    presentsem.setText(null);
                    tenth.setText(null);
                    puc.setText(null);
                    category.setText(null);
                    dob.setText(null);
                    
                    address.setText(null);                   
                    aadharno.setText(null);
                    age.setText(null);
                    yearofjoin.setText(null);
                    rank.setText(null);
                                 }
                                 
                             
                                 
                              
                                     
                                 
             }
        }
            
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(f4page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f4page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f4page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f4page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f4page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField aadharno;
    public javax.swing.JTextField address;
    public javax.swing.JTextField age;
    public javax.swing.JTextField branchid;
    public javax.swing.JTextField category;
    public javax.swing.JTextField courseid;
    public javax.swing.JTextField dob;
    public javax.swing.JTextField gaurdian;
    public javax.swing.JTextField gender;
    public javax.swing.JTextField gphone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jaddress;
    private javax.swing.JLabel jaddress1;
    private javax.swing.JLabel jaddress10;
    private javax.swing.JLabel jaddress2;
    private javax.swing.JLabel jaddress3;
    private javax.swing.JLabel jaddress4;
    private javax.swing.JLabel jaddress5;
    private javax.swing.JLabel jaddress6;
    private javax.swing.JLabel jaddress7;
    private javax.swing.JLabel jaddress8;
    private javax.swing.JLabel jdob;
    private javax.swing.JLabel jgender;
    private javax.swing.JLabel jsname;
    private javax.swing.JLabel jusn;
    public javax.swing.JTextField name;
    public javax.swing.JTextField parent;
    public javax.swing.JTextField pphone;
    public javax.swing.JTextField presentsem;
    public javax.swing.JTextField puc;
    public javax.swing.JTextField rank;
    public javax.swing.JTextField sphone;
    public javax.swing.JTextField staytype;
    public javax.swing.JTextField tenth;
    public javax.swing.JTextField usn;
    private javax.swing.JTextField usn1;
    public javax.swing.JTextField yearofjoin;
    // End of variables declaration//GEN-END:variables
}
