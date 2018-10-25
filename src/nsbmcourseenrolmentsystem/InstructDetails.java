/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmcourseenrolmentsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InstructDetails extends AbstractTableModel{
    private static final String COLUMN_NAMES []={"Instructor Name","Instructor ID","Subject Name","Subject ID"};
    private static ArrayList<Instructor> list2;
    
    InstructDetails(ArrayList<Instructor> inslist){
        list2 = inslist;
    }
    
    @Override
    public int getRowCount() {
        return list2.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:return list2.get(rowIndex).getInstructorName();
           case 1:return list2.get(rowIndex).getInstructorID();
           case 2:return list2.get(rowIndex).getSubName();
           case 3:return list2.get(rowIndex).getSubID();
           default:return "Error";
       }
    }
    
    
}
