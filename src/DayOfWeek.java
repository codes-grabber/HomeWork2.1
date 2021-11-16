public enum DayOfWeek {
    Monday("Понедельник", 8),
    Tuesday("Вторник", 8),
    Wednesday("Среда", 8),
    Thursday("Четверг", 8),
    Friday("Пятница", 8),
    Saturday("Суббота", 0),
    Sunday("Воскресенье", 0);

    private String rusTittle;
    private int workingHours;

    DayOfWeek(String rusTittle, int workingHours) {
        this.rusTittle = rusTittle;
        this.workingHours = workingHours;
    }

    public int getWorkingHours(){
        return workingHours;
    }

    public String getRusTittle(){
        return rusTittle;
    }

    static void hoursLeft(DayOfWeek d) {
        if (d.workingHours == 0) {
            System.out.println("Сегодня выходной!");
        } else {
            System.out.println();

            DayOfWeek[] types = DayOfWeek.values();
            int hoursLeft = 0;
            for (int i = d.ordinal(); i <= types.length - 1; i++) {
                hoursLeft += types[i].workingHours;
            }
            System.out.println("До выходных осталось " + hoursLeft + " часов!");
        }
    }

}
