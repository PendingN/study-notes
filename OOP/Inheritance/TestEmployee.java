public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("E01", "Nguyen Van A", 2.5);
        Employee e2 = new Employee("E02", "Tran Thi B", 1.8);
        Employee e3 = new Employee("E03", "Le Van C", 1.5);

        e1.setYearJoined(2015);
        e1.setNumDaysOff(1);

        e2.setYearJoined(2018);
        e2.setNumDaysOff(2);

        e3.setYearJoined(2021);
        e3.setNumDaysOff(4);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}

