package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewDisbursements.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 * The ViewDisbursements class is responsible of displaying list 
 * of the given Disbursements to the specified Applicant from the Organization
 */
public class ViewDisbursements extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    DefaultTableModel tableModel;

    /**
     * ViewDisbursements Form
     * Default Constructor of ViewDisbursements to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     */
    public ViewDisbursements(HELPAid HELPAid, User currentUser) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) DisbursementsTable.getModel();
        tableModel.setRowCount(0);
        // Add the disbursements data to the JTable
        addDataDisbursementRowToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewDisbursementsPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        GivenDisbursementLabel = new javax.swing.JLabel();
        JScrollDisbursements = new javax.swing.JScrollPane();
        DisbursementsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewDisbursementsPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        GivenDisbursementLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        GivenDisbursementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GivenDisbursementLabel.setText("List of Given Disbursements");

        DisbursementsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DisbursementsTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Disbursement Date", "Cash Amount", "Goods Disbursed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DisbursementsTable.getTableHeader().setReorderingAllowed(false);
        JScrollDisbursements.setViewportView(DisbursementsTable);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewDisbursementsPanelLayout = new javax.swing.GroupLayout(ViewDisbursementsPanel);
        ViewDisbursementsPanel.setLayout(ViewDisbursementsPanelLayout);
        ViewDisbursementsPanelLayout.setHorizontalGroup(
            ViewDisbursementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDisbursementsPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewDisbursementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewDisbursementsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewDisbursementsPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(GivenDisbursementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDisbursementsPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(ViewDisbursementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDisbursementsPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDisbursementsPanelLayout.createSequentialGroup()
                        .addComponent(JScrollDisbursements, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        ViewDisbursementsPanelLayout.setVerticalGroup(
            ViewDisbursementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDisbursementsPanelLayout.createSequentialGroup()
                .addGroup(ViewDisbursementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewDisbursementsPanelLayout.createSequentialGroup()
                        .addGroup(ViewDisbursementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewDisbursementsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(GivenDisbursementLabel)))
                .addGap(18, 18, 18)
                .addComponent(JScrollDisbursements, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewDisbursementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewDisbursementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the Applicant wants to return back to the Applicant Menu Panel
     * , once they're done viewing the given disbursements
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Redirect the Applicant to the Applicant Menu
        // set its visibility to true and dispose the previous frame
        ApplicantMenu returnAppMenu = new ApplicantMenu(HELPAid, currentUser);
        returnAppMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    
    /**
     * The method below is used to add the disbursements data from the Organization to the JTable
     * Non-returnable function - addDataDisbursementRowToJTable();
     */
    private void addDataDisbursementRowToJTable(){
        // apply down-cast to Applicant
        Applicant sctApplicant = (Applicant) currentUser;
        // Get the list of given disbursements to the specified Applicant
        ArrayList<Disbursement> disbursements = HELPAid.getDisbursByApp(sctApplicant, sctApplicant.getIDNo());
        Object ObjRowData[] = new Object[3];
        for(int i = 0; i < disbursements.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = disbursements.get(i).getDisbursementDate();
            ObjRowData[1] = disbursements.get(i).getCashAmount();
            ObjRowData[2] = disbursements.get(i).getGoodsDisbursed();
            // add the row data to the table model
            tableModel.addRow(ObjRowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DisbursementsTable;
    private javax.swing.JLabel GivenDisbursementLabel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollDisbursements;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewDisbursementsPanel;
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}
