package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ViewPastAppeals.java
 * Date: 27-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The ViewPastAppeals class is responsible of displaying List of
 * the Past Appeals from various Organizations, where all of the
 * Appeals outcome is set to APPROVED.
 */
public class ViewPastAppeals extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    DefaultTableModel tableModel;
     
    /**
     * ViewPastAppeals Form
     * Default Constructor of ViewPastAppeals to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public ViewPastAppeals(HELPAid HELPAid) {
        this.HELPAid = HELPAid;
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
        addDataPstAplToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewPastAppealsPanel = new javax.swing.JPanel();
        UpperIconPanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        PastAppealLbl = new javax.swing.JLabel();
        JScrollAppeals = new javax.swing.JScrollPane();
        AppealsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewPastAppealsPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        PastAppealLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PastAppealLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PastAppealLbl.setText("List Of Past Appeals");

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

        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewPastAppealsPanelLayout = new javax.swing.GroupLayout(ViewPastAppealsPanel);
        ViewPastAppealsPanel.setLayout(ViewPastAppealsPanelLayout);
        ViewPastAppealsPanelLayout.setHorizontalGroup(
            ViewPastAppealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewPastAppealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HELPAidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(PastAppealLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(JScrollAppeals, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                .addGap(21, 301, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        ViewPastAppealsPanelLayout.setVerticalGroup(
            ViewPastAppealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                .addGroup(ViewPastAppealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpperIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                        .addGroup(ViewPastAppealsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewPastAppealsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PastAppealLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollAppeals, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPastAppealsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPastAppealsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the Donor wants to return back to the Donor Menu Panel
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // Redirect the Donor to the Donor Menu Panel
        // set its visibility to true and dispose the previous frame
        DonorMenu DnrMenu = new DonorMenu(HELPAid);
        DnrMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * This method below is used to add the Past Appeals from every Organization to the JTable
     * Non-returnable function - addDataPstAplToJTable();
     */
    private void addDataPstAplToJTable(){
        Object ObjRowData[] = new Object[5];
        // Get the List of the Past Appeals from various Organizations
        ArrayList<Appeal> PastAppeals = HELPAid.getPstAppealList();
        // Sort the ArrayList using Comparator interface
        Collections.sort(PastAppeals, new AppealComparator());
        for(int i = 0; i < PastAppeals.size(); i++){
            // Get each attributes from the ArrayList and assign it to the row data
            ObjRowData[0] = PastAppeals.get(i).getAppealID();
            ObjRowData[1] = PastAppeals.get(i).getFromDate();
            ObjRowData[2] = PastAppeals.get(i).getToDate();
            ObjRowData[3] = PastAppeals.get(i).getAplDescription();
            ObjRowData[4] = PastAppeals.get(i).getOutcome();
            // add the row data to the table model
            tableModel.addRow(ObjRowData);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppealsTable;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JScrollPane JScrollAppeals;
    private javax.swing.JLabel PastAppealLbl;
    private javax.swing.JPanel UpperIconPanel;
    private javax.swing.JPanel ViewPastAppealsPanel;
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}
