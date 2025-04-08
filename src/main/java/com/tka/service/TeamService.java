package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.TeamDao;
import com.tka.model.Team;
@Service
public class TeamService {

	@Autowired
	TeamDao teamDao;
	public String addTeam(Team team) {
		
		String msg = teamDao.addTeam(team);
		return msg;
	}
	
	public List<Team> getAllTeams(){
		
		List<Team> allTeams= teamDao.getAllTeams();
		return allTeams;
		
	}
	public Team getTeamById(int id) {
		
		Team team = teamDao.getTeamById(id);
		return team;
	}
	public String deleteTeam(int id) {
		
		int status=teamDao.deleteTeam(id);
		if(status==1) {
			return "team deleted";
		}else {
			return "team not found to delete";
		}
	}
	
	public String updateTeam(int id,Team team) {
		
		int status=teamDao.updateTeam(id, team);
		if(status==1) {
			return "team updated";
		}else {
			return "team not found to update";
		}
	}
}
