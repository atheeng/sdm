/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import com.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author salinthapa
 */
public class UserModelTable extends AbstractTableModel {

    List<User> userList = new ArrayList<>();

    private final String[] columnNames = new String[]{
        "Id", "Username", "Role"
    };
    private final Class[] columnClass = new Class[]{
        Integer.class, String.class, String.class
    };

    public UserModelTable(List<User> userList) {
        this.userList = userList;
    }

    @Override
     public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public int getRowCount()
    {
        return userList.size();
    }
    @Override
    public int getColumnCount() {
         return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User row = userList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getId();
        }
        else if(1 == columnIndex) {
            return row.getUsername();
        }
        else if(2 == columnIndex) {
            return row.getRole();
        }
        return null;
    }

}
