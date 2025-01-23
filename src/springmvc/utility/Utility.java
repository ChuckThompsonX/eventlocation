package springmvc.utility;

import java.sql.Timestamp;

public class Utility {

	public static Timestamp getCurrentMySQLDate() {
		long time = System.currentTimeMillis();
		//Date date = new Date(time);
		Timestamp ts = new Timestamp(time); // new Timestamp(date.getTime());
		return ts;
	}
}
