package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Match;
import com.tka.service.MatchService;

@RestController
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	@PostMapping("/api/matches")
	public String addMatch(@RequestBody Match match) {
		
		String msg = matchService.addMatch(match);
		
		
		return msg;
	}
	@GetMapping("/api/matches/all")
	public List<Match> getAllMatchs() {
		List<Match> almatch= matchService.getAllMatchs();
		
		return almatch;
		
	}
	@GetMapping("/api/match")
	public Object  getMatchById(@RequestParam int id) {
		Match match = matchService.getMatchById(id);
		
		if(match!=null) {
			return match;
			
		}else
		{
			return "match not found";
		}
		
		
		
	}
	
	@DeleteMapping("/api/matches/{id}")
	public String deleteMatch(@PathVariable int id) {
		
		
		
		return matchService.deleteMatch(id);
		
	}

	@PutMapping("/api/matches/{id}")
	public String  updateMatch(@RequestBody Match match,@PathVariable int id) {
		
		return matchService.updateMatch(id, match);
		
		
	}
}
