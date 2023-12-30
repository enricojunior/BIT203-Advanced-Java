package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * DonorMenu.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The DonorMenu class is responsible of displaying the Menu for the Donor.
 * The Donor has given the options to view current appeals, past appeals, and record contribution.
 */
public class DonorMenu extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;

    /**
     * DonorMenu Form
     * Default Constructor of DonorMenu to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public DonorMenu(HELPAid HELPAid) {
        this.HELPAid = HELPAid;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DonorMenuMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        LogOutDonorBTN = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        welcomeDonorLabel = new javax.swing.JLabel();
        LogAsDonorLbl = new javax.swing.JLabel();
        DonorSysLabel = new javax.swing.JLabel();
        ViewCrAppealsBtn = new javax.swing.JButton();
        ViewPstAppealsBtn = new javax.swing.JButton();
        DnrContributeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DonorMenuMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        LogOutDonorBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogOutDonorBTN.setText("Log Out");
        LogOutDonorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutDonorBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideLeftPanelLayout = new javax.swing.GroupLayout(SideLeftPanel);
        SideLeftPanel.setLayout(SideLeftPanelLayout);
        SideLeftPanelLayout.setHorizontalGroup(
            SideLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideLeftPanelLayout.createSequentialGroup()
                .addGroup(SideLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HELPAidLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SideLeftPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(HELPAidLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(SideLeftPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LogOutDonorBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideLeftPanelLayout.setVerticalGroup(
            SideLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideLeftPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HELPAidLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(LogOutDonorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        welcomeDonorLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcomeDonorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeDonorLabel.setText("Welcome,");

        LogAsDonorLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogAsDonorLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogAsDonorLbl.setText("Login as Donor");

        DonorSysLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        DonorSysLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DonorSysLabel.setText("Donor System");

        ViewCrAppealsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewCrAppealsBtn.setText("View Current Appeals");
        ViewCrAppealsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCrAppealsBtnActionPerformed(evt);
            }
        });

        ViewPstAppealsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewPstAppealsBtn.setText("View Past Appeals");
        ViewPstAppealsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPstAppealsBtnActionPerformed(evt);
            }
        });

        DnrContributeBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DnrContributeBtn.setText("Self-Record Contribution");
        DnrContributeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DnrContributeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DonorMenuMainPanelLayout = new javax.swing.GroupLayout(DonorMenuMainPanel);
        DonorMenuMainPanel.setLayout(DonorMenuMainPanelLayout);
        DonorMenuMainPanelLayout.setHorizontalGroup(
            DonorMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DonorMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(DonorMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeDonorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogAsDonorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(DonorMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ViewCrAppealsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(DonorSysLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewPstAppealsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(DnrContributeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DonorMenuMainPanelLayout.setVerticalGroup(
            DonorMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                .addGroup(DonorMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DonorMenuMainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(welcomeDonorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogAsDonorLbl)))
                .addGap(18, 18, 18)
                .addComponent(DonorSysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewCrAppealsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ViewPstAppealsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(DnrContributeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DonorMenuMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DonorMenuMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method below is used to add an event to the Log out button
     * Where the Donor wants to log out from the Donor system
     * @param evt
     */
    private void LogOutDonorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutDonorBTNActionPerformed
        // Display the following message once the Donor clicked the log out button
        JOptionPane.showMessageDialog(null, "Logging out from Donor System..");
        // Redirect the Donor to the HELPAidGUI Panel
        // set its visibility to true and dispose the previous frame
        HELPAidGUI HELPMainWindow = new HELPAidGUI();
        HELPMainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutDonorBTNActionPerformed

    /**
     * This method below is used to add an event to the View Current Appeals button
     * Where the Donor wants to view current appeals from every single registered Organizations
     * @param evt
     */
    private void ViewCrAppealsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCrAppealsBtnActionPerformed
        // Check if the current appeals that are stored in the ArrayList remains empty
        if(HELPAid.getCrAppealList().isEmpty()){
            // It will display the following message if there aren't any current appeals made from the organizations
            JOptionPane.showMessageDialog(this, "There aren't any current appeals at the moment.");
        }
        // else stat - check if there are any available current appeals in the ArrayList
        else {
            // Redirect the Donor to the View Current Appeals Panel
            // Set its visbility to true and dispose the previous frame
            ViewCurrentAppeals CrAppealPanel = new ViewCurrentAppeals(HELPAid);
            CrAppealPanel.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ViewCrAppealsBtnActionPerformed

    /**
     * This method below is used to add an event to the View Past Appeals button
     * Where the Donor wants to view past appeals from every single registered Organizations
     * @param evt
     */
    private void ViewPstAppealsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPstAppealsBtnActionPerformed
        // Check if the past appeals that are stored in the ArrayList remains empty
        if(HELPAid.getPstAppealList().isEmpty()){
            // It will display the following message if there aren't any appeals that are set to APPROVED
            JOptionPane.showMessageDialog(this, "There aren't any past appeals at the moment.");
        }
        // else stat - check if there are any available past appeals in the ArrayList
        else {
            // Redirect the Donor to the View Past Appeals Panel
            // set its visibility to true and dispose the previous frame
            ViewPastAppeals PstAppealPanel = new ViewPastAppeals(HELPAid);
            PstAppealPanel.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ViewPstAppealsBtnActionPerformed

    /**
     * This method below is used to add an event to the Record Contribution button
     * Where the Donor wants to record a contribution to the registered Appeals from various Organizations
     * @param evt
     */
    private void DnrContributeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DnrContributeBtnActionPerformed
        // Check if the current appeals that are stored in the ArrayList remains empty 
        if(HELPAid.getCrAppealList().isEmpty()){
            // It will display the following message if there aren't any current appeals made from the organizations
            JOptionPane.showMessageDialog(this, "There aren't any current appeals at the moment.");
        }
        // else stat - check if there are any available current appeals in the ArrayList
        else {
            // Redirect the Donor to the View Current Appeals Panel to record contribution
            // set its visibility to true and dispose the previous frame
            ViewCrAppealsDonor CrAppealPanel = new ViewCrAppealsDonor(HELPAid);
            CrAppealPanel.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_DnrContributeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DnrContributeBtn;
    private javax.swing.JPanel DonorMenuMainPanel;
    private javax.swing.JLabel DonorSysLabel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LogAsDonorLbl;
    private javax.swing.JButton LogOutDonorBTN;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton ViewCrAppealsBtn;
    private javax.swing.JButton ViewPstAppealsBtn;
    private javax.swing.JLabel welcomeDonorLabel;
    // End of variables declaration//GEN-END:variables
}
