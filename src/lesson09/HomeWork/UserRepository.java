package lesson09.HomeWork;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    //part 2
    public String[] getUserNames() {
        if (users == null)
            return null;

        int size = 0;
        for (User user : users) {
            if (user != null)
                size++;
        }

        int j = 0;
        String[] names = new String[size];
        for (User user : users) {
            if (user != null) {
                names[j] = user.getName();
                j++;
            }
        }

        return names;
    }

    public long[] getUserIds() {
        if (users == null)
            return null;

        int size = 0;
        for (User user : users) {
            if (user != null)
                size++;
        }

        int j = 0;
        long[] ids = new long[size];
        for (User user : users) {
            if (user != null) {
                ids[j] = user.getId();
                j++;
            }
        }

        return ids;
    }

    public String getUserNameById(long id) {
        if (users == null)
            return null;

        for (User user : users) {
            if (user != null && user.getId() == id)
                return user.getName();
        }

        return null;
    }

    //part 3
    public User getUserByName(String name) {
        if (users == null)
            return null;

        for (User user : users) {
            if (user != null && user.getName() == name)
                return user;
        }

        return null;
    }

    public User getUserById(long id) {
        if (users == null)
            return null;

        for (User user : users) {
            if (user != null && user.getId() == id)
                return user;
        }

        return null;
    }

    public User getUserBySessionId(String id) {
        if (users == null )
            return null;

        for (User user : users) {
            if (user != null && user.getSessionId() == id)
                return user;
        }

        return null;
    }


    //part 4
    public User findById(long id) {
        if (users == null)
            return null;

        for (User user : users) {
            if (user != null && user.getId() == id)
                return user;
        }

        return null;
    }

    public User save(User user) {
        if (users == null || user == null)
            return null;

        if (findById(user.getId()) != null)
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
        if (users == null || user == null)
            return null;

        int j = 0;
        for (User userInBd : users) {
            if(userInBd != null && user.getId() == userInBd.getId()) {
                users[j] = user;
                return user;
            }
            j++;
        }

        return null;
    }

    public void delete(long id) {
        if (users == null)
            return;

        int j = 0;
        for (User userInBd : users) {
            if(userInBd != null && userInBd.getId() == id) {
                users[j] = null;
                return;
            }
            j++;
        }
    }
}
