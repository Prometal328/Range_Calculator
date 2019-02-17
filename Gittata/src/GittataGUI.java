
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ionut Cicio
 */
public class GittataGUI extends javax.swing.JFrame implements ActionListener{
    
    Dimension screenSize;
    Timer timer;
    
    /**
     * Creates new form GittataGUI
     */
    public GittataGUI() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        timer = new Timer(1, this);
        timer.setInitialDelay(100);
        timer.start();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        background = new javax.swing.JPanel();
        dataManipulation = new javax.swing.JPanel();
        speed = new javax.swing.JTextField();
        acceleration = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        resultCalculator = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        dataVisualization = new javax.swing.JPanel();
        graphic = new javax.swing.JPanel();
        resultPanel = new javax.swing.JScrollPane();
        resultsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(screenSize.width / 2 - 710 / 2, screenSize.height / 2 - 500 / 2);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setForeground(new java.awt.Color(150, 150, 150));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataManipulation.setBackground(background.getBackground());
        dataManipulation.setForeground(background.getForeground());
        java.awt.GridBagLayout dataManipulationLayout = new java.awt.GridBagLayout();
        dataManipulationLayout.columnWidths = new int[] {0};
        dataManipulationLayout.rowHeights = new int[] {0, 40, 0, 40, 0, 40, 0, 40, 0};
        dataManipulation.setLayout(dataManipulationLayout);

        speed.setBackground(new java.awt.Color(45, 45, 45));
        speed.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        speed.setForeground(dataManipulation.getForeground());
        speed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        speed.setText("velocità");
        speed.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 12));
        speed.setCaretColor(new java.awt.Color(255, 255, 255));
        speed.setOpaque(false);
        speed.setPreferredSize(new java.awt.Dimension(150, 50));
        speed.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        speed.setSelectionColor(new java.awt.Color(200, 200, 200));
        speed.setUI(new CustomTextField());
        speed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                speedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                speedFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        dataManipulation.add(speed, gridBagConstraints);

        acceleration.setBackground(new java.awt.Color(45, 45, 45));
        acceleration.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        acceleration.setForeground(dataManipulation.getForeground());
        acceleration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acceleration.setText("accelerazione");
        acceleration.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 12));
        acceleration.setCaretColor(new java.awt.Color(255, 255, 255));
        acceleration.setOpaque(false);
        acceleration.setUI(new CustomTextField());
        acceleration.setPreferredSize(new java.awt.Dimension(150, 50));
        acceleration.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        acceleration.setSelectionColor(new java.awt.Color(200, 200, 200));
        acceleration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accelerationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accelerationFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        dataManipulation.add(acceleration, gridBagConstraints);

        height.setBackground(new java.awt.Color(45, 45, 45));
        height.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        height.setForeground(dataManipulation.getForeground());
        height.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        height.setText("altezza");
        height.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 12, 1, 12));
        height.setCaretColor(new java.awt.Color(255, 255, 255));
        height.setOpaque(false);
        height.setUI(new CustomTextField());
        height.setPreferredSize(new java.awt.Dimension(150, 50));
        height.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        height.setSelectionColor(new java.awt.Color(200, 200, 200));
        height.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                heightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                heightFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        dataManipulation.add(height, gridBagConstraints);

        resultCalculator.setBackground(new java.awt.Color(45, 45, 45));
        resultCalculator.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        resultCalculator.setForeground(dataManipulation.getForeground());
        resultCalculator.setText("calcola G");
        resultCalculator.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resultCalculator.setContentAreaFilled(false);
        resultCalculator.setPreferredSize(new java.awt.Dimension(150, 50));
        resultCalculator.setUI(new CustomButton());
        resultCalculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resultCalculatorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resultCalculatorMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        dataManipulation.add(resultCalculator, gridBagConstraints);

        result.setBackground(new java.awt.Color(45, 45, 45));
        result.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        result.setForeground(dataManipulation.getForeground());
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        result.setPreferredSize(new java.awt.Dimension(150, 50));
        result.setUI(new CustomLabel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        dataManipulation.add(result, gridBagConstraints);

        background.add(dataManipulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        dataVisualization.setBackground(background.getBackground());
        dataVisualization.setForeground(background.getForeground());
        dataVisualization.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graphic.setBackground(new java.awt.Color(255, 255, 255));
        graphic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        graphic.setOpaque(false);
        graphic.setUI(new DiagramPanel());

        javax.swing.GroupLayout graphicLayout = new javax.swing.GroupLayout(graphic);
        graphic.setLayout(graphicLayout);
        graphicLayout.setHorizontalGroup(
            graphicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        graphicLayout.setVerticalGroup(
            graphicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dataVisualization.add(graphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 42, 440, 230));

        resultPanel.setBackground(new java.awt.Color(45, 45, 45));
        resultPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        resultPanel.setForeground(new java.awt.Color(45, 45, 45));
        resultPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        resultPanel.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        resultPanel.setHorizontalScrollBar(null);
        resultPanel.setOpaque(false);

        resultsArea.setEditable(false);
        resultsArea.setBackground(new java.awt.Color(0, 0, 0));
        resultsArea.setColumns(20);
        resultsArea.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        resultsArea.setForeground(background.getForeground());
        resultsArea.setRows(5);
        resultsArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        resultsArea.setOpaque(false);
        resultsArea.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        resultsArea.setUI(new CustomTextArea());
        resultsArea.setSelectionColor(new java.awt.Color(200, 200, 200));
        resultPanel.setViewportView(resultsArea);

        dataVisualization.add(resultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 440, 150));

        background.add(dataVisualization, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 480, 500));

        getContentPane().add(background);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultCalculatorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultCalculatorMousePressed
        CustomButton buttonUI = (CustomButton)resultCalculator.getUI();
        buttonUI.target = buttonUI.numberOfFrames;
        
        if (Float.valueOf(height.getText()) > 170){
          resultsArea.setText("l'altezza deve essere minore o uguale a 170");
        } else if (!height.getText().equals("altezza") && 
                !height.getText().equals("") &&
                !acceleration.getText().equals("accelerazione") &&
                !acceleration.getText().equals("") &&
                !speed.getText().equals("velocità") &&
                !speed.getText().equals("")){
            DiagramPanel temp = (DiagramPanel)graphic.getUI();
            temp.setValues(
                    Float.valueOf(height.getText()),
                    Float.valueOf(height.getText()),
                    Float.valueOf(acceleration.getText()),
                    Float.valueOf(speed.getText()));
            temp.isDrawable = true;
            result.setText(calculateResult());
            
            resultsArea.setText(calculations());
        }
    }//GEN-LAST:event_resultCalculatorMousePressed

    private void resultCalculatorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultCalculatorMouseReleased
        CustomButton buttonUI = (CustomButton)resultCalculator.getUI();
        buttonUI.target = 0;
    }//GEN-LAST:event_resultCalculatorMouseReleased

    private void heightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightFocusGained
        if (height.getText().equals("altezza")){
            height.setText("");
        }
    }//GEN-LAST:event_heightFocusGained

    private void accelerationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accelerationFocusGained
        if (acceleration.getText().equals("accelerazione")){
            acceleration.setText("");
        }
    }//GEN-LAST:event_accelerationFocusGained

    private void speedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speedFocusGained
        if (speed.getText().equals("velocità")){
            speed.setText("");
        }
    }//GEN-LAST:event_speedFocusGained

    private void heightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightFocusLost
        if (height.getText().equals("")){
            height.setText("altezza");
        }
    }//GEN-LAST:event_heightFocusLost

    private void accelerationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accelerationFocusLost
        if (acceleration.getText().equals("")){
            acceleration.setText("accelerazione");
        }
    }//GEN-LAST:event_accelerationFocusLost

    private void speedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_speedFocusLost
        if (speed.getText().equals("")){
            speed.setText("velocità");
        }
    }//GEN-LAST:event_speedFocusLost

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GittataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GittataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GittataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GittataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GittataGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acceleration;
    private javax.swing.JPanel background;
    private javax.swing.JPanel dataManipulation;
    private javax.swing.JPanel dataVisualization;
    private javax.swing.JPanel graphic;
    private javax.swing.JTextField height;
    private javax.swing.JLabel result;
    private javax.swing.JButton resultCalculator;
    private javax.swing.JScrollPane resultPanel;
    private javax.swing.JTextArea resultsArea;
    private javax.swing.JTextField speed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public String calculateResult() {
        float V0 = Float.valueOf(speed.getText());
        float g = Float.valueOf(acceleration.getText());
        float h = Float.valueOf(height.getText());
        
        float G = (float)(V0 * Math.sqrt((2 * h) / g));
        
        return String.valueOf(G);
    }

    public String calculations() {
        float V0 = Float.valueOf(speed.getText());
        float g = Float.valueOf(acceleration.getText());
        float h = Float.valueOf(height.getText());
        
        float G = (float)(V0 * Math.sqrt((2 * h) / g));
        
        String operations = "V0 * sqrt((2*h) / g) =\n";
        operations += "= " + String.valueOf(V0) + " * sqrt((2*" + String.valueOf(h) + ") / " + String.valueOf(g) + ") =\n";
        operations += "= " + String.valueOf(V0) + " * sqrt(" + String.valueOf(2*h) + " / " + String.valueOf(g) + ") =\n";
        operations += "= " + String.valueOf(V0) + " * sqrt(" + String.valueOf((2 * h) / g) + ") =\n";
        operations += "= " + String.valueOf(V0) + " * " + String.valueOf(Math.sqrt((2 * h) / g)) + " =\n";
        operations += "= " + String.valueOf(V0 * Math.sqrt((2 * h) / g)) + "\n";
        return operations;
    }
}