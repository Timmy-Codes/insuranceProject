/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment03;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author timgl
 */
public class UpdateUI extends javax.swing.JFrame {

    UserUI userUI;
    InsurancePolicy policy;
    /**
     * Creates new form UpdateUI
     * @param policy
     * @param userUI
     */
    public UpdateUI(InsurancePolicy policy, UserUI userUI) {
        
        this.policy = policy;
        this.userUI = userUI;
        initComponents();
         
        
        // populate form with existing policy details
        policyHolderText.setText(policy.getPolicyHolderName());
        policyIdText.setText(policy.getId()+"");
        claimsText.setText(policy.getNumberOfClaims()+"");
        typeComboBox.setModel(new DefaultComboBoxModel<>(CarType.values()));
        typeComboBox.setSelectedItem(this.policy.getCar().getType());
        modelText.setText(policy.getCar().getModel());
        buildYearText.setText(policy.getCar().getManufacturingYear()+"");
        priceText.setText(String.format("%.2f",policy.getCar().getPrice()));
        expYearText.setText(policy.getExpiryDate().getYear()+"");
        expMonthText.setText(policy.getExpiryDate().getMonth()+"");
        expDayText.setText(policy.getExpiryDate().getDay()+"");
        
        policyIdText.setEnabled(false);
        
        // check policy type and populate appropriate fields
        if (policy instanceof ThirdPartyPolicy)
        {
            thirdPartyRadio.setSelected(true);
            comprehensiveRadio.setSelected(false);
            levelLabel.setVisible(false);
            levelText.setVisible(false);
            commentAgeLabel.setText("Comments");
            commentAgeText.setText(((ThirdPartyPolicy) policy).getComments());
        }
        else
        {
            thirdPartyRadio.setSelected(false);
            comprehensiveRadio.setSelected(true);
            commentAgeLabel.setText("Driver Age");
            levelLabel.setVisible(true);
            levelText.setVisible(true);
            commentAgeText.setText(((ComprehensivePolicy)policy).getDriverAge()+"");
            levelText.setText(((ComprehensivePolicy)policy).getLevel()+"");
        }
        
        thirdPartyRadio.setEnabled(false);
        comprehensiveRadio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddPolicy = new javax.swing.JPanel();
        thirdPartyRadio = new javax.swing.JRadioButton();
        comprehensiveRadio = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        policyHolderText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        policyIdText = new javax.swing.JTextField();
        vehicleDetailsLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        modelText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buildYearText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        expiryLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        expYearText = new javax.swing.JTextField();
        expMonthText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        expDayText = new javax.swing.JTextField();
        commentAgeLabel = new javax.swing.JLabel();
        commentAgeText = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        updateBut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        claimsText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        thirdPartyRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thirdPartyRadio.setText("Third Party");
        thirdPartyRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                thirdPartyRadioStateChanged(evt);
            }
        });
        thirdPartyRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdPartyRadioActionPerformed(evt);
            }
        });

        comprehensiveRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comprehensiveRadio.setText("Comprehensive");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Policy Holder Name");

        policyHolderText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Policy ID Number");
        jLabel11.setToolTipText("");

        policyIdText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        vehicleDetailsLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        vehicleDetailsLabel.setText("Vehicle Details:");

        typeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typeComboBox.setToolTipText("Tim Glasgow 7409072");
        typeComboBox.setName(""); // NOI18N
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Type");

        modelText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Model");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Build Year");

        buildYearText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Price");

        priceText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        expiryLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        expiryLabel.setText("Expiry Date:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Year");
        jLabel18.setToolTipText("");

        expYearText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        expMonthText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Month");
        jLabel19.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Day");
        jLabel20.setToolTipText("");

        expDayText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        commentAgeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        commentAgeLabel.setText("Comments");
        commentAgeLabel.setToolTipText("");

        commentAgeText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        levelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelLabel.setText("Cover Level");
        levelLabel.setToolTipText("");

        levelText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 102));
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        updateBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBut.setForeground(new java.awt.Color(255, 51, 102));
        updateBut.setText("UPDATE");
        updateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Number of Claims");
        jLabel12.setToolTipText("");

        claimsText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        claimsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claimsTextActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 102));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddPolicyLayout = new javax.swing.GroupLayout(AddPolicy);
        AddPolicy.setLayout(AddPolicyLayout);
        AddPolicyLayout.setHorizontalGroup(
            AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPolicyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(updateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(97, 97, 97)
                        .addComponent(expMonthText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(111, 111, 111)
                        .addComponent(expDayText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addComponent(commentAgeLabel)
                        .addGap(69, 69, 69)
                        .addComponent(commentAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addComponent(levelLabel)
                        .addGap(64, 64, 64)
                        .addComponent(levelText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expiryLabel)
                    .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(AddPolicyLayout.createSequentialGroup()
                            .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AddPolicyLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(1, 1, 1)))
                            .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AddPolicyLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(claimsText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AddPolicyLayout.createSequentialGroup()
                                    .addGap(223, 223, 223)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(AddPolicyLayout.createSequentialGroup()
                            .addComponent(thirdPartyRadio)
                            .addGap(18, 18, 18)
                            .addComponent(comprehensiveRadio))
                        .addGroup(AddPolicyLayout.createSequentialGroup()
                            .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(policyIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddPolicyLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(policyHolderText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(vehicleDetailsLabel)
                        .addGroup(AddPolicyLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(101, 101, 101)
                            .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddPolicyLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(78, 78, 78)
                            .addComponent(buildYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddPolicyLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(108, 108, 108)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddPolicyLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(105, 105, 105)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddPolicyLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(109, 109, 109)
                            .addComponent(expYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        AddPolicyLayout.setVerticalGroup(
            AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPolicyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thirdPartyRadio)
                    .addComponent(comprehensiveRadio))
                .addGap(29, 29, 29)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPolicyLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10))
                            .addGroup(AddPolicyLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(policyHolderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(11, 11, 11)
                        .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPolicyLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(policyIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton2)))
                .addGap(1, 1, 1)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(claimsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(vehicleDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13))
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(buildYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(expiryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18))
                    .addComponent(expYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(expMonthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(expDayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(commentAgeLabel))
                    .addComponent(commentAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPolicyLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(levelLabel))
                    .addGroup(AddPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(levelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBut)))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AddPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AddPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearPolicyForm() // method to clear entered policy details from Add Policy form
    {
        policyHolderText.setText("");
        policyIdText.setText("");
        modelText.setText("");
        buildYearText.setText("");
        priceText.setText("");
        claimsText.setText("");
        expYearText.setText("");
        expMonthText.setText("");
        expDayText.setText("");
        commentAgeText.setText("");
        levelText.setText("");
    }
    
    private void thirdPartyRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_thirdPartyRadioStateChanged

    }//GEN-LAST:event_thirdPartyRadioStateChanged

    private void thirdPartyRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdPartyRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thirdPartyRadioActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        clearPolicyForm();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButActionPerformed

        try
        {
            String holder = policyHolderText.getText();
//            int id = Integer.parseInt(policyIdText.getText());
            CarType type = (CarType) typeComboBox.getSelectedItem();
            String model = modelText.getText();
            int carYear = Integer.parseInt(buildYearText.getText());
            double price = Double.parseDouble(priceText.getText());
            int claimsNo = Integer.parseInt(claimsText.getText());
            int year = Integer.parseInt(expYearText.getText());
            int month = Integer.parseInt(expMonthText.getText());
            int day = Integer.parseInt(expDayText.getText());
            MyDate date = new MyDate(year, month, day);
            Car car = new Car(type, model, carYear, price);
            policy.setPolicyHolderName(holder);
            policy.setCar(car);
            policy.setNumberOfClaims(claimsNo);
            policy.setExpiryDate(date);
            
            if (thirdPartyRadio.isSelected())
            {
                String comments = commentAgeText.getText();
                ((ThirdPartyPolicy)policy).setComments(comments);
            }
            else
            {
                int age = Integer.parseInt(commentAgeText.getText());
                ((ComprehensivePolicy)policy).setDriverAge(age);
                int level = Integer.parseInt(levelText.getText());
                ((ComprehensivePolicy)policy).setLevel(level);
            }
            JOptionPane.showMessageDialog(this, "Policy has been updated successfully.");
            userUI.fillTable();
            this.dispose();
        }
        catch(NameException e)
        {
            JOptionPane.showMessageDialog(this, "Policy Holder Names must contain minimum three chracters in the format example of 'Bob Bob'.");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please check fields that require numeric inputs.");
        }
    }//GEN-LAST:event_updateButActionPerformed

    private void claimsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claimsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claimsTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new UpdateUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPolicy;
    private javax.swing.JTextField buildYearText;
    private javax.swing.JTextField claimsText;
    private javax.swing.JLabel commentAgeLabel;
    private javax.swing.JTextField commentAgeText;
    private javax.swing.JRadioButton comprehensiveRadio;
    private javax.swing.JTextField expDayText;
    private javax.swing.JTextField expMonthText;
    private javax.swing.JTextField expYearText;
    private javax.swing.JLabel expiryLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField levelText;
    private javax.swing.JTextField modelText;
    private javax.swing.JTextField policyHolderText;
    private javax.swing.JTextField policyIdText;
    private javax.swing.JTextField priceText;
    private javax.swing.JRadioButton thirdPartyRadio;
    private javax.swing.JComboBox<CarType> typeComboBox;
    private javax.swing.JButton updateBut;
    private javax.swing.JLabel vehicleDetailsLabel;
    // End of variables declaration//GEN-END:variables
}
