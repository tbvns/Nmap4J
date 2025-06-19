package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Optional;

/**
 * POJO for 'service' element within a port.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Service {
    @JacksonXmlProperty(isAttribute = true)
    public String name;

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> product; // Optional as not always present

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> version; // Optional as not always present

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> extrainfo; // Optional as not always present

    @JacksonXmlProperty(isAttribute = true)
    public String method;

    @JacksonXmlProperty(isAttribute = true)
    public Integer conf;

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> tunnel; // Optional for SSL tunnel

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> hostname; // Optional for SMTP hostname

    @JacksonXmlProperty(localName = "cpe")
    public Optional<String> cpe; // Optional as not always present
}
