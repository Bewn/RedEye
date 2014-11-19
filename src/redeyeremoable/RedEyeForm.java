
package redeyeremoable;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class RedEyeForm extends javax.swing.JFrame {

    
    final int LW = 8;
    JLabel [][] grid = new JLabel[LW][LW];
    JLabel [][] temp = new JLabel[LW][LW];
    
    int [][] red = new int[LW][LW];
    int [][] green = new int[LW][LW];
    int [][] blue = new int[LW][LW];
    
    Color rgb;
    Random gen = new Random();
   
    public RedEyeForm() {
        initComponents();
        
        for(int r = 0; r < LW; r++){
            
            for(int c = 0; c < LW; c++){
                
                red[r][c] = gen.nextInt(256);
                green[r][c] = gen.nextInt(256);
                blue[r][c] = gen.nextInt(256);
            
                grid[r][c] = new JLabel();
                temp[r][c] = new JLabel();
                grid[r][c].setText("");
                grid[r][c].setOpaque(true);
                
                
                
                rgb = new Color(red[r][c],green[r][c],blue[r][c]);
                grid[r][c].setBackground(rgb);
                
                
                this.getContentPane().add(grid[r][c]);
                grid[r][c].setBounds(25 + (c*60), 25 + (r*60), 50, 50);
                grid[r][c].setBorder(new LineBorder(Color.BLACK,1));
                grid[r][c].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            }
        }
        
    }

    public void paintScreen(){
        
    }
    
    public void removeRed(){
        
        for(int r = 0; r < LW; r++){
            for(int c = 0; c < LW; c++){
                if(red[r][c] != 0){
                    System.out.println("Pre: "+red[r][c]);
                    red[r][c] = 0;
                    rgb = new Color(red[r][c],green[r][c],blue[r][c]); // reccreates the colour, less the red.
                    grid[r][c].setBackground(rgb);
                    System.out.println("Post: "+red[r][c]);
                    
                }
            }   
        }
            
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        remove.setText("Change Things");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(remove)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(remove)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        removeRed();
        System.out.println("WORK");
    }//GEN-LAST:event_removeActionPerformed

   
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
            java.util.logging.Logger.getLogger(RedEyeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedEyeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedEyeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedEyeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedEyeForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}
