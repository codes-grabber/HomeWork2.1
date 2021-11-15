public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("John",50, 30);
        Track track1 = new Track(50);
        Track track2 = new Track(60);
        Track track3 = new Track(30);


        Go[] participants ={
                new Human("John",50, 50),
                new Human("Sam",20, 30),
                new Human("Lui",5, 3),
                new Cat("Vasia",30, 100),
                new Cat("Tishka",20, 30),
                new Cat("Belchik",5, 3),
                new Robot("t1000",50, 30),
                new Robot("%43df3",20, 30),
                new Robot("R432#d",5, 3),
        };

        par[] lets = {
                new Wall(30),
                new Wall(60),
                new Wall(70),
                new Track(10),
                new Track(20),
                new Track(50)
        };


        for (int i = 0; i <= participants.length-1; i++) {
            for (int j = 0; j <= lets.length-1; j++) {

                if (lets[j] instanceof Wall) {
                    Wall another = (Wall) lets[j];
                    if(!participants[i].jump(another)){
                        break;
                    }
                }
                else if (lets[j] instanceof Track){
                    Track another = (Track) lets[j];
                    if(!participants[i].run(another)){
                        break;
                    }
                }
            }
        }
    }
}
