package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RegisterApplicantForm.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The RegisterApplicantForm is responsible of displaying the Applicant's Registration Form
 * for the Organization Representative, if they chooses to Register Aid Applicant.
 */
public class RegisterApplicantForm extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    
    /**
     * RegisterApplicantForm Form
     * Default Constructor of RegisterApplicantForm to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     */
    public RegisterApplicantForm(HELPAid HELPAid, User currentUser) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
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

        RegisterApplicantMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        BackButtonRep = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisterAppLbl = new javax.swing.JLabel();
        ApplicantNameTextField = new javax.swing.JTextField();
        ApplicantNameLbl = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        EmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        MobileNumberLabel = new javax.swing.JLabel();
        MobileNumberTextField = new javax.swing.JTextField();
        ApplicantIDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        IncomeLabel = new javax.swing.JLabel();
        IncomeTextField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        RegisterApplicantMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        BackButtonRep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BackButtonRep.setText("Back");
        BackButtonRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonRepActionPerformed(evt);
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
                .addComponent(BackButtonRep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(BackButtonRep, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        RegisterAppLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisterAppLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterAppLbl.setText("Register New Applicant");

        ApplicantNameLbl.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        ApplicantNameLbl.setText("Full Name");

        SubmitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        EmailLabel.setText("Email");

        MobileNumberLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        MobileNumberLabel.setText("Mobile Number");

        ApplicantIDLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        ApplicantIDLabel.setText("ID Number");

        IncomeLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        IncomeLabel.setText("Income");

        AddressLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        AddressLabel.setText("Address");

        javax.swing.GroupLayout RegisterApplicantMainPanelLayout = new javax.swing.GroupLayout(RegisterApplicantMainPanel);
        RegisterApplicantMainPanel.setLayout(RegisterApplicantMainPanelLayout);
        RegisterApplicantMainPanelLayout.setHorizontalGroup(
            RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterApplicantMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                        .addGroup(RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ApplicantNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ApplicantNameLbl)
                                        .addComponent(RegisterAppLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EmailLabel)
                                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MobileNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                                            .addComponent(ApplicantIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(IncomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(IncomeTextField)))
                                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE))))
        );
        RegisterApplicantMainPanelLayout.setVerticalGroup(
            RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterApplicantMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterAppLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ApplicantNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApplicantNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MobileNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApplicantIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterApplicantMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterApplicantMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterApplicantMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the Representative wants to return back to the Representative Panel
     */
    private void BackButtonRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonRepActionPerformed
        // Redirect the Representative to the Representative Menu
        // set its visibility to true and dispose the previous frame
        RepresentativeMenu OrgRepPanel = new RepresentativeMenu(HELPAid, currentUser);
        OrgRepPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonRepActionPerformed

    /**
     * The method below is used to add an event to the submit button
     * Where the Representative proceeds to register new Applicant to the Organization
     * @param evt
     */
    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // List of the required attributes for the Applicant
        String regFullName, regEmail, regAddress;
        int regIDNo, regMobileNum, Income;
        // apply try-catch clause
        try {
            // Get each attributes for the Applicant from JTextField components
            regFullName = ApplicantNameTextField.getText();
            regEmail = EmailTextField.getText();
            regAddress = AddressTextField.getText();
            regIDNo = Integer.parseInt(IDTextField.getText());
            regMobileNum = Integer.parseInt(MobileNumberTextField.getText());
            Income = Integer.parseInt(IncomeTextField.getText());
            // Check if one of the required fields remains empty blank while registering a new Applicant
            if(ApplicantNameTextField.getText().isEmpty() || EmailTextField.getText().isEmpty() || AddressTextField.getText().isEmpty()
                    || IDTextField.getText().isEmpty() || MobileNumberTextField.getText().isEmpty() || IncomeTextField.getText().isEmpty()){
                // It will display the following message if one of the required fields remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check if the user data has already been taken 
            else if(HELPAid.isUserTaken(regFullName, regEmail, regMobileNum)){
                // Display the following message if the User data has already been taken in the system
                JOptionPane.showMessageDialog(this, "This data has already been taken!");
                // clear the form fields
                destroyFields();
            }
            // Check if the Applicant's ID Number has already been taken
            else if(HELPAid.DuplicateIDNo(regIDNo)){
                // Display the following message if the Applicant's ID No has already been taken in the system
                JOptionPane.showMessageDialog(this, "Duplicate Applicant's ID No Detected in the system.");
                // clear the form fields
                destroyFields();
            }
            // Check if the Representative's data input is valid 
            else {
                // Create a new Applicant object with the required parameters
                Applicant newApplicant = new Applicant(regFullName, regEmail, regMobileNum, regIDNo, regAddress, Income);
                // Set the Applicant specified Organization according to the current logged in Representative's Organization
                newApplicant.setSpecifiedOrg(((OrganizationRep) currentUser).getThisOrg());    
                // Check if the system detects duplicate username            
                if(HELPAid.DuplicateUName(newApplicant.getUsername())){
                    // Display the following message if there's a duplicate username found in the system
                    JOptionPane.showMessageDialog(this, "Duplicate Username Detected in the system.");
                    // clear the form fields
                    destroyFields();
                    // Return back to the Representative Menu Panel and destroy the created object
                    // Set its visibility to true and dispose the previous frame
                    RepresentativeMenu repMenuPanel = new RepresentativeMenu(HELPAid, currentUser);
                    repMenuPanel.setVisible(true);
                    dispose();
                }
                // Check if the system did not find any duplicate Username
                else {
                    // It will display the following message if the Applicant has been successfully registered to the system 
                    JOptionPane.showMessageDialog(this, "Successfully registered a new Applicant.\nGenerated Username: " + newApplicant.getUsername()
                        + "\nGenerated Password: " + newApplicant.getPassword());
                    // Add the registered Applicant to the HELPAid object
                    HELPAid.addUser(newApplicant);
                    // Add the newly created Applicant under a specified Organization
                    ((OrganizationRep) currentUser).getThisOrg().addApplicant(newApplicant);
                    // clear the form fields
                    destroyFields();
                    
                    // Moving on to create document panel for the registered Applicant
                    AppendDocument addDocPanel = new AppendDocument(HELPAid, currentUser, newApplicant);
                    addDocPanel.setVisible(true);
                    dispose();
                }
            }
        } 
        catch(Exception e){
            // catch an exception if the Representative enters an invalid data type for Applicant's Income, Mobile Number, or ID Number
            JOptionPane.showMessageDialog(this, "Invalid Household Income, Mobile Num, or ID No detected in the system!");
            // printStackTrace() method
            e.printStackTrace();
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed
    
    /**
     * This method below is used to clear the Applicant's form fields 
     * Non-returnable method - destroyFields();
     */
    private void destroyFields(){
        ApplicantNameTextField.setText("");
        EmailTextField.setText("");
        AddressTextField.setText("");
        IDTextField.setText("");
        MobileNumberTextField.setText("");
        IncomeTextField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JLabel ApplicantIDLabel;
    private javax.swing.JLabel ApplicantNameLbl;
    private javax.swing.JTextField ApplicantNameTextField;
    private javax.swing.JButton BackButtonRep;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel IncomeLabel;
    private javax.swing.JTextField IncomeTextField;
    private javax.swing.JLabel MobileNumberLabel;
    private javax.swing.JTextField MobileNumberTextField;
    private javax.swing.JLabel RegisterAppLbl;
    private javax.swing.JPanel RegisterApplicantMainPanel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton SubmitBtn;
    // End of variables declaration//GEN-END:variables
}
