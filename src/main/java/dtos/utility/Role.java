package dtos.utility;

public enum Role {
    ADMIN("admin"), SUPERVISOR("supervisor");

    private final String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
