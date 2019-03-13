//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 04:02:52 PM IST 
//


package com.doms.automation.jaxbclasses.authxmlpaymenttype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToDayPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToEmailId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BillToLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreditCardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreditCardName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomerAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomerPONo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequestAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToEmailId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToDayPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ShipToAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "value"
})
@XmlRootElement(name = "Payment")
public class AuthXmlPaymentType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Action")
    protected String action;
    @XmlAttribute(name = "BillToAddressLine1")
    protected String billToAddressLine1;
    @XmlAttribute(name = "BillToAddressLine2")
    protected String billToAddressLine2;
    @XmlAttribute(name = "BillToCity")
    protected String billToCity;
    @XmlAttribute(name = "BillToCountry")
    protected String billToCountry;
    @XmlAttribute(name = "BillToDayPhone")
    protected String billToDayPhone;
    @XmlAttribute(name = "BillToEmailId")
    protected String billToEmailId;
    @XmlAttribute(name = "BillToFirstName")
    protected String billToFirstName;
    @XmlAttribute(name = "BillToState")
    protected String billToState;
    @XmlAttribute(name = "BillToZipCode")
    protected String billToZipCode;
    @XmlAttribute(name = "BillToLastName")
    protected String billToLastName;
    @XmlAttribute(name = "CreditCardType")
    protected String creditCardType;
    @XmlAttribute(name = "CreditCardExpirationDate")
    protected String creditCardExpirationDate;
    @XmlAttribute(name = "CreditCardName")
    protected String creditCardName;
    @XmlAttribute(name = "CreditCardNo")
    protected String creditCardNo;
    @XmlAttribute(name = "Currency")
    protected String currency;
    @XmlAttribute(name = "CustomerAccountNo")
    protected String customerAccountNo;
    @XmlAttribute(name = "CustomerPONo")
    protected String customerPONo;
    @XmlAttribute(name = "OrderNo")
    protected String orderNo;
    @XmlAttribute(name = "PaymentType")
    protected String paymentType;
    @XmlAttribute(name = "RequestAmount")
    protected String requestAmount;
    @XmlAttribute(name = "ShipToCity")
    protected String shipToCity;
    @XmlAttribute(name = "ShipToZipCode")
    protected String shipToZipCode;
    @XmlAttribute(name = "ShipToState")
    protected String shipToState;
    @XmlAttribute(name = "ShipToLastName")
    protected String shipToLastName;
    @XmlAttribute(name = "ShipToFirstName")
    protected String shipToFirstName;
    @XmlAttribute(name = "ShipToEmailId")
    protected String shipToEmailId;
    @XmlAttribute(name = "ShipToDayPhone")
    protected String shipToDayPhone;
    @XmlAttribute(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlAttribute(name = "ShipToAddressLine2")
    protected String shipToAddressLine2;
    @XmlAttribute(name = "ShipToAddressLine1")
    protected String shipToAddressLine1;
    public String getEnterprisecode() {
		return enterprisecode;
	}

	public void setEnterprisecode(String enterprisecode) {
		this.enterprisecode = enterprisecode;
	}

	@XmlAttribute(name = "EnterpriseCode")
    protected String enterprisecode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the billToAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressLine1() {
        return billToAddressLine1;
    }

    /**
     * Sets the value of the billToAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressLine1(String value) {
        this.billToAddressLine1 = value;
    }

    /**
     * Gets the value of the billToAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressLine2() {
        return billToAddressLine2;
    }

    /**
     * Sets the value of the billToAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressLine2(String value) {
        this.billToAddressLine2 = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCity(String value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCountry() {
        return billToCountry;
    }

    /**
     * Sets the value of the billToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCountry(String value) {
        this.billToCountry = value;
    }

    /**
     * Gets the value of the billToDayPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToDayPhone() {
        return billToDayPhone;
    }

    /**
     * Sets the value of the billToDayPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToDayPhone(String value) {
        this.billToDayPhone = value;
    }

    /**
     * Gets the value of the billToEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToEmailId() {
        return billToEmailId;
    }

    /**
     * Sets the value of the billToEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToEmailId(String value) {
        this.billToEmailId = value;
    }

    /**
     * Gets the value of the billToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *     
     */
    public String getBillToFirstName() {
        return billToFirstName;
    }

    /**
     * Sets the value of the billToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToFirstName(String value) {
        this.billToFirstName = value;
    }

    /**
     * Gets the value of the billToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToState() {
        return billToState;
    }

    /**
     * Sets the value of the billToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToState(String value) {
        this.billToState = value;
    }

    /**
     * Gets the value of the billToZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToZipCode() {
        return billToZipCode;
    }

    /**
     * Sets the value of the billToZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToZipCode(String value) {
        this.billToZipCode = value;
    }

    /**
     * Gets the value of the billToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToLastName() {
        return billToLastName;
    }

    /**
     * Sets the value of the billToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToLastName(String value) {
        this.billToLastName = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    /**
     * Sets the value of the creditCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationDate(String value) {
        this.creditCardExpirationDate = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardName(String value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
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
     * Gets the value of the customerAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountNo() {
        return customerAccountNo;
    }

    /**
     * Sets the value of the customerAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountNo(String value) {
        this.customerAccountNo = value;
    }

    /**
     * Gets the value of the customerPONo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPONo() {
        return customerPONo;
    }

    /**
     * Sets the value of the customerPONo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPONo(String value) {
        this.customerPONo = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the requestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAmount() {
        return requestAmount;
    }

    /**
     * Sets the value of the requestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAmount(String value) {
        this.requestAmount = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZipCode() {
        return shipToZipCode;
    }

    /**
     * Sets the value of the shipToZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZipCode(String value) {
        this.shipToZipCode = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Sets the value of the shipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLastName(String value) {
        this.shipToLastName = value;
    }

    /**
     * Gets the value of the shipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Sets the value of the shipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirstName(String value) {
        this.shipToFirstName = value;
    }

    /**
     * Gets the value of the shipToEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToEmailId() {
        return shipToEmailId;
    }

    /**
     * Sets the value of the shipToEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToEmailId(String value) {
        this.shipToEmailId = value;
    }

    /**
     * Gets the value of the shipToDayPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToDayPhone() {
        return shipToDayPhone;
    }

    /**
     * Sets the value of the shipToDayPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToDayPhone(String value) {
        this.shipToDayPhone = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressLine2() {
        return shipToAddressLine2;
    }

    /**
     * Sets the value of the shipToAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressLine2(String value) {
        this.shipToAddressLine2 = value;
    }

    /**
     * Gets the value of the shipToAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressLine1() {
        return shipToAddressLine1;
    }

    /**
     * Sets the value of the shipToAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressLine1(String value) {
        this.shipToAddressLine1 = value;
    }

}
