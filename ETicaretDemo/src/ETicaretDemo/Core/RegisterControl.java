package ETicaretDemo.Core;

import java.util.regex.Pattern;

import ETicaretDemo.Entities.Concrete.User;

public class RegisterControl {
	
	public static boolean isCheckEmail(User user) {
		
		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|edu|net|gov|mil|biz|info|mobi|io)(.[A-Z]{2})?$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		
		return pattern.matcher(user.getEmail()).find();
	}
	public static boolean isCheckPassword(User user) {
		final String PASSWORD_PATTERN = "[a-zA-Z0-9]{6}";
		
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

		return pattern.matcher(user.getPassword()).find();
	}
	public static boolean isCheckFirstName(User user) {
		final String F�RST_NAME_PATTERN = "[A-Z]{2}";
		
		Pattern pattern = Pattern.compile(F�RST_NAME_PATTERN,Pattern.CASE_INSENSITIVE);

		return pattern.matcher(user.getFirstName()).find();
	}
	public static boolean isCheckLastName(User user) {
		final String LAST_NAME_PATTERN = "[A-Z]{2}";
		
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN,Pattern.CASE_INSENSITIVE);

		return pattern.matcher(user.getLastName()).find();
	}
	
	
	
}
