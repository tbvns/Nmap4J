package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for 'osmatch' element within os.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OsMatch {
    @JacksonXmlProperty(isAttribute = true)
    public String name;

    @JacksonXmlProperty(isAttribute = true)
    public Integer accuracy;

    @JacksonXmlProperty(isAttribute = true)
    public String line;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "osclass")
    public List<OsClass> osClass;
}
