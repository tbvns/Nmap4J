package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'distance' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distance {
    @JacksonXmlProperty(isAttribute = true)
    public Integer value;
}
