package mockitoDemo.service;

import mockitoDemo.User;
import mockitoDemo.data.UserRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AuthenticationService {
    private UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public boolean authenticate(String username, String password){
       User user = userRepository.findByUsername(username);
        return user.getPassword().equals(password);
    }

    public Set<User> getRegularUsers(){
        return userRepository.findAll()
                .stream()
                .filter(user -> user.isLive() && user.getUserType() == User.UserType.REGULAR_USER)
                .collect(Collectors.toSet());
    }
    public Set<User> getAdminUsers(){
        return userRepository.findAll()
                .stream()
                .filter(user -> user.isLive() && user.getUserType() == User.UserType.ADMIN_USER)
                .collect(Collectors.toSet());
    }
}
