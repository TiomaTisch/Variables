public class Main {
    public static void main(String[] args) {
        System.out.println("--------Задача1--------");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("--------Задача2--------");

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("--------Задача3--------");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("--------Задача4--------");

        var friend = 19;
        System.out.println("frieng = " + friend);
        friend += 2;
        System.out.println("frieng += " + friend);
        friend /= 7;
        System.out.println("frieng /= " + friend);

        System.out.println("--------Задача5--------");

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog *= " + frog);
        frog /= 3.5;
        System.out.println("frog /= " + frog);
        frog += 4;
        System.out.println("frog += " + frog);

        System.out.println("--------Задача6--------");

        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        System.out.println("Общая масса = " + (weightOneBoxer + weightTwoBoxer) + "кг");
        System.out.println("Разница масс = " + (weightTwoBoxer - weightOneBoxer) + "кг");

        System.out.println("--------Задача7--------");

        System.out.println("Остаток от деления = " + (weightTwoBoxer % weightOneBoxer));

        System.out.println("--------Задача8--------");

        var totalHours = 640;
        var openingHours = 8;
        var workers = totalHours / openingHours;
        System.out.println("Всего работников в компании — " + workers +" человек");
        System.out.println("Если в компании работает " + (workers += 94 )+ " человек, то всего " + (totalHours / workers) + " часов работы может быть поделено между сотрудниками");
    }
}