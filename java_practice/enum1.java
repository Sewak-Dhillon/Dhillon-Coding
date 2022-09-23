// An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

// An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

enum days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
enum number{
    ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN
}

public class enum1 {
    public static void main(String[] args) {
        for(days day : days.values()){
            System.out.println(day);
        }
        for( number day :  number.values()){
            System.out.println(day);
        }
    }
}
