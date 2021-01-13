/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Enum;

/**
 *
 * @author salinthapa
 */
public enum RoleType {
    ADMIN("ADMIN"),
    MANAGER("MANAGER"),
    CUSTOMER("CUSTOMER");

    public static String valueOf(RoleType role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String name;
    private RoleType(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
  
    
}
