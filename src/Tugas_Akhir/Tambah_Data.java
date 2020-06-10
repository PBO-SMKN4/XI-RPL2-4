/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class Tambah_Data extends JPanel {
    
    public Tambah_Data() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("project_m4p?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM M4p m");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        hariLabel = new javax.swing.JLabel();
        jamMasukLabel = new javax.swing.JLabel();
        pelajaranLabel = new javax.swing.JLabel();
        ruanganLabel = new javax.swing.JLabel();
        kelasLabel = new javax.swing.JLabel();
        hariField = new javax.swing.JTextField();
        jamMasukField = new javax.swing.JTextField();
        pelajaranField = new javax.swing.JTextField();
        ruanganField = new javax.swing.JTextField();
        kelasField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        hariLabel.setText("Hari:");

        jamMasukLabel.setText("Jam Masuk:");

        pelajaranLabel.setText("Pelajaran:");

        ruanganLabel.setText("Ruangan:");

        kelasLabel.setText("Kelas:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement.hari}"), hariField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), hariField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        hariField.addActionListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement.jamMasuk}"), jamMasukField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jamMasukField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jamMasukField.addActionListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pelajaran}"), pelajaranField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), pelajaranField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        pelajaranField.addActionListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ruangan}"), ruanganField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), ruanganField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        ruanganField.addActionListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement.kelas}"), kelasField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, new javax.swing.JTable(), org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), kelasField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        saveButton.setText("Simpan");
        saveButton.addActionListener(formListener);

        jLabel1.setText("Tambah Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jamMasukLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pelajaranLabel)
                                        .addComponent(kelasLabel)
                                        .addComponent(ruanganLabel)
                                        .addComponent(hariLabel))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hariField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ruanganField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pelajaranField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jamMasukField)
                                            .addComponent(kelasField, javax.swing.GroupLayout.Alignment.LEADING)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hariField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hariLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamMasukLabel)
                    .addComponent(jamMasukField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pelajaranField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pelajaranLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruanganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruanganLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addGap(44, 44, 44))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                Tambah_Data.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == hariField) {
                Tambah_Data.this.hariFieldActionPerformed(evt);
            }
            else if (evt.getSource() == pelajaranField) {
                Tambah_Data.this.pelajaranFieldActionPerformed(evt);
            }
            else if (evt.getSource() == jamMasukField) {
                Tambah_Data.this.jamMasukFieldActionPerformed(evt);
            }
            else if (evt.getSource() == ruanganField) {
                Tambah_Data.this.ruanganFieldActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<Tugas_Akhir.M4p> merged = new ArrayList<Tugas_Akhir.M4p>(list.size());
            for (Tugas_Akhir.M4p m : list) {
                merged.add(entityManager.merge(m));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void hariFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hariFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hariFieldActionPerformed

    private void pelajaranFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelajaranFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pelajaranFieldActionPerformed

    private void jamMasukFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamMasukFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamMasukFieldActionPerformed

    private void ruanganFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruanganFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField hariField;
    private javax.swing.JLabel hariLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jamMasukField;
    private javax.swing.JLabel jamMasukLabel;
    private javax.swing.JTextField kelasField;
    private javax.swing.JLabel kelasLabel;
    private java.util.List<Tugas_Akhir.M4p> list;
    private javax.swing.JTextField pelajaranField;
    private javax.swing.JLabel pelajaranLabel;
    private javax.persistence.Query query;
    private javax.swing.JTextField ruanganField;
    private javax.swing.JLabel ruanganLabel;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Tambah_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new Tambah_Data());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
