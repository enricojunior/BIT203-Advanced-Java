package asg2;

/**
 * 
 * @author : Enrico Junior
 * Student ID: E2100297
 * ContributionSelectionPanel.java
 * Date: 25-12-2023
 * This part is completed
 * 
 */ 

/**
 * The ContributionSelectionPanel class is responsible of displaying a frame
 * that displays contribution types, such as Goods or Cash Donation once the
 * Organization Representative chooses the desired Appeal
 */
public class ContributionSelectionPanel extends javax.swing.JFrame {

    // LIST OF THE REQUIRED ATTRIBUTES
    private static HELPAid HELPAid;
    private static User currentUser;
    private Appeal sctAppeal;
    
    /**
     * ContributionSelectionPanel Form
     * Default Constructor of ContributionSelectionPanel to initialize all of the required components
     * @param HELPAid - HELPAid
     * @param currentUser - User
     * @param sctAppeal = Appeal
     */
    public ContributionSelectionPanel(HELPAid HELPAid, User currentUser, Appeal sctAppeal) {
        this.HELPAid = HELPAid;
        this.currentUser = currentUser;
        this.sctAppeal = sctAppeal;
        // Call the initComponents() method that is used to 
        // initialize all of the required components for the GUI builder
        initComponents();
        // Update the Appeal From Date and To Date's Label according to the Representative selection
        UpdateAppealDates();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Initialize the JFrame along adding with the required swing components to the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContributionSelectionMainPanel = new javax.swing.JPanel();
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

        ContributionSelectionMainPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout ContributionSelectionMainPanelLayout = new javax.swing.GroupLayout(ContributionSelectionMainPanel);
        ContributionSelectionMainPanel.setLayout(ContributionSelectionMainPanelLayout);
        ContributionSelectionMainPanelLayout.setHorizontalGroup(
            ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContributionSelectionMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContributionSelectionMainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GoodsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(CashDonationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContributionSelectionMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContributionSelectionMainPanelLayout.createSequentialGroup()
                                .addGroup(ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AppealFromDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppealToDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContributionSelectionMainPanelLayout.createSequentialGroup()
                                .addComponent(contributionTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))))
        );
        ContributionSelectionMainPanelLayout.setVerticalGroup(
            ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContributionSelectionMainPanelLayout.createSequentialGroup()
                .addComponent(SideLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ContributionSelectionMainPanelLayout.createSequentialGroup()
                .addGroup(ContributionSelectionMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContributionSelectionMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HELPLOGOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContributionSelectionMainPanelLayout.createSequentialGroup()
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
            .addComponent(ContributionSelectionMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContributionSelectionMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The method below is used to add an event to the Goods Button
     * Where the Organization Representative wishes to add Goods donation
     * @param evt
     */
    private void GoodsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoodsBtnActionPerformed
        // Redirect the representative to the Goods Form
        // Set its visibility to true and dispose the previous frame
        RegisterGoodsForm GoodsForm = new RegisterGoodsForm(HELPAid, currentUser, sctAppeal);
        GoodsForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_GoodsBtnActionPerformed

    /**
     * The method below is used to add an event to the Goods Button
     * Where the Organization Representative wishes to add Cash donation
     * @param evt
     */
    private void CashDonationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashDonationBtnActionPerformed
        // Redirect the representative to the Cash Donation Form
        // Set its visibility to true and dispose the previous frame
        RegisterCashDonationForm CsForm = new RegisterCashDonationForm(HELPAid, currentUser, sctAppeal);
        CsForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_CashDonationBtnActionPerformed
    
    /**
     * The method below is used to update the Appeal's From Date and To Date
     * according to the Organization Representative selection by its ID
     * Non-returnable function, no parameters required
     */
    private void UpdateAppealDates(){
        AppealFromDateLbl.setText("Appeal's From Date: " + sctAppeal.getFromDate());
        AppealToDateLbl.setText("Appeal's To Date: " + sctAppeal.getToDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppealFromDateLbl;
    private javax.swing.JLabel AppealToDateLbl;
    private javax.swing.JButton CashDonationBtn;
    private javax.swing.JPanel ContributionSelectionMainPanel;
    private javax.swing.JButton GoodsBtn;
    private javax.swing.JLabel HELPAidLabel;
    private javax.swing.JLabel HELPAidLogo;
    private javax.swing.JLabel HELPLOGOLabel;
    private javax.swing.JPanel SideLeftPanel;
    private javax.swing.JLabel contributionTypeLabel;
    // End of variables declaration//GEN-END:variables
}
