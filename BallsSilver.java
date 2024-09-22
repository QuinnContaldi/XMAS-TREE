public class BallsSilver extends TreeDecorator {
    Tree tree;

    public BallsSilver(Tree tree){
        this.tree = tree;
    }

    public void setStar(boolean hasStar){
        tree.setStar(hasStar);
    }

    public boolean statusStar(){
        return tree.statusStar();
    }

    public String getDescription(){
        return tree.getDescription() + "Balls Silver ";
    }
    
    public Double cost(){
        return tree.cost() + 3.00;
    }
}
