package com.marene.eventmgr.model;

import java.util.Date;
import java.util.Objects;

public class Option {

	private String title;
	private Date start_at;
	private String location;
	private String location_name;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return start_at;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.start_at = startTime;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return location_name;
	}

	/**
	 * @param locationName
	 *            the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.location_name = locationName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result
				+ ((location_name == null) ? 0 : location_name.hashCode());
		result = prime * result
				+ ((start_at == null) ? 0 : start_at.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Option)
				&& Objects.equals(getLocation(), ((Option) obj).getLocation())
				&& Objects.equals(getTitle(), ((Option) obj).getTitle())
				&& Objects
						.equals(getStartTime(), ((Option) obj).getStartTime())
				&& Objects.equals(getLocationName(),
						((Option) obj).getLocationName());
	}
}
