package com.github.elvirol.datastructures.Map.exercise1;

import java.util.Map;

public class UserRolesMapTest {
	public static void main(String[] args) {
		Map<String, String> roleUser = Map.of(
				"Alice", "admin",
				"Bob", "editor",
				"Charlie", "viewer",
				"David", "inconnu"
				);
		
		showRoleUser(roleUser);
		
	}
	public static void showRoleUser(Map<String, String> users) {
		if(users == null || users.isEmpty()) {
			throw new IllegalArgumentException("Map cannot be null or emptpy");
		}
		
		users.forEach( (user, role) -> { System.out.println("Rôle de " + user + " : " +  role); });
	}

}
