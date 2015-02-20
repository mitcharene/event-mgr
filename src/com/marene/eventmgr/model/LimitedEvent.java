package com.marene.eventmgr.model;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

public class LimitedEvent {

	private String url;
	private int id;
	private String name;
	private Collection<User> members;
	private Collection<Option> options;
	private String description;
	private Date voting_closes;
	private boolean is_mute;
	private boolean is_locked;
	private boolean is_decided;
	private Date created_at;
	private Date last_modified;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the members
	 */
	public Collection<User> getMembers() {
		return members;
	}

	/**
	 * @param members
	 *            the members to set
	 */
	public void setMembers(Collection<User> members) {
		this.members = members;
	}

	/**
	 * @return the options
	 */
	public Collection<Option> getOptions() {
		return options;
	}

	/**
	 * @param options
	 *            the options to set
	 */
	public void setOptions(Collection<Option> options) {
		this.options = options;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the votingCloses
	 */
	public Date getVotingCloses() {
		return voting_closes;
	}

	/**
	 * @param votingCloses
	 *            the votingCloses to set
	 */
	public void setVotingCloses(Date votingCloses) {
		this.voting_closes = votingCloses;
	}

	/**
	 * @return the isMuted
	 */
	public boolean isMuted() {
		return is_mute;
	}

	/**
	 * @param isMuted
	 *            the isMuted to set
	 */
	public void setMuted(boolean isMuted) {
		this.is_mute = isMuted;
	}

	/**
	 * @return the isLocked
	 */
	public boolean isLocked() {
		return is_locked;
	}

	/**
	 * @param isLocked
	 *            the isLocked to set
	 */
	public void setLocked(boolean isLocked) {
		this.is_locked = isLocked;
	}

	/**
	 * @return the isDecided
	 */
	public boolean isDecided() {
		return is_decided;
	}

	/**
	 * @param isDecided
	 *            the isDecided to set
	 */
	public void setDecided(boolean isDecided) {
		this.is_decided = isDecided;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return created_at;
	}

	/**
	 * @param createdAt
	 *            the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.created_at = createdAt;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Event) && (getId() == ((Event) obj).getId())
				&& (Objects.equals(getName(), ((Event) obj).getName()));
	}

}
