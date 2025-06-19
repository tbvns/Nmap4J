package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for the 'scaninfo' element.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScanInfo {
    @JacksonXmlProperty(isAttribute = true)
    public String type;

    @JacksonXmlProperty(isAttribute = true)
    public String protocol;

    @JacksonXmlProperty(isAttribute = true)
    public Integer numservices;

    @JacksonXmlProperty(isAttribute = true)
    public String services;
}
