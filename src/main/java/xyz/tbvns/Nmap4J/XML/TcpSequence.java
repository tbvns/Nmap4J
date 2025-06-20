package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'tcpsequence' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TcpSequence {
    @JacksonXmlProperty(isAttribute = true)
    public Integer index;

    @JacksonXmlProperty(isAttribute = true)
    public String difficulty;

    @JacksonXmlProperty(isAttribute = true)
    public String values;
}
