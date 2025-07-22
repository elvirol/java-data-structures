package com.github.elvirol.datastructures.Optional.exercise5;

import java.util.Optional;

public class Article {
	
	private Optional<User> author;
	
	public Article(Optional<User> author) {
		this.author = author;
	}
	
	public Optional<User> getAuthor(){
		return author;
	}
}
