/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocalRent;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author sk995
 */
public class House extends JFrame {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form House
     */
    public House() {
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

        housePanel = new JPanel();
        backToHome = new JLabel();
        houseClose = new JButton();
        addPanel = new JPanel();
        addButton = new JButton();
        roomButton = new JButton();
        delete = new JButton();
        houseLabel = new JLabel();
        showPanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        houseTable = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        housePanel.setBackground(new Color(51, 102, 255));

        backToHome.setFont(new Font("Comic Sans MS", 1, 14)); // NOI18N
        backToHome.setForeground(new Color(255, 153, 153));
        backToHome.setText("Local Rent");
        backToHome.setToolTipText("back to home");
        backToHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backToHome.setIcon(new ImageIcon("image\\home-icon-silhouette.png"));
        backToHome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                backToHomeMouseClicked(evt);
            }
        });

        houseClose.setBackground(new Color(255, 0, 0));
        houseClose.setFont(new Font("Comic Sans MS", 1, 18)); // NOI18N
        houseClose.setForeground(new Color(255, 255, 255));
        houseClose.setText("X");
        houseClose.setToolTipText("close");
        houseClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                houseCloseActionPerformed(evt);
            }
        });

        addPanel.setBackground(new Color(255, 255, 255));

        addButton.setBackground(new Color(51, 255, 51));
        addButton.setFont(new Font("Comic Sans MS", 1, 15)); // NOI18N
        addButton.setForeground(new Color(255, 255, 255));
        addButton.setText("Add New");
        addButton.setToolTipText("add new house");
        addButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addButton.setIcon(new ImageIcon("image\\plus.png"));
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        roomButton.setBackground(new Color(102, 0, 0));
        roomButton.setFont(new Font("Comic Sans MS", 1, 15)); // NOI18N
        roomButton.setForeground(new Color(255, 255, 255));
        roomButton.setText("Room");
        roomButton.setToolTipText("show all house details");
        roomButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        roomButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        roomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                roomButtonActionPerformed(evt);
            }
        });

        delete.setBackground(new Color(255, 0, 0));
        delete.setFont(new Font("Comic Sans MS", 1, 16)); // NOI18N
        delete.setForeground(new Color(255, 255, 255));
        delete.setText("Delete");
        delete.setToolTipText("delete house");
        delete.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        delete.setCursor(new Cursor(Cursor.HAND_CURSOR));
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        GroupLayout addPanelLayout = new GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomButton, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(delete, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(roomButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        houseLabel.setFont(new Font("Comic Sans MS", 3, 24)); // NOI18N
        houseLabel.setForeground(new Color(255, 255, 255));
        houseLabel.setText("Houses");
        houseLabel.setIcon(new ImageIcon("image\\house1.png"));

        showPanel.setBackground(new Color(255, 255, 255));

        houseTable.setAutoCreateRowSorter(true);
        houseTable.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        houseTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.No.", "House Id", "Total Rooms", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        houseTable.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(houseTable);

        GroupLayout showPanelLayout = new GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, showPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE))
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, showPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout housePanelLayout = new GroupLayout(housePanel);
        housePanel.setLayout(housePanelLayout);
        housePanelLayout.setHorizontalGroup(
            housePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGroup(housePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(houseLabel)
                    .addComponent(backToHome))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(houseClose))
            .addGroup(housePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(housePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(showPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        housePanelLayout.setVerticalGroup(
            housePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGroup(housePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(backToHome)
                    .addComponent(houseClose, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(houseLabel)
                .addGap(33, 33, 33)
                .addComponent(addPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(showPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(housePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(housePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomButtonActionPerformed(ActionEvent evt) {
        Room room = new Room();
        room.setVisible(true);
        room.pack();
        room.setLocationRelativeTo(null);
        room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_roomButtonActionPerformed

    private void houseCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_houseCloseActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_houseCloseActionPerformed


    private void backToHomeMouseClicked(MouseEvent evt) {//GEN-FIRST:event_backToHomeMouseClicked
        try{
            stmt = conn.createStatement();
            String sql1 = "Select sum(vacantRoom)from house" ;
            String sql = "Select Distinct(tenantId),outstandingAmount from tenant";
            Home hom =new Home();
            rs = stmt.executeQuery(sql);
            int sum =0;
            while(rs.next()){
                sum += rs.getInt("outstandingAmount");
            }
            hom.outstandingAmount.setText(Integer.toString(sum));
            rs = stmt.executeQuery(sql1);
            while(rs.next()) {
                hom.setVisible(true);
                hom.pack();
                hom.setLocationRelativeTo(null);
                hom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                hom.vacantRooms.setText(Integer.toString(rs.getInt("sum(vacantRoom)")));
            }
            this.dispose();
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_backToHomeMouseClicked

    private void addButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        HRegister hreg=new HRegister();
        hreg.setVisible(true);
        hreg.pack();
        hreg.setLocationRelativeTo(null);
        hreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new House().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton addButton;
    private JPanel addPanel;
    private JLabel backToHome;
    private JButton delete;
    private JButton houseClose;
    private JLabel houseLabel;
    private JPanel housePanel;
    public JTable houseTable;
    private JScrollPane jScrollPane1;
    private JButton roomButton;
    private JPanel showPanel;
    // End of variables declaration//GEN-END:variables
}