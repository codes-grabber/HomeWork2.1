public class Robot implements Go{
    String name;
    int maxDist;
    int maxHeight;

    public Robot(String name, int maxDist, int maxHeight) {
        this.name = name;
        this.maxDist = maxDist;
        this.maxHeight = maxHeight;
    }

        @Override
    public boolean run(Track track) {
        if (track.dist > this.maxDist) {
            System.out.println(name + " не смог пробежать " + track.dist + "метров");
            return false;
        }
        System.out.println(name + " пробежал " + track.dist + "метров");
        return true;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height > this.maxHeight) {
            System.out.println(name + " не смог перепрыгнуть " + wall.height + "метров и сошел с дистанции");
            return false;
        }
        System.out.println(name + " перепрыгнул " + wall.height + " метров");
        return true;
    }
}
