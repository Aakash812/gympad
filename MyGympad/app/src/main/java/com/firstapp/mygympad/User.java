import java.util.*;
public class User {

    private String name;
    private int height;
    private float weight;
    private int age;
    private String sex;
    private int level;
    private ArrayList<Workout> workouts;

    public User(String name, int height, float weight, int age, String sex, int level)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.level = level;
        workouts = new ArrayList<Workout>();
    }

    public String getName() {return name; }
    public int getheight() {return height; }
    public float getWeight() {return weight; }
    public String getsex() {return sex; }
    public int getage() {return age; }
    public int getlevel() {return level; }
    public ArrayList<Workout> getWorkouts() {return workouts; }

    public boolean setName( String newName )
    {
        boolean ret = false;
        if(newName != null )
        {
            this.name = newName;
            ret = true;
        }
        return ret;
    }
    public boolean setHeight( int newHeight )
    {
        boolean ret = false;
        if(newHeight > 0 )
        {
            this.height = newHeight;
            ret = true;
        }
        return ret;

    }
    public boolean setWeight( float newWeight )
    {
        boolean ret = false;
        if(newWeight > 0 )
        {
            this.weight = newWeight;
            ret = true;
        }
        return ret;

    }
    public boolean setLevel( int newLevel )
    {
        boolean ret = false;
        if(newLevel > 0  )
        {
            this.level = newLevel;
            ret = true;
        }
        return ret;

    }

    public boolean setAge( int newAge)
    {
        boolean ret = false;
        if(newAge > 0 )
        {
            this.age = newAge;
            ret = true;
        }
        return ret;
    }

    public boolean setSex( String newSex )
    {
        boolean ret = false;
        if(newSex != null )
        {
            this.sex = newSex;
            ret = true;
        }
        return ret;
    }

    public String toString()
    {
        String toPrint = " ";
        toPrint += "Namae: " + name + " Height: "+ height + " Weight: " + weight + " Age: " + age + " Sex: " + sex + " Level: " + level;
        toPrint += workouts.toString();
        return toPrint;
    }
}
