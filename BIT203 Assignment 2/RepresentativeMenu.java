package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RepresentativeMenu.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The RepresentativeMenu class is responsible of displaying the Menu for the Representative.
 * The Representative has given the options to register new Applicant, organize Aid Appeal,
 * Record Contribution, and Record Aid Disbursement to the specified Applicant.
 */
public class RepresentativeMenu extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    
    /**
     * RepresentativeMenu Form
     * Default Constructor of RepresentativeMenu to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     */
    public RepresentativeMenu(HELPAid HELPAid, User currentUser) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Update the required labels to get the current logged in User and Organizaton Name
        welcomeRepLabel.setText("Welcome, " + ((OrganizationRep) currentUser).getFullName());
        LogAsRepLbl.setText(((OrganizationRep) currentUser).getThisOrg().getOrgName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RepMenuMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        LogOutRepBTN = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        welcomeRepLabel = new javax.swing.JLabel();
        LogAsRepLbl = new javax.swing.JLabel();
        OrgRepSysLabel = new javax.swing.JLabel();
        regApplicantBtn = new javax.swing.JButton();
        organizeAppealBtn = new javax.swing.JButton();
        recordContributionBtn = new javax.swing.JButton();
        recordDisbursementBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RepMenuMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        LogOutRepBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogOutRepBTN.setText("Log Out");
        LogOutRepBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutRepBTNActionPerformed(evt);
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
                .addComponent(LogOutRepBTN)
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
                .addComponent(LogOutRepBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        welcomeRepLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcomeRepLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeRepLabel.setText("Welcome,");

        LogAsRepLbl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogAsRepLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogAsRepLbl.setText("Login as");

        OrgRepSysLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        OrgRepSysLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrgRepSysLabel.setText("Representative System");

        regApplicantBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        regApplicantBtn.setText("Register New Applicant");
        regApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regApplicantBtnActionPerformed(evt);
            }
        });

        organizeAppealBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        organizeAppealBtn.setText("Organize Aid Appeal");
        organizeAppealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizeAppealBtnActionPerformed(evt);
            }
        });

        recordContributionBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        recordContributionBtn.setText("Record Contribution");
        recordContributionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordContributionBtnActionPerformed(evt);
            }
        });

        recordDisbursementBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        recordDisbursementBtn.setText("Record Aid Disbursement");
        recordDisbursementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordDisbursementBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RepMenuMainPanelLayout = new javax.swing.GroupLayout(RepMenuMainPanel);
        RepMenuMainPanel.setLayout(RepMenuMainPanelLayout);
        RepMenuMainPanelLayout.setHorizontalGroup(
            RepMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RepMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(RepMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeRepLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogAsRepLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(RepMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regApplicantBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(OrgRepSysLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(organizeAppealBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(recordContributionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(recordDisbursementBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        RepMenuMainPanelLayout.setVerticalGroup(
            RepMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                .addGroup(RepMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RepMenuMainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(welcomeRepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogAsRepLbl)))
                .addGap(18, 18, 18)
                .addComponent(OrgRepSysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regApplicantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(organizeAppealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(recordContributionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(recordDisbursementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RepMenuMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RepMenuMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the Log out button
     * Where the Representative wants to log out from the Representative system
     * @param evt
     */
    private void LogOutRepBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutRepBTNActionPerformed
        // Display the following message once the Representative clicked the log out button
        JOptionPane.showMessageDialog(this, "Logging out from Organization Representative System..");
        // Redirect the Representative to the HELPAidGUI Panel
        // set its visibility to true and dispose the previous frame
        HELPAidGUI HELPMainWindow = new HELPAidGUI();
        HELPMainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutRepBTNActionPerformed

    /**
     * The method below is used to add an event to the Register Applicant button
     * Where the Representative wants to register new Applicant to the system
     * @param evt
     */
    private void regApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regApplicantBtnActionPerformed
        // Redirect the Representative to the RegisterApplicantForm Panel
        // Set its visibility to true and dispose the previous frame
        RegisterApplicantForm regAppForm = new RegisterApplicantForm(HELPAid, currentUser);
        regAppForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_regApplicantBtnActionPerformed

    /**
     * The method below is used to add an event to the Organize Aid Appeal button
     * Where the Representative wants to record new Aid Appeal
     * @param evt
     */
    private void organizeAppealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizeAppealBtnActionPerformed
        // Redirect the Representative to the RegisterAppealForm Panel
        // Set its visibility to true and dispose the previous frame
        RegisterAppealForm regAppealForm = new RegisterAppealForm(HELPAid, currentUser);
        regAppealForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_organizeAppealBtnActionPerformed

    /**
     * The method below is used to add an event to the Record Contribution button
     * Where the Representative wants to record new contribution 
     * @param evt
     */
    private void recordContributionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordContributionBtnActionPerformed
        // apply down-cast to OrganizationRep
        OrganizationRep sctOrgRep = (OrganizationRep) currentUser;
        // Check if there aren't any current appeals made by specific Organization
        if(HELPAid.getCrAppealByOrg(sctOrgRep.getThisOrg()).isEmpty()){
            // Display the following message if there aren't any registered current Appeal made by the specified Organization
            JOptionPane.showMessageDialog(this, "There aren't any current appeals made by this organization.");
        }
        // If there are any available current appeals made by the organization 
        else {
            // Redirect the Representative to View Current Appeals made by the Organization
            // Set its visibility to true and dispose the previous frame
            ViewCrAppealsByOrgContribution showContributionPanel = new ViewCrAppealsByOrgContribution(HELPAid, currentUser);
            showContributionPanel.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_recordContributionBtnActionPerformed

    /**
     * The method below is used to add an event to the Record Aid Disbursement button
     * Where the Representative wants to record new aid disbursement
     * @param evt
     */
    private void recordDisbursementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordDisbursementBtnActionPerformed
        // apply down-cast to OrganizationRep
        OrganizationRep sctOrgRep = (OrganizationRep) currentUser;
        // Check if there aren't any current appeals made by specific Organization
        if(HELPAid.getCrAppealByOrg(sctOrgRep.getThisOrg()).isEmpty()){
            // Display the following message if there aren't any registered current Appeal made by the specified Organization
            JOptionPane.showMessageDialog(this, "There aren't any current appeals made by this organization.");
        // If there are any available current appeals made by the organization 
        } else {
            // Redirect the Representative to View Current Appeals made by the Organization
            // Set its visibility to true and dispose the previous frame 
            ViewCrAppealsByOrgDisbursement showDisbursementPanel = new ViewCrAppealsByOrgDisbursement(HELPAid, currentUser);
            showDisbursementPanel.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_recordDisbursementBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LogAsRepLbl;
    private javax.swing.JButton LogOutRepBTN;
    private javax.swing.JLabel OrgRepSysLabel;
    private javax.swing.JPanel RepMenuMainPanel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton organizeAppealBtn;
    private javax.swing.JButton recordContributionBtn;
    private javax.swing.JButton recordDisbursementBtn;
    private javax.swing.JButton regApplicantBtn;
    private javax.swing.JLabel welcomeRepLabel;
    // End of variables declaration//GEN-END:variables
}
