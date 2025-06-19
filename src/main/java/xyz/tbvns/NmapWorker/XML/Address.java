package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'address' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JacksonXmlProperty(isAttribute = true)
    public String addr;

    @JacksonXmlProperty(isAttribute = true)
    public String addrtype;
}
