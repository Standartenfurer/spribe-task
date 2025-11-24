package dtos;

import dtos.utility.Gender;
import dtos.utility.Role;

public class PlayerCreateResponseDTO implements DTOCallable {

    private Integer id;

    private Integer age;

    private Gender gender;

    private String login;

    private String password;

    private String screenName;

    private Role role;

    public PlayerCreateResponseDTO(Integer id, Integer age, Gender gender, String login, String password, String screenName, Role role) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.login = login;
        this.password = password;
        this.screenName = screenName;
        this.role = role;
    }

    private PlayerCreateResponseDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


}
