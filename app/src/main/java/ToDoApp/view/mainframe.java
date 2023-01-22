/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ToDoApp.view;

import ToDoApp.controller.ProjectController;
import ToDoApp.controller.TaskController;
import ToDoApp.model.Project;
import ToDoApp.model.Task;
import ToDoApp.util.ButtonColumnCellRederer;
import ToDoApp.util.DeadLineColumnCellRenderer;
import ToDoApp.util.TaskTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import ToDoApp.util.DeadLineColumnCellRenderer;
import javax.swing.JOptionPane;
/**
 *
 * @author gusta
 */
public final class mainframe extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;

    DefaultListModel projectsModel;
    TaskTableModel taskModel;

    public mainframe() {
        initComponents();
        
        initDataController();
        initComponentsModel();
        
        decorateTableTasks();
        centralizeMainframe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPaneltoolBar = new javax.swing.JPanel();
        jLabelTollBarTitle = new javax.swing.JLabel();
        jLabelTollBarSubTitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitle = new javax.swing.JLabel();
        jLabelTasksAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPanelProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTltle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();

        jScrollPaneTasks.setFont(new java.awt.Font("Corbel Light", 1, 12)); // NOI18N

        jTableTasks.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(java.awt.Color.white);
        jTableTasks.setMinimumSize(new java.awt.Dimension(60, 200));
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(229, 229, 229));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(true);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(800, 800));

        jPaneltoolBar.setBackground(new java.awt.Color(53, 59, 80));
        jPaneltoolBar.setPreferredSize(new java.awt.Dimension(371, 140));

        jLabelTollBarTitle.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabelTollBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTollBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-selecionado-64.png"))); // NOI18N
        jLabelTollBarTitle.setText(" TodoApp");

        jLabelTollBarSubTitle.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabelTollBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTollBarSubTitle.setText("Anote tudo e não se esqueça de nada!");

        javax.swing.GroupLayout jPaneltoolBarLayout = new javax.swing.GroupLayout(jPaneltoolBar);
        jPaneltoolBar.setLayout(jPaneltoolBarLayout);
        jPaneltoolBarLayout.setHorizontalGroup(
            jPaneltoolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltoolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneltoolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneltoolBarLayout.createSequentialGroup()
                        .addComponent(jLabelTollBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67))
                    .addGroup(jPaneltoolBarLayout.createSequentialGroup()
                        .addComponent(jLabelTollBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPaneltoolBarLayout.setVerticalGroup(
            jPaneltoolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltoolBarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelTollBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTollBarSubTitle)
                .addGap(28, 28, 28))
        );

        jPanelProjects.setBackground(java.awt.Color.white);
        jPanelProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelProjectsTitle.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabelProjectsTitle.setText("Projetos");
        jLabelProjectsTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        jLabelProjectsAdd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelProjectsAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTasks.setBackground(java.awt.Color.white);
        jPanelTasks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTasksTitle.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabelTasksTitle.setText("Tarefas");
        jLabelTasksTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        jLabelTasksAdd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTasksAdd)
                .addGap(8, 8, 8))
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTasksAdd)
                    .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProjectList.setBackground(java.awt.Color.white);
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jListProjects.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jListProjects.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setToolTipText("");
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(229, 229, 229));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPanelProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanelProjects)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanelProjects)
                .addContainerGap())
        );

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(java.awt.Color.white);

        jLabelEmptyListIcon.setFont(new java.awt.Font("Corbel Light", 1, 30)); // NOI18N
        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setText("Anda muito vazio por aqui :D");

        jLabelEmptyListTltle.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabelEmptyListTltle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmptyListTltle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTltle.setText("Clique no botão  \"+\" para adicionar uma tarefa");

        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deserto.png"))); // NOI18N

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmptyListSubTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListTltle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabelEmptyListSubTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmptyListTltle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPaneltoolBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPaneltoolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);

        projectDialogScreen.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });


    }//GEN-LAST:event_jLabelProjectsAddMouseClicked

    private void jLabelTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTasksAddMouseClicked
        // TODO add your handling code here:

        TasksDialogScreen tasksDialogScreen = new TasksDialogScreen(this, rootPaneCheckingEnabled);
        //tasksDialogScreen.setProject(null);

        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        tasksDialogScreen.setProject(project);

        tasksDialogScreen.setVisible(true);

        tasksDialogScreen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
        });


    }//GEN-LAST:event_jLabelTasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:

        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = taskModel.getTasks().get(rowIndex);
        switch (columnIndex) {

            case 3:

                taskController.update(task);
                break;

            case 4:
                JOptionPane.showMessageDialog(rootPane, "Editar a tarefa");
                
                
                break;

            case 5:

                taskController.removeByID(task.getId());
                taskModel.getTasks().remove(task);
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                break;

            default:
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // TODO add your handling code here:

        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());

    }//GEN-LAST:event_jListProjectsMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTltle;
    private javax.swing.JLabel jLabelProjectsAdd;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTasksAdd;
    private javax.swing.JLabel jLabelTasksTitle;
    private javax.swing.JLabel jLabelTollBarSubTitle;
    private javax.swing.JLabel jLabelTollBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPaneltoolBar;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JScrollPane jScrollPanelProjects;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTasks() {

        //Customizando o header da table de tarefas
        jTableTasks.getTableHeader().setFont(new Font("Corbel", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(53, 59, 80));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
        
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadLineColumnCellRenderer());
        
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRederer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRederer("delete"));
        //Criando um sort automático para as colunas da table 
        jTableTasks.setAutoCreateRowSorter(true);
    }

    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    

    public void initComponentsModel() {

        projectsModel = new DefaultListModel();
        loadProjects();

        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);

        if (!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0);

            Project project = (Project) projectsModel.get(0);
            loadTasks(project.getId());
        }

    }

    public void loadTasks(int idProject) {
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);

        showJTableTasks(!tasks.isEmpty());
    }

    public void showJTableTasks(boolean hasTasks) {
        if (hasTasks) {
            //Existem tarefas carregadas
            if (jPanelEmptyList.isVisible()) {
                jPanelEmptyList.setVisible(false);
                jPanel5.remove(jPanelEmptyList);
            }

            jPanel5.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanel5.getWidth(), jPanel5.getHeight());

        } else {
            if (jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanel5.remove(jScrollPaneTasks);
            }

            jPanel5.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel5.getWidth(), jPanel5.getWidth());
        }
    }

    public void loadProjects() {
        List<Project> projects = projectController.getAll();

        projectsModel.clear();

        for (int i = 0; i < projects.size(); i++) {

            Project project = projects.get(i);

            projectsModel.addElement(project);

        }

        jListProjects.setModel(projectsModel);
    }
    
    private void centralizeMainframe() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}