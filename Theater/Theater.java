import java.util.ArrayList;

public class Theater {
    private String nameOftheater;
    private ArrayList <Seat> seats;

    public Theater(String nameOftheater , int numberOfRows , int seatPerRow) {
        this.nameOftheater = nameOftheater;
        int lastRow = 'A' + (numberOfRows-1);
        for (char row = 'A' ; row <= lastRow ; ++row){
            for (int num = 1 ; num<=seatPerRow ; ++num){
                Seat seat = new Seat(row+String.format("%02d" , num));
                seats.add(seat);
                System.out.println();
            }
        }
    }
}
