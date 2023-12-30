package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RegisterOrganizationForm.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The RegisterOrganizationForm is responsible of displaying the Organization Registration Form.
 * The HELPAid Admin fills all of the required fields in the Organization Registration Form.
 */
public class RegisterOrganizationForm extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    
    /**
     * RegisterOrganizationForm Form
     * Default Constructor of RegisterOrganizationForm to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public RegisterOrganizationForm(HELPAid HELPAid) {
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

        RegisterOrgMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        BackButtonAdmin = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisterOrgLbl = new javax.swing.JLabel();
        OrgNameTxtField = new javax.swing.JTextField();
        OrganizationNameLbl1 = new javax.swing.JLabel();
        AddressLbl = new javax.swing.JLabel();
        OrgAddTxtField = new javax.swing.JTextField();
        ProceedBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RegisterOrgMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        BackButtonAdmin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BackButtonAdmin.setText("Back");
        BackButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonAdminActionPerformed(evt);
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
                .addComponent(BackButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(BackButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        RegisterOrgLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisterOrgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterOrgLbl.setText("Register New Organization");

        OrganizationNameLbl1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        OrganizationNameLbl1.setText("Organization Name");

        AddressLbl.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        AddressLbl.setText("Organization Address");

        OrgAddTxtField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        ProceedBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProceedBtn.setText("Proceed");
        ProceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterOrgMainPanelLayout = new javax.swing.GroupLayout(RegisterOrgMainPanel);
        RegisterOrgMainPanel.setLayout(RegisterOrgMainPanelLayout);
        RegisterOrgMainPanelLayout.setHorizontalGroup(
            RegisterOrgMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterOrgMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterOrgMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterOrgMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(RegisterOrgMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterOrgMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterOrgMainPanelLayout.createSequentialGroup()
                                    .addComponent(RegisterOrgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addGroup(RegisterOrgMainPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(RegisterOrgMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrgNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrganizationNameLbl1)
                                    .addComponent(AddressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrgAddTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(RegisterOrgMainPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        RegisterOrgMainPanelLayout.setVerticalGroup(
            RegisterOrgMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterOrgMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterOrgMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterOrgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrganizationNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrgNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(AddressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrgAddTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterOrgMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterOrgMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the HELPAid Admin wants to return back to the HELPAid Admin System
     * @param evt
     */
    private void BackButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonAdminActionPerformed
        // Redirect the HELPAid Admin to the HELPAid Admin System
        // set its visibility to true and dispose the previous frame
        HELPAidAdminMenu AdminMenu = new HELPAidAdminMenu(HELPAid);
        AdminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonAdminActionPerformed

    /**
     * The method below is used to add an event to the proceed button
     * Where the HELPAid Admin proceeds to register a new organization 
     * @param evt
     */
    private void ProceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedBtnActionPerformed
        // List of the declared attributes
        String RegOrgName, RegOrgAddress;
        // Get each attributes for the Organization from the JTextField components
        RegOrgName = OrgNameTxtField.getText();
        RegOrgAddress = OrgAddTxtField.getText();
        
        // Check if the organization name or address Text field remains empty blank 
        if(OrgNameTxtField.getText().isEmpty() || OrgAddTxtField.getText().isEmpty()){
            // Display the following message if one of the text field remains empty blank
            JOptionPane.showMessageDialog(null, "Please fill in all of the required fields!");
        }
        // Check if the Organization has already been registered to the system using stream() and lambda expressions
        else if(HELPAid.getOrgList().stream().anyMatch(dct -> dct.getOrgName().equals(RegOrgName) && dct.getAddress().equals(RegOrgAddress))){
            // Display the following message if the organization data has already been taken
            JOptionPane.showMessageDialog(null, "This Organization has already been registered to the system.");
            // clear the form fields
            destroyFields();
        }
        // Check if the Organization is not taken and newly created
        else {
            // Display the following message if the Organization has already been successfully registered to the system
            JOptionPane.showMessageDialog(null, "Successfully added a new Organization to the system.");
            // Create a new Organization object with the required parameters
            Organization newOrganization = new Organization(RegOrgName, RegOrgAddress);
            // Show and display the details of the Organization name and its generated ID
            JOptionPane.showMessageDialog(null, "Organization Name: " + newOrganization.getOrgName() + "\n" 
                        + "Organization Generated ID: " + newOrganization.getOrgID());
            // Add the registered Organization to the HELPAid object
            HELPAid.addOrg(newOrganization);
            // clear the form fields
            destroyFields();
            
            // Once the HELPAid Admin completes the registration, 
            // redirect the HELPAid Admin to the HELPAid Admin Menu
            // set its visibility to true and dispose the previous frame
            HELPAidAdminMenu adminMenu = new HELPAidAdminMenu(HELPAid);
            adminMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ProceedBtnActionPerformed
    
    /**
     * The method below is used to clear the Organization's required fields
     * Non-returnable method - destroyFields();
     */
    public void destroyFields(){
        OrgNameTxtField.setText("");
        OrgAddTxtField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JButton BackButtonAdmin;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JTextField OrgAddTxtField;
    private javax.swing.JTextField OrgNameTxtField;
    private javax.swing.JLabel OrganizationNameLbl1;
    private javax.swing.JButton ProceedBtn;
    private javax.swing.JLabel RegisterOrgLbl;
    private javax.swing.JPanel RegisterOrgMainPanel;
    private javax.swing.JPanel SideLeftPanel;
    // End of variables declaration//GEN-END:variables
}
