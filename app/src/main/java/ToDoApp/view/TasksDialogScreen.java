/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ToDoApp.view;

import ToDoApp.controller.ProjectController;
import ToDoApp.controller.TaskController;
import ToDoApp.model.Project;
import ToDoApp.model.Task;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class TasksDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;

    public TasksDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();

        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTollBarTasksDialogScreen = new javax.swing.JPanel();
        jLabelTitleTasksDialogScreen = new javax.swing.JLabel();
        jLabelAddTasksDialogScreen = new javax.swing.JLabel();
        jPanelMainTasksDialogScreen = new javax.swing.JPanel();
        jLabelNameTasksDialogScreen = new javax.swing.JLabel();
        jTextFieldNameTasksDialogScreen = new javax.swing.JTextField();
        jLabelDescriptionTasksDialogScreen = new javax.swing.JLabel();
        jScrollPaneDescriptionTasksDialogScreen = new javax.swing.JScrollPane();
        jTextAreaDescriptionTasksDialogScreen = new javax.swing.JTextArea();
        jLabelDeadLineTasksDialogSCreen = new javax.swing.JLabel();
        jLabelNotesTasksDialogScreen = new javax.swing.JLabel();
        jScrollPaneNotesTasksDialogScreen = new javax.swing.JScrollPane();
        jTextAreaNotesTasksDialogSCreen = new javax.swing.JTextArea();
        jFormattedTextFieldDeadLine = new javax.swing.JFormattedTextField();
        jLabelErrorFieldName = new javax.swing.JLabel();
        jLabelErrorFieldDeadLine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jPanelTollBarTasksDialogScreen.setBackground(new java.awt.Color(53, 59, 80));

        jLabelTitleTasksDialogScreen.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabelTitleTasksDialogScreen.setForeground(java.awt.Color.white);
        jLabelTitleTasksDialogScreen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitleTasksDialogScreen.setText("Tarefas");
        jLabelTitleTasksDialogScreen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelAddTasksDialogScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddTasksDialogScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-selecionado-35.png"))); // NOI18N
        jLabelAddTasksDialogScreen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelAddTasksDialogScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddTasksDialogScreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTollBarTasksDialogScreenLayout = new javax.swing.GroupLayout(jPanelTollBarTasksDialogScreen);
        jPanelTollBarTasksDialogScreen.setLayout(jPanelTollBarTasksDialogScreenLayout);
        jPanelTollBarTasksDialogScreenLayout.setHorizontalGroup(
            jPanelTollBarTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTollBarTasksDialogScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitleTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAddTasksDialogScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTollBarTasksDialogScreenLayout.setVerticalGroup(
            jPanelTollBarTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTollBarTasksDialogScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTollBarTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTollBarTasksDialogScreenLayout.createSequentialGroup()
                        .addComponent(jLabelAddTasksDialogScreen)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelTitleTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelMainTasksDialogScreen.setBackground(java.awt.Color.white);

        jLabelNameTasksDialogScreen.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabelNameTasksDialogScreen.setText("Nome");

        jTextFieldNameTasksDialogScreen.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jTextFieldNameTasksDialogScreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNameTasksDialogScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameTasksDialogScreenActionPerformed(evt);
            }
        });

        jLabelDescriptionTasksDialogScreen.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabelDescriptionTasksDialogScreen.setText("Descri????o");

        jTextAreaDescriptionTasksDialogScreen.setColumns(20);
        jTextAreaDescriptionTasksDialogScreen.setFont(new java.awt.Font("Corbel Light", 1, 12)); // NOI18N
        jTextAreaDescriptionTasksDialogScreen.setRows(5);
        jTextAreaDescriptionTasksDialogScreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneDescriptionTasksDialogScreen.setViewportView(jTextAreaDescriptionTasksDialogScreen);

        jLabelDeadLineTasksDialogSCreen.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabelDeadLineTasksDialogSCreen.setText("Prazo");

        jLabelNotesTasksDialogScreen.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jLabelNotesTasksDialogScreen.setText("Notas");

        jTextAreaNotesTasksDialogSCreen.setColumns(20);
        jTextAreaNotesTasksDialogSCreen.setFont(new java.awt.Font("Candara Light", 1, 12)); // NOI18N
        jTextAreaNotesTasksDialogSCreen.setRows(5);
        jTextAreaNotesTasksDialogSCreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneNotesTasksDialogScreen.setViewportView(jTextAreaNotesTasksDialogSCreen);

        jFormattedTextFieldDeadLine.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldDeadLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDeadLineActionPerformed(evt);
            }
        });

        jLabelErrorFieldName.setText("*Campo obrigat??rio");

        jLabelErrorFieldDeadLine.setText("*Campo obrigat??rio");

        javax.swing.GroupLayout jPanelMainTasksDialogScreenLayout = new javax.swing.GroupLayout(jPanelMainTasksDialogScreen);
        jPanelMainTasksDialogScreen.setLayout(jPanelMainTasksDialogScreenLayout);
        jPanelMainTasksDialogScreenLayout.setHorizontalGroup(
            jPanelMainTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainTasksDialogScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorFieldDeadLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDescriptionTasksDialogScreen)
                    .addComponent(jTextFieldNameTasksDialogScreen)
                    .addComponent(jLabelDescriptionTasksDialogScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNameTasksDialogScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneNotesTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainTasksDialogScreenLayout.createSequentialGroup()
                        .addGroup(jPanelMainTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNotesTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelMainTasksDialogScreenLayout.createSequentialGroup()
                                .addComponent(jLabelDeadLineTasksDialogSCreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118)))
                        .addGap(180, 180, 180))
                    .addComponent(jFormattedTextFieldDeadLine)
                    .addComponent(jLabelErrorFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMainTasksDialogScreenLayout.setVerticalGroup(
            jPanelMainTasksDialogScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainTasksDialogScreenLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelNameTasksDialogScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorFieldName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameTasksDialogScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescriptionTasksDialogScreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescriptionTasksDialogScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeadLineTasksDialogSCreen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorFieldDeadLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNotesTasksDialogScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotesTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTollBarTasksDialogScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelMainTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTollBarTasksDialogScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMainTasksDialogScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameTasksDialogScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameTasksDialogScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameTasksDialogScreenActionPerformed

    private void jLabelAddTasksDialogScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddTasksDialogScreenMouseClicked
        // TODO add your handling code here:

        try {
            if (isFieldsValid()) {

                Task task = new Task();

                task.setIdProject(project.getId());

                task.setName(jTextFieldNameTasksDialogScreen.getText());
                task.setDescription(jTextAreaDescriptionTasksDialogScreen.getText());
                task.setNotes(jTextAreaNotesTasksDialogSCreen.getText());
                task.setCompleted(false);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = null;

                deadline = dateFormat.parse(jFormattedTextFieldDeadLine.getText());
                task.setDeadline(deadline);
                controller.save(task);
                JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso");
                this.dispose();

            } else {
                hideErrorFields();
                if (jTextFieldNameTasksDialogScreen.getText().isEmpty()) {
                    jLabelErrorFieldName.setVisible(true);
                }

                if (jFormattedTextFieldDeadLine.getText().isEmpty()) {
                    jLabelErrorFieldDeadLine.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_jLabelAddTasksDialogScreenMouseClicked

    private void jFormattedTextFieldDeadLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDeadLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDeadLineActionPerformed

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
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TasksDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TasksDialogScreen dialog = new TasksDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadLine;
    private javax.swing.JLabel jLabelAddTasksDialogScreen;
    private javax.swing.JLabel jLabelDeadLineTasksDialogSCreen;
    private javax.swing.JLabel jLabelDescriptionTasksDialogScreen;
    private javax.swing.JLabel jLabelErrorFieldDeadLine;
    private javax.swing.JLabel jLabelErrorFieldName;
    private javax.swing.JLabel jLabelNameTasksDialogScreen;
    private javax.swing.JLabel jLabelNotesTasksDialogScreen;
    private javax.swing.JLabel jLabelTitleTasksDialogScreen;
    private javax.swing.JPanel jPanelMainTasksDialogScreen;
    private javax.swing.JPanel jPanelTollBarTasksDialogScreen;
    private javax.swing.JScrollPane jScrollPaneDescriptionTasksDialogScreen;
    private javax.swing.JScrollPane jScrollPaneNotesTasksDialogScreen;
    private javax.swing.JTextArea jTextAreaDescriptionTasksDialogScreen;
    private javax.swing.JTextArea jTextAreaNotesTasksDialogSCreen;
    private javax.swing.JTextField jTextFieldNameTasksDialogScreen;
    // End of variables declaration//GEN-END:variables

    private void initDataAccessObjects() {
        TaskController taskController = new TaskController();
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void hideErrorFields() {
        jLabelErrorFieldName.setVisible(false);
        jLabelErrorFieldDeadLine.setVisible(false);
    }

    public boolean isFieldsValid() {
        if ((!jTextFieldNameTasksDialogScreen.getText().isEmpty()) && (!jFormattedTextFieldDeadLine.getText().isEmpty())) {

            return true;

        } else {
            return false;
        }

    }
}
