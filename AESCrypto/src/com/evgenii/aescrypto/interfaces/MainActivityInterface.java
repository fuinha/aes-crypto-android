package com.evgenii.aescrypto.interfaces;

public interface MainActivityInterface {
	public boolean hasMessage();

	public boolean hasPassword();

	public void invalidateOptionsMenu();

	public boolean isBusy();

	public void setMessage(String message);

	public String trimmedMessage();

	public String trimmedPassword();

	public void updateBusy(boolean isBusy);
}
