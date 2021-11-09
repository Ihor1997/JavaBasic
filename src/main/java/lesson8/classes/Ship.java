package lesson8.classes;

public class Ship {
    private Engine eng;

    public class Engine{
        public void launch(){
            System.out.println("Engine started!");
        }
    }

    public final void init(){
        eng = new Engine();
        eng.launch();
    }
}
