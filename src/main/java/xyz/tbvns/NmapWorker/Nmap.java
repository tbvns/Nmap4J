package xyz.tbvns.NmapWorker;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import xyz.tbvns.NmapWorker.XML.NmapRun;

import java.io.File;
import java.nio.file.Files;

public class Nmap {
    @Setter @Getter
    private static String location = "nmap";

    public static NmapRun fullScan(String host) throws Exception {
        File file = Files.createTempFile("nmap4j-out", ".xml").toFile();
        ProcessBuilder builder = new ProcessBuilder(
                location,
                "-v", "-A", "-Pn",
                host, "-oX", file.getAbsolutePath()
        );
        Process process = builder.start();
        while (process.isAlive());
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new Jdk8Module());
        NmapRun outputXML = mapper.readValue(file, NmapRun.class);
        file.delete();
        return outputXML;
    }

    public static NmapRun portScan(String host, int... port) throws Exception {
        File file = Files.createTempFile("nmap4j-out", ".xml").toFile();
        StringBuilder ports = new StringBuilder();
        if (port.length == 1) {
            ports = new StringBuilder(String.valueOf(port[0]));
        } else {
            for (int i = 0; i < port.length; i++) {
                if (i!=0) ports.append(",");
                ports.append(port[i]);
            }
        }

        ProcessBuilder builder = new ProcessBuilder(
                location,
                "-v", "-A", "-Pn",
                host, "-oX", file.getAbsolutePath(),
                "-p", ports.toString()
        );
        Process process = builder.start();
        while (process.isAlive());
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new Jdk8Module());
        NmapRun outputXML = mapper.readValue(file, NmapRun.class);
        file.delete();
        return outputXML;
    }
}
