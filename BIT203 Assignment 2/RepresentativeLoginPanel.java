package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RepresentativeLoginPanel.java
 * Date: 26-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The RepresentativeLoginPanel class is responsible of displaying the
 * Login Form for the specified Organization Representative by inputting valid credentials to the Text fields
 */
public class RepresentativeLoginPanel extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser = null;

    /**
     * RepresentativeLoginPanel Form
     * Default Constructor of RepresentativeLoginPanel to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public RepresentativeLoginPanel(HELPAid HELPAid) {
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

        OrgRepLoginPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        backButtonRep = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        LoginRepLabel = new javax.swing.JLabel();
        RepUsernameLabel = new javax.swing.JLabel();
        RepUsernameField = new javax.swing.JTextField();
        RepPasswordLabel = new javax.swing.JLabel();
        RepPasswordField = new javax.swing.JPasswordField();
        RepLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        OrgRepLoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        backButtonRep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButtonRep.setText("Back");
        backButtonRep.setPreferredSize(new java.awt.Dimension(80, 30));
        backButtonRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonRepActionPerformed(evt);
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
                .addComponent(backButtonRep, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(backButtonRep, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        LoginRepLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginRepLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginRepLabel.setText("Login as Representative");

        RepUsernameLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        RepUsernameLabel.setText("Username");

        RepPasswordLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        RepPasswordLabel.setText("Password");

        RepLoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RepLoginBtn.setText("Login");
        RepLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrgRepLoginPanelLayout = new javax.swing.GroupLayout(OrgRepLoginPanel);
        OrgRepLoginPanel.setLayout(OrgRepLoginPanelLayout);
        OrgRepLoginPanelLayout.setHorizontalGroup(
            OrgRepLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrgRepLoginPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OrgRepLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrgRepLoginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrgRepLoginPanelLayout.createSequentialGroup()
                        .addGroup(OrgRepLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrgRepLoginPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(RepLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OrgRepLoginPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(OrgRepLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RepPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RepUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RepUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoginRepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 60, Short.MAX_VALUE))))
        );
        OrgRepLoginPanelLayout.setVerticalGroup(
            OrgRepLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(OrgRepLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginRepLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(RepUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RepUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(RepPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(RepLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrgRepLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrgRepLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the back button
     * Where the Representative wants to return back to the HELPAidGUI Panel
     * @param evt
     */
    private void backButtonRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonRepActionPerformed
        // Redirect the Representative to the HELPAidGUI Panel
        HELPAidGUI HELPmainWindow = new HELPAidGUI();
        // set its visibility to true and dispose the previous frame
        HELPmainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonRepActionPerformed

    /**
     * The method below is used to add an event to the Login button
     * where the Representative wants to login to the Representative system
     * @param evt
     */
    private void RepLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepLoginBtnActionPerformed
        // Get the credentials from the JTextField components
        String repUsername = RepUsernameField.getText();
        String repPassword = String.valueOf(RepPasswordField.getText());
        
        // Check if the username or password field remains empty blank
        if(RepUsernameField.getText().isEmpty() || RepPasswordField.getText().isEmpty()){
            // It will display the following message, if one of the credentials remains empty
            JOptionPane.showMessageDialog(null, "Please fill in all of the required fields!");
        // // Check if the system detect the User wants to login is an instance of Organization Representative
        } else if(HELPAid.DetectUserOrgRep(repUsername, repPassword)){
            // Display the following message if the Representative inputted valid credentials
            JOptionPane.showMessageDialog(null, "Successfully login to the system!");
            // clear the form fields
            clearFormFields();
            
            // Get the current User from the HELPAid object
            currentUser = HELPAid.getUser(repUsername, repPassword);
            // Redirect the Representative to the Representative Menu
            // Set its visibility to true and dispose the previous frame  
            RepresentativeMenu repMenu = new RepresentativeMenu(HELPAid, currentUser);
            repMenu.setVisible(true);
            dispose();
        // Check if the Representative enters invalid credentials
        } else {
            // It will display the following message if the Representative enters invalid username or password
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
            // clear the form fields
            clearFormFields();
        }
    }//GEN-LAST:event_RepLoginBtnActionPerformed
    
    /**
     * The method below is used to set the Username and Password Fields to empty
     * Non-returnable method, no parameters required
     */
    public void clearFormFields(){
        RepUsernameField.setText("");
        RepPasswordField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LoginRepLabel;
    private javax.swing.JPanel OrgRepLoginPanel;
    private javax.swing.JButton RepLoginBtn;
    private javax.swing.JPasswordField RepPasswordField;
    private javax.swing.JLabel RepPasswordLabel;
    private javax.swing.JTextField RepUsernameField;
    private javax.swing.JLabel RepUsernameLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton backButtonRep;
    // End of variables declaration//GEN-END:variables
}
