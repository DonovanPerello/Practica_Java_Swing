/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi.practica_java_swing.clases;

/**
 *
 * @author donih
 */
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PincelLloguers extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        Object dataObj = table.getModel().getValueAt(row, 4);
        Object estatObj = table.getModel().getValueAt(row, 5);

        if (!isSelected) {
            try {
                if (estatObj != null && estatObj.toString().equals("Actiu")) {
                    
                    LocalDate dataTornada = (LocalDate) dataObj;
                    
                    if (LocalDate.now().isAfter(dataTornada)) {
                        // Fuera de plazo: Rojo pastel suave
                        c.setBackground(new Color(255, 204, 204)); 
                        c.setForeground(Color.BLACK); 
                    } else {
                        // Dentro del plazo: Verde pastel suave
                        c.setBackground(new Color(204, 255, 204)); 
                        c.setForeground(Color.BLACK);
                    }
                } else {
                    // Si ya está devuelto (Retornat), lo dejamos blanco
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);
                }
            } catch (Exception e) {
                c.setBackground(Color.WHITE);
                c.setForeground(Color.BLACK);
            }
        }
        return c;
    }
}