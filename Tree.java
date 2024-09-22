public abstract class Tree{
    String description;
    boolean hasStar = false; 
    public Tree(){
        description = "unreal tree";
    }

    public abstract Double cost();

    public void setStar(boolean hasStar){
        this.hasStar = hasStar;
    }
    
    public boolean statusStar(){
        return this.hasStar;
    }

    public String getDescription()
    {
        return description;
    }
}