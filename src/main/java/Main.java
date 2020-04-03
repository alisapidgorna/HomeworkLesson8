public class Main {
    public static void main(String[] args) {
        Human human = new Human("Human", 60, 180, "Brown", "Without color", "Clever");

        Woman woman = new Woman("Mariya","Ukrainian", "QA", "Green", "Brown", 2, 41);

        woman.talk("English and Ukrainian");
        woman.move(4);
        woman.run(10);
        woman.study("Java");
        woman.mood("Good, perfect, super!!!");
        woman.hobby("Gym, sewing, improving English, learning to code");
    }
}
