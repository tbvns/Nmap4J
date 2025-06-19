package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'hosts' element within runstats.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hosts {
    @JacksonXmlProperty(isAttribute = true)
    public Integer up;

    @JacksonXmlProperty(isAttribute = true)
    public Integer down;

    @JacksonXmlProperty(isAttribute = true)
    public Integer total;
}
