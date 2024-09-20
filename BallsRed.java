public class BallsRed extends TreeDecorator {
    Tree tree;

    public BallsRed(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Balls Red ";
    }
    
    public Double cost(){
        return tree.cost() + 2.00;
    }
}
