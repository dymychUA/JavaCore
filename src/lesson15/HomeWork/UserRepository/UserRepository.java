package lesson15.HomeWork.UserRepository;

public class UserRepository {
    private User[] users = new User[10];

    public UserRepository() {
    }

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }


    public boolean findUser(User user) {
        for (User userInBD : users) {
            if (user != null && userInBD.equals(user))
                return true;
        }

        return false;
    }

    public User save(User user) {
        if (user == null)
            return null;

        if (findUser(user))
            return null;

        int j = 0;
        for (User userInBd : users) {
            if (userInBd == null) {
                users[j] = user;
                return user;
            }
            j++;
        }
        return null;
    }

    //part 5
    public User update(User user) {
        if (user == null)
            return null;

        int j = 0;
        for (User userInBd : users) {
            if(userInBd != null && user.equals(userInBd)) {
                users[j] = user;
                return user;
            }
            j++;
        }

        return null;
    }

    public void delete(long id) {
        int j = 0;
        for (User userInBd : users) {
            if(userInBd != null && userInBd.getId() == id) {
                users[j] = null;
                break;
            }
            j++;
        }
    }
}
