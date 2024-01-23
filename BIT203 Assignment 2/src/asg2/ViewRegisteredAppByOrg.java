package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewRegisteredAppByOrg.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * ViewRegisteredAppByOrg class is responsible of displaying the List
 * of the Registered Applicants from a specific Organization.
 * This Panel will be displayed when the Representative wants to View Applicants
 * Once they're done view the list of contributions from the chosen Appeal.
 */
public class ViewRegisteredAppByOrg extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    private Appeal dctAppeal;
    DefaultTableModel tableModel;
    
    /**
     * ViewRegisteredAppByOrg Form
     * Default Constructor of ViewRegisteredAppByOrg to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     * @param dctAppeal - Appeal
     */
    public ViewRegisteredAppByOrg(HELPAid HELPAid, User currentUser, Appeal dctAppeal) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        this.dctAppeal = dctAppeal;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Set the preferred width for each column to the Applicants Table
        ApplicantsTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        ApplicantsTable.getColumnModel().getColumn(1).setPreferredWidth(250);
        ApplicantsTable.getColumnModel().getColumn(2).setPreferredWidth(174);
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) ApplicantsTable.getModel();
        tableModel.setRowCount(0);
        // Add the Registered Applicants data to the JTable
        addApplicantToJTable();
        
        // Set and update the Organization Label
        setOrgLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        ViewRegisteredAppsByOrgPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisteredAppLabel = new javax.swing.JLabel();
        JScrollApplicants = new javax.swing.JScrollPane();
        ApplicantsTable = new javax.swing.JTable();
        IDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        ProceedBtn = new javax.swing.JButton();
        OrgLabel = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewRegisteredAppsByOrgPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        RegisteredAppLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisteredAppLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisteredAppLabel.setText("List Of Registered Applicants");

        ApplicantsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ApplicantsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
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
                "Applicant ID", "Applicant Email", "Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ApplicantsTable.getTableHeader().setReorderingAllowed(false);
        JScrollApplicants.setViewportView(ApplicantsTable);

        IDLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        IDLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDLabel.setText("Select the Applicant ID:");

        ProceedBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProceedBtn.setText("Proceed");
        ProceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedBtnActionPerformed(evt);
            }
        });

        OrgLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        OrgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrgLabel.setText("Organization Name");

        javax.swing.GroupLayout ViewRegisteredAppsByOrgPanelLayout = new javax.swing.GroupLayout(ViewRegisteredAppsByOrgPanel);
        ViewRegisteredAppsByOrgPanel.setLayout(ViewRegisteredAppsByOrgPanelLayout);
        ViewRegisteredAppsByOrgPanelLayout.setHorizontalGroup(
            ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                                .addComponent(OrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(RegisteredAppLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(IDLabel)
                .addGap(18, 18, 18)
                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                        .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                        .addComponent(JScrollApplicants, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        ViewRegisteredAppsByOrgPanelLayout.setVerticalGroup(
            ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                .addGroup(ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                        .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                        .addGroup(ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewRegisteredAppsByOrgPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisteredAppLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(OrgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScrollApplicants, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewRegisteredAppsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredAppsByOrgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredAppsByOrgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the proceed button
     * Where the Representative proceeds to select the Applicant by its ID and moving on the Disbursements Panel
     * @param evt
     */
    private void ProceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedBtnActionPerformed
        // Get the selected Applicant ID by parsing the JTextField component
        int sctApplicantID = Integer.parseInt(IDTextField.getText());
        // apply try-catch clause
        try {
            // Check if the ID Text Field remains empty blank
            if(IDTextField.getText().isEmpty()){
                // Display the following message if the ID Text Field remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check and verify the ID, case if the Applicant was found by the choosen ID 
            else if(!(HELPAid.VerifyAppByID(sctApplicantID))){
                // Display the following message if the Applicant was not found by the choosen ID
                JOptionPane.showMessageDialog(this, "Unable to find the specified Applicant by the specified ID!");
                // Clear the form fields
                destroyFields();
            }
            // Check and verify the ID. case if the Applicant was found by the choosen ID
            else {
                // Get the Applicant object according to the choosen ID
                Applicant sctApplicant = HELPAid.getApplicantByID(sctApplicantID);
                // Redirect the Representative to the Disbursement Registration Panel
                // set its visibility to true and dispose the previous frame
                RegisterDisbursementForm RecordAidDis = new RegisterDisbursementForm(HELPAid, currentUser, dctAppeal, sctApplicant);
                RecordAidDis.setVisible(true);
                dispose();
                // clear the form fields
                destroyFields();
            }
        }
        catch(Exception e){
            // catch an exception if the Representative enters and invalid data type to the JTextField (eg: String, float, etc.)
            JOptionPane.showMessageDialog(this, e.getMessage());
            // printStackTrace() method
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProceedBtnActionPerformed
    
    /**
     * The method below is used to clear the form fields to an empty string
     * Non-returnable method - destroyFields();
     */
    private void destroyFields(){
        IDTextField.setText("");
    }
    
    /**
     * The method below is used to set and update the Organization Label
     * By getting the Organization name
     * Non-returnable function - setOrgLabel();
     */
    private void setOrgLabel(){
        OrganizationRep sctOrgRep = (OrganizationRep) currentUser;
        OrgLabel.setText(sctOrgRep.getThisOrg().getOrgName());
    }
    
    /**
     * The method below is used to add the List of registered Applicants data to the JTable
     * Non-returnable function - addApplicantToJTable();
     */
    private void addApplicantToJTable(){
        Object ObjRowData[] = new Object[3];
        // Get the List of the Registered Applicants under a specified Organization
        ArrayList<Applicant> listOfApplicants = HELPAid.getRegAppByOrgID(((OrganizationRep) currentUser).getThisOrg().getOrgID());
        for(int i = 0; i < listOfApplicants.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = listOfApplicants.get(i).getIDNo();
            ObjRowData[1] = listOfApplicants.get(i).getEmail();
            ObjRowData[2] = listOfApplicants.get(i).getMobileNo();
            // add the row data to the table model
            tableModel.addRow(ObjRowData);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApplicantsTable;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollApplicants;
    private javax.swing.JLabel OrgLabel;
    private javax.swing.JButton ProceedBtn;
    private javax.swing.JLabel RegisteredAppLabel;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewRegisteredAppsByOrgPanel;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables
}
