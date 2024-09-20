public class BallsSilver extends TreeDecorator {
    Tree tree;

    public BallsSilver(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Balls Silver ";
    }
    
    public Double cost(){
        return tree.cost() + 3.00;
    }
}
