package Currency.Converter3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {
	
	@XmlElement()
    private String Publisher;
  
	@XmlElement()
    private String PublishingDate;
	
	@XmlElement()
    private String MessageType;
  
  
	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getPublishingDate() {
		return PublishingDate;
	}

	public void setPublishingDate(String publishingDate) {
		PublishingDate = publishingDate;
	}

	public String getMessageType() {
		return MessageType;
	}

	public void setMessageType(String messageType) {
		MessageType = messageType;
	}

	@Override
	public String toString() {
		return "Header [Publisher=" + Publisher + ", PublishingDate=" + PublishingDate + ", MessageType=" + MessageType
				+ "]";
	}

	
  

}
