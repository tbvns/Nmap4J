package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Optional;

/**
 * POJO for the 'address' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JacksonXmlProperty(isAttribute = true)
    public String addr;

    @JacksonXmlProperty(isAttribute = true)
    public String addrtype;

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> vendor; // Optional for MAC address vendor
}
