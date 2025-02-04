package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslistl.dto.GameMinDto;


@Service
public class GameService {

	
	@Autowired
	private GameRepository gameRepository;  
	
	public List<GameMinDto> findAll(){
				List<Game> result = gameRepository.findAll();
				return result.stream().map(x -> new GameMinDto(x)).toList();
			
	}
}


