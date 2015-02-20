package com.marene.eventmgr.model;

import java.util.Date;
import java.util.Objects;

public class User {

	private String url;
	private int id;
	private String phone_number;
	private String full_name;
	private String avatar_thumbnail;
	private Date last_modified;
	private String events_url;
	private String groups_url;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phone_number;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return full_name;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.full_name = fullName;
	}

	/**
	 * @return the avatarThumbnailUrl
	 */
	public String getAvatarThumbnailUrl() {
		return avatar_thumbnail;
	}

	/**
	 * @param avatarThumbnailUrl
	 *            the avatarThumbnailUrl to set
	 */
	public void setAvatarThumbnailUrl(String avatarThumbnailUrl) {
		this.avatar_thumbnail = avatarThumbnailUrl;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return last_modified;
	}

	/**
	 * @param lastModified
	 *            the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.last_modified = lastModified;
	}

	/**
	 * @return the eventsUrl
	 */
	public String getEventsUrl() {
		return events_url;
	}

	/**
	 * @param eventsUrl
	 *            the eventsUrl to set
	 */
	public void setEventsUrl(String eventsUrl) {
		this.events_url = eventsUrl;
	}

	/**
	 * @return the groupsUrl
	 */
	public String getGroupsUrl() {
		return groups_url;
	}

	/**
	 * @param groupsUrl
	 *            the groupsUrl to set
	 */
	public void setGroupsUrl(String groupsUrl) {
		this.groups_url = groupsUrl;
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
				+ ((full_name == null) ? 0 : full_name.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((phone_number == null) ? 0 : phone_number.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User)
				&& (getId() == ((User) obj).getId())
				&& (Objects.equals(getFullName(), ((User) obj).getFullName()))
				&& (Objects.equals(getPhoneNumber(),
						((User) obj).getPhoneNumber()));
	}

}
