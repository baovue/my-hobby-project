package com.baovue.myhobbyproject.shared;

public class FieldVerifier {
	
	public static boolean isValidName(String name) {
        return name != null && name.length() > 2;
    }

}
