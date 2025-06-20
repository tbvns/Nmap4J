package xyz.tbvns.Nmap4J;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import xyz.tbvns.Nmap4J.XML.NmapRun;

public class Nmap {
    @Setter @Getter
    private static String location = "nmap";

    public static NmapRun fullScan(String host, boolean detectOs) throws Exception {
        File file = Files.createTempFile("nmap4j-out", ".xml").toFile();
        ProcessBuilder builder = new ProcessBuilder(
                location,
                "-v", "-A", "-Pn",
                host, "-oX", file.getAbsolutePath()
        );
        if (detectOs) builder.command().add("-O");
        Process process = builder.start();
        while (process.isAlive());
        System.out.println(file);
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
        System.out.println(new String(process.getErrorStream().readAllBytes()));
        System.out.println(new String(process.getInputStream().readAllBytes()));
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new Jdk8Module());
        NmapRun outputXML = mapper.readValue(file, NmapRun.class);
        file.delete();
        return outputXML;
    }

//    public static NmapRun fullScanAdmin(String host, boolean detectOs) throws Exception {
//        File file = Files.createTempFile("nmap4j-out", ".xml").toFile();
//        file.delete();
//
//        // Build base command
//        List<String> command = new ArrayList<>();
//        command.add("pkexec");
//        command.add(location);
//        command.add("-v");
//        command.add("-A");
//        command.add("-Pn");
//        command.add("-oX");
//        command.add(file.getAbsolutePath());
//        if (detectOs) command.add("-O");
//        command.add(host);
//
//        ProcessBuilder builder = new ProcessBuilder(command);
//        Process process = builder.start();
//
//        // Wait for the process to finish
//        process.waitFor();
//
//        System.out.println(new String(process.getErrorStream().readAllBytes()));
//
//        System.out.println("Scan result saved to: " + file);
//
//        // Parse output
//        XmlMapper mapper = new XmlMapper();
//        mapper.registerModule(new Jdk8Module());
//        NmapRun outputXML = mapper.readValue(file, NmapRun.class);
//
//        // Clean up
//        file.delete();
//
//        return outputXML;
//    }

//    @SneakyThrows
//    public static void main(String[] args) {
//        NmapRun run = fullScanAdmin("192.168.1.42", true);
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new Jdk8Module());
//        String data = mapper.writeValueAsString(run);
//        System.out.println(data);
//    }
}
