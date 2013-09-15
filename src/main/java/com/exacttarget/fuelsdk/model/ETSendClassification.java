package com.exacttarget.fuelsdk.model;

import com.exacttarget.fuelsdk.annotations.InternalSoapField;
import com.exacttarget.fuelsdk.annotations.InternalSoapType;
import com.exacttarget.fuelsdk.internal.DeliveryProfile;
import com.exacttarget.fuelsdk.internal.SendClassification;

@InternalSoapType(type = SendClassification.class, ignoredFields = {"SenderProfile","DeliveryProfile","SendPriority","ID"})
public class ETSendClassification extends BaseSoapSerializableObject implements
		ETObject {
	
	@InternalSoapField(name = "sendClassificationType")
    protected ETSendClassificationType sendClassificationType;
    
	@InternalSoapField(name = "name")
    protected String name;
    
	@InternalSoapField(name = "description")
    protected String description;
    
	@InternalSoapField(name = "senderProfile")
    protected ETSenderProfile senderProfile;
    
	@InternalSoapField(name = "deliveryProfile")
    protected DeliveryProfile deliveryProfile;
    
	//@InternalSoapField(name = "honorPublicationListOptOutsForTransactionalSends")
    protected Boolean honorPublicationListOptOutsForTransactionalSends;
    
	@InternalSoapField(name = "sendPriority")
    protected ETSendPriority sendPriority;
    
	//@InternalSoapField(name = "archiveEmail")
    protected Boolean archiveEmail;
	
	public ETSendClassification() {}

	public ETSendClassificationType getSendClassificationType() {
		return sendClassificationType;
	}

	public void setSendClassificationType(
			ETSendClassificationType sendClassificationType) {
		this.sendClassificationType = sendClassificationType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ETSenderProfile getSenderProfile() {
		return senderProfile;
	}

	public void setSenderProfile(ETSenderProfile senderProfile) {
		this.senderProfile = senderProfile;
	}

	public DeliveryProfile getDeliveryProfile() {
		return deliveryProfile;
	}

	public void setDeliveryProfile(DeliveryProfile deliveryProfile) {
		this.deliveryProfile = deliveryProfile;
	}

	public Boolean getHonorPublicationListOptOutsForTransactionalSends() {
		return honorPublicationListOptOutsForTransactionalSends;
	}

	public void setHonorPublicationListOptOutsForTransactionalSends(
			Boolean honorPublicationListOptOutsForTransactionalSends) {
		this.honorPublicationListOptOutsForTransactionalSends = honorPublicationListOptOutsForTransactionalSends;
	}

	public ETSendPriority getSendPriority() {
		return sendPriority;
	}

	public void setSendPriority(ETSendPriority sendPriority) {
		this.sendPriority = sendPriority;
	}

	public Boolean getArchiveEmail() {
		return archiveEmail;
	}

	public void setArchiveEmail(Boolean archiveEmail) {
		this.archiveEmail = archiveEmail;
	}

	@Override
	public String toString() {
		return "ETSendClassification [sendClassificationType="
				+ sendClassificationType + ", name=" + name + ", description="
				+ description + ", senderProfile=" + senderProfile
				+ ", deliveryProfile=" + deliveryProfile
				+ ", honorPublicationListOptOutsForTransactionalSends="
				+ honorPublicationListOptOutsForTransactionalSends
				+ ", sendPriority=" + sendPriority + ", archiveEmail="
				+ archiveEmail + ", id=" + id + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", customerKey="
				+ customerKey + "]";
	}
	
	
}
