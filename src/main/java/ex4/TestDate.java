package ex4;

import java.util.Date;

public class TestDate {
	
	public static void main (String[] args) {
		
		Date test = new Date(122,1,10,10,20,0);
		System.out.println(DateUtils.formatDefaultDate(test));
		System.out.println(DateUtils.formatChoisiDate(test, "dd/MM/yyyy"));
	}

}
