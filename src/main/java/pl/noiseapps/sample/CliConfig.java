package pl.noiseapps.sample;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class CliConfig {

    public Options createCliOptions() {
        Options options = new Options();

        options.addOption(new Option("h", "help", false, "Display help"));
        options.addOption(new Option("t", "test", true, "Display message"));

        return options;
    }

}
