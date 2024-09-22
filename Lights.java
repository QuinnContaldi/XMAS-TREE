public class Lights extends TreeDecorator{
    Tree tree;
    public Lights(Tree tree){
        this.tree = tree;
    }

    public void setStar(boolean hasStar){
        tree.setStar(hasStar);
    }

    public boolean statusStar(){
        return tree.statusStar();
    }

    public String getDescription(){
        return tree.getDescription()+ "Lights ";
    }

    public Double cost(){
        return tree.cost()+ 5.00;
    }
}
