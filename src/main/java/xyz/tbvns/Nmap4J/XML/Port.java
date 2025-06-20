package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for an individual 'port' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Port {
    @JacksonXmlProperty(isAttribute = true)
    public String protocol;

    @JacksonXmlProperty(isAttribute = true)
    public Integer portid;

    @JacksonXmlProperty(localName = "state")
    public xyz.tbvns.Nmap4J.XML.State state;

    @JacksonXmlProperty(localName = "service")
    public xyz.tbvns.Nmap4J.XML.Service service;

    // Nmap scripts can have varied output, often within <script> tags.
    // We'll use a List<Script> to capture these.
    @JacksonXmlElementWrapper(useWrapping = false) // Don't wrap multiple <script> elements
    @JacksonXmlProperty(localName = "script")
    public List<xyz.tbvns.Nmap4J.XML.Script> scripts;
}
