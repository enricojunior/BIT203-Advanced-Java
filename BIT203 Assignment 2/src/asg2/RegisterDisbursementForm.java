package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RegisterDisbursementForm.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * The RegisterDisbursementForm class is responsible of displaying the disbursement form
 * to the Organization Representative. Once the Representative selects one of the registered
 * Applicants from the List. Furthermore, it also given an option to the Representative,
 * whether the Representative wants to view the Applicant documents or not.
 */
public class RegisterDisbursementForm extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    private Appeal dctAppeal;
    private Applicant dctApplicant;
    DefaultTableModel tableModel;

    /**
     * RegisterDisbursementForm Form
     * Default Constructor of RegisterDisbursementForm to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     * @param dctAppeal - Appeal
     * @param dctApplicant - Applicant
     */
    public RegisterDisbursementForm(HELPAid HELPAid, User currentUser, Appeal dctAppeal, Applicant dctApplicant) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        this.dctAppeal = dctAppeal;
        this.dctApplicant = dctApplicant;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Set the preferred width for each column for the Document Table
        DocumentTable.getColumnModel().getColumn(0).setPreferredWidth(65);
        DocumentTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        DocumentTable.getColumnModel().getColumn(2).setPreferredWidth(145);
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) DocumentTable.getModel();
        tableModel.setRowCount(0);
        // Add the document data to the table model
        addDataDocumentToJTable();
        // Update the labels, displaying the Applicant's full name, address, and Inco
        UptAppData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewButtonChoices = new javax.swing.ButtonGroup();
        RegisterDisbursementMainPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        DocumentPanel = new javax.swing.JPanel();
        DocumentLabel = new javax.swing.JLabel();
        DisableButton = new javax.swing.JRadioButton();
        EnableButton = new javax.swing.JRadioButton();
        JScrollDoc = new javax.swing.JScrollPane();
        DocumentTable = new javax.swing.JTable();
        ApplicantLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        IncomeLabel = new javax.swing.JLabel();
        RecordAidLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        CashLabel = new javax.swing.JLabel();
        CashTextField = new javax.swing.JTextField();
        GoodsDisbursedLabel = new javax.swing.JLabel();
        GoodsTextField = new javax.swing.JTextField();
        recordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RegisterDisbursementMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        UpperIconPanel.setBackground(new java.awt.Color(0, 133, 255));

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/HELPAidIconResized.jpg"))); // NOI18N

        javax.swing.GroupLayout UpperIconPanelLayout = new javax.swing.GroupLayout(UpperIconPanel);
        UpperIconPanel.setLayout(UpperIconPanelLayout);
        UpperIconPanelLayout.setHorizontalGroup(
            UpperIconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperIconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        UpperIconPanelLayout.setVerticalGroup(
            UpperIconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperIconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(0, 133, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HELPAidLabel.setText("HELPAid");

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        DocumentPanel.setBackground(new java.awt.Color(0, 133, 255));

        DocumentLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        DocumentLabel.setForeground(new java.awt.Color(255, 255, 255));
        DocumentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DocumentLabel.setText("View Applicant's Document(s)");

        ViewButtonChoices.add(DisableButton);
        DisableButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DisableButton.setForeground(new java.awt.Color(255, 255, 255));
        DisableButton.setText("Disable");
        DisableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableButtonActionPerformed(evt);
            }
        });

        ViewButtonChoices.add(EnableButton);
        EnableButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EnableButton.setForeground(new java.awt.Color(255, 255, 255));
        EnableButton.setText("Enable");
        EnableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnableButtonActionPerformed(evt);
            }
        });

        DocumentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "File Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollDoc.setViewportView(DocumentTable);

        javax.swing.GroupLayout DocumentPanelLayout = new javax.swing.GroupLayout(DocumentPanel);
        DocumentPanel.setLayout(DocumentPanelLayout);
        DocumentPanelLayout.setHorizontalGroup(
            DocumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocumentPanelLayout.createSequentialGroup()
                .addGroup(DocumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DocumentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DocumentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DocumentPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(EnableButton)
                        .addGap(42, 42, 42)
                        .addComponent(DisableButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(DocumentPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(JScrollDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        DocumentPanelLayout.setVerticalGroup(
            DocumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocumentPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(DocumentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DocumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisableButton)
                    .addComponent(EnableButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScrollDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        ApplicantLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ApplicantLabel.setText("Applicant:");

        AddressLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        AddressLabel.setText("Address:");

        IncomeLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        IncomeLabel.setText("Household Income: ");

        RecordAidLabel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        RecordAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecordAidLabel.setText("Record Aid Disbursement");

        DateLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DateLabel.setText("Disbursement Date (dd-mm-yyyy)");

        CashLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CashLabel.setText("Cash Amount");

        GoodsDisbursedLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GoodsDisbursedLabel.setText("Goods Disbursed");

        recordButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        recordButton.setText("Record");
        recordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterDisbursementMainPanelLayout = new javax.swing.GroupLayout(RegisterDisbursementMainPanel);
        RegisterDisbursementMainPanel.setLayout(RegisterDisbursementMainPanelLayout);
        RegisterDisbursementMainPanelLayout.setHorizontalGroup(
            RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(HELPAidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ApplicantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                .addGroup(RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                        .addComponent(DocumentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RecordAidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addComponent(IncomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateTextField)
                                    .addComponent(CashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CashTextField)
                                    .addComponent(GoodsDisbursedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GoodsTextField)))
                            .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(recordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        RegisterDisbursementMainPanelLayout.setVerticalGroup(
            RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                .addGroup(RegisterDisbursementMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DocumentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(RegisterDisbursementMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ApplicantLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RecordAidLabel)
                .addGap(18, 18, 18)
                .addComponent(DateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CashLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CashTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GoodsDisbursedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(recordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterDisbursementMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterDisbursementMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the record button
     * Where the Representative wants to record aid disbursement to the designated Applicant
     * @param evt
     */
    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtonActionPerformed
        // apply try-catch clause
        try {
            // Get each required attributes for the Disbursement from the JTextField components
            String disDate = DateTextField.getText();
            int csAmount = Integer.parseInt(CashTextField.getText());
            int gdDis = Integer.parseInt(GoodsTextField.getText());
            // Check if one of the required fields remains empty blank
            if(DateTextField.getText().isEmpty() || CashTextField.getText().isEmpty() || GoodsTextField.getText().isEmpty()){
                // Display the following message if one of the required fields remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check and validate the disbursement date
            else if(!(HELPAid.isValidDate(disDate))){
                // Display the following message if the disbursement date is out of range 
                JOptionPane.showMessageDialog(this, "Invalid disbursement date detected!");
                // clear the form fields
                destroyFields();
            }
            // Check if the cash amount or goods disbursed inputted is negative number or remains 0
            else if(csAmount <= 0 || gdDis <= 0){
                // Display the following message to remind the Representative cannot inputted 0 or any negative numbers
                JOptionPane.showMessageDialog(this, "Cash Amount or Goods Disbursed cannot be negative or 0!");
                // clear the form fields
                destroyFields();
            }
            // Check if the Representative enters valid inputs to all of the required fields
            else {
                // Display the following message if the disbursement has been successfully recorded to the Applicant
                JOptionPane.showMessageDialog(this, "Successfully recorded new aid disbursement.");
                // Create new object of Disbursement with the required parameters
                Disbursement newDis = new Disbursement(disDate, csAmount, gdDis, dctAppeal, dctApplicant);
                // Set the choosen Appeal's outcome to APPROVED
                newDis.getThisAppeal().setOutcome("APPROVED");
                // Add the recorded disbursement to the specified Applicant
                dctApplicant.addDisbursement(newDis);
                
                // showConfirmDialog to check whether the Representative wants to record another disbursement or not
                int choice = JOptionPane.showConfirmDialog(this, "Would you like to record another disbursement?"
                        , "Confirm Add Disbursement" , JOptionPane.YES_NO_OPTION);
                // Check if the Representative selects the yes option
                if(choice == JOptionPane.YES_OPTION){
                    // Redirect the Representative to view the registered Applicants under the specified Organization
                    // set its visibility to true and dispose the previous frame 
                    ViewRegisteredAppByOrg ViewAppsAgain = new ViewRegisteredAppByOrg(HELPAid, currentUser, dctAppeal);
                    ViewAppsAgain.setVisible(true);
                    dispose();
                }
                // Check if the Representative selects the no option
                else {
                    // Redirect the Representative to the Representative system
                    // set its visibility to true and dispose the previous frame
                    RepresentativeMenu backMenu = new RepresentativeMenu(HELPAid, currentUser);
                    backMenu.setVisible(true);
                    dispose();
                }
            }
        }
        catch(Exception e){
            // catch an exception if the Representative enters an invalid date format or data type required
            JOptionPane.showMessageDialog(this, e.getMessage());
            // printStackTrace() method
            e.printStackTrace();
        }
    }//GEN-LAST:event_recordButtonActionPerformed

    /**
     * The method below is used to add an event to the enable JRadioButton
     * Where the Representative wants to view documents according to the selected Applicant
     * @param evt
     */
    private void EnableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnableButtonActionPerformed
        // set the row count to 0
        tableModel.setRowCount(0);
        // call the method to add the document data
        addDataDocumentToJTable();
    }//GEN-LAST:event_EnableButtonActionPerformed

    /**
     * The method below is used to add an event to the disable JRadioButton
     * Where the Representative may choose not to view documents of the specified Applicant 
     * @param evt
     */
    private void DisableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableButtonActionPerformed
        // set the row count to 0
        tableModel.setRowCount(0);
        // Declare the array of objects
        Object ObjRowData[] = new Object[3];
        // Init and assign the documents empty ArrayList 
        ArrayList<Document> documents;
        documents = new ArrayList<>();
        // Iterate the documents ArrayList using for loop
        for(int i = 0; i < documents.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = documents.get(i).getDocumentID();
            ObjRowData[1] = documents.get(i).getFileName();
            ObjRowData[2] = documents.get(i).getDescription();
            // add the row data to the table Model
            tableModel.addRow(ObjRowData);
        }
    }//GEN-LAST:event_DisableButtonActionPerformed
    
    /**
     * This method below is used to add the document data to the JTable
     * Non-returnable function - addDataDocumentToJTable();
     */
    private void addDataDocumentToJTable(){
        // set the row count to 0
        Object ObjRowData[] = new Object[3];
        // Get the list of documents from the selected Applicant 
        ArrayList<Document> documents = HELPAid.getDocList(dctApplicant, (OrganizationRep) currentUser);
        // Iterate the documents ArrayList using for loop
        for(int i = 0; i < documents.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = documents.get(i).getDocumentID();
            ObjRowData[1] = documents.get(i).getFileName();
            ObjRowData[2] = documents.get(i).getDescription();
            // add the row data to the table Model
            tableModel.addRow(ObjRowData);
        }
    }

    /**
     * This method below is used to set all of the data fields to an empty string
     * Non-returnable method - destroyFields();
     */  
    private void destroyFields(){
        DateTextField.setText("");
        CashTextField.setText("");
        GoodsTextField.setText("");
    }
    
    /**
     * This method below is used to update the label consisting of Applicant's full name, address, and income
     * Update the required data and system will show the Applicant's name, address, and income
     */
    private void UptAppData(){
        ApplicantLabel.setText("Applicant: " + dctApplicant.getFullName());
        AddressLabel.setText("Address: " + dctApplicant.getAddress());
        IncomeLabel.setText("Income: " + dctApplicant.getHouseholdIncome());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel ApplicantLabel;
    private javax.swing.JLabel CashLabel;
    private javax.swing.JTextField CashTextField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JRadioButton DisableButton;
    private javax.swing.JLabel DocumentLabel;
    private javax.swing.JPanel DocumentPanel;
    private javax.swing.JTable DocumentTable;
    private javax.swing.JRadioButton EnableButton;
    private javax.swing.JLabel GoodsDisbursedLabel;
    private javax.swing.JTextField GoodsTextField;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel IncomeLabel;
    private javax.swing.JScrollPane JScrollDoc;
    private javax.swing.JLabel RecordAidLabel;
    private javax.swing.JPanel RegisterDisbursementMainPanel;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.ButtonGroup ViewButtonChoices;
    private javax.swing.JButton recordButton;
    // End of variables declaration//GEN-END:variables
}
