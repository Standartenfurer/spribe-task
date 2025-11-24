package dtos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dtos.utility.Gender;
import dtos.utility.Role;

@JsonDeserialize
public class PlayerGetByPlayerIdResponseDTO implements DTOCallable {

    private Integer age;

    private Gender gender;

    private Integer id;

    private String login;

    private String password;

    private Role role;

    private String screenName;

    public PlayerGetByPlayerIdResponseDTO(Integer age, Gender gender, Integer id, String login, String password, Role role, String screenName) {
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.screenName = screenName;
    }

    public PlayerGetByPlayerIdResponseDTO(PlayerGetByPlayerIdResponseDTO playerDto) {
        this.age = playerDto.age;
        this.gender = playerDto.gender;
        this.id = playerDto.id;
        this.login = playerDto.login;
        this.password = playerDto.password;
        this.role = playerDto.role;
        this.screenName = playerDto.screenName;
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
}
