package com.marene.eventmgr.model;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

public class Group {

	private String url;
	private int id;
	private String name;
	private String photo;
	private String photo_thumbnail;
	private Collection<User> members;
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
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photo;
	}

	/**
	 * @param photoUrl
	 *            the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photo = photoUrl;
	}

	/**
	 * @return the thumbnailPhotoUrl
	 */
	public String getThumbnailPhotoUrl() {
		return photo_thumbnail;
	}

	/**
	 * @param thumbnailPhotoUrl
	 *            the thumbnailPhotoUrl to set
	 */
	public void setThumbnailPhotoUrl(String thumbnailPhotoUrl) {
		this.photo_thumbnail = thumbnailPhotoUrl;
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
		return (obj instanceof Group) && (getId() == ((Group) obj).getId())
				&& (Objects.equals(getName(), ((Group) obj).getName()));
	}
}
