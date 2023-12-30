package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * AppendDocument.java
 * Date: 24-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE UTILITIES REQUIRED
import javax.swing.JOptionPane;

/**
 * The AppendDocument class is also responsible of displaying the Document Form Panel
 * But this time, the Applicant is registered with the assistance of the Organization Representative
 * Once the Organization Representative done finishing the Applicant's registration, the Organization
 * Representative will be directed to this panel
 */
public class AppendDocument extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    private Applicant dctApplicant;
    
    /**
     * AppendDocument Form
     * Default Constructor of AppendDocument to initialize all of the required components
     * @param HELPAid = HELPAid
     * @param currentUser - User
     * @param dctApplicant - Applicant
     */
    public AppendDocument(HELPAid HELPAid, User currentUser, Applicant dctApplicant) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        this.dctApplicant = dctApplicant;
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

        AppendDocumentMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        createNewDocLabel = new javax.swing.JLabel();
        FileNameTextField = new javax.swing.JTextField();
        FileNameLabel = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        DescriptionLabel = new javax.swing.JLabel();
        DescriptionTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AppendDocumentMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

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
        );
        SideLeftPanelLayout.setVerticalGroup(
            SideLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideLeftPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HELPAidLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        createNewDocLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        createNewDocLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createNewDocLabel.setText("Create New Document");

        FileNameLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        FileNameLabel.setText("Document File Name");

        SubmitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        DescriptionLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        DescriptionLabel.setText("Document Description");

        javax.swing.GroupLayout AppendDocumentMainPanelLayout = new javax.swing.GroupLayout(AppendDocumentMainPanel);
        AppendDocumentMainPanel.setLayout(AppendDocumentMainPanelLayout);
        AppendDocumentMainPanelLayout.setHorizontalGroup(
            AppendDocumentMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppendDocumentMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AppendDocumentMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppendDocumentMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AppendDocumentMainPanelLayout.createSequentialGroup()
                        .addGroup(AppendDocumentMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AppendDocumentMainPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(AppendDocumentMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createNewDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AppendDocumentMainPanelLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE))))
        );
        AppendDocumentMainPanelLayout.setVerticalGroup(
            AppendDocumentMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppendDocumentMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AppendDocumentMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(createNewDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(FileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppendDocumentMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppendDocumentMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method below is used to add an event to the submit button 
     * Where the Organization Representative proceeds to submit document(s) once they're filling out the fields
     */
    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // List of the required attributes
        String fileName, fileDes;
        // Get the file name and file description from the JTextField components
        fileName = FileNameTextField.getText();
        fileDes = DescriptionTextField.getText();
        
        // Check if the File Name or Description remains empty blank
        if(FileNameTextField.getText().isEmpty() || DescriptionTextField.getText().isEmpty()){
            // It will display the following message if one of them remains empty blank
            JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
        }
        else {
            // Create a new document object with the required parameters
            Document newDoc = new Document(fileName, fileDes, dctApplicant);
            // Add the document to the specified Applicant
            dctApplicant.addDocument(newDoc);
            // Display the following message where the document has been successfully uploaded
            // Display the Document's file name and its generated ID
            JOptionPane.showMessageDialog(this, "Successfully uploaded a new document.\nDocument file: " + newDoc.getFileName()
                + "\nGenerated ID: " + newDoc.getDocumentID());
            // Set the text field to empty
            destroyFields();
            
             // Confirmation Pane whether the Representative wants to add another document to the registered Applicant
            int OrgChoice = JOptionPane.showConfirmDialog(this, "Would you like to add another document to the registered Applicant?",
                "Confirm Add Document", JOptionPane.YES_NO_OPTION);
            // Check if the Applicant clicked YES option
            if(OrgChoice == JOptionPane.YES_OPTION){
                // Adding another document to the specified Applicant, set its visibility to true
                AppendDocument addDocPanel = new AppendDocument(HELPAid, currentUser, dctApplicant);
                addDocPanel.setVisible(true);
                // dispose the previous frame
                dispose();
            } else {
                // Return back to the Representative Menu if the Representative refuses to add another document to the Applicant
                RepresentativeMenu orgRepMenu = new RepresentativeMenu(HELPAid, currentUser);
                orgRepMenu.setVisible(true);
                // dispose the previous frame
                dispose();
            }
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed
    
    /**
     * This method is used to set all of the data fields to an empty string
     * Non-returnable method - destroyFields();
     */
    private void destroyFields(){
        FileNameTextField.setText("");
        DescriptionTextField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppendDocumentMainPanel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JLabel FileNameLabel;
    private javax.swing.JTextField FileNameTextField;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel createNewDocLabel;
    // End of variables declaration//GEN-END:variables
}