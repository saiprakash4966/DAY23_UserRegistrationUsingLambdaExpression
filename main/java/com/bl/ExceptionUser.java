package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionUser 
{
	
		// validating first name
		/**
		 * created method fName and passing parameter in this it will check
		 * FirstName is valid or not result will be in true or false because method is
		 * boolean type
		 * 
		 * @param str -passing string of first name
		 * @return -return to method created
		 */
		public boolean fName(String str) 
		{
			/**
			 * The Matcher and Pattern classes provide the facility of Java regular
			 * expression Pattern object represents a compile version of regular expression
			 * we can create a pattern object by using compile() version of pattern class
			 */
			Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");

			/**
			 * we can use matcher object to match the given pattern in the target string we
			 * can create matcher object by using matcher() of pattern class
			 */
			Matcher matcher = pattern.matcher(str);
			return matcher.matches();
		}
	}


