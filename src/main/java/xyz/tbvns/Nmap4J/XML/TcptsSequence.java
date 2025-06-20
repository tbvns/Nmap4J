package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'tcptssequence' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TcptsSequence {
    @JacksonXmlProperty(isAttribute = true)
    public String clazz; // 'class' is a reserved keyword in Java, using 'clazz'

    @JacksonXmlProperty(isAttribute = true)
    public String values;
}
