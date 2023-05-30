//import org.junit.Test;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SILab2Test {

    @Test
    public void test1() {

        User user = null;
        List<User> allUsers = new ArrayList<>();
        try {
            SILab2.function(user,allUsers);
        } catch (Exception e){
            assertEquals(e.getMessage(),"Mandatory information missing!");
        }
    }

    @Test
    public void test2() {

        User user = new User("nikola",null,null);
        //User user2 = new User("nikola_2","lozinkaa","email@hotmail.com");
        List<User> allUsers = new ArrayList<>();
        //allUsers.add(user2);
        try {
            SILab2.function(user,allUsers);
        } catch (Exception e){
            assertEquals(e.getMessage(),"Mandatory information missing!");
        }
    }

    @Test
    public void test3() {

        User user = new User("Nikola", null, "nikola.timo@finki.com");
        List<User> allUsers = new ArrayList<>();
        try {
            SILab2.function(user,allUsers);
        } catch (Exception e){
            assertEquals(e.getMessage(),"Mandatory information missing!");
        }
    }

    @Test
    public void test4() {

        User user = new User("Nikola", "lozinka", null);
        List<User> allUsers = new ArrayList<>();
        try {
            SILab2.function(user,allUsers);
        } catch (Exception e){
            assertEquals(e.getMessage(),"Mandatory information missing!");
        }
    }

    @Test
    public void test5() {

        User user = new User("Nikola", "lozinka", "nekojemail@hotmail.com");
        List<User> allUsers = new ArrayList<>();
        SILab2.function(user,allUsers);
    }

    @Test
    public void test6() {

        User user = new User("username_ex_1","lozinka123#","example_2@hotmail.com");
        User user2 = new User("username_ex_3","lozinkaa-2","example_3@hotmail.com");
        User user3 = new User("username_ex_2","google","example_4@hotmail.com");
        List<User> allUsers = new ArrayList<>();
        allUsers.add(user2);
        allUsers.add(user3);
        SILab2.function(user,allUsers);
        assertEquals(SILab2.function(user,allUsers),true);
    }
}