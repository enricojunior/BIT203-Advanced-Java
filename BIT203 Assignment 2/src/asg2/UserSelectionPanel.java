package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * UserSelectionPanel.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED ATTRIBUTES
import javax.swing.JOptionPane;

/**
 * The UserSelectionPanel class is responsible of displaying the Selection User Panel
 * After the User chooses to view registered Users from the HELPAidGUI Panel.
 * The User has given two options, whether to select Representative or Applicant.
 */
public class UserSelectionPanel extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;

    /**
     * UserSelectionPanel Form
     * Default Constructor of UserSelectionPanel to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public UserSelectionPanel(HELPAid HELPAid) {
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

        UserSelectionMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        orgRepresentativeBtn = new javax.swing.JButton();
        aidApplicantBtn = new javax.swing.JButton();
        userSelectionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        UserSelectionMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        BackButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
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
                .addComponent(BackButton)
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
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        orgRepresentativeBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        orgRepresentativeBtn.setText("Organization Representative");
        orgRepresentativeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgRepresentativeBtnActionPerformed(evt);
            }
        });

        aidApplicantBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        aidApplicantBtn.setText("HELP Aid Applicant");
        aidApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidApplicantBtnActionPerformed(evt);
            }
        });

        userSelectionLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        userSelectionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userSelectionLabel.setText("Select the User Type");

        javax.swing.GroupLayout UserSelectionMainPanelLayout = new javax.swing.GroupLayout(UserSelectionMainPanel);
        UserSelectionMainPanel.setLayout(UserSelectionMainPanelLayout);
        UserSelectionMainPanelLayout.setHorizontalGroup(
            UserSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserSelectionMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(UserSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UserSelectionMainPanelLayout.createSequentialGroup()
                        .addGap(37, 250, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UserSelectionMainPanelLayout.createSequentialGroup()
                        .addGroup(UserSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UserSelectionMainPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(userSelectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UserSelectionMainPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(UserSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgRepresentativeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aidApplicantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        UserSelectionMainPanelLayout.setVerticalGroup(
            UserSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserSelectionMainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(UserSelectionMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(userSelectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(orgRepresentativeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(aidApplicantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserSelectionMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserSelectionMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the User wants to return back to the HELPAidGUI Panel
     * @param evt
     */
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Redirect the User to the HELPAidGUI Panel
        // set its visibility to true and dispose the previous frame
        HELPAidGUI HELPMainWindow = new HELPAidGUI();
        HELPMainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * The method below is used to add an event to the Representative button
     * Where the User wants to view registered Representatives from various Organizations
     * @param evt
     */
    private void orgRepresentativeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgRepresentativeBtnActionPerformed
        // Check if there aren't any registered Representatives in the HELPAid object
        if(HELPAid.getOrgRepList().isEmpty()){
            // Display the following message, if there aren't any registered Representative in the system
            JOptionPane.showMessageDialog(this, "There aren't any registered Representatives in the system.");
        } 
        // Check if there any available registered Representative in the HELPAid object
        else {
            // Redirect the User to the ViewRegisteredRepresentatives Panel
            // Set its visibility to true and dispose the previous frame
            ViewRegisteredRepresentatives viewRegReps = new ViewRegisteredRepresentatives(HELPAid);
            viewRegReps.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_orgRepresentativeBtnActionPerformed

    /**
     * The method below is used to add an event to the Applicant button
     * Where the User wants to view registered Applicants from various Organizations
     * @param evt
     */
    private void aidApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidApplicantBtnActionPerformed
        // Check if there aren't any registered Applicants in the HELPAid object
        if(HELPAid.getApplicantList().isEmpty()){
            // Display the following message, if there aren't any registered Applicants in the system
            JOptionPane.showMessageDialog(this, "There aren't any registered Applicants in the system.");
        } 
        // Check if there any available registered Applicant in the HELPAid object
        else {
            // Redirect the User to the ViewRegisteredApplicants Panel
            // Set its visibility to true and dispose the previous frame 
            ViewRegisteredApplicants viewRegApps = new ViewRegisteredApplicants(HELPAid);
            viewRegApps.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_aidApplicantBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JPanel UserSelectionMainPanel;
    private javax.swing.JButton aidApplicantBtn;
    private javax.swing.JButton orgRepresentativeBtn;
    private javax.swing.JLabel userSelectionLabel;
    // End of variables declaration//GEN-END:variables
}