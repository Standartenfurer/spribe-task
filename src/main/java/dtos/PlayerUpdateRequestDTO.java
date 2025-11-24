package dtos;

import dtos.utility.Gender;
import dtos.utility.Role;

public class PlayerUpdateRequestDTO implements DTOCallable {
    private Integer age;

    private Gender gender;

    private String login;

    private String password;

    private Role role;

    private String screenName;

    public PlayerUpdateRequestDTO(Integer age, Gender gender, String login, String password, Role role, String screenName) {
        this.age = age;
        this.gender = gender;
        this.login = login;
        this.password = password;
        this.role = role;
        this.screenName = screenName;
    }

    private PlayerUpdateRequestDTO(Builder playerUpdateRequestDTOBuilder) {
        this.age = playerUpdateRequestDTOBuilder.age;
        this.gender = playerUpdateRequestDTOBuilder.gender;
        this.login = playerUpdateRequestDTOBuilder.login;
        this.password = playerUpdateRequestDTOBuilder.password;
        this.screenName = playerUpdateRequestDTOBuilder.screenName;
        this.role = playerUpdateRequestDTOBuilder.role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }


    public class Builder {
        private Integer age = 0;
        private Gender gender = Gender.MALE;
        private String login = "";
        private String password = "";
        private String screenName = "";

        private Role role;

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

        public PlayerUpdateRequestDTO build() {
            return new PlayerUpdateRequestDTO(this);
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
