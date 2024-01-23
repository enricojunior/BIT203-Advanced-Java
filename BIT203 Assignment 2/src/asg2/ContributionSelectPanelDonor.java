package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ContributionSelectPanelDonor.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

/**
 * The ContributionSelectPanelDonor class is responsible of displaying a frame
 * that displays contribution types, such as Goods or Cash Donation.
 * But this time, it's Donor who chooses the Appeal by the ID
 */
public class ContributionSelectPanelDonor extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private Appeal dctAppeal;

    /**
     * ContributionSelectPanelDonor Form
     * Default Constructor of ContributionSelectPanelDonor to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param dctAppeal - dctAppeal
     */
    public ContributionSelectPanelDonor(HELPAid HELPAid, Appeal dctAppeal) {
        this.HELPAid = HELPAid;
        this.dctAppeal = dctAppeal;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        // Update the Appeal From Date and To Date's Label according to the Donor selection
        UpdateAppealDates();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContributionSelectionMainPanelDnr = new javax.swing.JPanel();
        SideLeftPanel = new javax.swing.JPanel();
        HELPAidLabel = new javax.swing.JLabel();
        HELPAidLogo = new javax.swing.JLabel();
        HELPLOGOLabel = new javax.swing.JLabel();
        GoodsBtn = new javax.swing.JButton();
        CashDonationBtn = new javax.swing.JButton();
        contributionTypeLabel = new javax.swing.JLabel();
        AppealFromDateLbl = new javax.swing.JLabel();
        AppealToDateLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ContributionSelectionMainPanelDnr.setBackground(new java.awt.Color(255, 255, 255));

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

        GoodsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GoodsBtn.setText("Goods");
        GoodsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoodsBtnActionPerformed(evt);
            }
        });

        CashDonationBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CashDonationBtn.setText("Cash Donation");
        CashDonationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashDonationBtnActionPerformed(evt);
            }
        });

        contributionTypeLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        contributionTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contributionTypeLabel.setText("Select The Contribution Type");

        AppealFromDateLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AppealFromDateLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AppealFromDateLbl.setText("Appeal's From Date: <Date>");

        AppealToDateLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AppealToDateLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AppealToDateLbl.setText("Appeal's To Date: <Date>");

        javax.swing.GroupLayout ContributionSelectionMainPanelDnrLayout = new javax.swing.GroupLayout(ContributionSelectionMainPanelDnr);
        ContributionSelectionMainPanelDnr.setLayout(ContributionSelectionMainPanelDnrLayout);
        ContributionSelectionMainPanelDnrLayout.setHorizontalGroup(
            ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GoodsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(CashDonationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                                .addGroup(ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AppealFromDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppealToDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                                .addComponent(contributionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))))
        );
        ContributionSelectionMainPanelDnrLayout.setVerticalGroup(
            ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                .addGroup(ContributionSelectionMainPanelDnrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContributionSelectionMainPanelDnrLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(AppealFromDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AppealToDateLbl)))
                .addGap(48, 48, 48)
                .addComponent(contributionTypeLabel)
                .addGap(44, 44, 44)
                .addComponent(GoodsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(CashDonationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContributionSelectionMainPanelDnr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContributionSelectionMainPanelDnr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the Goods Button
     * Where the Donor wishes to add Goods donation
     * @param evt
     */
    private void GoodsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoodsBtnActionPerformed
        // Redirect the Donor to the Goods Form
        // Set its visibility to true and dispose the previous frame
        DonorRegGoods DnrCtrGoods = new DonorRegGoods(HELPAid, dctAppeal);
        DnrCtrGoods.setVisible(true);
        dispose();
    }//GEN-LAST:event_GoodsBtnActionPerformed

    /**
     * The method below is used to add an event to the Cash Donation Button
     * Where the Donor wishes to add Cash donation
     */
    private void CashDonationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashDonationBtnActionPerformed
        // Redirect the Donor to the Cash Donation Form
        // Set its visibility to true and dispose the previous frame
        DonorRegCashDonation DnrCtrCsDonation = new DonorRegCashDonation(HELPAid, dctAppeal);
        DnrCtrCsDonation.setVisible(true);
        dispose();
    }//GEN-LAST:event_CashDonationBtnActionPerformed
    
    /**
     * The method below is used to update the Appeal's From Date and To Date
     * according to the Organization Representative selection by its ID
     * Non-returnable function, no parameters required
     */
    private void UpdateAppealDates(){
        AppealFromDateLbl.setText("Appeal's From Date: " + dctAppeal.getFromDate());
        AppealToDateLbl.setText("Appeal's To Date: " + dctAppeal.getToDate());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppealFromDateLbl;
    private javax.swing.JLabel AppealToDateLbl;
    private javax.swing.JButton CashDonationBtn;
    private javax.swing.JPanel ContributionSelectionMainPanelDnr;
    private javax.swing.JButton GoodsBtn;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JLabel contributionTypeLabel;
    // End of variables declaration//GEN-END:variables
}
