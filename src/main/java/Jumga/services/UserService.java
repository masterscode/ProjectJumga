package Jumga.services;

import Jumga.models.User;
import Jumga.repos.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User createUser(User user){
        return repository.save(user);
    }

    public User getUserByEmail(User user) {
        return repository.findUserByEmail(user.getEmail());
    }
}
