package pl.noiseapps.sample;

import org.apache.commons.cli.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Hi");

        Options cliOptions = new CliConfig().createCliOptions();
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(cliOptions, args);

        if (commandLine.hasOption('h')) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("ant", cliOptions);
        }
        if (commandLine.hasOption('t')) {
            String value = commandLine.getOptionValue('t');
            System.out.println(value);
        }

    }
}
