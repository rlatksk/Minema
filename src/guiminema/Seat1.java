/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiminema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Justin
 */
public class Seat1 extends javax.swing.JFrame {

    /**
     * Creates new form Seat
     */
    public Seat1() {
        
        initComponents();
        ButtonHandler btnHandler = new ButtonHandler();
        jButton1.addActionListener(btnHandler);
    }

    
    private class ButtonHandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(jToggleButton1.isSelected()){
                seat = seat + "A1 ";
                count++;
        }  
            if(jToggleButton2.isSelected()){
                seat = seat + "A2 ";
                count++;
        }  
            if(jToggleButton3.isSelected()){
                seat = seat + "A3 ";
                count++;
        }  
            if(jToggleButton4.isSelected()){
                seat = seat + "A4 ";
                count++;
        }  
            if(jToggleButton5.isSelected()){
                seat = seat + "B1 ";
                count++;
        }  
            if(jToggleButton6.isSelected()){
                seat = seat + "B2 ";
                count++;
        }  
            if(jToggleButton7.isSelected()){
                seat = seat + "B3 ";
                count++;
        }  
            if(jToggleButton8.isSelected()){
                seat = seat + "B4 ";
                count++;
        }  
            if(jToggleButton9.isSelected()){
                seat = seat + "C1 ";
                count++;
        }  
            if(jToggleButton10.isSelected()){
                seat = seat + "C2 ";
                count++;
        }  
            if(jToggleButton11.isSelected()){
                seat = seat + "C3 ";
                count++;
        }  
            if(jToggleButton12.isSelected()){
                seat = seat + "C4 ";
                count++;
        }  
            if(jToggleButton13.isSelected()){
                seat = seat + "D1 ";
                count++;
        }  
            if(jToggleButton14.isSelected()){
                seat = seat + "D2 ";
                count++;
        }  
            if(jToggleButton15.isSelected()){
                seat = seat + "D3 ";
                count++;
        }  
            if(jToggleButton16.isSelected()){
                seat = seat + "D4 ";
                count++;
        }
            String time = jComboBox1.getSelectedItem().toString();
            
            switch(time){
                case "10:00" ->  {
                    for(int i=0; i<seatStrLen1/3; i++){
                        int j = i*3;
                        seatTemp[i] = seat1.substring(j,j+3);
                        seat = seat.replace(seatTemp[i], "");
                    }
                    count = count - count1;
                    seat = seat.replace(seat1, "");
                }
                case "16:00" ->  {
                    for(int i=0; i<seatStrLen2/3; i++){
                        int j = i*3;
                        seatTemp[i] = seat2.substring(j,j+3);
                        seat = seat.replace(seatTemp[i], "");
                    }
                    count = count - count2;
                    seat = seat.replace(seat2, "");
                }
            }
 
            String title = "Black Panther";
            int  price = count * 30000;
            Random rand = new Random();
            int upperbound = 100;
            int int_random1 = rand.nextInt(upperbound);
            int int_random2 = rand.nextInt(upperbound);
            int int_random3 = rand.nextInt(upperbound);
            int int_random4 = rand.nextInt(upperbound);
            JOptionPane.showMessageDialog(Seat1.this, "Movie Name : Black Panther" + "\n" + "Time : " + time + "\n" + "Seats : " + seat + "\n" + "Price : " + price + "\n" + "Receipt ID : " + int_random1 + int_random2 + int_random3 + int_random4);
            switch(time){
                case "10:00" : {
                    count1 = count1 + count;
                    seat1 = seat1 + seat;
                    seatStrLen1 = seat1.length();
                    break;
                }
                case "16:00" : {
                    count2 = count2 + count;
                    seat2 = seat2 + seat;
                    seatStrLen2 = seat2.length();
                    break;
                }
            }
            count = 0;
            seat = "";
            for(int i=0; i<16; i++){
                seatTemp[i] = "";
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jToggleButton1.setText("A1");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(50, 24));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("A2");
        jToggleButton2.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton3.setText("A3");
        jToggleButton3.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton4.setText("A4");
        jToggleButton4.setPreferredSize(new java.awt.Dimension(50, 24));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("SCREEN");

        jToggleButton5.setText("B1");
        jToggleButton5.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton6.setText("B2");
        jToggleButton6.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton7.setText("B3");
        jToggleButton7.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton8.setText("B4");
        jToggleButton8.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton9.setText("C1");
        jToggleButton9.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton10.setText("C2");
        jToggleButton10.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton11.setText("C3");
        jToggleButton11.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton12.setText("C4");
        jToggleButton12.setPreferredSize(new java.awt.Dimension(50, 24));
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setText("D1");
        jToggleButton13.setPreferredSize(new java.awt.Dimension(50, 24));
        jToggleButton13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton13ItemStateChanged(evt);
            }
        });

        jToggleButton14.setText("D2");
        jToggleButton14.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton15.setText("D3");
        jToggleButton15.setPreferredSize(new java.awt.Dimension(50, 24));

        jToggleButton16.setText("D4");
        jToggleButton16.setPreferredSize(new java.awt.Dimension(50, 24));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "16:00" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Jam Tayang  : ");

        jButton1.setText("Print...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton13ItemStateChanged
        
    }//GEN-LAST:event_jToggleButton13ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jToggleButton1.isSelected())
            jToggleButton1.setEnabled(false);
        if(jToggleButton2.isSelected())
            jToggleButton2.setEnabled(false);
        if(jToggleButton3.isSelected())
            jToggleButton3.setEnabled(false);
        if(jToggleButton4.isSelected())
            jToggleButton4.setEnabled(false);
        if(jToggleButton5.isSelected())
            jToggleButton5.setEnabled(false);
        if(jToggleButton6.isSelected())
            jToggleButton6.setEnabled(false);
        if(jToggleButton7.isSelected())
            jToggleButton7.setEnabled(false);
        if(jToggleButton8.isSelected())
            jToggleButton8.setEnabled(false);
        if(jToggleButton9.isSelected())
            jToggleButton9.setEnabled(false);
        if(jToggleButton10.isSelected())
            jToggleButton10.setEnabled(false);
        if(jToggleButton11.isSelected())
            jToggleButton11.setEnabled(false);
        if(jToggleButton12.isSelected())
            jToggleButton12.setEnabled(false);
        if(jToggleButton13.isSelected())
            jToggleButton13.setEnabled(false);
        if(jToggleButton14.isSelected())
            jToggleButton14.setEnabled(false);
        if(jToggleButton15.isSelected())
            jToggleButton15.setEnabled(false);
        if(jToggleButton16.isSelected())
            jToggleButton16.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String time = jComboBox1.getSelectedItem().toString();
        switch (time){
            case "10:00" : {
                    jToggleButton1.setSelected(false);
                    jToggleButton1.setEnabled(true);
                    jToggleButton2.setSelected(false);
                    jToggleButton2.setEnabled(true);
                    jToggleButton3.setSelected(false);
                    jToggleButton3.setEnabled(true);
                    jToggleButton4.setSelected(false);
                    jToggleButton4.setEnabled(true);
                    jToggleButton5.setSelected(false);
                    jToggleButton5.setEnabled(true);
                    jToggleButton6.setSelected(false);
                    jToggleButton6.setEnabled(true);
                    jToggleButton7.setSelected(false);
                    jToggleButton7.setEnabled(true);
                    jToggleButton8.setSelected(false);
                    jToggleButton8.setEnabled(true);
                    jToggleButton9.setSelected(false);
                    jToggleButton9.setEnabled(true);
                    jToggleButton10.setSelected(false);
                    jToggleButton10.setEnabled(true);
                    jToggleButton11.setSelected(false);
                    jToggleButton11.setEnabled(true);
                    jToggleButton12.setSelected(false);
                    jToggleButton12.setEnabled(true);
                    jToggleButton13.setSelected(false);
                    jToggleButton13.setEnabled(true);
                    jToggleButton14.setSelected(false);
                    jToggleButton14.setEnabled(true);
                    jToggleButton15.setSelected(false);
                    jToggleButton15.setEnabled(true);
                    jToggleButton16.setSelected(false);
                    jToggleButton16.setEnabled(true);
                    
                    for(int i=0; i<seatStrLen1/3; i++){
                        int j = i*3;
                        seatTemp[i] = seat1.substring(j,j+3);
                    }
                    for(int i=0; i<16; i++){
                        System.out.println(seatTemp[i]);
                    }
                    for(int i=0; i<16 ; i++){
                        if("A1 ".equals(seatTemp[i])){
                            jToggleButton1.setSelected(true);
                            jToggleButton1.setEnabled(false);
                        }
                        if("A2 ".equals(seatTemp[i])){
                            jToggleButton2.setSelected(true);
                            jToggleButton2.setEnabled(false);
                        }
                        if("A3 ".equals(seatTemp[i])){
                            jToggleButton3.setSelected(true);
                            jToggleButton3.setEnabled(false);
                        }
                        if("A4 ".equals(seatTemp[i])){
                            jToggleButton4.setSelected(true);
                            jToggleButton4.setEnabled(false);
                        }
                        if("B1 ".equals(seatTemp[i])){
                            jToggleButton5.setSelected(true);
                            jToggleButton5.setEnabled(false);
                        }
                        if("B2 ".equals(seatTemp[i])){
                            jToggleButton6.setSelected(true);
                            jToggleButton6.setEnabled(false);
                        }
                        if("B3 ".equals(seatTemp[i])){
                            jToggleButton7.setSelected(true);
                            jToggleButton7.setEnabled(false);
                        }
                        if("B4 ".equals(seatTemp[i])){
                            jToggleButton8.setSelected(true);
                            jToggleButton8.setEnabled(false);
                        }
                        if("C1 ".equals(seatTemp[i])){
                            jToggleButton9.setSelected(true);
                            jToggleButton9.setEnabled(false);
                        }
                        if("C2 ".equals(seatTemp[i])){
                            jToggleButton10.setSelected(true);
                            jToggleButton10.setEnabled(false);
                        }
                        if("C3 ".equals(seatTemp[i])){
                            jToggleButton11.setSelected(true);
                            jToggleButton11.setEnabled(false);
                        }
                        if("C4 ".equals(seatTemp[i])){
                            jToggleButton12.setSelected(true);
                            jToggleButton12.setEnabled(false);
                        }
                        if("D1 ".equals(seatTemp[i])){
                            jToggleButton13.setSelected(true);
                            jToggleButton13.setEnabled(false);
                        }
                        if("D2 ".equals(seatTemp[i])){
                            jToggleButton14.setSelected(true);
                            jToggleButton14.setEnabled(false);
                        }
                        if("D3 ".equals(seatTemp[i])){
                            jToggleButton15.setSelected(true);
                            jToggleButton15.setEnabled(false);
                        }
                        if("D4 ".equals(seatTemp[i])){
                            jToggleButton16.setSelected(true);
                            jToggleButton16.setEnabled(false);
                        }
                    }
                    for(int i=0; i<16; i++){
                        seatTemp[i] = "";
                    }
                    break;
                }
            case "16:00" : {
                    jToggleButton1.setSelected(false);
                    jToggleButton1.setEnabled(true);
                    jToggleButton2.setSelected(false);
                    jToggleButton2.setEnabled(true);
                    jToggleButton3.setSelected(false);
                    jToggleButton3.setEnabled(true);
                    jToggleButton4.setSelected(false);
                    jToggleButton4.setEnabled(true);
                    jToggleButton5.setSelected(false);
                    jToggleButton5.setEnabled(true);
                    jToggleButton6.setSelected(false);
                    jToggleButton6.setEnabled(true);
                    jToggleButton7.setSelected(false);
                    jToggleButton7.setEnabled(true);
                    jToggleButton8.setSelected(false);
                    jToggleButton8.setEnabled(true);
                    jToggleButton9.setSelected(false);
                    jToggleButton9.setEnabled(true);
                    jToggleButton10.setSelected(false);
                    jToggleButton10.setEnabled(true);
                    jToggleButton11.setSelected(false);
                    jToggleButton11.setEnabled(true);
                    jToggleButton12.setSelected(false);
                    jToggleButton12.setEnabled(true);
                    jToggleButton13.setSelected(false);
                    jToggleButton13.setEnabled(true);
                    jToggleButton14.setSelected(false);
                    jToggleButton14.setEnabled(true);
                    jToggleButton15.setSelected(false);
                    jToggleButton15.setEnabled(true);
                    jToggleButton16.setSelected(false);
                    jToggleButton16.setEnabled(true);
                    
                    for(int i=0; i<seatStrLen2/3; i++){
                        int j = i*3;
                        seatTemp[i] = seat2.substring(j,j+3);
                    }
                    for(int i=0; i<16; i++){
                        System.out.println(seatTemp[i]);
                    }
                    for(int i=0; i<16 ; i++){
                        if("A1 ".equals(seatTemp[i])){
                            jToggleButton1.setSelected(true);
                            jToggleButton1.setEnabled(false);
                        }
                        if("A2 ".equals(seatTemp[i])){
                            jToggleButton2.setSelected(true);
                            jToggleButton2.setEnabled(false);
                        }
                        if("A3 ".equals(seatTemp[i])){
                            jToggleButton3.setSelected(true);
                            jToggleButton3.setEnabled(false);
                        }
                        if("A4 ".equals(seatTemp[i])){
                            jToggleButton4.setSelected(true);
                            jToggleButton4.setEnabled(false);
                        }
                        if("B1 ".equals(seatTemp[i])){
                            jToggleButton5.setSelected(true);
                            jToggleButton5.setEnabled(false);
                        }
                        if("B2 ".equals(seatTemp[i])){
                            jToggleButton6.setSelected(true);
                            jToggleButton6.setEnabled(false);
                        }
                        if("B3 ".equals(seatTemp[i])){
                            jToggleButton7.setSelected(true);
                            jToggleButton7.setEnabled(false);
                        }
                        if("B4 ".equals(seatTemp[i])){
                            jToggleButton8.setSelected(true);
                            jToggleButton8.setEnabled(false);
                        }
                        if("C1 ".equals(seatTemp[i])){
                            jToggleButton9.setSelected(true);
                            jToggleButton9.setEnabled(false);
                        }
                        if("C2 ".equals(seatTemp[i])){
                            jToggleButton10.setSelected(true);
                            jToggleButton10.setEnabled(false);
                        }
                        if("C3 ".equals(seatTemp[i])){
                            jToggleButton11.setSelected(true);
                            jToggleButton11.setEnabled(false);
                        }
                        if("C4 ".equals(seatTemp[i])){
                            jToggleButton12.setSelected(true);
                            jToggleButton12.setEnabled(false);
                        }
                        if("D1 ".equals(seatTemp[i])){
                            jToggleButton13.setSelected(true);
                            jToggleButton13.setEnabled(false);
                        }
                        if("D2 ".equals(seatTemp[i])){
                            jToggleButton14.setSelected(true);
                            jToggleButton14.setEnabled(false);
                        }
                        if("D3 ".equals(seatTemp[i])){
                            jToggleButton15.setSelected(true);
                            jToggleButton15.setEnabled(false);
                        }
                        if("D4 ".equals(seatTemp[i])){
                            jToggleButton16.setSelected(true);
                            jToggleButton16.setEnabled(false);
                        }
                    }
                    for(int i=0; i<16; i++){
                        seatTemp[i] = "";
                    }
                    break;
            }
        }    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
    private String seat = "";
    private String seat1 = "";
    private String seat2 = "";
    private String[] seatTemp = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    private int count = 0;
    private int count1 = 0;
    private int count2 = 0;
    private int seatStrLen1 = 0;
    private int seatStrLen2 = 0;
}
