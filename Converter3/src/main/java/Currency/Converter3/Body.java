package Currency.Converter3;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Body")
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

	@XmlElement()
    private String Subject;
    
    @XmlElement()
    private String OrigCurrency;
   
    @XmlElementWrapper(name="Cube")
    @XmlElement(name="Rate")
    private List<String> Cube;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getOrigCurrency() {
		return OrigCurrency;
	}

	public void setOrigCurrency(String origCurrency) {
		OrigCurrency = origCurrency;
	}

	public List<String> getCube() {
		return Cube;
	}

	public void setCube(List<String> cube) {
		Cube = cube;
	}

	@Override
	public String toString() {
		return "Body [Subject=" + Subject + ", OrigCurrency=" + OrigCurrency + ", Cube=" + Cube + "]";
	}
    
    
    
}
