/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.registration.system;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static student.registration.system.mysqlConnection.conn;
import static student.registration.system.mysqlConnection.st;
import static student.registration.system.registeredStudents.pst;
import static student.registration.system.registeredStudents.rs;
import static student.registration.system.studentManagement.regno;

/**
 *
 * @author Hassow099
 */
public class ResultsProcessing extends javax.swing.JFrame {

    /**
     * Creates new form ResultsProcessing
     */
    public ResultsProcessing() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        InserResult = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        UpdateResult = new javax.swing.JButton();
        deleteResult = new javax.swing.JButton();
        resetResult = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTBResult = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 0, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESULT PROCESSING");

        InserResult.setBackground(new java.awt.Color(0, 153, 153));
        InserResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InserResult.setForeground(new java.awt.Color(255, 0, 51));
        InserResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/registration/system/icons/Save-icon_1_1.png"))); // NOI18N
        InserResult.setText("Save");
        InserResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserResultActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/registration/system/icons/logout_1_1.png"))); // NOI18N
        jButton6.setText("Go back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        UpdateResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateResult.setForeground(new java.awt.Color(0, 102, 102));
        UpdateResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/registration/system/icons/update icon_1.png"))); // NOI18N
        UpdateResult.setText("Update");
        UpdateResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateResultActionPerformed(evt);
            }
        });

        deleteResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteResult.setForeground(new java.awt.Color(0, 102, 102));
        deleteResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/registration/system/icons/delete_16x16_1_1.gif"))); // NOI18N
        deleteResult.setText("Delete");
        deleteResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResultActionPerformed(evt);
            }
        });

        resetResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetResult.setForeground(new java.awt.Color(0, 102, 102));
        resetResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/registration/system/icons/delete_16x16_2.gif"))); // NOI18N
        resetResult.setText("Reset");
        resetResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetResultActionPerformed(evt);
            }
        });

        JTBResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RegNo", "Name", "ACSC 332", "ACSC 351", "ACSC 327", "ACSC 371", "ACSC 381", "COSC 340"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTBResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTBResultMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTBResult);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(153, 0, 0));
        jLabel53.setText("Code");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(153, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Name");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(153, 0, 0));
        jLabel55.setText("Grade");

        jComboBox1.setBackground(new java.awt.Color(0, 0, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 0, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "X", "Z" }));

        jLabel62.setText("JAVA DESKTOP APPLICATION");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel57.setText("ACSC 332");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel58.setText("ACSC 351");

        jLabel63.setText("DATABASE MANAGEMENT");

        jComboBox2.setBackground(new java.awt.Color(153, 0, 153));
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "X", "Z" }));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel56.setText("ACSC 327");

        jLabel64.setText("WEB DEVELOPMENT &ADMINITRATION");

        jComboBox4.setBackground(new java.awt.Color(153, 0, 153));
        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "X", "Z" }));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel59.setText("ACSC 371");

        jLabel65.setText("COMPUTING AND PROFESSIONAL ETHICS");

        jComboBox3.setBackground(new java.awt.Color(153, 0, 153));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "X", "Z" }));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel60.setText("ACSC 381");

        jLabel66.setText("RESEARCH METHODS");

        jComboBox5.setBackground(new java.awt.Color(153, 0, 153));
        jComboBox5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "X", "Z" }));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel61.setText("COSC 340");

        jLabel67.setText("THEORY OF COMPUTATION");

        jComboBox6.setBackground(new java.awt.Color(153, 0, 153));
        jComboBox6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "X", "Z" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InserResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpdateResult, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(deleteResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76)))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InserResult, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel58)
                                .addComponent(jLabel63))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(jLabel64)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetResult, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel66)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel67)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InserResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserResultActionPerformed
    String acsc332=(String)jComboBox1.getSelectedItem();
    String acsc351=(String)jComboBox2.getSelectedItem();
    String acsc327=(String)jComboBox3.getSelectedItem();   
    String acsc371=(String)jComboBox4.getSelectedItem(); 
    String acsc381=(String)jComboBox5.getSelectedItem(); 
    String cosc340=(String)jComboBox6.getSelectedItem(); 
   
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbchuka" ,"root","");
            st=conn.createStatement();
           
                st.executeUpdate("INSERT INTO result (ACSC332,ACSC351,ACSC327,ACSC371,ACSC381,COSC340)"
                    + "VALUES('"+acsc332+"','"+acsc351+"','"+acsc327+"','"+acsc371+"','"+acsc381+"','"+cosc340+"'");
               
                JOptionPane.showMessageDialog(null,"Result Added");
              } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Unable to add Result!");
        }
    }//GEN-LAST:event_InserResultActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new registeredStudents().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UpdateResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateResultActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbmdl =(DefaultTableModel)JTBResult.getModel();
        int selectedRow=JTBResult.getSelectedRow();

        try {
            int id =Integer.parseInt(tbmdl.getValueAt(selectedRow,0).toString());

            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbchuka" ,"root","");
            pst=conn.prepareStatement("Update result SET ACSC332=?,ACSC351=?,ACSC327=?,ACSC371=?,ACSC381=?,COSC340=? "
                + "where id=?");

            pst.setString(3,(String)jComboBox1.getSelectedItem());
            pst.setString(4,(String)jComboBox2.getSelectedItem());
            pst.setString(6,(String)jComboBox4.getSelectedItem()); 
            pst.setString(5,(String)jComboBox3.getSelectedItem());
            pst.setString(7,(String)jComboBox5.getSelectedItem()); 
            pst.setString(8,(String)jComboBox6.getSelectedItem());
            pst.setInt(9,id);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null,"Record Updated");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Unable to update Record!");
        }

    }//GEN-LAST:event_UpdateResultActionPerformed

    private void deleteResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResultActionPerformed
        DefaultTableModel tbmdl =(DefaultTableModel)JTBResult.getModel();
        int selectedRow=JTBResult.getSelectedRow();

        try{
            int id =Integer.parseInt(tbmdl.getValueAt(selectedRow,0).toString());
            int delete=JOptionPane.showConfirmDialog(null,"Confirm You want to delete this Record","warning!",
                JOptionPane.YES_NO_OPTION);

            if(delete==JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbchuka" ,"root","");
                pst=conn.prepareStatement("Delete from tbstudents where id=?");

                pst.setInt(1,id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Deleted!");
             
                jComboBox1.setSelectedItem(0);
                jComboBox2.setSelectedItem(0);
                jComboBox3.setSelectedItem(0);
                jComboBox4.setSelectedItem(0);
                jComboBox5.setSelectedItem(0);   
                jComboBox6.setSelectedItem(0);


            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Unable to add Record to tbstudents!");
        }
    }//GEN-LAST:event_deleteResultActionPerformed

    private void resetResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetResultActionPerformed
        jComboBox1.setSelectedItem(0);
        jComboBox2.setSelectedItem(0);
        jComboBox3.setSelectedItem(0);
        jComboBox4.setSelectedItem(0);
        jComboBox5.setSelectedItem(0);
        jComboBox6.setSelectedItem(0);

    }//GEN-LAST:event_resetResultActionPerformed

    private void JTBResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTBResultMouseClicked
         DefaultTableModel tbmdl =(DefaultTableModel)JTBResult.getModel();
        int selectedRow=JTBResult.getSelectedRow();
        try{
       
        jComboBox1.setSelectedItem(tbmdl.getValueAt(selectedRow,3).toString());   
        jComboBox2.setSelectedItem(tbmdl.getValueAt(selectedRow,4).toString());  
        jComboBox3.setSelectedItem(tbmdl.getValueAt(selectedRow,6).toString()); 
        jComboBox4.setSelectedItem(tbmdl.getValueAt(selectedRow,5).toString());
        jComboBox5.setSelectedItem(tbmdl.getValueAt(selectedRow,7).toString()); 
        jComboBox6.setSelectedItem(tbmdl.getValueAt(selectedRow,8).toString());  
        }catch(Exception e){
            System.out.println("");
        }
        
    }//GEN-LAST:event_JTBResultMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         try {
                  conn=mysqlConnection.getConnection();        
                    mysqlConnection.st=conn.createStatement(); 
             String query=("SELECT *FROM result");
                    rs=mysqlConnection.st.executeQuery(query);
                   
            while(rs.next()){
              String id=rs.getString("id");
              regno=rs.getString("RegNO");
              String name=rs.getString("name");
              String acsc332=rs.getString("acsc332");   
              String acsc351=rs.getString("acsc351");
              String acsc327=rs.getString("acsc327"); 
              String acsc371=rs.getString("acsc371");
              String acsc381=rs.getString("acsc381");
              String cosc340=rs.getString("cosc340");
      
                  String tbData[]={id,regno,name,acsc332,acsc351,acsc327,acsc371,acsc381,cosc340};
             
                  
                  DefaultTableModel tbmdl =(DefaultTableModel)JTBResult.getModel();
                  tbmdl.addRow(tbData); 

                   }
                   conn.close();
               } catch (SQLException ex) {
                   System.out.println("failed table reading!");
               }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ResultsProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultsProcessing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InserResult;
    private javax.swing.JTable JTBResult;
    private javax.swing.JButton UpdateResult;
    private javax.swing.JButton deleteResult;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton resetResult;
    // End of variables declaration//GEN-END:variables
}
