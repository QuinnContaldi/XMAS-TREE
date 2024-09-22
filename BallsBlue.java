public class BallsBlue extends TreeDecorator {
    Tree tree;

    public BallsBlue(Tree tree){
        this.tree = tree;
    }

    public void setStar(boolean hasStar){
        tree.setStar(hasStar);
    }

    public boolean statusStar(){
        return tree.statusStar();
    }

    public String getDescription(){
        return tree.getDescription() + "Balls Blue ";
    }
    
    public Double cost(){
        return tree.cost() + 1.00;
    }
}
