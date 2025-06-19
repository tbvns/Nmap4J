package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Optional;

/**
 * POJO for nested 'table' elements within a script.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScriptTable {
    @JacksonXmlProperty(isAttribute = true)
    public Optional<String> key; // Tables can have a 'key' attribute

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "elem")
    public List<ScriptElem> elems;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "table")
    public List<ScriptTable> tables; // Tables can contain other tables
}
