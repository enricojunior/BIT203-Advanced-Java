package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewRegisteredRepresentatives.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Collections;

/**
 * ViewRegisteredRepresentatives class is responsible of displaying the List
 * of Registered Representatives from various Organizations.
 * The User is given an option whether wants to view it in original sequence or sorted according to full name.
 */
public class ViewRegisteredRepresentatives extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    String UserSelectedOption = "Default";
    private static HELPAid HELPAid;
    DefaultTableModel tableModel;
    
    /**
     * ViewRegisteredRepresentatives Form
     * Default Constructor of ViewRegisteredRepresentatives to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public ViewRegisteredRepresentatives(HELPAid HELPAid) {
        this.HELPAid = HELPAid;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        
        // Get the table model and set its row count to 0
        tableModel = (DefaultTableModel) RepsTable.getModel();
        tableModel.setRowCount(0);
        // Add the Registered Representatives to the JTable
        addDataOrgRepToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewRegisteredOrgRepsPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegisteredOrgRepsLabel = new javax.swing.JLabel();
        JScrollOrgReps = new javax.swing.JScrollPane();
        RepsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        sortOptions = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewRegisteredOrgRepsPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        RegisteredOrgRepsLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegisteredOrgRepsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisteredOrgRepsLabel.setText("Registered Representatives");

        RepsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RepsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Full Name", "Email", "Mobile No", "Job Title", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RepsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RepsTable.getTableHeader().setReorderingAllowed(false);
        JScrollOrgReps.setViewportView(RepsTable);

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

        javax.swing.GroupLayout ViewRegisteredOrgRepsPanelLayout = new javax.swing.GroupLayout(ViewRegisteredOrgRepsPanel);
        ViewRegisteredOrgRepsPanel.setLayout(ViewRegisteredOrgRepsPanelLayout);
        ViewRegisteredOrgRepsPanelLayout.setHorizontalGroup(
            ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JScrollOrgReps, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel))
                    .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(RegisteredOrgRepsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                        .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ViewRegisteredOrgRepsPanelLayout.setVerticalGroup(
            ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                .addGroup(ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                        .addGroup(ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewRegisteredOrgRepsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegisteredOrgRepsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewRegisteredOrgRepsPanelLayout.createSequentialGroup()
                                .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScrollOrgReps, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredOrgRepsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewRegisteredOrgRepsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * The method below is used to add an event to the back button
     * Where if the User clicked the button, it will return to the HELPAidGUI Panel
     * @param evt 
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Redirect the User to the HELPAidGUI Panel
        // Set its visibility to true and dispose the previous frame
        HELPAidGUI GUIPanel = new HELPAidGUI();
        GUIPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    
    /**
     * The method below is used to add an event to the sort options
     * Where the User wants to view the registered Representatives
     * either in Original Sequence or Sorted According to Full Name
     * @param evt
     */
    private void sortOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortOptionsActionPerformed
        // Get the selected option according to the JComboBox selecion
        UserSelectedOption = sortOptions.getSelectedItem().toString();
        // Set its row count to 0
        tableModel.setRowCount(0);
        // Add the registered Representatives to the JTable
        addDataOrgRepToJTable();
    }//GEN-LAST:event_sortOptionsActionPerformed

    /**
     * The method below is used to add the List of the Registered Representatives to the JTable
     * Non-returnable function - addDataOrgRepToJTable();
     */
    private void addDataOrgRepToJTable(){
        Object ObjRowData[] = new Object[7];
        // Get the List of the Registered Representatives from the HELPAid Object
        ArrayList<OrganizationRep> RepresentativeList = HELPAid.getOrgRepList();
        
        // Check if the selected option is set to default
        if(UserSelectedOption.equals("Default")){
            for(int i = 0; i < RepresentativeList.size(); i++){
                /// Get each of the required attributes from the ArrayList and assign it to the row data
                ObjRowData[0] = RepresentativeList.get(i).getUsername();
                ObjRowData[1] = RepresentativeList.get(i).getPassword();
                ObjRowData[2] = RepresentativeList.get(i).getFullName();
                ObjRowData[3] = RepresentativeList.get(i).getEmail();
                ObjRowData[4] = RepresentativeList.get(i).getMobileNo();
                ObjRowData[5] = RepresentativeList.get(i).getJobTitle();
                ObjRowData[6] = RepresentativeList.get(i).getThisOrg().getOrgName();
                // add the row data to the table model
                tableModel.addRow(ObjRowData);
            }
        }
        // Check if the selected option is set to full name 
        else {
            // Create a new copy of array list with the same data
            ArrayList<OrganizationRep> copyRepList = new ArrayList<>(RepresentativeList);
            // Sort the ArrayList using Comparable interface
            Collections.sort(copyRepList);
            for(int i = 0; i < copyRepList.size(); i++){
                // Get each of the required attributes from the ArrayList and assign it to the row data
                ObjRowData[0] = copyRepList.get(i).getUsername();
                ObjRowData[1] = copyRepList.get(i).getPassword();
                ObjRowData[2] = copyRepList.get(i).getFullName();
                ObjRowData[3] = copyRepList.get(i).getEmail();
                ObjRowData[4] = copyRepList.get(i).getMobileNo();
                ObjRowData[5] = copyRepList.get(i).getJobTitle();
                ObjRowData[6] = copyRepList.get(i).getThisOrg().getOrgName();
                // add the row data to the table model
                tableModel.addRow(ObjRowData);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollOrgReps;
    private javax.swing.JLabel RegisteredOrgRepsLabel;
    private javax.swing.JTable RepsTable;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewRegisteredOrgRepsPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> sortOptions;
    // End of variables declaration//GEN-END:variables
}
