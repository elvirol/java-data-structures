package com.github.elvirol.datastructures.Optional.exercise5;

import java.util.Objects;
import java.util.Optional;

public class UserEmail {
	public static void mail(String[] args) {
		
	}
	public Optional<String> findAuthorEmail(Optional<Article> article){
		
		return article
				.flatMap(Article :: getAuthor)
				.flatMap(User :: getEmail);
			
	}
}
