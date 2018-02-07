//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:38:42 AM GMT 
//


package com.integ.integration.services.contracts.common.test.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for FaultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://integ.com/integration/test/rest/qoteandbuy/api}AbstractDummy"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultDetails" type="{http://integ.com/integration/services/contracts/common}faultDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultResponse", propOrder = {
    "faultDetails"
})
public class FaultResponse
    extends AbstractDummy
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    protected FaultDetails faultDetails;

    /**
     * Default no-arg constructor
     * 
     */
    public FaultResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FaultResponse(final FaultDetails faultDetails) {
        super();
        this.faultDetails = faultDetails;
    }

    /**
     * Gets the value of the faultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FaultDetails }
     *     
     */
    public FaultDetails getFaultDetails() {
        return faultDetails;
    }

    /**
     * Sets the value of the faultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultDetails }
     *     
     */
    public void setFaultDetails(FaultDetails value) {
        this.faultDetails = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            FaultDetails theFaultDetails;
            theFaultDetails = this.getFaultDetails();
            strategy.appendField(locator, this, "faultDetails", buffer, theFaultDetails);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FaultResponse that = ((FaultResponse) object);
        {
            FaultDetails lhsFaultDetails;
            lhsFaultDetails = this.getFaultDetails();
            FaultDetails rhsFaultDetails;
            rhsFaultDetails = that.getFaultDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faultDetails", lhsFaultDetails), LocatorUtils.property(thatLocator, "faultDetails", rhsFaultDetails), lhsFaultDetails, rhsFaultDetails)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            FaultDetails theFaultDetails;
            theFaultDetails = this.getFaultDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faultDetails", theFaultDetails), currentHashCode, theFaultDetails);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof FaultResponse) {
            final FaultResponse copy = ((FaultResponse) draftCopy);
            if (this.faultDetails!= null) {
                FaultDetails sourceFaultDetails;
                sourceFaultDetails = this.getFaultDetails();
                FaultDetails copyFaultDetails = ((FaultDetails) strategy.copy(LocatorUtils.property(locator, "faultDetails", sourceFaultDetails), sourceFaultDetails));
                copy.setFaultDetails(copyFaultDetails);
            } else {
                copy.faultDetails = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FaultResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof FaultResponse) {
            final FaultResponse target = this;
            final FaultResponse leftObject = ((FaultResponse) left);
            final FaultResponse rightObject = ((FaultResponse) right);
            {
                FaultDetails lhsFaultDetails;
                lhsFaultDetails = leftObject.getFaultDetails();
                FaultDetails rhsFaultDetails;
                rhsFaultDetails = rightObject.getFaultDetails();
                FaultDetails mergedFaultDetails = ((FaultDetails) strategy.merge(LocatorUtils.property(leftLocator, "faultDetails", lhsFaultDetails), LocatorUtils.property(rightLocator, "faultDetails", rhsFaultDetails), lhsFaultDetails, rhsFaultDetails));
                target.setFaultDetails(mergedFaultDetails);
            }
        }
    }

}