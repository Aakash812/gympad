public class Excercise {
  
    private String name;
    private int difficulty;
    private String muscleGroup;

    public Excercise(String name, int difficulty, String muscleGroup )
    {
        this.name = name;
        this.difficulty = difficulty;
        this.muscleGroup = muscleGroup;
    }

     
    public String getName() { return name; }

    public String getmuscleGroup() { return muscleGroup; }

      
    public int difficulty() { return difficulty; }

    public String toString()
    {
        String toPrint = " ";
        toPrint += ( "Excercise Name:  " + name + "Difficulty: " + difficulty + " Target Muscle: " + muscleGroup + " " );
        return toPrint; 
    }

    }
