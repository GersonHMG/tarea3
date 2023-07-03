package src.main.com.tienda;


public class User{

   public enum Type {
        USER,
        ADMIN,
    } // user or admin

    Type user_type;

    public User(Type type) {
        user_type = type;
    }

    public Type getUserType(){
        return user_type;
    }

}