package Jumga.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name="users")
public class Payment {
    private Long id;
    private Shop shop;
}
