package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'finished' element within runstats.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Finished {
    @JacksonXmlProperty(isAttribute = true)
    public Long time;

    @JacksonXmlProperty(isAttribute = true)
    public String timestr;

    @JacksonXmlProperty(isAttribute = true)
    public String summary;

    @JacksonXmlProperty(isAttribute = true)
    public Double elapsed;

    @JacksonXmlProperty(isAttribute = true)
    public String exit;
}
