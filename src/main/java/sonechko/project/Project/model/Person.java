package sonechko.project.Project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
@Getter
@Setter
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Ім'я користувача не може бути пустим")
    @Size(min = 5, max = 30, message = "Ім'я користувача має бути від 5 до 30 символів")
    @Column(name = "username")
    private String username;
    @NotEmpty(message = "Ім'я не може бути пустим")
    @Size(min = 3, max = 20, message = "Ім'я має бути від 3 до 20 символів")
    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.STRING)
    @NotEmpty(message = "Имя не должно быть пустым")
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public Person() {
    }

    public Person(String username, String name, int yearOfBirth, Sex sex) {
        this.username = username;
        this.name = name;
        this.sex = sex;

    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", role='" + role + '\'' +
                '}';
    }
}
