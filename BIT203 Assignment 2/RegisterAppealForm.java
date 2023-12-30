package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RegisterAppealForm.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The RegisterAppealForm class is responsible of displaying the Appeal Form
 * for the registered Organization Representative, if they chooses to add an
 * Aid Appeal to the specified Applicant.
 */
public class RegisterAppealForm extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES 
    private static HELPAid HELPAid;
    private static User currentUser;

    /**
     * RegisterAppealForm Form
     * Default Constructor of RegisterAppealForm to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     */
    public RegisterAppealForm(HELPAid HELPAid, User currentUser) {
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

        RegisterAppMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        BackButtonRep = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisterAppealLbl = new javax.swing.JLabel();
        FromDateText = new javax.swing.JTextField();
        FromDateLabel = new javax.swing.JLabel();
        CreateBtn = new javax.swing.JButton();
        ToDateLabel = new javax.swing.JLabel();
        ToDateText = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RegisterAppMainPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        RegisterAppealLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisterAppealLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterAppealLbl.setText("Organize Aid Appeal");

        FromDateLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        FromDateLabel.setText("Appeal's From Date (dd-mm-yyyy)");

        CreateBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CreateBtn.setText("Create");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        ToDateLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        ToDateLabel.setText("Appeal's To Date (dd-mm-yyyy)");

        descriptionLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        descriptionLabel.setText("Appeal's Description");

        javax.swing.GroupLayout RegisterAppMainPanelLayout = new javax.swing.GroupLayout(RegisterAppMainPanel);
        RegisterAppMainPanel.setLayout(RegisterAppMainPanelLayout);
        RegisterAppMainPanelLayout.setHorizontalGroup(
            RegisterAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterAppMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterAppMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterAppMainPanelLayout.createSequentialGroup()
                        .addGroup(RegisterAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterAppMainPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(RegisterAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegisterAppealLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ToDateLabel)
                                    .addComponent(ToDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(RegisterAppMainPanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE))))
        );
        RegisterAppMainPanelLayout.setVerticalGroup(
            RegisterAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterAppMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterAppMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(RegisterAppealLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ToDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterAppMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterAppMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method below is used to add an event to the create button
     * Where the Representative proceeds to register new Appeal to the Organization
     * @param evt
     */
    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // List of the declared attributes
        String fromDate, toDate, AppealDes;
        // Get each requird attributes for the Appeal from the JTextField components
        fromDate = FromDateText.getText();
        toDate = ToDateText.getText();
        AppealDes = descriptionTextField.getText();
        
        // apply try-catch clause
        try {
            // Check if one of the from Date, to Date, or description Text field remains empty blank
            if(FromDateText.getText().isEmpty() || ToDateText.getText().isEmpty() 
                || descriptionTextField.getText().isEmpty()){
                // Display the following message if one of the text fields remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check and validate the Appeal's From Date
            else if(!HELPAid.isValidDate(fromDate)){
                // Display the following message if the Appeal's From Date is out of range
                JOptionPane.showMessageDialog(this, "Invalid From Date detected!");
                // dispose the from date field
                destroyFromDateField();
            }
            // Check and validate the Appeal's To Date
            else if(!HELPAid.isValidDate(toDate)){
                // Display the following message if the Appeal's To Date is out of range
                JOptionPane.showMessageDialog(this, "Invalid To Date detected!");
                // dispose the to date field
                destroyToDateField();
            }
            // Check and validate both Appeal's From Date and To Date
            else if(!(HELPAid.isValidDate(fromDate) && HELPAid.isValidDate(toDate))){
                // Display the following message if the Appeal's From Date and To Date is out of range
                JOptionPane.showMessageDialog(this, "Invalid From Date and To Date detected!");
                // dispose the from date and to date field
                destroyFromDateField();
                destroyToDateField();
            }
            // Check and validate if the Appeal's From Date and To Date is not a valid range
            else if(!HELPAid.isValidRange(fromDate, toDate)){
                // Display the following message if the Appeal's From Date is after the Appeal's To Date
                JOptionPane.showMessageDialog(this, "Invalid Date Range!");
                // dispose the from date and to date field
                destroyFromDateField();
                destroyToDateField();
            }
            // Check if the Representative enters valid fields
            else {
                // Init the var aplOutcome and assign the value to "PENDING"
                String aplOutcome = "PENDING";
                // Create a new Appeal object with the required parameters
                Appeal newAppeal = new Appeal(fromDate, toDate, AppealDes, aplOutcome, ((OrganizationRep) currentUser).getThisOrg());
                // Display the following message if the Appeal has been successfully created
                // Show the new Appeal's generated ID 
                JOptionPane.showMessageDialog(this, "Successfully create a new Appeal.\nGenerated ID: " + newAppeal.getAppealID());  
                // Add the newly created Appeal to the HELPAid object         
                HELPAid.addAppeal(newAppeal);
                // dispose the form fields
                destroyFields();

                // Redirect the Organization Representative to the Representative Menu
                // Once the Representative has finished organizing an Aid Appeal for the Applicant
                // set its visibility to true and dispose the previous frame
                RepresentativeMenu newRepMenu = new RepresentativeMenu(HELPAid, currentUser);
                newRepMenu.setVisible(true);
                dispose();
            }
        }
        catch(Exception e){
            // catch an exception where the Representative inputted an invalid date format
            JOptionPane.showMessageDialog(this, "Invalid Date Format Detected in the System!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_CreateBtnActionPerformed

    /**
     * This method below is used to add an event to the back button
     * Where the Representative wants to return back to the Representative Panel
     * @param evt
     */
    private void BackButtonRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonRepActionPerformed
        // Redirect the Representative to the Representative Menu
        // set its visibility to true and dispose the previous frame
        RepresentativeMenu OrgRepPanel = new RepresentativeMenu(HELPAid, currentUser);
        OrgRepPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonRepActionPerformed
    
    /**
     * This method below is used to clear the To Date's text field
     * When the Representative inputted an invalid Appeal's To Date
     * Non-returnable method - destroyToDateField();
     */
    private void destroyToDateField(){
        ToDateText.setText("");
    }
    
    /**
     * This method below is used to clear the From Date's text field
     * When the Representative inputted an invalid Appeal's From Date
     * Non-returnable method - destroyFromDateField();
     */
    private void destroyFromDateField(){
        FromDateText.setText("");
    }
    
    /**
     * This method below is used to clear the From Date and To Date's text field
     * Non-returnable method - destroyFields();
     */
    private void destroyFields(){
        FromDateText.setText("");
        ToDateText.setText("");
        descriptionTextField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButtonRep;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JLabel FromDateLabel;
    private javax.swing.JTextField FromDateText;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JPanel RegisterAppMainPanel;
    private javax.swing.JLabel RegisterAppealLbl;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JLabel ToDateLabel;
    private javax.swing.JTextField ToDateText;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    // End of variables declaration//GEN-END:variables
}
