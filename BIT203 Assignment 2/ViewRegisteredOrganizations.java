package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewRegisteredOrganizations.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * ViewRegisteredOrganizations class is responsible of displaying the List of Registered Organizations.
 * This Panel will be shown if the HELPAid Admin wants to register a new Representative to the selected Organization.
 */
public class ViewRegisteredOrganizations extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    DefaultTableModel tableModel;
    
    /**
     * ViewRegisteredOrganizations Form
     * Default Constructor of ViewRegisteredOrganizations to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public ViewRegisteredOrganizations(HELPAid HELPAid) {
        this.HELPAid = HELPAid;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        // Set the preferred width for each column to the Organization Table
        OrganizationTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        OrganizationTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        OrganizationTable.getColumnModel().getColumn(2).setPreferredWidth(321);
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) OrganizationTable.getModel();
        tableModel.setRowCount(0);
        // Add the Registered Organizations to the JTable
        addDataOrgToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewRegisteredOrganizationPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisteredOrgLabel = new javax.swing.JLabel();
        JScrollOrg = new javax.swing.JScrollPane();
        OrganizationTable = new javax.swing.JTable();
        OrgChooseIDLbl = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        ProceedBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewRegisteredOrganizationPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        RegisteredOrgLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisteredOrgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisteredOrgLabel.setText("List Of Registered Organizations");

        OrganizationTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OrganizationTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Organization ID", "Organization Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrganizationTable.getTableHeader().setReorderingAllowed(false);
        JScrollOrg.setViewportView(OrganizationTable);

        OrgChooseIDLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        OrgChooseIDLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        OrgChooseIDLbl.setText("Select the Organization ID:");

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ProceedBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ProceedBtn.setText("Proceed");
        ProceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewRegisteredOrganizationPanelLayout = new javax.swing.GroupLayout(ViewRegisteredOrganizationPanel);
        ViewRegisteredOrganizationPanel.setLayout(ViewRegisteredOrganizationPanelLayout);
        ViewRegisteredOrganizationPanelLayout.setHorizontalGroup(
            ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(RegisteredOrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                .addGroup(ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(JScrollOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(OrgChooseIDLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        ViewRegisteredOrganizationPanelLayout.setVerticalGroup(
            ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                .addGroup(ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                        .addGroup(ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewRegisteredOrganizationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RegisteredOrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrgChooseIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(ViewRegisteredOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredOrganizationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredOrganizationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method below is used to add an event to the back button
     * Where the HELPAid Admin wants to return back to the HELPAid Admin Panel
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Redirect the HELPAid Admin to the HELPAid Admin Menu Panel
        // Set its visibility to true and dispose the previous frame
        HELPAidAdminMenu AdminPanelMenu = new HELPAidAdminMenu(HELPAid);
        AdminPanelMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * This method below is used to add an event to the proceed button
     * Where the HELPAid Admin wants to register a new Representative after choosing the Organization
     * @param evt
     */
    private void ProceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedBtnActionPerformed
        // Get the Desired ID by parsing the JTextField component
        int desiredID = Integer.parseInt(IDTextField.getText());
        // apply try-catch clause
        try {
            // Check if the ID Text Field remains empty blank
            if(IDTextField.getText().isEmpty()){
                // Display the following message if the Text field remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            } 
            // Check if the Organization was found by the choosen ID
            else if(HELPAid.foundOrgByID(desiredID)){
                // Get the Organization by the choosen ID
                Organization dctOrg = HELPAid.getOrganizationByID(desiredID);
                // Redirect the HELPAid Admin to the Representative Registration Form
                // Set its visibility to true and dispose the previous frame
                RegisterRepresentativeForm regOrgForm = new RegisterRepresentativeForm(HELPAid, dctOrg);
                regOrgForm.setVisible(true);
                dispose();
            } 
            // Check if the Organization was not found by the choosen ID
            else {
                // Display the following message if the Organization was not found by the choosen ID
                JOptionPane.showMessageDialog(this, "Organization was not found by the specified ID!");
                // clear the form fields
                destroyFields();
            }
        }
        catch(Exception e){
            // catch an exception if the HELPAid Admin enters an invalid data type to the Text field
            JOptionPane.showMessageDialog(this, e.getMessage());
            // printStackTrace() method
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProceedBtnActionPerformed
    
    /**
     * This method below is used to add the registered Organizations to the JTable
     * Non-returnable method - addDataOrgToJTable();
     */
    private void addDataOrgToJTable(){
        Object ObjRowData[] = new Object[3];
        // Get the List of the Registered Organizations from the HELPAid object
        ArrayList<Organization> registeredOrgs = HELPAid.getOrgList();
        for(int i = 0; i < registeredOrgs.size(); i++){
            // Get each of the required attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = registeredOrgs.get(i).getOrgID();           
            ObjRowData[1] = registeredOrgs.get(i).getOrgName();
            ObjRowData[2] = registeredOrgs.get(i).getAddress();
            // add the row data to the table model
            tableModel.addRow(ObjRowData);
        }
    }
    
    /**
     * The method below is used to clear the form fields to an empty string
     * Non-returnable method - destroyFields();
     */
    public void destroyFields(){
        IDTextField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollOrg;
    private javax.swing.JLabel OrgChooseIDLbl;
    private javax.swing.JTable OrganizationTable;
    private javax.swing.JButton ProceedBtn;
    private javax.swing.JLabel RegisteredOrgLabel;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewRegisteredOrganizationPanel;
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}
