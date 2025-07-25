/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/
public class Loading2 extends javax.swing.JFrame {

    
    public Loading2() {
        initComponents(); Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        jProgressBar1.setValue(i);
                        Thread.sleep(50);
                        if(jProgressBar1.getString().equals("100%"))
                            new SignIn().setVisible(true);
                        if(jProgressBar1.getString().equals("50%")){
                            jLabel.setText("Loading Modules.....");
                            
                        }
                        if(jProgressBar1.getString().equals("25%")){
                            jLabel.setText("Connecting Database....");
                            
                            }
                        if(jProgressBar1.getString().equals("95%"))
                            jLabel.setText("Launching Aplication....");
                    } catch (InterruptedException ex) {

                    }
                }
            }
        });
        t.start();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Picsart_23-10-30_17-47-04-022.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, -1));

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 153));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 153));
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 650, 16));
        jPanel1.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 247, 22));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading2().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    
}
