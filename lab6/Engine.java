public class Engine
{
    private String engineNum;
    private int ccRating;
    private int cylinder;
    enum Condition {Poor, Fair, Good, Excellent}
    private Condition condition;
    
    public Engine(String engine, int cc, int cyl, int con)
    {
        engineNum = engine;
        ccRating = cc;
        cylinder = cyl;
        setCondition(con);
    }
    
    public String getEngineNum()
    {
        return engineNum;
    }
    
    public int getCCRating()
    {
        return ccRating;
    }
    
    public int getcylinder()
    {
        return cylinder;
    }
    
    public Condition getCondition()
    {
        return condition;
    }
    
    public void setCondition(int condition)
    {
        if(condition == 0)
        {
            this.condition = Condition.Poor;
        }
        
        else if(condition == 1)
        {
            this.condition = Condition.Fair;
        }
        
        else if(condition == 2)
        {
            this.condition = Condition.Good;
        }
        
        else if(condition == 3)
        {
            this.condition = Condition.Excellent;
        }
    }
    
    public String toString()
    {
        return "\nEngine Information:" + "\n\tEngine number: " + engineNum + "\n\tCC rating: " + ccRating
               + "\n\tNumber of Cylinders: " + cylinder + "\n\tCondition: " + condition;
    }   
}