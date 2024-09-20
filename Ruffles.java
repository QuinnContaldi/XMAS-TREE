public class Ruffles extends TreeDecorator {
    Tree tree;

    public Ruffles(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Ruffles ";
    }
    
    public Double cost(){
        return tree.cost() + 1.00;
    }
}
