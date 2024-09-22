public class Ruffles extends TreeDecorator {
    Tree tree;

    public Ruffles(Tree tree){
        this.tree = tree;
    }

    public void setStar(boolean hasStar){
        tree.setStar(hasStar);
    }

    public boolean statusStar(){
        return tree.statusStar();
    }

    public String getDescription(){
        return tree.getDescription() + "Ruffles ";
    }
    
    public Double cost(){
        return tree.cost() + 1.00;
    }
}
