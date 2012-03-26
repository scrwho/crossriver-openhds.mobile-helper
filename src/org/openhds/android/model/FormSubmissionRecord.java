package org.openhds.android.model;

import java.util.ArrayList;
import java.util.List;

public class FormSubmissionRecord {
	private long id;
	private String formOwnerId;
	private String formType;
	private String partialForm;
	private String saveDate;
	private String odkUri;
	private List<String> errors = new ArrayList<String>();

	public void setFormOwnerId(String text) {
		this.formOwnerId = text;
	}

	public void setFormType(String text) {
		this.formType = text;
	}

	public void setPartialFormData(String text) {
		this.partialForm = text;
	}
	
	public String getPartialForm() {
		return partialForm;
	}

	public void addErrorMessage(String text) {
		errors.add(text);
	}

	public String getFormOwnerId() {
		return formOwnerId;
	}

	public String getFormType() {
		return formType;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSaveDate() {
		return saveDate;
	}
	
	public void setSaveDate(String dateTime) {
		this.saveDate = dateTime;
	}

	public String getOdkUri() {
		return odkUri;
	}

	public void setOdkUri(String odkUri) {
		this.odkUri = odkUri;
	}

	public long getId() {
		return id;
	}
}
