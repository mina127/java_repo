package com.korit.study.ch26;

import java.util.ArrayList;
import java.util.List;

public enum Role {
    ADMIN("ROLE_ADMIN","관리자"),
    USER("ROLE_USER","사용자"),

    MANAGER("ROLE_MANAGER","매니저"),
    ;
    private String roleName;
    private String roleNameKor;

    Role(String roleName, String roleNameKor) {
        this.roleName = roleName;
        this.roleNameKor = roleNameKor;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleNameKor() {
        return roleNameKor;

    }

    public static void main(String[] args) {
        List<String> roles = List.of("ADMIN","USER");
        List<String> roles2 = List.of("ADMIN","MANAGER");
        Role admin = Role.ADMIN;
        Role user = Role.USER;
        Role manager = Role.MANAGER;
        System.out.println(admin);

        /// //////////////////////////////

        Role admin2 = Role.valueOf("ADMIN");
        Role user2 = Role.valueOf("USER");
        Role manager2 = Role.valueOf("MANAGER");


        /// //////////////////////////////
        for(String role : roles){
            System.out.println(Role.valueOf(role);
        }

    }
}
