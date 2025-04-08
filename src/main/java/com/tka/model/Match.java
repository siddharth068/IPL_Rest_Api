package com.tka.model;

public class Match {

	private int matchId;
	private String team1OneName;
	private String team1TwoName;
	private String date;
	private String venue;
	private String result;
	public Match() {
		// TODO Auto-generated constructor stub
	}
	public Match(int matchId, String team1OneName, String team1TwoName, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.team1OneName = team1OneName;
		this.team1TwoName = team1TwoName;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeam1OneName() {
		return team1OneName;
	}
	public void setTeam1OneName(String team1OneName) {
		this.team1OneName = team1OneName;
	}
	public String getTeam1TwoName() {
		return team1TwoName;
	}
	public void setTeam1TwoName(String team1TwoName) {
		this.team1TwoName = team1TwoName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", team1OneName=" + team1OneName + ", team1TwoName=" + team1TwoName
				+ ", date=" + date + ", venue=" + venue + ", result=" + result + "]";
	}
	
	
}
