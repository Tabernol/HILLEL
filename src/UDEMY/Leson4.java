package UDEMY;

public class Leson4 {
    int numberID;
    String name;
    String secondName;
    int kurs;
    double mathmeticAVR;
    double economyAVR;
    double foreignLanguageAVR;
    double chemic;
    Leson4(int numberID1, String name1, String secondName1, int kurs1, double mathmeticAVR1, double economyAVR1, double foreignLanguageAVR1) {
        numberID = numberID1;
        name = name1;
        secondName = secondName1;
        kurs = kurs1;
        mathmeticAVR = mathmeticAVR1;
        economyAVR = economyAVR1;
        foreignLanguageAVR = foreignLanguageAVR1;
    }
    void les4() {
        System.out.println("Номер студента " + numberID + "Имя " + name + "Фамилия " + secondName + "Курс " + kurs);
    }
    double les5(Leson4 st){
        double avr = (mathmeticAVR+economyAVR+foreignLanguageAVR)/3;
        System.out.println("average: " + avr);
        return avr;
    }
}
