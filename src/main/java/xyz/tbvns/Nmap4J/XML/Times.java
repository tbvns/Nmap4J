package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'times' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Times {
    @JacksonXmlProperty(isAttribute = true)
    public Long srtt;

    @JacksonXmlProperty(isAttribute = true)
    public Long rttvar;

    @JacksonXmlProperty(isAttribute = true)
    public Long to;
}
