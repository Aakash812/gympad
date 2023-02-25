import java.util.ArrayList;
import java.util.*;

public class Workout {
    private ArrayList<Set> sets;
    private Date date; 

    public Workout(Date date)
    {
        this.date = date;
        sets = new ArrayList<Set>();
    }

    public ArrayList<Set> getSets() { return sets; }
    public Date getDate() { return date; }

    public boolean addSet(Set newSet )
    {
        boolean ret = false;
        if(newSet!= null )
        {
            sets.add(newSet);
            ret = true;
        }
        return ret;
    }
    public boolean removeSet(Set toRemove )
    {
        boolean ret = false;

        for(int i=0; i<sets.size(); i++ )
        {
            if(sets.get(i).getSetNo() == toRemove.getSetNo() )
            {
                sets.remove(i);
                ret = true;
            }
        }
        return ret;
    }

    public String toString()
    {
        String toPrint = " ";
        for(int i =0; i<sets.size(); i++ )
        {
            toPrint += "\n " + sets.get(i).toString();
        }
        return toPrint;
    }

}
