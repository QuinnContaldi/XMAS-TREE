public abstract class Tree{
    String description;
    public Tree(){
        description = "unreal tree";
    }

    public abstract Double cost();

    public String getDescription()
    {
        return description;
    }
}