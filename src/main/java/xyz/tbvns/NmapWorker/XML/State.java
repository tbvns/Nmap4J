package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'state' element within a port.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {
    @JacksonXmlProperty(isAttribute = true)
    public String state;

    @JacksonXmlProperty(isAttribute = true)
    public String reason;

    @JacksonXmlProperty(isAttribute = true)
    public Integer reason_ttl;
}
