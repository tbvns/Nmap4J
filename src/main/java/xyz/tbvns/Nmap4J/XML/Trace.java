package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for the 'trace' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trace {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "hop")
    public List<Hop> hops;
}
