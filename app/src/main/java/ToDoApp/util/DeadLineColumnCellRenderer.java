/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToDoApp.util;

import ToDoApp.model.Task;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gusta
 */
import javax.swing.JLabel;
public class DeadLineColumnCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column){
        
      JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
      label.setHorizontalAlignment(CENTER);
      
      TaskTableModel taskmodel = (TaskTableModel) table.getModel();
      Task task = taskmodel.getTasks().get(row);
      
      if (!task.getDeadline().after(new Date())) {
          label.setBackground(Color.RED);
        } else {
          label.setBackground(Color.GREEN);
          
          
    } 
    
    
    return label;  
    
}
                          
          
            
}
