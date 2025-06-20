package xyz.tbvns.Nmap4J.XML;

// Main NmapRun POJO
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import xyz.tbvns.Nmap4J.XML.*;

import java.util.List;

/**
 * Main POJO representing the root 'nmaprun' element of the Nmap XML output.
 * It contains high-level scan information and a list of hosts.
 */
@JacksonXmlRootElement(localName = "nmaprun")
// Ignore unknown properties at the root level to prevent issues with unmapped elements
@JsonIgnoreProperties(ignoreUnknown = true)
public class NmapRun {

    @JacksonXmlProperty(isAttribute = true)
    public String scanner;

    @JacksonXmlProperty(isAttribute = true)
    public String args;

    @JacksonXmlProperty(isAttribute = true)
    public Long start;

    @JacksonXmlProperty(isAttribute = true)
    public String startstr;

    @JacksonXmlProperty(isAttribute = true)
    public String version;

    @JacksonXmlProperty(isAttribute = true)
    public String xmloutputversion;

    @JacksonXmlElementWrapper(useWrapping = false) // No wrapper element for taskbegin/taskend
    @JacksonXmlProperty(localName = "taskbegin")
    public List<Task> taskBegins;

    @JacksonXmlElementWrapper(useWrapping = false) // No wrapper element for taskbegin/taskend
    @JacksonXmlProperty(localName = "taskend")
    public List<Task> taskEnds;

    @JacksonXmlElementWrapper(useWrapping = false) // No wrapper element for host
    @JsonProperty("host")
    public List<Host> hosts;

    @JacksonXmlProperty(localName = "scaninfo")
    public ScanInfo scanInfo;

    @JacksonXmlProperty(localName = "verbose")
    public Verbose verbose;

    @JacksonXmlProperty(localName = "debugging")
    public Debugging debugging;

    @JacksonXmlProperty(localName = "runstats")
    public RunStats runStats;

    // Getters and Setters (omitted for brevity, but recommended for production code)
}


