package mockitoDemo.data;

import mockitoDemo.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<String, User>();

    public UserRepository(){
        //regular
        users.put("matt", User.createRegularUser("matt", "letmein"));
        users.put("frank", User.createRegularUser("frank", "myPassword"));
        users.put("suzie", User.createRegularUser("suzie", "abracadabra"));

        //admin
        users.put("thomas", User.createAdminUser("thomas", "adminpassword"));
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
    public List<User> findAll(){
        return new LinkedList<>(users.values());
    }


}
