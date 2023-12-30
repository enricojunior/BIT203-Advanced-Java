package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * RegisterCashDonationForm.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;
import java.time.LocalDate;

/**
 * The RegisterCashDonationForm is responsible of displaying the Cash Donation Form for the Representative.
 * The Representative fills all of the required fields in the Cash Donation Contribution Form.
 */
public class RegisterCashDonationForm extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    private Appeal dctAppeal;
    
    /**
     * RegisterCashDonationForm Form
     * Default Constructor of RegisterCashDonationForm to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     * @param dctAppeal - Appeal
     */
    public RegisterCashDonationForm(HELPAid HELPAid, User currentUser, Appeal dctAppeal) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        this.dctAppeal = dctAppeal;
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

        RegisterCashDonationMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        ContributingCsDonationLabel = new javax.swing.JLabel();
        AmountLabel = new javax.swing.JLabel();
        AmountText = new javax.swing.JTextField();
        ChannelLabel = new javax.swing.JLabel();
        ChannelText = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        ReferenceNumLabel = new javax.swing.JLabel();
        ReferenceNumText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        RegisterCashDonationMainPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        ContributingCsDonationLabel.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        ContributingCsDonationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContributingCsDonationLabel.setText("Contributing Cash Donation");

        AmountLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        AmountLabel.setText("Amount");

        ChannelLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        ChannelLabel.setText("Payment Channel");

        submitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        ReferenceNumLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        ReferenceNumLabel.setText("Reference Number");

        javax.swing.GroupLayout RegisterCashDonationMainPanelLayout = new javax.swing.GroupLayout(RegisterCashDonationMainPanel);
        RegisterCashDonationMainPanel.setLayout(RegisterCashDonationMainPanelLayout);
        RegisterCashDonationMainPanelLayout.setHorizontalGroup(
            RegisterCashDonationMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegisterCashDonationMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                        .addGroup(RegisterCashDonationMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(RegisterCashDonationMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChannelText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ContributingCsDonationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChannelLabel)
                                    .addComponent(ReferenceNumLabel)
                                    .addComponent(ReferenceNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 55, Short.MAX_VALUE))))
        );
        RegisterCashDonationMainPanelLayout.setVerticalGroup(
            RegisterCashDonationMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RegisterCashDonationMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ContributingCsDonationLabel)
                .addGap(30, 30, 30)
                .addComponent(AmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChannelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChannelText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReferenceNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReferenceNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterCashDonationMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterCashDonationMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event ot the submit button
     * Where the Representative wants to submit contribution in cash to the specified Appeal made by specific Organization
     * @param evt
     */
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // Get each required attributes for the Cash Donation from the JTextField components
        int csAmount = Integer.parseInt(AmountText.getText());
        String paymentChannel = ChannelText.getText();
        String referenceNo = ReferenceNumText.getText();
        // apply try-catch clause
        try {
            // Check if one of the amount, channel, or reference number Text field remains empty blank
            if(AmountText.getText().isEmpty() || ChannelText.getText().isEmpty() || ReferenceNumText.getText().isEmpty()){
                // Display the following message if one of the required fields remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check if the cash amount inputted is negative number or remains 0
            else if(csAmount <= 0){
                // Display the following message to remind the Representative cannot inputted 0 or any negative numbers
                JOptionPane.showMessageDialog(this, "Cash Amount cannot be a negative number or 0!");
                // dispose the cash amount field
                destroyNumField();
            }
            // Check if the Representative enters valid inputs to all of the required fields
            else {
                // Get the current date from the LocalDate library
                LocalDate receivedCsDonationDate = LocalDate.now();
                // Create a new CashDonation object with the required parameters
                CashDonation newCsDonation = new CashDonation(receivedCsDonationDate, dctAppeal, csAmount, paymentChannel, referenceNo);
                // Display the following message if the contribution has been successfully added to the specified Appeal made by the specific Organization
                // Show the contribution ID made by the Representative
                JOptionPane.showMessageDialog(this, "Successfully added a new contribution.\nGenerated ID: " 
                            + newCsDonation.getContributionID());
                // Add the contribution object to the specified Appeal
                dctAppeal.addContribution(newCsDonation);
                
                // Once the Representative finishes recording the contribution
                // Redirect the Representative to the Representative menu
                // set its visibility to true and dispose the previous frame
                RepresentativeMenu returnOrgRepMenu = new RepresentativeMenu(HELPAid, currentUser);
                returnOrgRepMenu.setVisible(true);
                dispose();
            }
        }
        catch(Exception e){
            // catch and exception if the Representative enters an invalid data type
            JOptionPane.showMessageDialog(this, e.getMessage());
            // printStackTrace() method
            e.printStackTrace();
            // dispose the cash amount field
            destroyNumField();
        }        
    }//GEN-LAST:event_submitBtnActionPerformed
    
    /**
     * This method is used to set all of the data fields to an empty string
     * Non-returnable method - destroyNumField();
     */
    private void destroyNumField(){
        AmountText.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JTextField AmountText;
    private javax.swing.JLabel ChannelLabel;
    private javax.swing.JTextField ChannelText;
    private javax.swing.JLabel ContributingCsDonationLabel;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JLabel ReferenceNumLabel;
    private javax.swing.JTextField ReferenceNumText;
    private javax.swing.JPanel RegisterCashDonationMainPanel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
