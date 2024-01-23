package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ApplicantMenu.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The ApplicantMenu class is responsible of displaying the Menu for the Applicant.
 * The Applicant has given an option to view aid disbursements from the Organization. 
 */
public class ApplicantMenu extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES 
    private static HELPAid HELPAid;
    private static User currentUser;
    
    /**
     * ApplicantMenu Form
     * Default Constructor of ApplicantMenu to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     */
    public ApplicantMenu(HELPAid HELPAid, User currentUser) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();

        // Update the Label and get the Applicant name who's currently loggied in to the system
        UptLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppMenuMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        LogOutAppBTN = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        LogAsAppLabel = new javax.swing.JLabel();
        AppSysLabel = new javax.swing.JLabel();
        ViewAidBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AppMenuMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        LogOutAppBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogOutAppBTN.setText("Log Out");
        LogOutAppBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutAppBTNActionPerformed(evt);
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
                .addComponent(LogOutAppBTN)
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
                .addComponent(LogOutAppBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        welcomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel.setText("Welcome,");

        LogAsAppLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogAsAppLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogAsAppLabel.setText("Login as");

        AppSysLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        AppSysLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppSysLabel.setText("Applicant System");

        ViewAidBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewAidBtn.setText("View Aid Disbursement");
        ViewAidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAidBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppMenuMainPanelLayout = new javax.swing.GroupLayout(AppMenuMainPanel);
        AppMenuMainPanel.setLayout(AppMenuMainPanelLayout);
        AppMenuMainPanelLayout.setHorizontalGroup(
            AppMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AppMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(AppMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogAsAppLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(AppMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ViewAidBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(AppSysLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        AppMenuMainPanelLayout.setVerticalGroup(
            AppMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                .addGroup(AppMenuMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AppMenuMainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogAsAppLabel)))
                .addGap(18, 18, 18)
                .addComponent(AppSysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(ViewAidBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppMenuMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppMenuMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the Log out button
     * Where the Applicant wants to log out from the Applicant system
     * @param evt
     */
    private void LogOutAppBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutAppBTNActionPerformed
        // Display the following message once the Applicant clicked the log out button
        JOptionPane.showMessageDialog(this, "Logging out from Applicant System..");
        // Redirect te Applicant to the ApplicantEnterController frame
        // Set its visibility to true and dispose the previous frame
        ApplicantEnterController AppEnterCtrl = new ApplicantEnterController(HELPAid);
        AppEnterCtrl.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutAppBTNActionPerformed

    /**
     * The method below is used to add an event to the View Aids Button
     * Where the Applicant wants to view given disbursements from the Organization
     * @param evt
     */
    private void ViewAidBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAidBtnActionPerformed
       // apply down-cast and get the dctApplicant from the currentUser var
       Applicant dctApplicant = (Applicant) currentUser;
       // Check if there aren't any given disbursements 
       if(!(HELPAid.isDisbursementExist(dctApplicant, dctApplicant.getIDNo()))){
           // Display the following message if there aren't any disbursements to the specified Applicant
           JOptionPane.showMessageDialog(this, "There aren't any given disbursement for Applicant " + dctApplicant.getFullName() + ".");           
       }
       // If there are any available disbursements to the Applicant
       else {
           // Redirect the Applicant to the View Disbursements frame
           // Set its visibility to true and dispose the previous frame
           ViewDisbursements AppViewDis = new ViewDisbursements(HELPAid, currentUser);
           AppViewDis.setVisible(true);
           dispose();
       }
    }//GEN-LAST:event_ViewAidBtnActionPerformed
    
    /**
     * The method below is used to set and update the Applicant label to get the Applicant's full name
     * Non-returnable function, no parameters required
     */
    private void UptLabel(){
        LogAsAppLabel.setText("Login as " + ((Applicant) currentUser).getFullName());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppMenuMainPanel;
    private javax.swing.JLabel AppSysLabel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LogAsAppLabel;
    private javax.swing.JButton LogOutAppBTN;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton ViewAidBtn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
