public class User {
    //    instance variables/attributes
    private String password;
    private String username;
    private int id;
    private String profilePicture;

    //equals
    public boolean equals(User o) {
        if(this.username.equals(o.username) && this.id == o.id) {
            return true;
        }
        return false;
    }

    //    constructors
    public User(String password, String username, int id) {
        this.password = password;
        this.username = username;
        this.id = id;

        System.out.println("You are calling the first constructor!");
    }

    public User(String password, String username, int id, String pic) {
        this(password, username, id);
        this.profilePicture = pic;

        System.out.println("You are calling the second constructor!");
    }

    //    methods
//    get and set methods
//    set/mutator methods - updates attribute value
    public void setUsername(String username) {
        this.username = username;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    get/accessor methods - retrieves attribute value
    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    //    toString method - what should display when object is printed
    public String toString() {
        String result = "Username: " + username + ", ID: " + id;
        return result;
    }
}
