package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.Optional;

/**
 * POJO for 'elem' elements within a script or script table.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScriptElem {
    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> key; // Elems can have a 'key' attribute

    @JacksonXmlText // Captures the direct text content of the element
    public String value;
}
