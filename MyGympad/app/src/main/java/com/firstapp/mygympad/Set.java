public class Set {
    private Excercise excercise;
    private int reps;
    private int weight;
    private int setNo;

    public Set(Excercise excercise, int reps, int weight, int setNo)
    {
        this.excercise = excercise;
        this.reps = reps;
        this.weight = weight;
        this.setNo = setNo;
    }

    public Excercise getExcercise() { return excercise; }
    public int getweight() { return weight; }
    public int getSetNo() { return setNo; }
    public int getReps() { return reps; }
    public String toString()
    {
        String toPrint = " ";

        toPrint += excercise.toString();
        toPrint += (" " + "Reps:  " + reps + "Weight (lbs): " + weight + "Set Numner: " + setNo + " " ); 

        return toPrint;
    }
    public boolean setReps(int reps)
    { 
        boolean ret = false;
        if(reps >= 0 )
        {
            this.reps = reps;
            ret = true;
        }
        return ret;
    }
    public boolean setWeight(int weight)
    { 
        boolean ret = false;
        if(weight >= 0 )
        {
            this.weight = weight;
            ret = true;
        }
        return ret;
    }
    

}
