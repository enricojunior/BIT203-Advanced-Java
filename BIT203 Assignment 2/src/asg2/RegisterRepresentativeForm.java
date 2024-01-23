package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RegisterRepresentativeForm.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The RegisterRepresentativeForm class is responsible of displaying the Representative Registration Form.
 * After the HELPAid Admin selects the Organization by its ID. 
 * The HELPAid Admin fills all of the required fields in the Representative Registration Form.
 */
public class RegisterRepresentativeForm extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private Organization dctOrg;

    /**
     * RegisterRepresentativeForm Form
     * Default Constructor of RegisterRepresentativeForm to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param dctOrg - Organization
     */
    public RegisterRepresentativeForm(HELPAid HELPAid, Organization dctOrg) {
        this.HELPAid = HELPAid;
        this.dctOrg = dctOrg;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();

        // Set and update the organization label according to the HELPAid Admin's selection
        setOrgNameField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterRepMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegNewRepLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        MobileNumLabel = new javax.swing.JLabel();
        MobileNumText = new javax.swing.JTextField();
        JobTitleLabel = new javax.swing.JLabel();
        JobTitleText = new javax.swing.JTextField();
        ProceedBtn = new javax.swing.JButton();
        OrganizationLabel = new javax.swing.JLabel();
        orgNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RegisterRepMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

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
        );
        SideLeftPanelLayout.setVerticalGroup(
            SideLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideLeftPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HELPAidLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        RegNewRepLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegNewRepLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegNewRepLabel.setText("Register New Representative");

        fullNameLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        fullNameLabel.setText("Full Name");

        EmailLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        EmailLabel.setText("Email");

        MobileNumLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        MobileNumLabel.setText("Mobile Number (eg: 6299358)");

        JobTitleLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JobTitleLabel.setText("Job Title");

        ProceedBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProceedBtn.setText("Proceed");
        ProceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedBtnActionPerformed(evt);
            }
        });

        OrganizationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OrganizationLabel.setText("Organization");

        orgNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        orgNameLabel.setText("<Org Name>");

        javax.swing.GroupLayout RegisterRepMainPanelLayout = new javax.swing.GroupLayout(RegisterRepMainPanel);
        RegisterRepMainPanel.setLayout(RegisterRepMainPanelLayout);
        RegisterRepMainPanelLayout.setHorizontalGroup(
            RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                        .addGroup(RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MobileNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JobTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JobTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MobileNumLabel)))
                            .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrganizationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegNewRepLabel)
                                    .addComponent(orgNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );
        RegisterRepMainPanelLayout.setVerticalGroup(
            RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                .addGroup(RegisterRepMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterRepMainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(OrganizationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orgNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(RegNewRepLabel)
                .addGap(18, 18, 18)
                .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MobileNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MobileNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JobTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterRepMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterRepMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the proceed button
     * Where the HELPAid Admin proceeds to register a new Representative
     * @param evt
     */
    private void ProceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedBtnActionPerformed
        // List of the required attributes
        String regFullName, regEmail, regJobTitle;
        int regPhoneNum;
        // apply try-catch clause
        try {
            // Get each attributes for the Representative from the JTextField components
            regFullName = fullNameText.getText();
            regEmail = EmailText.getText();
            regPhoneNum = Integer.parseInt(MobileNumText.getText());
            regJobTitle = JobTitleText.getText();
            // Check if the one of the required fields remains empty blank while registering a new Representative
            if(fullNameText.getText().isEmpty() || EmailText.getText().isEmpty() ||
                MobileNumText.getText().isEmpty() || JobTitleText.getText().isEmpty()){
                // It will display the following message if one of the text field remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check if the user data has already been taken
            else if(HELPAid.isUserTaken(regFullName, regEmail, regPhoneNum)){
                // Display the following message if the User data has already been taken in the system
                JOptionPane.showMessageDialog(this, "This data has already been taken!");
                // clear the form fields
                clearFields();
            }
            // Check if the HELPAid Admin's data input is valid 
            else {
                // Create a new Representative object with the required parameters
                OrganizationRep newOrgRep = new OrganizationRep(regFullName, regEmail, regPhoneNum, regJobTitle, dctOrg);
                // Check if the system detects duplicate username
                if(HELPAid.DuplicateUName(newOrgRep.getUsername())){
                    // Display the following message if there's a duplicate username found in the system
                    JOptionPane.showMessageDialog(this, "Duplicate Username Detected in the system!");
                    // clear the form fields
                    clearFields();
                    // Return back to the HELPAid Admin Menu Panel and destroy the created object
                    // Set its visibility to true and dispose the previous frame
                    HELPAidAdminMenu mainPanel = new HELPAidAdminMenu(HELPAid);
                    mainPanel.setVisible(true);
                    dispose();
                }
                // Check if the system did not find any duplicte username
                else {
                    // It will display the following message if the Representative has been successfully registered to the system 
                    JOptionPane.showMessageDialog(this, "Successfully registered a new Organization Representative.\nGenerated Username: " 
                            + newOrgRep.getUsername() + "\nGenerated Password: " + newOrgRep.getPassword());
                    // Add the registered Representative to the HELPAid object
                    HELPAid.addUser(newOrgRep);
                    // showConfirmDialog to check whether the HELPAid Admin wants to add another Representative or not
                    int UserChoice = JOptionPane.showConfirmDialog(this, "Would you like to add another Representative?", 
                                "Confirm Add Another Representative", JOptionPane.YES_NO_OPTION);
                    // Check if the HELPAid Admin selects the yes option
                    if(UserChoice == JOptionPane.YES_OPTION){
                        // Redirect the HELPAid Admin back to the Representative Registration Form
                        // set its visibility to true and dispose the previous frame
                        RegisterRepresentativeForm newRegForm = new RegisterRepresentativeForm(HELPAid, dctOrg);
                        newRegForm.setVisible(true);
                        dispose();
                    }
                    // Check if the HELPAid Admin selects the no option
                    else {
                        // Redirect teh HELPAid Admin back to the HELPAid Admin System
                        // set its visibility to true and dispose the previous frame
                        HELPAidAdminMenu mainPanel = new HELPAidAdminMenu(HELPAid);
                        mainPanel.setVisible(true);
                        dispose();
                    }
                }
            }
        }
        catch(NumberFormatException e){
            // catch an exception if the HELPAid Admin enters invalid data type for the phone number
            JOptionPane.showMessageDialog(this, "Invalid Phone Number Detected!");
            e.printStackTrace();
        } 
    }//GEN-LAST:event_ProceedBtnActionPerformed
    
    /**
     * This method below is used to set all of the data fields to an empty string
     * Non-returnable method - clearFields();
     */  
    public void clearFields(){
        fullNameText.setText("");
        EmailText.setText("");
        MobileNumText.setText("");
        JobTitleText.setText("");
    }
    
    /**
     * This method below is used to set and update the Organization name's label,
     * update and display the organization name according to the Admin selection.
     * Non-returnable method - setOrgNameField();
     */
    private void setOrgNameField(){
        orgNameLabel.setText(dctOrg.getOrgName());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel JobTitleLabel;
    private javax.swing.JTextField JobTitleText;
    private javax.swing.JLabel MobileNumLabel;
    private javax.swing.JTextField MobileNumText;
    private javax.swing.JLabel OrganizationLabel;
    private javax.swing.JButton ProceedBtn;
    private javax.swing.JLabel RegNewRepLabel;
    private javax.swing.JPanel RegisterRepMainPanel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JLabel orgNameLabel;
    // End of variables declaration//GEN-END:variables
}
