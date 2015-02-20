package com.marene.eventmgr.model;

import java.util.Objects;

public class LimitedUser {

	private String url;
	private int id;
	private String phone_number;

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
	 * Get the user's phone number
	 * 
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phone_number;
	}

	/**
	 * Set the user's phone number
	 * 
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((phone_number == null) ? 0 : phone_number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof LimitedUser)
				&& Objects.equals(getPhoneNumber(),
						((LimitedUser) obj).getPhoneNumber())
				&& getId() == ((LimitedUser) obj).getId();

	}
}
