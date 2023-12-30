package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ApplicantLoginPanel.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The ApplicantLoginPanel class is responsible of displaying the
 * Login Form for the specified Applicant by inputting valid credentials to the Text fields
 */
public class ApplicantLoginPanel extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    
    /**
     * ApplicantLoginPanel Form
     * Default Constructor of ApplicantLoginPanel to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public ApplicantLoginPanel(HELPAid HELPAid) {
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

        AppLoginPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        backButtonApp = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        LoginDonorLabel = new javax.swing.JLabel();
        AppUsernameLabel = new javax.swing.JLabel();
        AppUsernameField = new javax.swing.JTextField();
        AppPasswordLabel = new javax.swing.JLabel();
        AppPasswordField = new javax.swing.JPasswordField();
        AppLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AppLoginPanel.setBackground(new java.awt.Color(255, 255, 255));

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
        backButtonApp.setPreferredSize(new java.awt.Dimension(80, 30));
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

        LoginDonorLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginDonorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginDonorLabel.setText("Login as Applicant");

        AppUsernameLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        AppUsernameLabel.setText("Username");

        AppPasswordLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        AppPasswordLabel.setText("Password");

        AppLoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AppLoginBtn.setText("Login");
        AppLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppLoginPanelLayout = new javax.swing.GroupLayout(AppLoginPanel);
        AppLoginPanel.setLayout(AppLoginPanelLayout);
        AppLoginPanelLayout.setHorizontalGroup(
            AppLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppLoginPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AppLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppLoginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AppLoginPanelLayout.createSequentialGroup()
                        .addGroup(AppLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AppLoginPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(AppLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AppLoginPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(AppLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AppPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoginDonorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 60, Short.MAX_VALUE))))
        );
        AppLoginPanelLayout.setVerticalGroup(
            AppLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AppLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginDonorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(AppUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(AppPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(AppLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the Login button
     * Where the Applicant wants to login to the Applicant system
     * @param evt
     */
    private void AppLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppLoginBtnActionPerformed
        // Get the credentials from the JTextField components
        String appUsername = AppUsernameField.getText();
        String appPassword = String.valueOf(AppPasswordField.getText());

        // Check if the username or password field remains empty blank
        if(AppUsernameField.getText().isEmpty() || AppPasswordField.getText().isEmpty()){
            // It will display the following message, if one of the credentials remains empty
            JOptionPane.showMessageDialog(this, "Please fill in all of the required fields!");
        } 
        // Check if the system detect the User wants to login is an instance of Applicant
        else if(HELPAid.DetectUserApplicant(appUsername, appPassword)){
            // Display the following message if the Applicant inputted valid credentials
            JOptionPane.showMessageDialog(this, "Successfully login to the system!");
            // dispose the form fields
            clearFormFields();

            // Get the current User from the HELPAid object
            currentUser = HELPAid.getUser(appUsername, appPassword); 
            // Redirect the Applicant to the Applicant Menu
            // Set its visibility to true and dispose the previous frame    
            ApplicantMenu AppMainMenu = new ApplicantMenu(HELPAid, currentUser);
            AppMainMenu.setVisible(true);
            dispose();
        } 
        // Check if the Applicant enters invalid credentials
        else {
            // It will display the following message if the Applicant enters invalid username or password
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            // dispose the form fields
            clearFormFields();
        }
    }//GEN-LAST:event_AppLoginBtnActionPerformed

    /**
     * The method below is used to add an event to the back button
     * Where the Applicant wants to return back to the Enter Controller
     * @param evt
     */
    private void backButtonAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonAppActionPerformed
        // Redirect the Applicant to the Applicant Enter Controller if the Applicant clicked the back button
        ApplicantEnterController AppEnterController = new ApplicantEnterController(HELPAid);
        // Set its visibility to true and dispose the previous frame
        AppEnterController.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonAppActionPerformed
    
    /**
     * The method below is used to set the Username and Password Fields to empty
     * Non-returnable function, no parameters required
     */
    private void clearFormFields(){
        AppUsernameField.setText("");
        AppPasswordField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppLoginBtn;
    private javax.swing.JPanel AppLoginPanel;
    private javax.swing.JPasswordField AppPasswordField;
    private javax.swing.JLabel AppPasswordLabel;
    private javax.swing.JTextField AppUsernameField;
    private javax.swing.JLabel AppUsernameLabel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LoginDonorLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton backButtonApp;
    // End of variables declaration//GEN-END:variables
}
