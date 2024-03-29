//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 12:34:58 PM IST 
//


package com.doms.automation.jaxbclasses.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlTest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderOrderLinesOrderLineLineChargesLineChargeExtn_QNAME = new QName("", "Extn");
    private final static QName _OrderPaymentMethodsPaymentMethodPersonInfoBillTo_QNAME = new QName("", "PersonInfoBillTo");
    private final static QName _OrderPaymentMethodsPaymentMethodPaymentDetails_QNAME = new QName("", "PaymentDetails");
    private final static QName _OrderOrderLinesOrderLineLineChargesLineCharge_QNAME = new QName("", "LineCharge");
    private final static QName _OrderOrderLinesOrderLinePromotionsPromotion_QNAME = new QName("", "Promotion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlTest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Order.PaymentMethods }
     * 
     */
    public Order.PaymentMethods createOrderPaymentMethods() {
        return new Order.PaymentMethods();
    }

    /**
     * Create an instance of {@link Order.PaymentMethods.PaymentMethod }
     * 
     */
    public Order.PaymentMethods.PaymentMethod createOrderPaymentMethodsPaymentMethod() {
        return new Order.PaymentMethods.PaymentMethod();
    }

    /**
     * Create an instance of {@link Order.HeaderTaxes }
     * 
     */
    public Order.HeaderTaxes createOrderHeaderTaxes() {
        return new Order.HeaderTaxes();
    }

    /**
     * Create an instance of {@link Order.HeaderTaxes.HeaderTax }
     * 
     */
    public Order.HeaderTaxes.HeaderTax createOrderHeaderTaxesHeaderTax() {
        return new Order.HeaderTaxes.HeaderTax();
    }

    /**
     * Create an instance of {@link Order.HeaderCharges }
     * 
     */
    public Order.HeaderCharges createOrderHeaderCharges() {
        return new Order.HeaderCharges();
    }

    /**
     * Create an instance of {@link Order.Extn }
     * 
     */
    public Order.Extn createOrderExtn() {
        return new Order.Extn();
    }

    /**
     * Create an instance of {@link Order.Extn.ExtnPaymentDetailsList }
     * 
     */
    public Order.Extn.ExtnPaymentDetailsList createOrderExtnExtnPaymentDetailsList() {
        return new Order.Extn.ExtnPaymentDetailsList();
    }

    /**
     * Create an instance of {@link Order.Extn.ExtnUserAgentDetailsList }
     * 
     */
    public Order.Extn.ExtnUserAgentDetailsList createOrderExtnExtnUserAgentDetailsList() {
        return new Order.Extn.ExtnUserAgentDetailsList();
    }

    /**
     * Create an instance of {@link Order.Extn.ExtnStoreList }
     * 
     */
    public Order.Extn.ExtnStoreList createOrderExtnExtnStoreList() {
        return new Order.Extn.ExtnStoreList();
    }

    /**
     * Create an instance of {@link Order.Notes }
     * 
     */
    public Order.Notes createOrderNotes() {
        return new Order.Notes();
    }

    /**
     * Create an instance of {@link Order.OrderLines }
     * 
     */
    public Order.OrderLines createOrderOrderLines() {
        return new Order.OrderLines();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine }
     * 
     */
    public Order.OrderLines.OrderLine createOrderOrderLinesOrderLine() {
        return new Order.OrderLines.OrderLine();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Instructions }
     * 
     */
    public Order.OrderLines.OrderLine.Instructions createOrderOrderLinesOrderLineInstructions() {
        return new Order.OrderLines.OrderLine.Instructions();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Notes }
     * 
     */
    public Order.OrderLines.OrderLine.Notes createOrderOrderLinesOrderLineNotes() {
        return new Order.OrderLines.OrderLine.Notes();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.PersonInfoShipTo }
     * 
     */
    public Order.OrderLines.OrderLine.PersonInfoShipTo createOrderOrderLinesOrderLinePersonInfoShipTo() {
        return new Order.OrderLines.OrderLine.PersonInfoShipTo();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.OrderDates }
     * 
     */
    public Order.OrderLines.OrderLine.OrderDates createOrderOrderLinesOrderLineOrderDates() {
        return new Order.OrderLines.OrderLine.OrderDates();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Promotions }
     * 
     */
    public Order.OrderLines.OrderLine.Promotions createOrderOrderLinesOrderLinePromotions() {
        return new Order.OrderLines.OrderLine.Promotions();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LineTaxes }
     * 
     */
    public Order.OrderLines.OrderLine.LineTaxes createOrderOrderLinesOrderLineLineTaxes() {
        return new Order.OrderLines.OrderLine.LineTaxes();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LineTaxes.LineTax }
     * 
     */
    public Order.OrderLines.OrderLine.LineTaxes.LineTax createOrderOrderLinesOrderLineLineTaxesLineTax() {
        return new Order.OrderLines.OrderLine.LineTaxes.LineTax();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LineCharges }
     * 
     */
    public Order.OrderLines.OrderLine.LineCharges createOrderOrderLinesOrderLineLineCharges() {
        return new Order.OrderLines.OrderLine.LineCharges();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LineCharges.LineCharge }
     * 
     */
    public Order.OrderLines.OrderLine.LineCharges.LineCharge createOrderOrderLinesOrderLineLineChargesLineCharge() {
        return new Order.OrderLines.OrderLine.LineCharges.LineCharge();
    }

    /**
     * Create an instance of {@link Order.PriceInfo }
     * 
     */
    public Order.PriceInfo createOrderPriceInfo() {
        return new Order.PriceInfo();
    }

    /**
     * Create an instance of {@link Order.PersonInfoBillTo }
     * 
     */
    public Order.PersonInfoBillTo createOrderPersonInfoBillTo() {
        return new Order.PersonInfoBillTo();
    }

    /**
     * Create an instance of {@link Order.PaymentMethods.PaymentMethod.PersonInfoBillTo }
     * 
     */
    public Order.PaymentMethods.PaymentMethod.PersonInfoBillTo createOrderPaymentMethodsPaymentMethodPersonInfoBillTo() {
        return new Order.PaymentMethods.PaymentMethod.PersonInfoBillTo();
    }

    /**
     * Create an instance of {@link Order.PaymentMethods.PaymentMethod.PaymentDetails }
     * 
     */
    public Order.PaymentMethods.PaymentMethod.PaymentDetails createOrderPaymentMethodsPaymentMethodPaymentDetails() {
        return new Order.PaymentMethods.PaymentMethod.PaymentDetails();
    }

    /**
     * Create an instance of {@link Order.HeaderTaxes.HeaderTax.Extn }
     * 
     */
    public Order.HeaderTaxes.HeaderTax.Extn createOrderHeaderTaxesHeaderTaxExtn() {
        return new Order.HeaderTaxes.HeaderTax.Extn();
    }

    /**
     * Create an instance of {@link Order.HeaderCharges.HeaderCharge }
     * 
     */
    public Order.HeaderCharges.HeaderCharge createOrderHeaderChargesHeaderCharge() {
        return new Order.HeaderCharges.HeaderCharge();
    }

    /**
     * Create an instance of {@link Order.Extn.ExtnPaymentDetailsList.ExtnPaymentDetails }
     * 
     */
    public Order.Extn.ExtnPaymentDetailsList.ExtnPaymentDetails createOrderExtnExtnPaymentDetailsListExtnPaymentDetails() {
        return new Order.Extn.ExtnPaymentDetailsList.ExtnPaymentDetails();
    }

    /**
     * Create an instance of {@link Order.Extn.ExtnUserAgentDetailsList.ExtnUserAgentDetails }
     * 
     */
    public Order.Extn.ExtnUserAgentDetailsList.ExtnUserAgentDetails createOrderExtnExtnUserAgentDetailsListExtnUserAgentDetails() {
        return new Order.Extn.ExtnUserAgentDetailsList.ExtnUserAgentDetails();
    }

    /**
     * Create an instance of {@link Order.Extn.ExtnStoreList.ExtnStore }
     * 
     */
    public Order.Extn.ExtnStoreList.ExtnStore createOrderExtnExtnStoreListExtnStore() {
        return new Order.Extn.ExtnStoreList.ExtnStore();
    }

    /**
     * Create an instance of {@link Order.Notes.Note }
     * 
     */
    public Order.Notes.Note createOrderNotesNote() {
        return new Order.Notes.Note();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Extn }
     * 
     */
    public Order.OrderLines.OrderLine.Extn createOrderOrderLinesOrderLineExtn() {
        return new Order.OrderLines.OrderLine.Extn();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Item }
     * 
     */
    public Order.OrderLines.OrderLine.Item createOrderOrderLinesOrderLineItem() {
        return new Order.OrderLines.OrderLine.Item();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LinePriceInfo }
     * 
     */
    public Order.OrderLines.OrderLine.LinePriceInfo createOrderOrderLinesOrderLineLinePriceInfo() {
        return new Order.OrderLines.OrderLine.LinePriceInfo();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Instructions.Instruction }
     * 
     */
    public Order.OrderLines.OrderLine.Instructions.Instruction createOrderOrderLinesOrderLineInstructionsInstruction() {
        return new Order.OrderLines.OrderLine.Instructions.Instruction();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Notes.Note }
     * 
     */
    public Order.OrderLines.OrderLine.Notes.Note createOrderOrderLinesOrderLineNotesNote() {
        return new Order.OrderLines.OrderLine.Notes.Note();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.PersonInfoShipTo.Extn }
     * 
     */
    public Order.OrderLines.OrderLine.PersonInfoShipTo.Extn createOrderOrderLinesOrderLinePersonInfoShipToExtn() {
        return new Order.OrderLines.OrderLine.PersonInfoShipTo.Extn();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.OrderDates.OrderDate }
     * 
     */
    public Order.OrderLines.OrderLine.OrderDates.OrderDate createOrderOrderLinesOrderLineOrderDatesOrderDate() {
        return new Order.OrderLines.OrderLine.OrderDates.OrderDate();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.Promotions.Promotion }
     * 
     */
    public Order.OrderLines.OrderLine.Promotions.Promotion createOrderOrderLinesOrderLinePromotionsPromotion() {
        return new Order.OrderLines.OrderLine.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn }
     * 
     */
    public Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn createOrderOrderLinesOrderLineLineTaxesLineTaxExtn() {
        return new Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn();
    }

    /**
     * Create an instance of {@link Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn }
     * 
     */
    public Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn createOrderOrderLinesOrderLineLineChargesLineChargeExtn() {
        return new Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Extn", scope = Order.OrderLines.OrderLine.LineCharges.LineCharge.class)
    public JAXBElement<Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn> createOrderOrderLinesOrderLineLineChargesLineChargeExtn(Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn value) {
        return new JAXBElement<Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn>(_OrderOrderLinesOrderLineLineChargesLineChargeExtn_QNAME, Order.OrderLines.OrderLine.LineCharges.LineCharge.Extn.class, Order.OrderLines.OrderLine.LineCharges.LineCharge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.PaymentMethods.PaymentMethod.PersonInfoBillTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PersonInfoBillTo", scope = Order.PaymentMethods.PaymentMethod.class)
    public JAXBElement<Order.PaymentMethods.PaymentMethod.PersonInfoBillTo> createOrderPaymentMethodsPaymentMethodPersonInfoBillTo(Order.PaymentMethods.PaymentMethod.PersonInfoBillTo value) {
        return new JAXBElement<Order.PaymentMethods.PaymentMethod.PersonInfoBillTo>(_OrderPaymentMethodsPaymentMethodPersonInfoBillTo_QNAME, Order.PaymentMethods.PaymentMethod.PersonInfoBillTo.class, Order.PaymentMethods.PaymentMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.PaymentMethods.PaymentMethod.PaymentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PaymentDetails", scope = Order.PaymentMethods.PaymentMethod.class)
    public JAXBElement<Order.PaymentMethods.PaymentMethod.PaymentDetails> createOrderPaymentMethodsPaymentMethodPaymentDetails(Order.PaymentMethods.PaymentMethod.PaymentDetails value) {
        return new JAXBElement<Order.PaymentMethods.PaymentMethod.PaymentDetails>(_OrderPaymentMethodsPaymentMethodPaymentDetails_QNAME, Order.PaymentMethods.PaymentMethod.PaymentDetails.class, Order.PaymentMethods.PaymentMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Extn", scope = Order.OrderLines.OrderLine.LineTaxes.LineTax.class)
    public JAXBElement<Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn> createOrderOrderLinesOrderLineLineTaxesLineTaxExtn(Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn value) {
        return new JAXBElement<Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn>(_OrderOrderLinesOrderLineLineChargesLineChargeExtn_QNAME, Order.OrderLines.OrderLine.LineTaxes.LineTax.Extn.class, Order.OrderLines.OrderLine.LineTaxes.LineTax.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.OrderLines.OrderLine.LineCharges.LineCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LineCharge", scope = Order.OrderLines.OrderLine.LineCharges.class)
    public JAXBElement<Order.OrderLines.OrderLine.LineCharges.LineCharge> createOrderOrderLinesOrderLineLineChargesLineCharge(Order.OrderLines.OrderLine.LineCharges.LineCharge value) {
        return new JAXBElement<Order.OrderLines.OrderLine.LineCharges.LineCharge>(_OrderOrderLinesOrderLineLineChargesLineCharge_QNAME, Order.OrderLines.OrderLine.LineCharges.LineCharge.class, Order.OrderLines.OrderLine.LineCharges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.HeaderTaxes.HeaderTax.Extn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Extn", scope = Order.HeaderTaxes.HeaderTax.class)
    public JAXBElement<Order.HeaderTaxes.HeaderTax.Extn> createOrderHeaderTaxesHeaderTaxExtn(Order.HeaderTaxes.HeaderTax.Extn value) {
        return new JAXBElement<Order.HeaderTaxes.HeaderTax.Extn>(_OrderOrderLinesOrderLineLineChargesLineChargeExtn_QNAME, Order.HeaderTaxes.HeaderTax.Extn.class, Order.HeaderTaxes.HeaderTax.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.OrderLines.OrderLine.PersonInfoShipTo.Extn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Extn", scope = Order.OrderLines.OrderLine.PersonInfoShipTo.class)
    public JAXBElement<Order.OrderLines.OrderLine.PersonInfoShipTo.Extn> createOrderOrderLinesOrderLinePersonInfoShipToExtn(Order.OrderLines.OrderLine.PersonInfoShipTo.Extn value) {
        return new JAXBElement<Order.OrderLines.OrderLine.PersonInfoShipTo.Extn>(_OrderOrderLinesOrderLineLineChargesLineChargeExtn_QNAME, Order.OrderLines.OrderLine.PersonInfoShipTo.Extn.class, Order.OrderLines.OrderLine.PersonInfoShipTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order.OrderLines.OrderLine.Promotions.Promotion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Promotion", scope = Order.OrderLines.OrderLine.Promotions.class)
    public JAXBElement<Order.OrderLines.OrderLine.Promotions.Promotion> createOrderOrderLinesOrderLinePromotionsPromotion(Order.OrderLines.OrderLine.Promotions.Promotion value) {
        return new JAXBElement<Order.OrderLines.OrderLine.Promotions.Promotion>(_OrderOrderLinesOrderLinePromotionsPromotion_QNAME, Order.OrderLines.OrderLine.Promotions.Promotion.class, Order.OrderLines.OrderLine.Promotions.class, value);
    }

}
