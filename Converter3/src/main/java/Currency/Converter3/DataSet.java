//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.09 at 10:34:45 PM EET 
//


package Currency.Converter3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PublishingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrigCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Cube">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="multiplier" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "DataSet")
public class DataSet {

    @XmlElement(name = "Header", required = true)
    protected DataSet.Header header;
    @XmlElement(name = "Body", required = true)
    protected DataSet.Body body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet.Header }
     *     
     */
    public DataSet.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet.Header }
     *     
     */
    public void setHeader(DataSet.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link DataSet.Body }
     *     
     */
    public DataSet.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet.Body }
     *     
     */
    public void setBody(DataSet.Body value) {
        this.body = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrigCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Cube">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
     *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="multiplier" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subject",
        "origCurrency",
        "cube"
    })
    public static class Body {

        @XmlElement(name = "Subject", required = true)
        protected String subject;
        @XmlElement(name = "OrigCurrency", required = true)
        protected String origCurrency;
        @XmlElement(name = "Cube", required = true)
        protected DataSet.Body.Cube cube;

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubject(String value) {
            this.subject = value;
        }

        /**
         * Gets the value of the origCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigCurrency() {
            return origCurrency;
        }

        /**
         * Sets the value of the origCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigCurrency(String value) {
            this.origCurrency = value;
        }

        /**
         * Gets the value of the cube property.
         * 
         * @return
         *     possible object is
         *     {@link DataSet.Body.Cube }
         *     
         */
        public DataSet.Body.Cube getCube() {
            return cube;
        }

        /**
         * Sets the value of the cube property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataSet.Body.Cube }
         *     
         */
        public void setCube(DataSet.Body.Cube value) {
            this.cube = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Rate" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
         *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="multiplier" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rate"
        })
        public static class Cube {

            @XmlElement(name = "Rate")
            protected List<DataSet.Body.Cube.Rate> rate;
            @XmlAttribute(name = "date")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;

            /**
             * Gets the value of the rate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DataSet.Body.Cube.Rate }
             * 
             * 
             */
            public List<DataSet.Body.Cube.Rate> getRate() {
                if (rate == null) {
                    rate = new ArrayList<DataSet.Body.Cube.Rate>();
                }
                return this.rate;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
             *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="multiplier" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Rate {

                @XmlValue
                protected float value;
                @XmlAttribute(name = "currency")
                protected String currency;
                @XmlAttribute(name = "multiplier")
                protected Byte multiplier;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public float getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(float value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the currency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrency() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrency(String value) {
                    this.currency = value;
                }

                /**
                 * Gets the value of the multiplier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getMultiplier() {
                    return multiplier;
                }

                /**
                 * Sets the value of the multiplier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setMultiplier(Byte value) {
                    this.multiplier = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PublishingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publisher",
        "publishingDate",
        "messageType"
    })
    public static class Header {

        @XmlElement(name = "Publisher", required = true)
        protected String publisher;
        @XmlElement(name = "PublishingDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar publishingDate;
        @XmlElement(name = "MessageType", required = true)
        protected String messageType;

        /**
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublisher() {
            return publisher;
        }

        /**
         * Sets the value of the publisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublisher(String value) {
            this.publisher = value;
        }

        /**
         * Gets the value of the publishingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishingDate() {
            return publishingDate;
        }

        /**
         * Sets the value of the publishingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishingDate(XMLGregorianCalendar value) {
            this.publishingDate = value;
        }

        /**
         * Gets the value of the messageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageType() {
            return messageType;
        }

        /**
         * Sets the value of the messageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageType(String value) {
            this.messageType = value;
        }

    }

}
