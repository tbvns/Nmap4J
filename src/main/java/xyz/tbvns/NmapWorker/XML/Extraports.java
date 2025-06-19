package xyz.tbvns.NmapWorker.XML;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * POJO for 'extraports' element, including the 'reason' attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Extraports {
    @JacksonXmlProperty(isAttribute = true)
    public String state;

    @JacksonXmlProperty(isAttribute = true)
    public Integer count;

    // Use Optional for the 'reason' attribute if it might not always be present
    // The issue from your previous query was likely due to this field not being
    // present in the compiled public class or a mismatch in how it was parsed vs. expected.
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "extrareasons")
    public List<ExtraReason> extrareasons;
}
