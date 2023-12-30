package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewContributions.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED ATTRIBUTES
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * The ViewContributions class is responsible of displaying list of the recorded Contributions
 * made from the specified Appeal, when the Representative selects the Appeal by Appeal's ID,
 * while recording a new aid disbursement to the specified Applicant registered in the Organization.
 */
public class ViewContributions extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    private Appeal dctAppeal;
    DefaultTableModel tableModel;
    
    /**
     * ViewContributions Form
     * Default Constructor of ViewContributions to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     * @param dctAppeal - Appeal
     */
    public ViewContributions(HELPAid HELPAid, User currentUser, Appeal dctAppeal) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        this.dctAppeal = dctAppeal;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Update the Appeal From Date and To Date's Label
        AppealsFromDate.setText("Appeal's From Date: " + dctAppeal.getFromDate());
        AppealsToDate.setText("Appeal's To Date: " + dctAppeal.getToDate());
        
        // Set the preferred width for each column to the Contributions Table 
        ContributionsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        ContributionsTable.getColumnModel().getColumn(1).setPreferredWidth(68);
        ContributionsTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        ContributionsTable.getColumnModel().getColumn(3).setPreferredWidth(210);
        ContributionsTable.getColumnModel().getColumn(4).setPreferredWidth(90);
        ContributionsTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        ContributionsTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        ContributionsTable.getColumnModel().getColumn(7).setPreferredWidth(100);
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) ContributionsTable.getModel();
        tableModel.setRowCount(0);
        // Add the contributions data to the JTable
        addContributionToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewContributionsPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        CurrentAppealLbl = new javax.swing.JLabel();
        JScrollContributions = new javax.swing.JScrollPane();
        ContributionsTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        ViewApplicantButton = new javax.swing.JButton();
        AppealsFromDate = new javax.swing.JLabel();
        AppealsToDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewContributionsPanel.setBackground(new java.awt.Color(255, 255, 255));

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
        CurrentAppealLbl.setText("List of Contributions");

        ContributionsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ContributionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, ""},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "ID", "Received Date", "Description", "Est Value", "Channel", "Reference No", "Cash Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ContributionsTable.getTableHeader().setReorderingAllowed(false);
        JScrollContributions.setViewportView(ContributionsTable);

        cancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        ViewApplicantButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewApplicantButton.setText("View Applicants");
        ViewApplicantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewApplicantButtonActionPerformed(evt);
            }
        });

        AppealsFromDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AppealsFromDate.setText("Appeal's From Date: ");

        AppealsToDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AppealsToDate.setText("Appeal's To Date:");

        javax.swing.GroupLayout ViewContributionsPanelLayout = new javax.swing.GroupLayout(ViewContributionsPanel);
        ViewContributionsPanel.setLayout(ViewContributionsPanelLayout);
        ViewContributionsPanelLayout.setHorizontalGroup(
            ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HELPAidLabel)
                            .addComponent(AppealsFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppealsToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(CurrentAppealLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 234, Short.MAX_VALUE))))
            .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollContributions)
                    .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewApplicantButton)))
                .addGap(31, 31, 31))
        );
        ViewContributionsPanelLayout.setVerticalGroup(
            ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                .addGroup(ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                        .addGroup(ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                                .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(ViewContributionsPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AppealsFromDate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AppealsToDate)
                        .addGap(2, 2, 2)
                        .addComponent(CurrentAppealLbl)))
                .addGap(18, 18, 18)
                .addComponent(JScrollContributions, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(ViewContributionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewApplicantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewContributionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewContributionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the cancel button
     * Where the Representative wants to return back to the RepresentativeMenu Panel
     * @param evt
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Display the following message if the Representative clicked the cancel button
        JOptionPane.showMessageDialog(this, "Returning back to the Representative Menu..");
        // Redirect the Representative to the Reprsentative Menu Panel
        // set its visibility to true and dispose the previous frame
        RepresentativeMenu orgRepMenuPanel = new RepresentativeMenu(HELPAid, currentUser);
        orgRepMenuPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * The method below is used to add an event to the View Applicants button
     * Where the Representative wishes to view all of the registered Applicants under a specified Organization 
     * @param evt
     */
    private void ViewApplicantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewApplicantButtonActionPerformed
        // Check if there aren't any registered Applicants under the specified Organization
        if(((OrganizationRep) currentUser).getThisOrg().getAppList().isEmpty()){
            // Display the following message if there aren't any registered applicants uder the specified Organization
            JOptionPane.showMessageDialog(this, "There aren't any registered applicant under this organization");
        }
        // Check if there are any available registered Applicants
        else {
            // Redirect the Representative to the ViewRegisteredAppByOrg Panel
            // set its visibility to true and dispose the previous frame
            ViewRegisteredAppByOrg ViewRegisteredApps = new ViewRegisteredAppByOrg(HELPAid, currentUser, dctAppeal);
            ViewRegisteredApps.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ViewApplicantButtonActionPerformed
    
    /**
     * This method is used to add the contributions data to the JTable
     * Non-returnable function - addContributionToJTable();
     */
    private void addContributionToJTable(){
        // set the row count to 0
        tableModel.setRowCount(0);
        Object ObjRowData[] = new Object[8];
        // Get the List of Contributions made according to the selected Appeal
        ArrayList<Contribution> listOfContributions = dctAppeal.getContributionList();
        for(int i = 0; i < listOfContributions.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = listOfContributions.get(i).getContributionType();
            ObjRowData[1] = listOfContributions.get(i).getContributionID();
            ObjRowData[2] = listOfContributions.get(i).getReceivedDate();
            // Check if the contribution is an instance of Goods
            if(listOfContributions.get(i) instanceof Goods GoodsDonation){
                // Get each attributes from the ArrayList and assign it to the row data
                ObjRowData[3] = GoodsDonation.getDescription();
                ObjRowData[4] = GoodsDonation.getEstValue();
                // Set the Row Data to stripe since Goods does not have the attribute Cash Donation has
                ObjRowData[5] = "---";
                ObjRowData[6] = "---";
                ObjRowData[7] = "---";
            }
            // Check if the contribution is an instance of CashDonation 
            else if(listOfContributions.get(i) instanceof CashDonation CashDonation){
                // Set the Row Data to stripe since Cash Donation does not have the attribute Goods has
                ObjRowData[3] = "---";
                ObjRowData[4] = "---";
                // Get each attributes from the ArrayList and assign it to the row data 
                ObjRowData[5] = CashDonation.getPaymentChannel();
                ObjRowData[6] = CashDonation.getReferenceNo();
                ObjRowData[7] = CashDonation.getAmount();
            }
            // Check if the contribution type is not identifiable
            else {
                // Set all of the Row Data to stripe
                ObjRowData[3] = "---";
                ObjRowData[4] = "---";
                ObjRowData[5] = "---";
                ObjRowData[6] = "---";
                ObjRowData[7] = "---";
            }
            // add the row data to the table Model
            tableModel.addRow(ObjRowData);
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppealsFromDate;
    private javax.swing.JLabel AppealsToDate;
    private javax.swing.JTable ContributionsTable;
    private javax.swing.JLabel CurrentAppealLbl;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollContributions;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JButton ViewApplicantButton;
    private javax.swing.JPanel ViewContributionsPanel;
    private javax.swing.JButton cancelButton;
    // End of variables declaration//GEN-END:variables
}
