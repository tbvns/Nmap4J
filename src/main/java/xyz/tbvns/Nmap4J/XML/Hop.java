package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'hop' element within trace.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hop {
    @JacksonXmlProperty(isAttribute = true)
    public Integer ttl;

    @JacksonXmlProperty(isAttribute = true)
    public String ipaddr;

    @JacksonXmlProperty(isAttribute = true)
    public Double rtt;
}
