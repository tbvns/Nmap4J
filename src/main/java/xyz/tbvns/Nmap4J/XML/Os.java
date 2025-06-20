package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for the 'os' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Os {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "portused")
    public List<xyz.tbvns.Nmap4J.XML.PortUsed> portUsed;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "osmatch")
    public List<xyz.tbvns.Nmap4J.XML.OsMatch> osMatch;
}
