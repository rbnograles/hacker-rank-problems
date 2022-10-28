public class DayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 2016;
        int feb = 0;

        if(year >= 1700 && year <= 1917) {
            if(year % 4 == 0){
                feb = 29;
            } else {
                feb = 28;
            }
        }
        else if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            feb = 29;
        }
        else {
            feb = 28;
        }

        int sum = (year == 1918) ? (feb -= 2) : 256 - (31 + feb + 31 + 30 + 31 + 30 + 31 + 31);

        System.out.println(sum + ".09." + year);
    }
}
