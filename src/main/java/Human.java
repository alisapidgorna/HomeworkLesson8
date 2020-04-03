public class Human {
    public String name;
    public int weight;
    public int height;
    public String hairColor;
    public String nails;
    public String brain;

    public Human(String name, int weight, int height, String hairColor, String nails, String brain){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
        this.nails = nails;
        this.brain = brain;
    }
    public void talk(String language){
        System.out.println("Human.talk() called. Talking in:  " + language);
    }
    public void move(int speed) {
        System.out.println("Human.move() called. Moving at speed:  " + speed);
    }
    public void run(int speed){
        System.out.println("Human.run() called. Running at speed:  " + speed);
    }
    public void study(String prLanguage){
        System.out.println("Human.study() called. Studying:  " + prLanguage);
    }
    public void hobby(String hobby){
        System.out.println("Human.hobby() called. Hobbies are:  " + hobby);
    }
}
