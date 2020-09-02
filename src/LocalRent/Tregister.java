/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocalRent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sumit
 */
public class Tregister extends JFrame {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form Tregister
     */
    public Tregister() {
        super("Tenant Register");
        initComponents();
        conn = RentDatabase.connectDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        tenantRegisterPanel = new JPanel();
        whitePanel = new JPanel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel9 = new JLabel();
        jLabel1 = new JLabel();
        jLabel8 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        tenantName = new JTextField();
        aadharId = new JTextField();
        mobile = new JTextField();
        email = new JTextField();
        tRegisterClose = new JButton();
        addTenantButton = new JButton();
        numberOfRooms = new JTextField();
        roomId = new JTextField();
        numberOfMembers = new JTextField();
        tregDate = new JTextField();
        jLabel3 = new JLabel();
        advance1 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tenantRegisterPanel.setBackground(new Color(0, 204, 204));

        whitePanel.setBackground(new Color(255, 255, 255));

        jLabel2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel4.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Aadhar Id");

        jLabel5.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mobile Number");

        jLabel6.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Registration Date");

        jLabel9.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Number of Members");

        jLabel1.setFont(new Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(SwingConstants.TRAILING);
        jLabel1.setText("Tenant Details");
        jLabel1.setHorizontalTextPosition(SwingConstants.LEFT);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(SwingConstants.TOP);

        jLabel8.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Number of Rooms");

        jLabel10.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Advance");

        jLabel11.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Room Id");

        GroupLayout whitePanelLayout = new GroupLayout(whitePanel);
        whitePanel.setLayout(whitePanelLayout);
        whitePanelLayout.setHorizontalGroup(
            whitePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, whitePanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(whitePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        whitePanelLayout.setVerticalGroup(
            whitePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tRegisterClose.setBackground(new Color(255, 0, 0));
        tRegisterClose.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        tRegisterClose.setForeground(new Color(255, 255, 255));
        tRegisterClose.setText("X");
        tRegisterClose.setToolTipText("close");
        tRegisterClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tRegisterCloseActionPerformed(evt);
            }
        });

        addTenantButton.setBackground(new Color(204, 255, 255));
        addTenantButton.setFont(new Font("Comic Sans MS", 1, 18)); // NOI18N
        addTenantButton.setForeground(new Color(0, 153, 153));
        addTenantButton.setText("Add Tenant");
        addTenantButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addTenantButton.setIcon(new ImageIcon("image\\plus.png"));
        addTenantButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addTenantButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("( YYYY-MM-DD )");

        GroupLayout tenantRegisterPanelLayout = new GroupLayout(tenantRegisterPanel);
        tenantRegisterPanel.setLayout(tenantRegisterPanelLayout);
        tenantRegisterPanelLayout.setHorizontalGroup(
            tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(whitePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, tenantRegisterPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tRegisterClose))
                    .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                                .addComponent(tregDate, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(email, GroupLayout.Alignment.LEADING)
                                .addComponent(mobile, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addComponent(tenantName, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(aadharId, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfRooms, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfMembers, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomId, GroupLayout.Alignment.LEADING))
                            .addComponent(advance1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(addTenantButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tenantRegisterPanelLayout.setVerticalGroup(
            tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                .addGroup(tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(whitePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(tenantRegisterPanelLayout.createSequentialGroup()
                        .addComponent(tRegisterClose, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tenantName, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aadharId, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobile, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(tenantRegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tregDate, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addComponent(numberOfMembers, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numberOfRooms, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(advance1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomId, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(addTenantButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(tenantRegisterPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tenantRegisterPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tRegisterCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tRegisterCloseActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_tRegisterCloseActionPerformed

    private void addTenantButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addTenantButtonActionPerformed
        
    try{
             stmt = conn.createStatement();
             String regName = tenantName.getText();
             String regDate = tregDate.getText();
             String mobileno = mobile.getText();
             String aadhar   = aadharId.getText();
             String member = numberOfMembers.getText();
             String rooms = numberOfRooms.getText();
             String rId = roomId.getText();
             String em = email.getText();
             String advance = advance1.getText();
                  if(rId.contains(","))
                   rId = rId.replace(',',' ');
                  String[] arr = rId.split("\\s");
                  for(int i=0;i<arr.length;i++) {
                      String sql = "insert into tenant(tenantId,name,mobile,email,regDate,noOfMembers,noOfRooms,advance,roomId)values('" + aadhar + "','" + regName + "','" + mobileno + "','" + em + "','" + regDate + "','" + member + "','" + rooms + "','" + advance + "','"+arr[i]+
                      "')";
                      stmt.executeUpdate(sql);
                  }
             JOptionPane.showMessageDialog(null,"Tenant Registered Successfully");
             this.dispose();

         }catch(HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null, e);
                                                            
         }// TODO add your handling code here:
    }//GEN-LAST:event_addTenantButtonActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField aadharId;
    private JButton addTenantButton;
    private JTextField advance1;
    private JTextField email;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JTextField mobile;
    private JTextField numberOfMembers;
    private JTextField numberOfRooms;
    private JTextField roomId;
    private JButton tRegisterClose;
    private JTextField tenantName;
    private JPanel tenantRegisterPanel;
    private JTextField tregDate;
    private JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
}