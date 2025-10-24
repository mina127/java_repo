package com.korit.study.ch17;

public interface UserDetails {

    public abstract String getUsername();
    public abstract String getPassword();
    public abstract GrantedAuthority[] getAuthorities();
}
