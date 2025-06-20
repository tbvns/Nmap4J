package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'extrareasons' element. This is where the 'reason' attribute was causing issues.
 * Note the 'reason' is an attribute here.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraReason {
    @JacksonXmlProperty(isAttribute = true)
    public String reason;

    @JacksonXmlProperty(isAttribute = true)
    public Integer count;

    @JacksonXmlProperty(isAttribute = true)
    public String proto;

    @JacksonXmlProperty(isAttribute = true)
    public String ports;
}
