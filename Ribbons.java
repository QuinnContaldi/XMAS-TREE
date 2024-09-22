public class Ribbons extends TreeDecorator{
    Tree tree;

    public Ribbons(Tree tree)
    {
        this.tree = tree;
    }

    public void setStar(boolean hasStar){
        tree.setStar(hasStar);
    }

    public boolean statusStar(){
        return tree.statusStar();
    }

    public String getDescription(){
        return tree.getDescription() + "Ribbons ";
    }

    public Double cost(){
        return tree.cost() + 2.00;
    }

}
