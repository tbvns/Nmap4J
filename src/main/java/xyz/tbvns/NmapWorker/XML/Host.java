package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for the 'host' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Host {
    @JacksonXmlProperty(isAttribute = true)
    public Long starttime;

    @JacksonXmlProperty(isAttribute = true)
    public Long endtime;

    @JacksonXmlProperty(localName = "status")
    public Status status;

    @JacksonXmlProperty(localName = "address")
    public Address address;

    @JacksonXmlElementWrapper(localName = "hostnames") // Wrapper for hostnames
    @JacksonXmlProperty(localName = "hostname")
    public List<Hostname> hostnames;

    @JacksonXmlProperty(localName = "ports")
    public Ports ports;

    @JacksonXmlProperty(localName = "times")
    public Times times;
}
