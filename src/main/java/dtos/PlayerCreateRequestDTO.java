package dtos;

import dtos.utility.Gender;
import dtos.utility.Role;

public class PlayerCreateRequestDTO implements DTOCallable {

    private Integer age;

    private Gender gender;

    private String login;

    private String password;

    private String screenName;

    private Role role;

    private String editor;

    public PlayerCreateRequestDTO(Integer age, Gender gender, String login, String password, String screenName, Role role, String editor) {
        this.age = age;
        this.gender = gender;
        this.login = login;
        this.password = password;
        this.screenName = screenName;
        this.role = role;
        this.editor = editor;
    }

    private PlayerCreateRequestDTO(Builder playerCreateRequestDTOBuilder) {
        this.age = playerCreateRequestDTOBuilder.age;
        this.gender = playerCreateRequestDTOBuilder.gender;
        this.login = playerCreateRequestDTOBuilder.login;
        this.password = playerCreateRequestDTOBuilder.password;
        this.screenName = playerCreateRequestDTOBuilder.screenName;
        this.role = playerCreateRequestDTOBuilder.role;
        this.editor = playerCreateRequestDTOBuilder.editor;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    private PlayerCreateRequestDTO() {
    }

    public static Builder getBuilder() {
        return new PlayerCreateRequestDTO().new Builder();
    }


    public class Builder {
        private Integer age = 0;
        private Gender gender = Gender.MALE;
        private String login = "";
        private String password = "";
        private String screenName = "";
        private Role role;

        private String editor;

        private Builder() {
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setScreenName(String screenName) {
            this.screenName = screenName;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder setEditor(String editor) {
            this.editor = editor;
            return this;
        }

        public PlayerCreateRequestDTO build() {
            return new PlayerCreateRequestDTO(this);
        }
                    /*

        this.gender = gender;
        this.login = login;
        this.password = password;
        this.screenName = screenName;
        this.role = role;
     */
    }

}
