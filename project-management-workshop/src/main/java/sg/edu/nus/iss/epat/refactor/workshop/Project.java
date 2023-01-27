package sg.edu.nus.iss.epat.refactor.workshop;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String name = null;
	private Duration duration = null;
	private double rate = 0.0;
	private int effortRequired = 0;;
	public List<String> members;
	private String manager = null;

	public Project() {
		members = new ArrayList<String>();
	}



	public void addManager(String manager) {
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getEffortRequired() {
		return effortRequired;
	}

	public void setEffortRequired(int effortRequired) {
		this.effortRequired = effortRequired;
	}

	public List<String> getMembers() {
		return members;
	}

	public String getManager() {
		return manager;
	}

}
