package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * HELPAidAdminLoginPanel.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;

/**
 * The HELPAidAdminLoginPanel is responsible of displaying the
 * Login Form for the HELPAid Admin by inputting valid credentials to the Text fields 
 */
public class HELPAidAdminLoginPanel extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;

    /**
     * HELPAidAdminLoginPanel Form
     * Default Constructor of the HELPAidAdminLoginPanel to initialize all of the required components
     * @param HELPAid
     */
    public HELPAidAdminLoginPanel(HELPAid HELPAid) {
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

        HELPAidAdminMainPanelLogin = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        backButtonAdmin = new javax.swing.JButton();
        HELPLOGOLabel = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        LoginHELPAdminLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        Passwordfield = new javax.swing.JPasswordField();
        AdminLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        HELPAidAdminMainPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        HELPAidAdminMainPanelLogin.setPreferredSize(new java.awt.Dimension(700, 500));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        backButtonAdmin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButtonAdmin.setText("Back");
        backButtonAdmin.setPreferredSize(new java.awt.Dimension(80, 30));
        backButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonAdminActionPerformed(evt);
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
                .addComponent(backButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(backButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        usernameLbl.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLbl.setText("HELP Aid Admin's Username");

        LoginHELPAdminLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginHELPAdminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginHELPAdminLabel.setText("Login as HELPAid Admin");

        passwordLbl.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLbl.setText("HELP Aid Admin's Password");

        AdminLoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AdminLoginBtn.setText("Login");
        AdminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HELPAidAdminMainPanelLoginLayout = new javax.swing.GroupLayout(HELPAidAdminMainPanelLogin);
        HELPAidAdminMainPanelLogin.setLayout(HELPAidAdminMainPanelLoginLayout);
        HELPAidAdminMainPanelLoginLayout.setHorizontalGroup(
            HELPAidAdminMainPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HELPAidAdminMainPanelLoginLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HELPAidAdminMainPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HELPAidAdminMainPanelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(HELPAidAdminMainPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Passwordfield, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLbl)
                            .addComponent(LoginHELPAdminLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameField))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(HELPAidAdminMainPanelLoginLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(AdminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HELPAidAdminMainPanelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        HELPAidAdminMainPanelLoginLayout.setVerticalGroup(
            HELPAidAdminMainPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HELPAidAdminMainPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginHELPAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(usernameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(passwordLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(AdminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HELPAidAdminMainPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HELPAidAdminMainPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * The method below is used to add an event to the back button
     * Where the HELPAid Admin wants to return back to the HELPAidGUI frame
     * @param evt 
     */
    private void backButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonAdminActionPerformed
        // Display the HELPAidGUI Panel 
        HELPAidGUI HELPmainWindow = new HELPAidGUI();
        // set its visibility to true and dispose the previous frame
        HELPmainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonAdminActionPerformed
    
    /**
     * The method below is used to add an event to the login button
     * Where the HELPAid Admin wants to login to the HELPAid Admin system
     * @param evt 
     */
    private void AdminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginBtnActionPerformed
        // Get the credentials from the JTextField components
        String AdminUserName = usernameField.getText();
        String AdminPwd = String.valueOf(Passwordfield.getText());
        
        // check if the username or password field remains empty blank
        if(usernameField.getText().isEmpty() || Passwordfield.getText().isEmpty()){
            // It will display the following message, if one of the credentials remains empty
            JOptionPane.showMessageDialog(this, "Please fill in all of the required fields!");     
        } 
        // Check if the HELPAid Admin enters the valid username or password
        else if((AdminUserName.equals("HELPAidAdmin") && AdminPwd.equals("HELPAid2023"))){
            // Display the following message if the HELPAid Admin inputted valid credentials
            JOptionPane.showMessageDialog(this, "Successfully Login to the System!");
            // dispose the form fields
            clearFormFields();
            
            // Redirect the HELPAid Admin to the HELPAid Admin Menu
            // set its visibility to true and dispose the previous frame
            HELPAidAdminMenu HelpAidAdminMenu = new HELPAidAdminMenu(HELPAid);
            HelpAidAdminMenu.setVisible(true);
            dispose();  
        } 
        // Check if the HELPAid Admin enters invalid credentials
        else {
            // It will display the following message if the HELPAid Admin enters invalid username or password
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            // dispose the form fields
            clearFormFields();
        }
    }//GEN-LAST:event_AdminLoginBtnActionPerformed
    
    /**
     * The method below is used to set the Username and Password Fields to empty
     * Non-returnable function, no parameters required
     */
    public void clearFormFields(){
        usernameField.setText("");
        Passwordfield.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLoginBtn;
    private javax.swing.JPanel HELPAidAdminMainPanelLogin;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel LoginHELPAdminLabel;
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton backButtonAdmin;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
