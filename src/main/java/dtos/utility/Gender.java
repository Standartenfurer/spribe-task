package dtos.utility;

public enum Gender {
    MALE("male"),FEMALE("female");
    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getValue() {
        return gender;
    }
}
