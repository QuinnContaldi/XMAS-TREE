public class Ribbons extends TreeDecorator{
    Tree tree;

    public Ribbons(Tree tree)
    {
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() + "Ribbons ";
    }

    public Double cost(){
        return tree.cost() + 2.00;
    }

}
