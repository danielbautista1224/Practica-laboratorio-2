/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolaboratorio2;

/**
 *
 * @author ASUS
 */
public class Resistencia extends javax.swing.JFrame {

    /**
     * Creates new form Resistencia
     */
    public Resistencia() {
        initComponents();
        franja1.removeAllItems();
        franja2.removeAllItems();
        franja3.removeAllItems();
        franja4.removeAllItems();
        franja1.addItem("Marron");
        franja1.addItem("Rojo");
        franja1.addItem("Naranja");
        franja1.addItem("Amarillo");
        franja1.addItem("Verde");
        franja1.addItem("Azul");
        franja1.addItem("Violeta");
        franja1.addItem("Gris");
        franja1.addItem("Blanco");
        franja2.addItem("Negro");
        franja2.addItem("Marron");
        franja2.addItem("Rojo");
        franja2.addItem("Naranja");
        franja2.addItem("Amarillo");
        franja2.addItem("Verde");
        franja2.addItem("Azul");
        franja2.addItem("Violeta");
        franja2.addItem("Gris");
        franja2.addItem("Blanco");
        franja3.addItem("Negro");
        franja3.addItem("Marron");
        franja3.addItem("Rojo");
        franja3.addItem("Naranja");
        franja3.addItem("Amarillo");
        franja3.addItem("Verde");
        franja3.addItem("Azul");
        franja3.addItem("Violeta");
        franja3.addItem("Gris");
        franja3.addItem("Blanco");
        franja3.addItem("Oro");
        franja3.addItem("Plata");
        franja4.addItem("Marron");
        franja4.addItem("Rojo");
        franja4.addItem("Naranja");
        franja4.addItem("Amarillo");
        franja4.addItem("Verde");
        franja4.addItem("Azul");
        franja4.addItem("Violeta");
        franja4.addItem("Gris");
        franja4.addItem("Oro");
        franja4.addItem("Plata");
        franja4.addItem("Ninguno");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valor_resistencia = new javax.swing.JTextField();
        franja1 = new javax.swing.JComboBox<>();
        franja2 = new javax.swing.JComboBox<>();
        franja3 = new javax.swing.JComboBox<>();
        franja4 = new javax.swing.JComboBox<>();
        calculalo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valor_resistencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        franja1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        franja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                franja1ActionPerformed(evt);
            }
        });

        franja2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        franja3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        franja4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        calculalo.setText("Calculalo ");
        calculalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(valor_resistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(franja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(franja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(franja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(franja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(calculalo)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(valor_resistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(franja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(franja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(franja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(franja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(calculalo)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void franja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_franja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_franja1ActionPerformed

    private void calculaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaloActionPerformed
        // TODO add your handling code here:
        franja1.getSelectedItem();
        franja2.getSelectedItem();
        franja3.getSelectedItem();
        franja4.getSelectedItem();
        Double valor1=0.0;
        Double valor2=0.0;
        Double valor3=0.0;
        Double valor4=0.0;
        Double valortotal=0.0;
        String magnitud="";
        if (franja1.getSelectedItem()=="Marron")
        {
            valor1=10.0;
        }
        if (franja1.getSelectedItem()=="Rojo")
        {
            valor1=20.0;
        }
        if (franja1.getSelectedItem()=="Naranja")
        {
            valor1=30.0;
        }
        if (franja1.getSelectedItem()=="Amarillo")
        {
            valor1=40.0;
        }
        if (franja1.getSelectedItem()=="Verde")
        {
            valor1=50.0;
        }
        if (franja1.getSelectedItem()=="Azul")
        {
            valor1=60.0;
        }
        if (franja1.getSelectedItem()=="Violeta")
        {
            valor1=70.0;
        }
        if (franja1.getSelectedItem()=="Gris")
        {
            valor1=80.0;
        }
        if (franja1.getSelectedItem()=="Blanco")
        {
            valor1=90.0;
        }
        if (franja2.getSelectedItem()=="Negro")
        {
            valor2=0.0;
        }
        if (franja2.getSelectedItem()=="Marron")
        {
            valor2=1.0;
        }
        if (franja2.getSelectedItem()=="Rojo")
        {
            valor2=2.0;
        }
        if (franja2.getSelectedItem()=="Naranja")
        {
            valor2=3.0;
        }
        if (franja2.getSelectedItem()=="Amarillo")
        {
            valor2=4.0;
        }
        if (franja2.getSelectedItem()=="Verde")
        {
            valor2=5.0;
        }
        if (franja2.getSelectedItem()=="Azul")
        {
            valor2=6.0;
        }
        if (franja2.getSelectedItem()=="Violeta")
        {
            valor2=7.0;
        }
        if (franja2.getSelectedItem()=="Gris")
        {
           valor2=8.0;
        }
        if (franja2.getSelectedItem()=="Blanco")
        {
            valor2=9.0;
        }
        if (franja3.getSelectedItem()=="Negro")
        {
           valor3=1.0;
        }
        if (franja3.getSelectedItem()=="Marron")
        {
            valor3=10.0;
        }
        if (franja3.getSelectedItem()=="Rojo")
        {
            valor3=100.0;
        }
        if (franja3.getSelectedItem()=="Naranja")
        {
           valor3=1.0;
            magnitud="k";
        }
        if (franja3.getSelectedItem()=="Amarillo")
        {
            valor3=10.0;
            magnitud="k";
        }
        if (franja3.getSelectedItem()=="Verde")
        {
            valor3=100.0;
            magnitud="k";
        }
        if (franja3.getSelectedItem()=="Azul")
        {
            valor3=1.0;
            magnitud="M";
        }
        if (franja3.getSelectedItem()=="Violeta")
        {
            valor3=10.0;
            magnitud="M";
        }
        if (franja3.getSelectedItem()=="Gris")
        {
            valor3=100.0;
            magnitud="M";
        }
        if (franja3.getSelectedItem()=="Blanco")
        {
           valor3=1.0;
            magnitud="G";
        }
        if (franja3.getSelectedItem()=="Oro")
        {
            valor1=0.1;
        }
        if (franja3.getSelectedItem()=="Plata")
        {
            valor3=0.01;           
        }
        if (franja4.getSelectedItem()=="Marron")
        {
            valor4=1.0;
        }
        if (franja4.getSelectedItem()=="Rojo")
        {
            valor4=2.0;
        }
        if (franja4.getSelectedItem()=="Naranja")
        {
           valor4=0.05;
          
        }
        if (franja4.getSelectedItem()=="Amarillo")
        {
            valor4=0.02;
            
        }
        if (franja4.getSelectedItem()=="Verde")
        {
            valor4=0.5;
            
        }
        if (franja4.getSelectedItem()=="Azul")
        {
            valor4=0.25;
           
        }
        if (franja4.getSelectedItem()=="Violeta")
        {
            valor4=0.1;
           
        }
        if (franja4.getSelectedItem()=="Gris")
        {
            valor4=0.01;
           
        }
        
        if (franja3.getSelectedItem()=="Oro")
        {
            valor1=5.0;
        }
        if (franja3.getSelectedItem()=="Plata")
        {
            valor3=10.0;           
        }
        if (franja4.getSelectedItem()=="Ninguno")
        {
           valor4=20.0;
            
        }
        valortotal=(valor1+valor2)*valor3;
        valor_resistencia.setText(valortotal+magnitud+"Ω +-"+valor4+"%");
    }//GEN-LAST:event_calculaloActionPerformed

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
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculalo;
    private javax.swing.JComboBox<String> franja1;
    private javax.swing.JComboBox<String> franja2;
    private javax.swing.JComboBox<String> franja3;
    private javax.swing.JComboBox<String> franja4;
    private javax.swing.JTextField valor_resistencia;
    // End of variables declaration//GEN-END:variables
}
