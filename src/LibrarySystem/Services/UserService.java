package LibrarySystem.Services;

import java.util.ArrayList;
import java.util.List;

import LibrarySystem.Users.User;

public class UserService {
    private final List<User> users;
    public UserService() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user) {
        this.users.add(user);
    }

    public void unregisterUser(int userId) {
        this.users.removeIf(user -> user.getId() == userId);
    }

    public User findUserById(int userId){
        for (User user: users)
            if (user.getId() == userId)
                return user;
        return  null;
    }

}
