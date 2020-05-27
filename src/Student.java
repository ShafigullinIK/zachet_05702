public class Student {

    private int numberCourse;
    private String nameStudent;
    private int[] arrScore;
    public void show(){
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Иванов";
        ivanov.arrScore = new int[]{2, 3, 4, 5, 6};

        Student petrov = new Student();
        petrov.numberCourse = 2;
        petrov.nameStudent = "Петров";
        petrov.arrScore = new int[]{7, 3, 7, 5, 6};

        Student sidorov = new Student();
        sidorov.numberCourse = 3;
        sidorov.nameStudent = "Сидоров";
        sidorov.arrScore = new int[]{5, 8, 7, 4, 4};

        Student smirnov = new Student();
        smirnov.numberCourse = 3;
        smirnov.nameStudent = "Смирнов";
        smirnov.arrScore = new int[]{9, 1, 8, 4, 2};

        Student karabaev = new Student();
        karabaev.numberCourse = 3;
        karabaev.nameStudent = "Карабаев";
        karabaev.arrScore = new int[]{5, 7, 1, 3, 5};


        ivanov.show();
        System.out.println("Средний балл " + ivanov.averageSystem(ivanov.arrScore()));
        petrov.show();
        System.out.println("Средний балл " + petrov.averageSystem(petrov.arrScore()));
        sidorov.show();
        System.out.println("Средний балл" + sidorov.averageSystem(sidorov.arrScore()));
        smirnov.show();
        System.out.println("Средний балл" + smirnov.averageSystem(smirnov.arrScore()));
        karabaev.show();
        System.out.println("Средний балл" + karabaev.averageSystem(karabaev.arrScore()));


    }
    }
}
// написал чушь, но чтоб хоть что то сдать что-то покалякал)