package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for the 'ports' element, containing lists of extraports and individual ports.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ports {
    @JacksonXmlElementWrapper(useWrapping = false) // No wrapper for extraports
    @JacksonXmlProperty(localName = "extraports")
    public List<Extraports> extraports;

    @JacksonXmlElementWrapper(useWrapping = false) // No wrapper for port
    @JacksonXmlProperty(localName = "port")
    public List<Port> ports;
}
