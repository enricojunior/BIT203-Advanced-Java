package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewRegisteredApplicants.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Collections;

/**
 * ViewRegisteredApplicants class is responsible of displaying the List
 * of Registered Applicants from various Organizations.
 * The User is given an option whether wants to view it in original sequence or sorted according to full name.
 */
public class ViewRegisteredApplicants extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    String UserSelectedOption = "Default";
    private static HELPAid HELPAid;
    DefaultTableModel tableModel;
 
    /**
     * ViewRegisteredApplicants Form
     * Default Constructor of ViewRegisteredApplicants to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public ViewRegisteredApplicants(HELPAid HELPAid) {
        this.HELPAid = HELPAid;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) AppsTable.getModel();
        tableModel.setRowCount(0);
        // Add the Registered Applicants to the JTable
        addDataAppsToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewRegisteredApplicantsPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisteredApplicantsLabel = new javax.swing.JLabel();
        JScrollApps = new javax.swing.JScrollPane();
        AppsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        sortOptions = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewRegisteredApplicantsPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        RegisteredApplicantsLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisteredApplicantsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisteredApplicantsLabel.setText("Registered Applicants");

        AppsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AppsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Full Name", "Email", "Mobile No", "App ID", "Address", "Income", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppsTable.getTableHeader().setReorderingAllowed(false);
        JScrollApps.setViewportView(AppsTable);

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        sortOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Full Name" }));
        sortOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewRegisteredApplicantsPanelLayout = new javax.swing.GroupLayout(ViewRegisteredApplicantsPanel);
        ViewRegisteredApplicantsPanel.setLayout(ViewRegisteredApplicantsPanelLayout);
        ViewRegisteredApplicantsPanelLayout.setHorizontalGroup(
            ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JScrollApps, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel))
                    .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(RegisteredApplicantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                        .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ViewRegisteredApplicantsPanelLayout.setVerticalGroup(
            ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                .addGroup(ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                        .addGroup(ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewRegisteredApplicantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegisteredApplicantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewRegisteredApplicantsPanelLayout.createSequentialGroup()
                                .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScrollApps, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredApplicantsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredApplicantsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the User wants to return back to the HELPAidGUI Panel
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Redirect the User to the HELPAidGUI Panel
        // set its visibility to true and dispose the previous frame
        HELPAidGUI GUIPanel = new HELPAidGUI();
        GUIPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * The method below is used to add an event to the sort options
     * Where the User wants to view the registered Applicants
     * either in Original Sequence or Sorted According to Full Name
     * @param evt
     */
    private void sortOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortOptionsActionPerformed
        // Get the selected option according to the JComboBox selection
        UserSelectedOption = sortOptions.getSelectedItem().toString();
        // Set its row count to 0
        tableModel.setRowCount(0);
        // Add the Registered Applicants to the JTable
        addDataAppsToJTable();
    }//GEN-LAST:event_sortOptionsActionPerformed
    
    /**
     * The method below is used to add the List of the Registered Applicants to the JTable
     * Non-returnable function - addDataAppsToJTable();
     */
    private void addDataAppsToJTable(){
        Object ObjRowData[] = new Object[9];
        // Get the List of the Registered Applicants from the HELPAid object
        ArrayList<Applicant> ApplicantList = HELPAid.getApplicantList();
        
        // Check if the selected option is set to default
        if(UserSelectedOption.equals("Default")){
            for(int i = 0; i < ApplicantList.size(); i++){
                // Get each of the required attributes from the ArrayList and assign it to the row data
                ObjRowData[0] = ApplicantList.get(i).getUsername();
                ObjRowData[1] = ApplicantList.get(i).getPassword();
                ObjRowData[2] = ApplicantList.get(i).getFullName();
                ObjRowData[3] = ApplicantList.get(i).getEmail();
                ObjRowData[4] = ApplicantList.get(i).getMobileNo();
                ObjRowData[5] = ApplicantList.get(i).getIDNo();
                ObjRowData[6] = ApplicantList.get(i).getAddress();
                ObjRowData[7] = ApplicantList.get(i).getHouseholdIncome();
                ObjRowData[8] = ApplicantList.get(i).getSpecifiedOrg().getOrgName();
                // add the row data to the table model
                tableModel.addRow(ObjRowData);
            }
        }
        // Check if the selected option is set to Full Name 
        else {
            // Create a new copy of ArrayList with the same data 
            ArrayList<Applicant> copyAppList = new ArrayList<>(ApplicantList);
            // Sort the ArrayList using Comparable interface
            Collections.sort(copyAppList);
            for(int i = 0; i < copyAppList.size(); i++){
                // Get each of the required attributes from the ArrayList and assign it to the row data
                ObjRowData[0] = copyAppList.get(i).getUsername();
                ObjRowData[1] = copyAppList.get(i).getPassword();
                ObjRowData[2] = copyAppList.get(i).getFullName();
                ObjRowData[3] = copyAppList.get(i).getEmail();
                ObjRowData[4] = copyAppList.get(i).getMobileNo();
                ObjRowData[5] = copyAppList.get(i).getIDNo();
                ObjRowData[6] = copyAppList.get(i).getAddress();
                ObjRowData[7] = copyAppList.get(i).getHouseholdIncome();
                ObjRowData[8] = copyAppList.get(i).getSpecifiedOrg().getOrgName();
                // add the row data to the table model
                tableModel.addRow(ObjRowData);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppsTable;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollApps;
    private javax.swing.JLabel RegisteredApplicantsLabel;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewRegisteredApplicantsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> sortOptions;
    // End of variables declaration//GEN-END:variables
}
