public class Star extends TreeDecorator {
    Tree tree;
    public Star(Tree tree){
        //will check here to see if tree has a star
        this.tree = tree;
    }

    public String getDescription()
    {
        return tree.getDescription() + "Star ";
    }
    
    public Double cost() {
        return tree.cost() + 4.00;
    }
}
