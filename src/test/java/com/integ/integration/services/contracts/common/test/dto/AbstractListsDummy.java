//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:38:42 AM GMT 
//


package com.integ.integration.services.contracts.common.test.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.integ.integration.services.contracts.common.CalendarDateDeserializer;
import com.integ.integration.services.contracts.common.CalendarDateSerializer;
import com.integ.integration.services.contracts.common.CalendarDateTimeDeserializer;
import com.integ.integration.services.contracts.common.CalendarDateTimeSerializer;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * <p>Java class for AbstractListsDummy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractListsDummy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://integ.com/integration/test/rest/qoteandbuy/api}AbstractDummy"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dn" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ln" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractListsDummy", propOrder = {
    "string",
    "dateTime",
    "date",
    "dn",
    "in",
    "ln"
})
@XmlSeeAlso({
    ListsDummyResponse.class,
    ListsDummyRequest.class
})
public abstract class AbstractListsDummy
    extends AbstractDummy
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString {

    protected List<String> string;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    @JsonSerialize(contentUsing = CalendarDateTimeSerializer.class, as = List.class)
    @JsonDeserialize(contentUsing = CalendarDateTimeDeserializer.class, as = List.class)
    protected List<Calendar> dateTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @JsonSerialize(contentUsing = CalendarDateSerializer.class, as = List.class)
    @JsonDeserialize(contentUsing = CalendarDateDeserializer.class, as = List.class)
    protected List<Calendar> date;
    protected List<BigDecimal> dn;
    @XmlElement(type = Integer.class)
    protected List<Integer> in;
    @XmlElement(type = Long.class)
    protected List<Long> ln;

    /**
     * Default no-arg constructor
     * 
     */
    public AbstractListsDummy() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AbstractListsDummy(final List<String> string, final List<Calendar> dateTime, final List<Calendar> date, final List<BigDecimal> dn, final List<Integer> in, final List<Long> ln) {
        super();
        this.string = string;
        this.dateTime = dateTime;
        this.date = date;
        this.dn = dn;
        this.in = in;
        this.ln = ln;
    }

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getString() {
        if (string == null) {
            string = new ArrayList<String>();
        }
        return this.string;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<Calendar> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<Calendar>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<Calendar> getDate() {
        if (date == null) {
            date = new ArrayList<Calendar>();
        }
        return this.date;
    }

    /**
     * Gets the value of the dn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getDn() {
        if (dn == null) {
            dn = new ArrayList<BigDecimal>();
        }
        return this.dn;
    }

    /**
     * Gets the value of the in property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the in property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIn() {
        if (in == null) {
            in = new ArrayList<Integer>();
        }
        return this.in;
    }

    /**
     * Gets the value of the ln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLn() {
        if (ln == null) {
            ln = new ArrayList<Long>();
        }
        return this.ln;
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
            List<String> theString;
            theString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
            strategy.appendField(locator, this, "string", buffer, theString);
        }
        {
            List<Calendar> theDateTime;
            theDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
        }
        {
            List<Calendar> theDate;
            theDate = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            List<BigDecimal> theDn;
            theDn = (((this.dn!= null)&&(!this.dn.isEmpty()))?this.getDn():null);
            strategy.appendField(locator, this, "dn", buffer, theDn);
        }
        {
            List<Integer> theIn;
            theIn = (((this.in!= null)&&(!this.in.isEmpty()))?this.getIn():null);
            strategy.appendField(locator, this, "in", buffer, theIn);
        }
        {
            List<Long> theLn;
            theLn = (((this.ln!= null)&&(!this.ln.isEmpty()))?this.getLn():null);
            strategy.appendField(locator, this, "ln", buffer, theLn);
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
        final AbstractListsDummy that = ((AbstractListsDummy) object);
        {
            List<String> lhsString;
            lhsString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
            List<String> rhsString;
            rhsString = (((that.string!= null)&&(!that.string.isEmpty()))?that.getString():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "string", lhsString), LocatorUtils.property(thatLocator, "string", rhsString), lhsString, rhsString)) {
                return false;
            }
        }
        {
            List<Calendar> lhsDateTime;
            lhsDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
            List<Calendar> rhsDateTime;
            rhsDateTime = (((that.dateTime!= null)&&(!that.dateTime.isEmpty()))?that.getDateTime():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime)) {
                return false;
            }
        }
        {
            List<Calendar> lhsDate;
            lhsDate = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
            List<Calendar> rhsDate;
            rhsDate = (((that.date!= null)&&(!that.date.isEmpty()))?that.getDate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            List<BigDecimal> lhsDn;
            lhsDn = (((this.dn!= null)&&(!this.dn.isEmpty()))?this.getDn():null);
            List<BigDecimal> rhsDn;
            rhsDn = (((that.dn!= null)&&(!that.dn.isEmpty()))?that.getDn():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dn", lhsDn), LocatorUtils.property(thatLocator, "dn", rhsDn), lhsDn, rhsDn)) {
                return false;
            }
        }
        {
            List<Integer> lhsIn;
            lhsIn = (((this.in!= null)&&(!this.in.isEmpty()))?this.getIn():null);
            List<Integer> rhsIn;
            rhsIn = (((that.in!= null)&&(!that.in.isEmpty()))?that.getIn():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "in", lhsIn), LocatorUtils.property(thatLocator, "in", rhsIn), lhsIn, rhsIn)) {
                return false;
            }
        }
        {
            List<Long> lhsLn;
            lhsLn = (((this.ln!= null)&&(!this.ln.isEmpty()))?this.getLn():null);
            List<Long> rhsLn;
            rhsLn = (((that.ln!= null)&&(!that.ln.isEmpty()))?that.getLn():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ln", lhsLn), LocatorUtils.property(thatLocator, "ln", rhsLn), lhsLn, rhsLn)) {
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
            List<String> theString;
            theString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "string", theString), currentHashCode, theString);
        }
        {
            List<Calendar> theDateTime;
            theDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime);
        }
        {
            List<Calendar> theDate;
            theDate = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            List<BigDecimal> theDn;
            theDn = (((this.dn!= null)&&(!this.dn.isEmpty()))?this.getDn():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dn", theDn), currentHashCode, theDn);
        }
        {
            List<Integer> theIn;
            theIn = (((this.in!= null)&&(!this.in.isEmpty()))?this.getIn():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "in", theIn), currentHashCode, theIn);
        }
        {
            List<Long> theLn;
            theLn = (((this.ln!= null)&&(!this.ln.isEmpty()))?this.getLn():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ln", theLn), currentHashCode, theLn);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AbstractListsDummy) {
            final AbstractListsDummy copy = ((AbstractListsDummy) target);
            if ((this.string!= null)&&(!this.string.isEmpty())) {
                List<String> sourceString;
                sourceString = (((this.string!= null)&&(!this.string.isEmpty()))?this.getString():null);
                @SuppressWarnings("unchecked")
                List<String> copyString = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "string", sourceString), sourceString));
                copy.string = null;
                if (copyString!= null) {
                    List<String> uniqueStringl = copy.getString();
                    uniqueStringl.addAll(copyString);
                }
            } else {
                copy.string = null;
            }
            if ((this.dateTime!= null)&&(!this.dateTime.isEmpty())) {
                List<Calendar> sourceDateTime;
                sourceDateTime = (((this.dateTime!= null)&&(!this.dateTime.isEmpty()))?this.getDateTime():null);
                @SuppressWarnings("unchecked")
                List<Calendar> copyDateTime = ((List<Calendar> ) strategy.copy(LocatorUtils.property(locator, "dateTime", sourceDateTime), sourceDateTime));
                copy.dateTime = null;
                if (copyDateTime!= null) {
                    List<Calendar> uniqueDateTimel = copy.getDateTime();
                    uniqueDateTimel.addAll(copyDateTime);
                }
            } else {
                copy.dateTime = null;
            }
            if ((this.date!= null)&&(!this.date.isEmpty())) {
                List<Calendar> sourceDate;
                sourceDate = (((this.date!= null)&&(!this.date.isEmpty()))?this.getDate():null);
                @SuppressWarnings("unchecked")
                List<Calendar> copyDate = ((List<Calendar> ) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate));
                copy.date = null;
                if (copyDate!= null) {
                    List<Calendar> uniqueDatel = copy.getDate();
                    uniqueDatel.addAll(copyDate);
                }
            } else {
                copy.date = null;
            }
            if ((this.dn!= null)&&(!this.dn.isEmpty())) {
                List<BigDecimal> sourceDn;
                sourceDn = (((this.dn!= null)&&(!this.dn.isEmpty()))?this.getDn():null);
                @SuppressWarnings("unchecked")
                List<BigDecimal> copyDn = ((List<BigDecimal> ) strategy.copy(LocatorUtils.property(locator, "dn", sourceDn), sourceDn));
                copy.dn = null;
                if (copyDn!= null) {
                    List<BigDecimal> uniqueDnl = copy.getDn();
                    uniqueDnl.addAll(copyDn);
                }
            } else {
                copy.dn = null;
            }
            if ((this.in!= null)&&(!this.in.isEmpty())) {
                List<Integer> sourceIn;
                sourceIn = (((this.in!= null)&&(!this.in.isEmpty()))?this.getIn():null);
                @SuppressWarnings("unchecked")
                List<Integer> copyIn = ((List<Integer> ) strategy.copy(LocatorUtils.property(locator, "in", sourceIn), sourceIn));
                copy.in = null;
                if (copyIn!= null) {
                    List<Integer> uniqueInl = copy.getIn();
                    uniqueInl.addAll(copyIn);
                }
            } else {
                copy.in = null;
            }
            if ((this.ln!= null)&&(!this.ln.isEmpty())) {
                List<Long> sourceLn;
                sourceLn = (((this.ln!= null)&&(!this.ln.isEmpty()))?this.getLn():null);
                @SuppressWarnings("unchecked")
                List<Long> copyLn = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "ln", sourceLn), sourceLn));
                copy.ln = null;
                if (copyLn!= null) {
                    List<Long> uniqueLnl = copy.getLn();
                    uniqueLnl.addAll(copyLn);
                }
            } else {
                copy.ln = null;
            }
        }
        return target;
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof AbstractListsDummy) {
            final AbstractListsDummy target = this;
            final AbstractListsDummy leftObject = ((AbstractListsDummy) left);
            final AbstractListsDummy rightObject = ((AbstractListsDummy) right);
            {
                List<String> lhsString;
                lhsString = (((leftObject.string!= null)&&(!leftObject.string.isEmpty()))?leftObject.getString():null);
                List<String> rhsString;
                rhsString = (((rightObject.string!= null)&&(!rightObject.string.isEmpty()))?rightObject.getString():null);
                List<String> mergedString = ((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "string", lhsString), LocatorUtils.property(rightLocator, "string", rhsString), lhsString, rhsString));
                target.string = null;
                if (mergedString!= null) {
                    List<String> uniqueStringl = target.getString();
                    uniqueStringl.addAll(mergedString);
                }
            }
            {
                List<Calendar> lhsDateTime;
                lhsDateTime = (((leftObject.dateTime!= null)&&(!leftObject.dateTime.isEmpty()))?leftObject.getDateTime():null);
                List<Calendar> rhsDateTime;
                rhsDateTime = (((rightObject.dateTime!= null)&&(!rightObject.dateTime.isEmpty()))?rightObject.getDateTime():null);
                List<Calendar> mergedDateTime = ((List<Calendar> ) strategy.merge(LocatorUtils.property(leftLocator, "dateTime", lhsDateTime), LocatorUtils.property(rightLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime));
                target.dateTime = null;
                if (mergedDateTime!= null) {
                    List<Calendar> uniqueDateTimel = target.getDateTime();
                    uniqueDateTimel.addAll(mergedDateTime);
                }
            }
            {
                List<Calendar> lhsDate;
                lhsDate = (((leftObject.date!= null)&&(!leftObject.date.isEmpty()))?leftObject.getDate():null);
                List<Calendar> rhsDate;
                rhsDate = (((rightObject.date!= null)&&(!rightObject.date.isEmpty()))?rightObject.getDate():null);
                List<Calendar> mergedDate = ((List<Calendar> ) strategy.merge(LocatorUtils.property(leftLocator, "date", lhsDate), LocatorUtils.property(rightLocator, "date", rhsDate), lhsDate, rhsDate));
                target.date = null;
                if (mergedDate!= null) {
                    List<Calendar> uniqueDatel = target.getDate();
                    uniqueDatel.addAll(mergedDate);
                }
            }
            {
                List<BigDecimal> lhsDn;
                lhsDn = (((leftObject.dn!= null)&&(!leftObject.dn.isEmpty()))?leftObject.getDn():null);
                List<BigDecimal> rhsDn;
                rhsDn = (((rightObject.dn!= null)&&(!rightObject.dn.isEmpty()))?rightObject.getDn():null);
                List<BigDecimal> mergedDn = ((List<BigDecimal> ) strategy.merge(LocatorUtils.property(leftLocator, "dn", lhsDn), LocatorUtils.property(rightLocator, "dn", rhsDn), lhsDn, rhsDn));
                target.dn = null;
                if (mergedDn!= null) {
                    List<BigDecimal> uniqueDnl = target.getDn();
                    uniqueDnl.addAll(mergedDn);
                }
            }
            {
                List<Integer> lhsIn;
                lhsIn = (((leftObject.in!= null)&&(!leftObject.in.isEmpty()))?leftObject.getIn():null);
                List<Integer> rhsIn;
                rhsIn = (((rightObject.in!= null)&&(!rightObject.in.isEmpty()))?rightObject.getIn():null);
                List<Integer> mergedIn = ((List<Integer> ) strategy.merge(LocatorUtils.property(leftLocator, "in", lhsIn), LocatorUtils.property(rightLocator, "in", rhsIn), lhsIn, rhsIn));
                target.in = null;
                if (mergedIn!= null) {
                    List<Integer> uniqueInl = target.getIn();
                    uniqueInl.addAll(mergedIn);
                }
            }
            {
                List<Long> lhsLn;
                lhsLn = (((leftObject.ln!= null)&&(!leftObject.ln.isEmpty()))?leftObject.getLn():null);
                List<Long> rhsLn;
                rhsLn = (((rightObject.ln!= null)&&(!rightObject.ln.isEmpty()))?rightObject.getLn():null);
                List<Long> mergedLn = ((List<Long> ) strategy.merge(LocatorUtils.property(leftLocator, "ln", lhsLn), LocatorUtils.property(rightLocator, "ln", rhsLn), lhsLn, rhsLn));
                target.ln = null;
                if (mergedLn!= null) {
                    List<Long> uniqueLnl = target.getLn();
                    uniqueLnl.addAll(mergedLn);
                }
            }
        }
    }

}