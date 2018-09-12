package inheritance;

public class Engineer extends Profession {
    private boolean isBuild;

    public void build(House house){
        house.setBuild(isBuild);
    }

    public boolean isIsbuild(House house){
        return house.isBuild();
    }
}
