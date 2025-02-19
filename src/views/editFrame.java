/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.classController;
import controllers.studentController;
import models.Student;

/**
 *
 * @author Harmoury
 */
public class editFrame extends javax.swing.JFrame {
    classController classCTL = new classController();
    studentController stuCTL = new studentController();
    Student studentM = new Student();

    /**
     * Creates new form editFrame
     */
    public editFrame() {
        initComponents();
        inforBonus();
    }

    public editFrame(int ID) {
        studentM = stuCTL.getStudentByID(ID);
        initComponents();
        inforBonus();
    }

    // Ham khoi tao bo sung
    public void inforBonus() {
        messageDLable.setText("");
        classCTL.setModelCBB(editClassComboBox);
        idDField.setText(String.valueOf(studentM.getStID()));
        NameDField.setText(studentM.getStName());
        birthDField.setText(studentM.getStBirth());
        genderField.setText(studentM.getStGender());
        phoneDField.setText(String.valueOf(studentM.getStPhone()));
        classDField.setText(studentM.getStClass());
        pointDField.setText(String.valueOf(studentM.getStPoint()));
        point_RDLabel.setText(String.valueOf(studentM.getStPonit_R()));
        point_RDScorllBar.setValue(studentM.getStPonit_R());
    }

    // Khoi phuc trang thai thuoc tinh
    public void beginStatus() {

    }

    // Ham nhap diem point_R
    private void setChangePoint_R() {
        int point_R = point_RDScorllBar.getValue();
        point_RDLabel.setText(String.valueOf(point_R));
    }

    // Ham bat che do edit
    public void setEditOption() {
        if (editDLabel.isSelected()) {
            NameDField.setEditable(true);
            birthDField.setEditable(true);
            editGenderComboBox.setEnabled(true);
            phoneDField.setEditable(true);
            editClassComboBox.setEnabled(true);
            pointDField.setEditable(true);
            point_RDScorllBar.setEnabled(true);
            saveBTN.setEnabled(true);
        } else {
            NameDField.setEditable(false);
            birthDField.setEditable(false);
            editGenderComboBox.setEnabled(false);
            phoneDField.setEditable(false);
            editClassComboBox.setEnabled(false);
            pointDField.setEditable(false);
            point_RDLabel.setEnabled(false);
            saveBTN.setEnabled(false);
        }
    }

    // Ham xoa sinh vien
    public void deleteFunc() {
        stuCTL.deleteSt(studentM);
        dispose();
    }

    // Cap nhap du lieu cho studentM
    public void updateStM() {
        studentM.setStName(NameDField.getText());
        studentM.setStGender((String) editGenderComboBox.getSelectedItem());
        studentM.setStGender(phoneDField.getText());
        studentM.setStClass((String) editClassComboBox.getSelectedItem());
        studentM.setStPoint(Float.parseFloat(pointDField.getText()));
        studentM.setStPonit_R(point_RDScorllBar.getValue());
    }

    // Ham sua thong tin sinh vien
    public void saveFunc() {
        updateStM();
        stuCTL.updateStInfor(studentM);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailLabel = new javax.swing.JLabel();
        NameDField = new javax.swing.JTextField();
        birthDField = new javax.swing.JTextField();
        phoneDField = new javax.swing.JTextField();
        pointDField = new javax.swing.JTextField();
        editGenderComboBox = new javax.swing.JComboBox<>();
        idDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        delBTN = new javax.swing.JButton();
        messageDLable = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        editClassComboBox = new javax.swing.JComboBox<>();
        point_RDScorllBar = new javax.swing.JSlider();
        editDLabel = new javax.swing.JCheckBox();
        point_RDLabel = new javax.swing.JLabel();
        classDField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        detailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(0, 51, 51));
        detailLabel.setText("DETAIL INFORMATION");

        NameDField.setEditable(false);

        birthDField.setEditable(false);

        phoneDField.setEditable(false);

        pointDField.setEditable(false);

        editGenderComboBox.setEditable(true);
        editGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        editGenderComboBox.setEnabled(false);

        idDField.setEditable(false);
        idDField.setEnabled(false);

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("Birth of day");

        jLabel5.setText("Gender");

        jLabel6.setText("Phone");

        jLabel7.setText("Point");

        saveBTN.setBackground(new java.awt.Color(204, 102, 0));
        saveBTN.setForeground(new java.awt.Color(255, 255, 255));
        saveBTN.setText("SAVE");
        saveBTN.setEnabled(false);
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        delBTN.setBackground(new java.awt.Color(204, 0, 0));
        delBTN.setForeground(new java.awt.Color(255, 255, 255));
        delBTN.setText("DELETE");
        delBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBTNActionPerformed(evt);
            }
        });

        messageDLable.setForeground(new java.awt.Color(204, 0, 0));
        messageDLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageDLable.setText("message");

        jLabel9.setText("Point_R");

        jLabel10.setText("Class");

        editClassComboBox.setEditable(true);
        editClassComboBox.setEnabled(false);

        point_RDScorllBar.setValue(0);
        point_RDScorllBar.setEnabled(false);
        point_RDScorllBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                point_RDScorllBarStateChanged(evt);
            }
        });

        editDLabel.setText("Edit");
        editDLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDLabelActionPerformed(evt);
            }
        });

        point_RDLabel.setText("0");

        classDField.setEditable(false);

        genderField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(delBTN,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(point_RDScorllBar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(point_RDLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(20, 20, 20))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(idDField, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(editDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(phoneDField,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(birthDField,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(editGenderComboBox,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(genderField))
                                                        .addComponent(NameDField,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(pointDField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(editClassComboBox,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(classDField)))
                                                .addGap(31, 31, 31))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(detailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(messageDLable))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(detailLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idDField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(editDLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NameDField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(birthDField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(editGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneDField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(classDField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pointDField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(point_RDScorllBar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(point_RDLabel))))
                                .addGap(18, 18, 18)
                                .addComponent(messageDLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveBTN)
                                        .addComponent(delBTN))
                                .addContainerGap(25, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editDLabelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editDLabelActionPerformed
        // TODO add your handling code here:
        setEditOption();
    }// GEN-LAST:event_editDLabelActionPerformed

    private void point_RDScorllBarStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_point_RDScorllBarStateChanged
        // TODO add your handling code here:
        setChangePoint_R();
    }// GEN-LAST:event_point_RDScorllBarStateChanged

    private void delBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_delBTNActionPerformed
        // TODO add your handling code here:
        deleteFunc();
    }// GEN-LAST:event_delBTNActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        saveFunc();
    }// GEN-LAST:event_saveBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameDField;
    private javax.swing.JTextField birthDField;
    private javax.swing.JTextField classDField;
    private javax.swing.JButton delBTN;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JComboBox<String> editClassComboBox;
    private javax.swing.JCheckBox editDLabel;
    private javax.swing.JComboBox<String> editGenderComboBox;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField idDField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel messageDLable;
    private javax.swing.JTextField phoneDField;
    private javax.swing.JTextField pointDField;
    private javax.swing.JLabel point_RDLabel;
    private javax.swing.JSlider point_RDScorllBar;
    private javax.swing.JButton saveBTN;
    // End of variables declaration//GEN-END:variables

}
