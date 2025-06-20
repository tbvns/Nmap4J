package xyz.tbvns.Nmap4J.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Optional;

/**
 * POJO for 'taskbegin' and 'taskend' elements.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Task {
    @JacksonXmlProperty(isAttribute = true)
    public String task;

    @JacksonXmlProperty(isAttribute = true)
    public Long time;

    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> extrainfo; // 'extrainfo' might be optional
}
