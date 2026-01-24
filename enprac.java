enum Day{
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private int value;
    Day(int value){
        this.value=value;
    }
    public int getDayNumber(){
        return this.value;
    }

    public void isWeekEnd(){
        if(this.value==6 || this.value == 7){
            System.out.println("Weekend");
        }else{
            System.out.println("Weekday");
        }
    }

}

public class enprac {
    public static void main(String[] args) {
        Day tdy = Day.MONDAY;

        /*System.out.println(tdy.getDayNumber());
        tdy.isWeekEnd();

        for(Day d: Day.values()){
            System.out.println("Day: "+d);
        }*/

        //System.out.println(tdy.ordinal());
        System.out.println(Day.valueOf("MONDAY"));
    }
}
