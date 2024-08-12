package newbegining;

import java.util.Date;

public class Time_Variations {

	public static void main(String[] args) {
		
		Date d = new Date();
		d.getTime();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime()+ (1000*60*60*24*10));
		System.out.println(d1);
		String crtime = d1.toString();
		String date=crtime.substring(8,10);
		System.out.println(date);
		String month=crtime.substring(4,7);
		System.out.println(month);
		String yr=crtime.substring(24);
		System.out.println(yr);
		String format = date.concat(" ").concat(month).concat(" ").concat(yr);
		System.out.println(format);
		String format1 = date.concat("-").concat(month).concat("-").concat(yr);
		System.out.println(format1);
		String format2 = date.concat("/").concat(month).concat("/").concat(yr);
		System.out.println(format2);
	}

}
