package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * HELPAidAdminMenu.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * The HELPAidAdminMenu class is responsible of displaying the Menu for the HELPAid Admin.
 * The HELPAid Admin has given options to manage organization, register new organization,
 * saving and load data with the implementation of JFileChooser along with IO components.
 */
public class HELPAidAdminMenu extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;

    /**
     * HELPAidAdminMenu Form
     * Default Constructor of HELPAidAdminMenu to initialize all of the required components
     * @param HELPAid - HELPAid
     */
    public HELPAidAdminMenu(HELPAid HELPAid) {
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

        HELPAidAdminSystemMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        LogOutAdminBTN = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        RegOrgBtn = new javax.swing.JButton();
        ManageOrgBtn = new javax.swing.JButton();
        HELPAidAdminLbl = new javax.swing.JLabel();
        welcomeLabel1 = new javax.swing.JLabel();
        SaveDataBtn = new javax.swing.JButton();
        LoadDataBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        HELPAidAdminSystemMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        SideLeftPanel.setBackground(new java.awt.Color(0, 133, 255));
        SideLeftPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        HELPAidLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        HELPAidLabel.setForeground(new java.awt.Color(255, 255, 255));
        HELPAidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidLabel.setText("HELPAid");

        HELPAidLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/bwink-med-12-single-06.jpg"))); // NOI18N
        HELPAidLogo.setText("jLabel1");

        LogOutAdminBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LogOutAdminBTN.setText("Log Out");
        LogOutAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutAdminBTNActionPerformed(evt);
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
                .addComponent(LogOutAdminBTN)
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
                .addComponent(LogOutAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        welcomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel.setText("HELP Aid Admin");

        HELPLOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asg2/helplogo.png"))); // NOI18N
        HELPLOGOLabel.setPreferredSize(new java.awt.Dimension(150, 67));

        RegOrgBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RegOrgBtn.setText("Register New Organization");
        RegOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegOrgBtnActionPerformed(evt);
            }
        });

        ManageOrgBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ManageOrgBtn.setText("Manage Organization");
        ManageOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrgBtnActionPerformed(evt);
            }
        });

        HELPAidAdminLbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HELPAidAdminLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HELPAidAdminLbl.setText("HELPAid Admin System");

        welcomeLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        welcomeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeLabel1.setText("Welcome,");

        SaveDataBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SaveDataBtn.setText("Save Data");
        SaveDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDataBtnActionPerformed(evt);
            }
        });

        LoadDataBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoadDataBtn.setText("Load Data");
        LoadDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HELPAidAdminSystemMainPanelLayout = new javax.swing.GroupLayout(HELPAidAdminSystemMainPanel);
        HELPAidAdminSystemMainPanel.setLayout(HELPAidAdminSystemMainPanelLayout);
        HELPAidAdminSystemMainPanelLayout.setHorizontalGroup(
            HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                                .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                                .addComponent(SaveDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                        .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RegOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ManageOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(HELPAidAdminLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE))))
        );
        HELPAidAdminSystemMainPanelLayout.setVerticalGroup(
            HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HELPAidAdminSystemMainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(welcomeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeLabel)))
                .addGap(45, 45, 45)
                .addComponent(HELPAidAdminLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(RegOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ManageOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HELPAidAdminSystemMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HELPAidAdminSystemMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HELPAidAdminSystemMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the log out button
     * Where the HELPAid Admin wants to log out from the HELPAid Admin system
     * @param evt
     */
    private void LogOutAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutAdminBTNActionPerformed
        // Display the following message once the HELPAid Admin clicked the log out button
        JOptionPane.showMessageDialog(null, "Logging out from HELP Aid Admin System..");
        // Redirect the HELPAid Admin to the HELPAidGUI Panel
        // set its visibility to true and dispose the previous frame
        HELPAidGUI HELPMainWindow = new HELPAidGUI();
        HELPMainWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutAdminBTNActionPerformed

    /**
     * The method below is used to add an event to the Register Organization button
     * Where the HELPAid Admin wants to register new organization to the HELPAid object
     * @param evt
     */
    private void RegOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegOrgBtnActionPerformed
        // Redirect the HELPAid Admin to the Register Organization Form
        // set its visibility to true and dispose the previous frame
        RegisterOrganizationForm RegOrgForm = new RegisterOrganizationForm(HELPAid);
        RegOrgForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegOrgBtnActionPerformed

    /**
     * The method below is used to add an event to the Manage Organization button
     * Where the HELPAid Admin wants to add new Representative to the HELPAid object
     */
    private void ManageOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrgBtnActionPerformed
        // Check if there aren't any registered Organizations in the ArrayList
        if(HELPAid.getOrgList().isEmpty()){
            // It will display the following message, if there aren't any registered organizations in the system
            JOptionPane.showMessageDialog(this, "There aren't any registered Organizations in the system.");
        }
        // Check if there are any available registered organizations in the HELPAid System 
        else {
            // Redirect the HELPAidAdmin to the View Registered Organizations Panel
            // set its visibility to true and dispose the previous frame
            ViewRegisteredOrganizations ViewRegOrgs = new ViewRegisteredOrganizations(HELPAid);
            ViewRegOrgs.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ManageOrgBtnActionPerformed

    /**
     * The method below is used to add an event to the Save Data button
     * Where the HELPAid Admin wants to save data from the HELPAid object with a .ser file
     * @param evt
     */
    private void SaveDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDataBtnActionPerformed
        // FileOutputStream to write data in bytes to a file
        FileOutputStream fos = null;
        // apply try-catch clause
        try {
            // Prompts the HELPAid Admin to enter the file name
            var FileName = javax.swing.JOptionPane.showInputDialog("Enter file name");
            // Assign the file name and append .ser file to the FileOutputStream object 
            fos = new FileOutputStream(FileName + ".ser");
            // Writes the primitive data types to an OutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Write the HELPAid object
            oos.writeObject(HELPAid);
            // close the ObjectOutputStream
            oos.close();
        } 
        // catch a FileNotFoundException when the file is not found
        catch (FileNotFoundException eMessage) {
            Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, eMessage);
        } 
        // catch an IOException
        catch (IOException eMessage) {
            Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, eMessage);
        } 
        // finally clause
        finally {
            try {
                // Close the FileOutputStream object
                fos.close();
            } 
            // catch an IOException
            catch (IOException ex) {
                Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }//GEN-LAST:event_SaveDataBtnActionPerformed

    /**
     * The method below is used to add an event to the Load Data button
     * Where the HELPAid Admin wants to load data from the .ser file
     * @param evt
     */
    private void LoadDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadDataBtnActionPerformed
        // Set the FileInputStream to null
        FileInputStream fis = null;
        // apply try-catch clause
        try {
            // List of the required attributes for later
            int AdminSctOpt;
            String FILE_PATHING = null;
            // Add JFileChooser component to load data
            JFileChooser sctFile = new JFileChooser();
            // Set its current directory
            sctFile.setCurrentDirectory(new File("."));
            AdminSctOpt = sctFile.showOpenDialog(null);
            // Check if the HELPAid selects an approve option
            if(AdminSctOpt == JFileChooser.APPROVE_OPTION){
                // Assign the file path according to the selected file path
                FILE_PATHING = sctFile.getSelectedFile().getAbsolutePath();
            }
            // Assign the FileInputStream according to the file path
            fis = new FileInputStream(FILE_PATHING);
            ObjectInputStream ois = new ObjectInputStream(fis);
            // Reads the data from the HELPAid object
            HELPAid = (HELPAid) ois.readObject();
            // Close the ObjectInputStream
            ois.close();
            
            // Display the following message if the data has been successfully imported
            JOptionPane.showMessageDialog(this, "Successfully imported the data!\nReturning to the HELPAidGUI Panel.");
            // Redirect the HELPAid Admin to the HELPAidGUI Panel
            // set its visibility to true and dispose the previous frame
            HELPAidGUI mainPanel = new HELPAidGUI();
            mainPanel.setVisible(true);
            dispose();          
        } 
        // catch FileNotFoundException if the file name was not found
        catch (FileNotFoundException ex) {
            Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } 
        // catch an IOException
        catch (IOException ex) {
            Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } 
        // catch a ClassNotFoundException
        catch (ClassNotFoundException ex) {
            Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } 
        // finally clause
        finally {
            try {
                // Close the FileInputStream
                fis.close();
            } 
            // catch and IOException
            catch (IOException ex) {
                Logger.getLogger(HELPAidAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_LoadDataBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HELPAidAdminLbl;
    private javax.swing.JPanel HELPAidAdminSystemMainPanel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JButton LoadDataBtn;
    private javax.swing.JButton LogOutAdminBTN;
    private javax.swing.JButton ManageOrgBtn;
    private javax.swing.JButton RegOrgBtn;
    private javax.swing.JButton SaveDataBtn;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    // End of variables declaration//GEN-END:variables
}
