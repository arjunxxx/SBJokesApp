package com.technolearns.services;


import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokesService {
	
	private  ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		super();
		chuckNorrisQuotes= new ChuckNorrisQuotes();
	}
	

	@Override
	public String getRandomJoke() {

		return chuckNorrisQuotes.getRandomQuote();

	}

	

}
