package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ApplicantEnterController.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The ApplicantEnterController class is responsible of displaying the 
 * continuous login panel for the Applicant. The Applicant has given options,
 * such as Online self-registration and login as Applicant.
 */
public class ApplicantEnterController extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    
    /**
     * ApplicantEnterController Form 
     * Default Constructor of ApplicantEnterController to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public ApplicantEnterController(HELPAid HELPAid) {
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

        ApplicantConLabel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        backButtonApp = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        ApplicantSysLabelCon = new javax.swing.JLabel();
        SelfRegButton = new javax.swing.JButton();
        LoginApplicantBtn = new javax.swing.JButton();
        SysLoginLabelCons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ApplicantConLabel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        backButtonApp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButtonApp.setText("Back");
        backButtonApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonAppActionPerformed(evt);
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
                .addComponent(backButtonApp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(backButtonApp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        ApplicantSysLabelCon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ApplicantSysLabelCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApplicantSysLabelCon.setText("Continuous Applicant");

        SelfRegButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SelfRegButton.setText("Applicant Self-Registration");
        SelfRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelfRegButtonActionPerformed(evt);
            }
        });

        LoginApplicantBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoginApplicantBtn.setText("Login as Applicant");
        LoginApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginApplicantBtnActionPerformed(evt);
            }
        });

        SysLoginLabelCons.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SysLoginLabelCons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SysLoginLabelCons.setText("Login Panel");

        javax.swing.GroupLayout ApplicantConLabelLayout = new javax.swing.GroupLayout(ApplicantConLabel);
        ApplicantConLabel.setLayout(ApplicantConLabelLayout);
        ApplicantConLabelLayout.setHorizontalGroup(
            ApplicantConLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicantConLabelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ApplicantConLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApplicantConLabelLayout.createSequentialGroup()
                        .addGap(27, 250, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ApplicantConLabelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(ApplicantConLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ApplicantSysLabelCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelfRegButton, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(LoginApplicantBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(SysLoginLabelCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        ApplicantConLabelLayout.setVerticalGroup(
            ApplicantConLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicantConLabelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ApplicantConLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ApplicantSysLabelCon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SysLoginLabelCons)
                .addGap(41, 41, 41)
                .addComponent(SelfRegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(LoginApplicantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApplicantConLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApplicantConLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add event to the self-registration button
     * Where the Applicant wants to register themselves through online
     * @param evt
     */
    private void SelfRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelfRegButtonActionPerformed
        // Check if there aren't any registered organizations in the ArrayList
        if(HELPAid.getOrgList().isEmpty()){
            // It will display the following message if there aren't any registered organizations
            JOptionPane.showMessageDialog(this, "There aren't any registered Organizations in the system.");
        }
        // Check if there are available registered Organizations
        else {
            // It will redirect the Applicant to View Registered Organizations Panel
            // Set its visibility to true and dispose the previous frame
            ViewRegisteredOrgsForApps ViewOrgs = new ViewRegisteredOrgsForApps(HELPAid);
            ViewOrgs.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_SelfRegButtonActionPerformed

    /**
     * The method below is used to add event to the login button
     * Where the Applicant wants to login to the system
     * @param evt
     */
    private void LoginApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginApplicantBtnActionPerformed
        // It will redirect the Applicant to the Login Form
        // Set its visibility to true and dispose the previous frame
        ApplicantLoginPanel appLoginPanel = new ApplicantLoginPanel(HELPAid);
        appLoginPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_LoginApplicantBtnActionPerformed

    /**
     * The method below is used to add event to the back button
     * Where the Applicant wants to return back to the HELPAid System
     * @param evt
     */
    private void backButtonAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonAppActionPerformed
        // Display the HELPAidGUI Panel 
        // Set its visibility to true and dispose the previous frame 
        HELPAidGUI HELPAidGUIPanel = new HELPAidGUI();
        HELPAidGUIPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonAppActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ApplicantConLabel;
    private javax.swing.JLabel ApplicantSysLabelCon;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JButton LoginApplicantBtn;
    private javax.swing.JButton SelfRegButton;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JLabel SysLoginLabelCons;
    private javax.swing.JButton backButtonApp;
    // End of variables declaration//GEN-END:variables
}
