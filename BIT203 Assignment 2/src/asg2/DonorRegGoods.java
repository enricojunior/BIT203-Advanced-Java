package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * DonorRegGoods.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

// LIST OF THE REQUIRED UTILITIES
import javax.swing.JOptionPane;
import java.time.LocalDate;

/**
 * The DonorRegGoods class is responsible of displaying the Goods Form for the Donor.
 * The Donor fills all of the required fields in the Goods Contribution Form.
 */
public class DonorRegGoods extends javax.swing.JFrame {
    
    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private Appeal dctAppeal;
    
    /**
     * DonorRegGoods Form
     * Default Constructor of DonorRegGoods to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param dctAppeal - Appeal
     */
    public DonorRegGoods(HELPAid HELPAid, Appeal dctAppeal) {
        this.HELPAid = HELPAid;
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

        DonorAddGoodsMainPanel = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        ContributingGoodsLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JTextField();
        EstValueLabel = new javax.swing.JLabel();
        EstValueText = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DonorAddGoodsMainPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        ContributingGoodsLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ContributingGoodsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContributingGoodsLabel.setText("Contributing Goods");

        DescriptionLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        DescriptionLabel.setText("Goods Description");

        EstValueLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        EstValueLabel.setText("Goods Estimated Value");

        submitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DonorAddGoodsMainPanelLayout = new javax.swing.GroupLayout(DonorAddGoodsMainPanel);
        DonorAddGoodsMainPanel.setLayout(DonorAddGoodsMainPanelLayout);
        DonorAddGoodsMainPanelLayout.setHorizontalGroup(
            DonorAddGoodsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DonorAddGoodsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                        .addGroup(DonorAddGoodsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(DonorAddGoodsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EstValueText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ContributingGoodsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EstValueLabel)))
                            .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 55, Short.MAX_VALUE))))
        );
        DonorAddGoodsMainPanelLayout.setVerticalGroup(
            DonorAddGoodsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DonorAddGoodsMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ContributingGoodsLabel)
                .addGap(42, 42, 42)
                .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(EstValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstValueText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DonorAddGoodsMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DonorAddGoodsMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method below is used to add an event to the submit button
     * Where the Donor wants to submit contribution in Goods to the specified Appeal
     */
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // Get each required attributes for the Goods from the JTextField components
        int EstValue = Integer.parseInt(EstValueText.getText());
        String GoodsDesc = DescriptionText.getText();
        
        // apply try-catch clause
        try {
            // Check if one of the estimated value and description Text field remains empty blank
            if(EstValueText.getText().isEmpty() || DescriptionText.getText().isEmpty()){
                // Display the following message if one of the required fields remains empty blank
                JOptionPane.showMessageDialog(this, "Please fill all of the required fields!");
            }
            // Check if the estimated value inputted is negative number or remains 0
            else if(EstValue <= 0){
                // Display the following message to remind the Donor cannot inputted 0 or any negative numbers
                JOptionPane.showMessageDialog(this, "Goods Estimated Value cannot be a negative number or 0!");
                // dispose the estimated value field
                destroyNumField();
            }
            // Check if the Donor enters valid inputs to all of the required fields
            else {
                // Get the current date from the LocalDate library
                LocalDate receivedGoodsDate = LocalDate.now();
                // Create a new Goods object with the required parameters 
                Goods newGoods = new Goods(receivedGoodsDate, dctAppeal, GoodsDesc, EstValue);
                // Display the following message if the contribution has been successfully added to the specified Appeal
                // Show the contribution ID made by the Donor
                JOptionPane.showMessageDialog(this, "Successfully added a new contribution.\nGenerated ID: " 
                            + newGoods.getContributionID());
                // Add the contribution object to the specified Appeal
                dctAppeal.addContribution(newGoods);
                
                // Once the Donor finishes recording the contribution, 
                // Redirect the Donor to the Donor Menu
                // Set its visibility to true and dispose the previous frame 
                DonorMenu DnrMenuReturn = new DonorMenu(HELPAid);
                DnrMenuReturn.setVisible(true);
                dispose();
            }
        }
        catch(Exception e){
            // catch and exception if the Donor enters an invalid data type
            JOptionPane.showMessageDialog(this, e.getMessage());
            // printStackTrace() method
            e.printStackTrace();
            // dispose the estimated value field
            destroyNumField();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    /**
     * This method is used to set all of the data fields to an empty string
     * Non-returnable method - destroyNumField();
     */
    private void destroyNumField(){
        EstValueText.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContributingGoodsLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionText;
    private javax.swing.JPanel DonorAddGoodsMainPanel;
    private javax.swing.JLabel EstValueLabel;
    private javax.swing.JTextField EstValueText;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
