package LibrarySystem.Users;

public class User {
    private final int id;
    private final String name;
    private final String email;
    private final String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    private boolean checkPassword(String password){
        return this.password.equals(password);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
