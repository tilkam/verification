
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClinicalDocumentNoteCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ClinicalDocumentNoteCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="utr"/&gt;
 *     &lt;enumeration value="atb"/&gt;
 *     &lt;enumeration value="sam"/&gt;
 *     &lt;enumeration value="sao"/&gt;
 *     &lt;enumeration value="ins"/&gt;
 *     &lt;enumeration value="slu"/&gt;
 *     &lt;enumeration value="auf"/&gt;
 *     &lt;enumeration value="sva"/&gt;
 *     &lt;enumeration value="bes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClinicalDocumentNoteCodeEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum ClinicalDocumentNoteCodeEnum {


    /**
     * Utredning
     * 
     */
    @XmlEnumValue("utr")
    UTR("utr"),

    /**
     * Åtgärd/Behandling
     * 
     */
    @XmlEnumValue("atb")
    ATB("atb"),

    /**
     * Sammanfattning
     * 
     */
    @XmlEnumValue("sam")
    SAM("sam"),

    /**
     * Samordning
     * 
     */
    @XmlEnumValue("sao")
    SAO("sao"),

    /**
     * Inskrivning
     * 
     */
    @XmlEnumValue("ins")
    INS("ins"),

    /**
     * Slutanteckning
     * 
     */
    @XmlEnumValue("slu")
    SLU("slu"),

    /**
     * Anteckning utan fysiskt möte
     * 
     */
    @XmlEnumValue("auf")
    AUF("auf"),

    /**
     * Slutenvårdsanteckning
     * 
     */
    @XmlEnumValue("sva")
    SVA("sva"),

    /**
     * Besöksanteckning
     * 
     */
    @XmlEnumValue("bes")
    BES("bes");
    private final String value;

    ClinicalDocumentNoteCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClinicalDocumentNoteCodeEnum fromValue(String v) {
        for (ClinicalDocumentNoteCodeEnum c: ClinicalDocumentNoteCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
