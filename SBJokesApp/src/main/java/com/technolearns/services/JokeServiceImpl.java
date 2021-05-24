package com.technolearns.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokesService {
	
	private  ChuckNorrisQuotes chuckNorrisQuotes= new ChuckNorrisQuotes();
	

	@Override
	public String getRandomJoke() {

		return chuckNorrisQuotes.getRandomQuote();

	}

}
