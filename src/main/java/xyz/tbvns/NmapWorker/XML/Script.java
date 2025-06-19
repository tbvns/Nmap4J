package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for the 'script' element.
 * The output can be complex, often containing nested 'table' and 'elem' elements,
 * or just plain text. We will handle the output as a raw string for simplicity,
 * and also map the nested tables and elems.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Script {
    @JacksonXmlProperty(isAttribute = true)
    public String id;

    @JacksonXmlProperty(isAttribute = true)
    public String output;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "table")
    public List<ScriptTable> tables;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "elem")
    public List<ScriptElem> elems;
}
