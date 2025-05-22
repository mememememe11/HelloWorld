import java.util.Calendar;

public class Cal {
public static void main(String[] args) {
	
	printCalendar(2025, 4);
	
}
	    public static void printCalendar(int year, int month) {
	        Calendar cal = Calendar.getInstance();

	        // 월: 0부터 시작하므로 -1
	        cal.set(year, month - 1, 1);

	        int startDay = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일
	        int lastDate = cal.getActualMaximum(Calendar.DATE); // 말일

	        System.out.printf("       [%d년 %d월]\n", year, month);
	        System.out.println(" 일 월 화 수 목 금 토");

	        // 시작 요일 앞에 공백 출력
	        for (int i = 1; i < startDay; i++) {
	            System.out.print("   ");
	        }

	        for (int day = 1; day <= lastDate; day++) {
	            System.out.printf("%3d", day);

	            // 줄 바꿈: 토요일이면 개행
	            if ((startDay + day - 1) % 7 == 0) {
	                System.out.println();
	            }
	        }
	        System.out.println();
	    }
}

