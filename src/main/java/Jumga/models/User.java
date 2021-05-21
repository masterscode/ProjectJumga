package Jumga.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String password;

    @Column
    private String gender;

    @Column(unique = true)
    private String email;

    @Column
    private String userType;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Shop> shops;

}
