
package nsbmcourseenrolmentsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class LecDetails extends AbstractTableModel{
    private static final String COLUMN_NAMES []={"Lecturer Name","Lecturer ID","Subject Name","Subject ID"};
    private static ArrayList<Lecturer> list;
    
    LecDetails(ArrayList<Lecturer> leclist){
        list = leclist;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
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
           case 0:return list.get(rowIndex).getLecName();
           case 1:return list.get(rowIndex).getLecID();
           case 2:return list.get(rowIndex).getSubName();
           case 3:return list.get(rowIndex).getSubID();
           default:return "Error";
       }
    }
    
    
}
