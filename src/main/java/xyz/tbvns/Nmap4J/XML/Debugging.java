package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'debugging' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Debugging {
    @JacksonXmlProperty(isAttribute = true)
    public Integer level;
}
