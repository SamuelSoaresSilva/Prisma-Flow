package com.prismaflow.manager.core.enums;

public enum UserRole {

    ADMIN("Administrador"),
    MEMBER("Member"),
    VIEWER("Viewer");

    private final String description;
    UserRole(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
