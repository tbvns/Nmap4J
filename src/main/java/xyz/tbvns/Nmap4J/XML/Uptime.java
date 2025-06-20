package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'uptime' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Uptime {
    @JacksonXmlProperty(isAttribute = true)
    public Long seconds;

    @JacksonXmlProperty(isAttribute = true)
    public String lastboot;
}
