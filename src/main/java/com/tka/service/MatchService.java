package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.MatchDao;
import com.tka.model.Match;
@Service
public class MatchService {

	@Autowired
	MatchDao matchDao;
	public String addMatch(Match match) {
		
		String msg = matchDao.addMatch(match);
		return msg;
	}
	
	public List<Match> getAllMatchs(){
		
		List<Match> allMatchs= matchDao.getAllMatchs();
		return allMatchs;
		
	}
	public Match getMatchById(int id) {
		
		Match match = matchDao.getMatchById(id);
		return match;
	}
	public String deleteMatch(int id) {
		
		int status=matchDao.deleteMatch(id);
		if(status==1) {
			return "match deleted";
		}else {
			return "match not found to delete";
		}
	}
	
	public String updateMatch(int id,Match match) {
		
		int status=matchDao.updateMatch(id, match);
		if(status==1) {
			return "match updated";
		}else {
			return "match not found to update";
		}
	}
}
