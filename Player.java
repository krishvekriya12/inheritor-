class Player {
    public static void main(String[] args) {

        Bestman b = new Bestman();
        b.get();
        Bolwer bw = new Bolwer();
        bw.show();

    }
}

class CricketPlayer {
    String a = "kholi";
    String b = "dhoni";
    String c = "chahal";
    String d = "dinesh_kartik";
    String e = "rohit_shrma";
    String f = "hardik_pandya";
    String g = "ishan_kishan";
    String h = "mohmad_shami";
    String i = "shikar_dhvan";
    String j = "ishant_shrma";
    String k = "bumbhra";

}

class Bestman extends CricketPlayer {

    void get() {
        System.out.println("Only Indian Crickete Team Bestman name : ");
        System.out.println("bestman = " + a);
        System.out.println("bestman = " + b);
        System.out.println("bestman = " + d);
        System.out.println("bestman = " + e);
        System.out.println("bestman = " + f);
        System.out.println("bestman = " + g);
        System.out.println("bestman = " + i);
    }

}

class Bolwer extends CricketPlayer {
    void show() {
        System.out.println("Only Indian Crickete Team Bolwer name :");
        System.out.println("bestman = " + c);
        System.out.println("bestman = " + h);
        System.out.println("bestman = " + j);
        System.out.println("bestman = " + k);
    }

}