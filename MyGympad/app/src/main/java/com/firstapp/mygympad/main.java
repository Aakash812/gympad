import java.util.*;
import java.util.Date;
public class main {
    public static void main(String[] args)
    {
        Excercise newex1  = new Excercise("LatPulldown", 2, "Lats-Biceps");
        Excercise newex2  = new Excercise("PullUps", 2, "Back-Triceps");
        User newUser = new User("Gollum", 60, 56,13, "Male", 1 );
        Set newSet1 = new Set(newex1,12,50,1);
        Set newSet2 = new Set(newex2,12,10,2);
        Workout newWorkout = new Workout(new Date() );
        newWorkout.addSet(newSet1);
        newWorkout.addSet(newSet2);
        System.out.println( newWorkout );
        newWorkout.removeSet(newSet2);
        System.out.println( newWorkout );
        System.out.println(newUser);
        newUser.setLevel(2);
        System.out.println(newUser);
        newUser.setWeight(150);
        System.out.println(newUser);
        newUser.setHeight(69);
        System.out.println(newUser);
        newUser.setName("Dobby");
        System.out.println(newUser);
        newUser.setSex("Other");
        System.out.println(newUser);
    }
}
