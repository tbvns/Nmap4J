package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'portused' element within os.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortUsed {
    @JacksonXmlProperty(isAttribute = true)
    public String state;

    @JacksonXmlProperty(isAttribute = true)
    public String proto;

    @JacksonXmlProperty(isAttribute = true)
    public Integer portid;
}
