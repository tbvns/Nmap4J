package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * POJO for 'osclass' element within osmatch.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OsClass {
    @JacksonXmlProperty(isAttribute = true)
    public String type;

    @JacksonXmlProperty(isAttribute = true)
    public String vendor;

    @JacksonXmlProperty(isAttribute = true)
    public String osfamily;

    @JacksonXmlProperty(isAttribute = true)
    public String osgen;

    @JacksonXmlProperty(isAttribute = true)
    public Integer accuracy;

    @JacksonXmlProperty(localName = "cpe")
    public String cpe;
}
