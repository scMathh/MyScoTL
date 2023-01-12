package Frameworks.Database.SQLite;

public class UserTableQueryHelper
{
    public static final String USER_TABLE = "user";
    public static final String LOGIN = "login";
    public static final String CPF_PERSON = "cpfPerson";
    public static final String PASSWORD = "password";
    public static final String USER_TYPE = "userType";

    public static String GetCreateCommand()
    {
        return "CREATE TABLE "+USER_TABLE+" ("
                +LOGIN +" TEXT PRIMARY KEY,"
                +CPF_PERSON+" TEXT,"
                +PASSWORD + " TEXT,"
                +USER_TYPE + " INTEGER,"
                +"FOREIGN KEY("+CPF_PERSON+") REFERENCES "+PersonTableQueryHelper.PERSON_TABLE+"("+PersonTableQueryHelper.CPF +")"
                +")";
    }

    public static String GetSelectAllQuery()
    {
        return "SELECT * FROM "+USER_TABLE;
    }
}