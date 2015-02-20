package com.marene.eventmgr.model;

import java.util.Objects;

public class UserNumber {

	private String phone_number;

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
		return (obj instanceof UserNumber)
				&& Objects.equals(getPhoneNumber(),
						((UserNumber) obj).getPhoneNumber());
	}
}
