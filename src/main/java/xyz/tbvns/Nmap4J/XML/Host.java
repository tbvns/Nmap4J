package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Optional;

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
    public List<Address> address; // Changed to list as there can be multiple addresses

    @JacksonXmlElementWrapper(localName = "hostnames") // Wrapper for hostnames
    @JacksonXmlProperty(localName = "hostname")
    public List<xyz.tbvns.Nmap4J.XML.Hostname> hostnames;

    @JacksonXmlProperty(localName = "ports")
    public xyz.tbvns.Nmap4J.XML.Ports ports;

    @JacksonXmlProperty(localName = "os") // Added for OS detection results
    public Optional<Os> os; // Optional as OS part may be null

    @JacksonXmlProperty(localName = "uptime") // Added for uptime
    public Optional<xyz.tbvns.Nmap4J.XML.Uptime> uptime; // Optional

    @JacksonXmlProperty(localName = "distance") // Added for distance
    public Optional<Distance> distance; // Optional

    @JacksonXmlProperty(localName = "tcpsequence") // Added for tcpsequence
    public Optional<xyz.tbvns.Nmap4J.XML.TcpSequence> tcpsequence; // Optional

    @JacksonXmlProperty(localName = "ipidsequence") // Added for ipidsequence
    public Optional<IpidSequence> ipidsequence; // Optional

    @JacksonXmlProperty(localName = "tcptssequence") // Added for tcptssequence
    public Optional<xyz.tbvns.Nmap4J.XML.TcptsSequence> tcptssequence; // Optional

    @JacksonXmlProperty(localName = "trace") // Added for trace
    public Optional<xyz.tbvns.Nmap4J.XML.Trace> trace; // Optional

    @JacksonXmlProperty(localName = "times")
    public xyz.tbvns.Nmap4J.XML.Times times;
}
