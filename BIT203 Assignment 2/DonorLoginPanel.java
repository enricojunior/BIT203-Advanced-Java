package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * DonorLoginPanel.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The DonorLoginPanel class is responsible of displaying the
 * Login Form for the Donor by inputting valid credentials to the Text fields
 */
public class DonorLoginPanel extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;

    /**
     * DonorLoginPanel Form
     * Default Constructor of the DonorLoginPanel to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public DonorLoginPanel(HELPAid HELPAid) {
        this.HELPAid = HELPAid;
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

        DonorMainLoginPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        backButtonDonor = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        LoginDonorLabel = new javax.swing.JLabel();
        DonorUsernameLabel = new javax.swing.JLabel();
        DonorUsernameField = new javax.swing.JTextField();
        DonorPasswordLabel = new javax.swing.JLabel();
        DonorPasswordField = new javax.swing.JPasswordField();
        DonorLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        DonorMainLoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        backButtonDonor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButtonDonor.setText("Back");
        backButtonDonor.setPreferredSize(new java.awt.Dimension(80, 30));
        backButtonDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonDonorActionPerformed(evt);
            }
        });

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
            .addGroup(SideLeftPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backButtonDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideLeftPanelLayout.setVerticalGroup(
            SideLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideLeftPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(HELPAidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HELPAidLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(backButtonDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        LoginDonorLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginDonorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginDonorLabel.setText("Login as Donor");

        DonorUsernameLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        DonorUsernameLabel.setText("Donor's Username");

        DonorPasswordLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        DonorPasswordLabel.setText("Donor's Password");

        DonorLoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DonorLoginBtn.setText("Login");
        DonorLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonorLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DonorMainLoginPanelLayout = new javax.swing.GroupLayout(DonorMainLoginPanel);
        DonorMainLoginPanel.setLayout(DonorMainLoginPanelLayout);
        DonorMainLoginPanelLayout.setHorizontalGroup(
            DonorMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DonorMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                        .addGroup(DonorMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(DonorMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DonorPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DonorUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DonorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DonorUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(LoginDonorLabel))
                            .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(DonorLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        DonorMainLoginPanelLayout.setVerticalGroup(
            DonorMainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DonorMainLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginDonorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(DonorUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonorUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(DonorPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(DonorLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DonorMainLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DonorMainLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the Donor wants to return back to the HELPAidGUI frame
     * @param evt
     */
    private void backButtonDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonDonorActionPerformed
        // Display the HELPAidGUI Panel 
        HELPAidGUI HELPmainWindow = new HELPAidGUI();
        // set its visibility to true and dispose the previous frame
        HELPmainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonDonorActionPerformed

    /**
     * The method below is used to add an event to the Login button
     * Where the Donor wants to login to the Applicant system
     * @param evt
     */
    private void DonorLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonorLoginBtnActionPerformed
        // Get the credentials from the JTextField components
        String DonorUsername = DonorUsernameField.getText();
        String DonorPwd = String.valueOf(DonorPasswordField.getText());
        
        // Check if the username or password field remains empty blank 
        if(DonorUsernameField.getText().isEmpty() || DonorPasswordField.getText().isEmpty()){
            // It will display the following message, if one of the credentials remains empty
            JOptionPane.showMessageDialog(null, "Please fill in all of the required fields!");
        } 
        // Check if the Donor enters the valid username or password
        else if(DonorUsername.equals("Donor") && DonorPwd.equals("Donor2023")){
            // Display the following message if the Donor inputted valid credentials
            JOptionPane.showMessageDialog(null, "Successfully login to the system!");
            // dispose the form fields
            clearFormFields();
            
            // Redirect the Donor to the Donor Menu
            // set its visibility to true and dispose the previous frame
            DonorMenu ViewDonorMenu = new DonorMenu(HELPAid);
            ViewDonorMenu.setVisible(true);
            dispose();           
        } 
        // Check if the Donor enters invalid credentials
        else {
            // It will display the following message if the Donor enters invalid username or password
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
            // dispose the form fields
            clearFormFields();
        }
    }//GEN-LAST:event_DonorLoginBtnActionPerformed

    /**
     * The method below is used to set the Username and Password Fields to empty
     * Non-returnable function, no parameters required
     */
    public void clearFormFields(){
        DonorUsernameField.setText("");
        DonorPasswordField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonorLoginBtn;
    private javax.swing.JPanel DonorMainLoginPanel;
    private javax.swing.JPasswordField DonorPasswordField;
    private javax.swing.JLabel DonorPasswordLabel;
    private javax.swing.JTextField DonorUsernameField;
    private javax.swing.JLabel DonorUsernameLabel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LoginDonorLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton backButtonDonor;
    // End of variables declaration//GEN-END:variables
}
