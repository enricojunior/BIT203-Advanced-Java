package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewCrAppealsByOrgContribution.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

/**
 * ViewCrAppealsByOrgContribution class is responsible of displaying list of the
 * Current Appeals made by a specific Organization when the Representative wants 
 * to record a new Contribution (Goods or Cash Donation) to the specified Appeal.
 */
public class ViewCrAppealsByOrgContribution extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    DefaultTableModel tableModel;
    
    /**
     * ViewCrAppealsByOrgContribution Form
     * Default Constructor of ViewCrAppealsByOrgContribution to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     */
    public ViewCrAppealsByOrgContribution(HELPAid HELPAid, User currentUser) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Set the preferred width for each column to the Appeals Table
        AppealsTable.getColumnModel().getColumn(0).setPreferredWidth(85);
        AppealsTable.getColumnModel().getColumn(1).setPreferredWidth(85);
        AppealsTable.getColumnModel().getColumn(2).setPreferredWidth(85);
        AppealsTable.getColumnModel().getColumn(3).setPreferredWidth(281);
        AppealsTable.getColumnModel().getColumn(4).setPreferredWidth(85);
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) AppealsTable.getModel();
        tableModel.setRowCount(0);
        // Add the Appeals data to the JTable
        addDataCrAppByOrgToJTable();
        
        // Set and update the Organization Name
        setOrgLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewCurrentAppealsByOrgPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        CurrentAppealLbl = new javax.swing.JLabel();
        JScrollAppeals = new javax.swing.JScrollPane();
        AppealsTable = new javax.swing.JTable();
        AppChooseIDLbl = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        ProceedBtn = new javax.swing.JButton();
        OrgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewCurrentAppealsByOrgPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        CurrentAppealLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CurrentAppealLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentAppealLbl.setText("Current Appeals From");

        AppealsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AppealsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Appeal ID", "From Date", "To Date", "Description", "Outcome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppealsTable.getTableHeader().setReorderingAllowed(false);
        JScrollAppeals.setViewportView(AppealsTable);

        AppChooseIDLbl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        AppChooseIDLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AppChooseIDLbl.setText("Select the Appeal ID:");

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

        OrgLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        OrgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrgLabel.setText("Organization Name");

        javax.swing.GroupLayout ViewCurrentAppealsByOrgPanelLayout = new javax.swing.GroupLayout(ViewCurrentAppealsByOrgPanel);
        ViewCurrentAppealsByOrgPanel.setLayout(ViewCurrentAppealsByOrgPanelLayout);
        ViewCurrentAppealsByOrgPanelLayout.setHorizontalGroup(
            ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                                .addComponent(OrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(CurrentAppealLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(JScrollAppeals, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(AppChooseIDLbl)
                        .addGap(18, 18, 18)
                        .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        ViewCurrentAppealsByOrgPanelLayout.setVerticalGroup(
            ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                        .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                        .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewCurrentAppealsByOrgPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CurrentAppealLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(OrgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollAppeals, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppChooseIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(ViewCurrentAppealsByOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewCurrentAppealsByOrgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewCurrentAppealsByOrgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the Representative wants to return back to the Representative Menu Panel
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Redirect the Representative to the Representative Menu Panel
        // set its visibility to true and dispose the previous frame
        RepresentativeMenu orgRepMenuPanel = new RepresentativeMenu(HELPAid, currentUser);
        orgRepMenuPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * The method below is used to add an event to the proceed button
     * Where the Representative wishes to proceed record a new contribution
     * @param evt
     */
    private void ProceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedBtnActionPerformed
        // Get the Desired ID by parsing the JTextField component
        int desiredID = Integer.parseInt(IDTextField.getText());
        // apply try-catch clause
        try {
            // Check if the ID Text field remains empty blank
            if(IDTextField.getText().isEmpty()){
                // It will display the following message if the Text field remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            } 
            // Check if the Appeal was found by the choosen ID
            else if(HELPAid.foundAplByID(desiredID)){
                // Get the Appeal object by the desired ID
                Appeal dctAppeal = HELPAid.getAppealByID(desiredID);
                // clear the form fields
                destroyFields();
                // Redirect the Representative to the Contribution Selection Panel
                // set its visibility to true and dispose the previous frame
                ContributionSelectionPanel ConsScPanel = new ContributionSelectionPanel(HELPAid, currentUser, dctAppeal);
                ConsScPanel.setVisible(true);
                dispose();
            }
            // Check if the Appeal was not found by the choosen ID
            else {
                // Display the following message if the Appeal was not found by the specified ID
                JOptionPane.showMessageDialog(this, "Unable to find the specified Appeal by ID!");
                destroyFields();
            }
        }
        catch(Exception e){
            // Catch an exception if the Representative enters an invalid data type (eg: String, float) to the Text field
            JOptionPane.showMessageDialog(this, e.getMessage());
            // printStackTrace() method
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProceedBtnActionPerformed
    
    /**
     * This method below is used to add the current appeals to the JTable
     * Non-returnable function - addDataCrAppByOrgToJTable();
     */
    private void addDataCrAppByOrgToJTable(){
        // apply down-cast to OrganizationRep
        OrganizationRep sctOrgRep = (OrganizationRep) currentUser;
        Object ObjRowData[] = new Object[5];
        // Get the list of the current Appeals according to the specified Organization
        ArrayList<Appeal> currentAppealByOrg = HELPAid.getCrAppealByOrg(sctOrgRep.getThisOrg());
        // Sort the ArrayList using Comparator interface
        Collections.sort(currentAppealByOrg, new AppealComparator());
        for(int i = 0; i < currentAppealByOrg.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data 
            ObjRowData[0] = currentAppealByOrg.get(i).getAppealID();
            ObjRowData[1] = currentAppealByOrg.get(i).getFromDate();
            ObjRowData[2] = currentAppealByOrg.get(i).getToDate();
            ObjRowData[3] = currentAppealByOrg.get(i).getAplDescription();
            ObjRowData[4] = currentAppealByOrg.get(i).getOutcome();
            // add the row data to the table Model
            tableModel.addRow(ObjRowData);
        }
    }
    
    /**
     * The method below is used to clear the form fields to an empty string
     * Non-returnable method - destroyFields();
     */
    private void destroyFields(){
        IDTextField.setText("");
    }
    
    /**
     * The method below is used to update the Organization label
     * By getting the Organization name
     * Non-returnable method - setOrgLabel();
     */
    private void setOrgLabel(){
        OrganizationRep sctOrgRep = (OrganizationRep) currentUser;
        OrgLabel.setText(sctOrgRep.getThisOrg().getOrgName());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppChooseIDLbl;
    private javax.swing.JTable AppealsTable;
    private javax.swing.JLabel CurrentAppealLbl;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollAppeals;
    private javax.swing.JLabel OrgLabel;
    private javax.swing.JButton ProceedBtn;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewCurrentAppealsByOrgPanel;
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}
