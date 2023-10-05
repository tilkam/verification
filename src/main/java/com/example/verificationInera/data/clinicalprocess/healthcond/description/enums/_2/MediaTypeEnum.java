
package com.example.verificationInera.data.clinicalprocess.healthcond.description.enums._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MediaTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="application/dicom"/&gt;
 *     &lt;enumeration value="application/msword"/&gt;
 *     &lt;enumeration value="application/pdf"/&gt;
 *     &lt;enumeration value="audio/basic"/&gt;
 *     &lt;enumeration value="audio/k32adpcm"/&gt;
 *     &lt;enumeration value="audio/mpeg"/&gt;
 *     &lt;enumeration value="image/g3fax"/&gt;
 *     &lt;enumeration value="image/gif"/&gt;
 *     &lt;enumeration value="image/jpeg"/&gt;
 *     &lt;enumeration value="image/png"/&gt;
 *     &lt;enumeration value="image/tiff"/&gt;
 *     &lt;enumeration value="model/vrml"/&gt;
 *     &lt;enumeration value="multipart/x-hl7-cda-level1"/&gt;
 *     &lt;enumeration value="text/html"/&gt;
 *     &lt;enumeration value="text/plain"/&gt;
 *     &lt;enumeration value="text/rtf"/&gt;
 *     &lt;enumeration value="text/sgml"/&gt;
 *     &lt;enumeration value="text/x-hl7-ft"/&gt;
 *     &lt;enumeration value="text/xml"/&gt;
 *     &lt;enumeration value="video/mpeg"/&gt;
 *     &lt;enumeration value="video/x-avi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediaTypeEnum", namespace = "urn:riv:clinicalprocess:healthcond:description:enums:2")
@XmlEnum
public enum MediaTypeEnum {

    @XmlEnumValue("application/dicom")
    APPLICATION_DICOM("application/dicom"),
    @XmlEnumValue("application/msword")
    APPLICATION_MSWORD("application/msword"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf"),
    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),
    @XmlEnumValue("audio/k32adpcm")
    AUDIO_K_32_ADPCM("audio/k32adpcm"),
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg"),
    @XmlEnumValue("image/g3fax")
    IMAGE_G_3_FAX("image/g3fax"),
    @XmlEnumValue("image/gif")
    IMAGE_GIF("image/gif"),
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff"),
    @XmlEnumValue("model/vrml")
    MODEL_VRML("model/vrml"),
    @XmlEnumValue("multipart/x-hl7-cda-level1")
    MULTIPART_X_HL_7_CDA_LEVEL_1("multipart/x-hl7-cda-level1"),
    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),
    @XmlEnumValue("text/rtf")
    TEXT_RTF("text/rtf"),
    @XmlEnumValue("text/sgml")
    TEXT_SGML("text/sgml"),
    @XmlEnumValue("text/x-hl7-ft")
    TEXT_X_HL_7_FT("text/x-hl7-ft"),
    @XmlEnumValue("text/xml")
    TEXT_XML("text/xml"),
    @XmlEnumValue("video/mpeg")
    VIDEO_MPEG("video/mpeg"),
    @XmlEnumValue("video/x-avi")
    VIDEO_X_AVI("video/x-avi");
    private final String value;

    MediaTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaTypeEnum fromValue(String v) {
        for (MediaTypeEnum c: MediaTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
