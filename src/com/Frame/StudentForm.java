/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Frame;

import com.dao.StudentDao;
import com.daoImp.StudentDaoImpl;
import com.model.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author Govinda
 */
public class StudentForm extends javax.swing.JFrame {
    
    Student s = new Student();
    StudentDao dao = new StudentDaoImpl();
    public StudentForm() {
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

        jLabel1 = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        niclabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        addresslabel = new javax.swing.JLabel();
        citylabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        nametxtfield = new javax.swing.JTextField();
        nictxtfield = new javax.swing.JTextField();
        emailtxtfield = new javax.swing.JTextField();
        addresstxtfield = new javax.swing.JTextField();
        citytxtfield = new javax.swing.JTextField();
        agetxtfield = new javax.swing.JTextField();
        registerbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION FORM");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 30, 172, 35));

        namelabel.setForeground(new java.awt.Color(255, 255, 255));
        namelabel.setText("NAME");
        getContentPane().add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 85, 28));

        niclabel.setForeground(new java.awt.Color(255, 255, 255));
        niclabel.setText("NIC");
        getContentPane().add(niclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 129, 85, 22));

        emaillabel.setForeground(new java.awt.Color(255, 255, 255));
        emaillabel.setText("EMAIL");
        getContentPane().add(emaillabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 169, 85, 27));

        addresslabel.setForeground(new java.awt.Color(255, 255, 255));
        addresslabel.setText("ADDRESS");
        getContentPane().add(addresslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 202, 85, 34));

        citylabel.setForeground(new java.awt.Color(255, 255, 255));
        citylabel.setText("CITY");
        getContentPane().add(citylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 247, 85, 29));

        agelabel.setForeground(new java.awt.Color(255, 255, 255));
        agelabel.setText("AGE");
        getContentPane().add(agelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 294, 85, 26));

        nametxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtfieldActionPerformed(evt);
            }
        });
        getContentPane().add(nametxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 83, 144, 28));
        getContentPane().add(nictxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 129, 144, 29));
        getContentPane().add(emailtxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 169, 144, 27));
        getContentPane().add(addresstxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 202, 144, 34));
        getContentPane().add(citytxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 247, 144, 29));
        getContentPane().add(agetxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 294, 144, 26));

        registerbutton.setText("REGISTER");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        // TODO add your handling code here:
        
        String name=nametxtfield.getText();
        String snic=nictxtfield.getText();
        String email=emailtxtfield.getText();
        String address=addresstxtfield.getText();
        String city=citytxtfield.getText();
        String sAge=agetxtfield.getText();
        Integer age = Integer.parseInt(sAge);
        Double cnic = Double.parseDouble(snic);
        
        System.out.println("name = "+name);
        System.out.println("nic = "+cnic);
        System.out.println("email = "+email);
        System.out.println("address ="+address);
        System.out.println("city ="+city);
        System.out.println("age = "+age);
        
        s.setAddress(address);
        s.setAge(age);
        s.setCNIC(cnic);
        s.setCity(city);
        s.setEmail(email);
        s.setStudentName(name);
        
        Integer reuslt= dao.addStudent(s);
        if(reuslt>0)
        {
            System.out.println("Added Suucesssully");
        }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void nametxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtfieldActionPerformed

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
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslabel;
    private javax.swing.JTextField addresstxtfield;
    private javax.swing.JLabel agelabel;
    private javax.swing.JTextField agetxtfield;
    private javax.swing.JLabel citylabel;
    private javax.swing.JTextField citytxtfield;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField emailtxtfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametxtfield;
    private javax.swing.JLabel niclabel;
    private javax.swing.JTextField nictxtfield;
    private javax.swing.JButton registerbutton;
    // End of variables declaration//GEN-END:variables
}
