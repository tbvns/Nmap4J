package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'runstats' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RunStats {
    @JacksonXmlProperty(localName = "finished")
    public Finished finished;

    @JacksonXmlProperty(localName = "hosts")
    public xyz.tbvns.Nmap4J.XML.Hosts hosts;
}
