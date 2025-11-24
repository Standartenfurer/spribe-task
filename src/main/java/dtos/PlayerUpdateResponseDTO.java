package dtos;

import dtos.utility.Gender;
import dtos.utility.Role;

public class PlayerUpdateResponseDTO implements DTOCallable {

    private Integer age;

    private Gender gender;

    private Integer id;

    private String login;

    private Role role;

    private String screenName;

    public PlayerUpdateResponseDTO(Integer age, Gender gender, Integer id, String login, Role role, String screenName) {
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.login = login;
        this.role = role;
        this.screenName = screenName;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

}
