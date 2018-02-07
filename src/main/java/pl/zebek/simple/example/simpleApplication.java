package pl.zebek.simple.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class simpleApplication extends Application<simpleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new simpleApplication().run(args);
    }

    @Override
    public String getName() {
        return "simple";
    }

    @Override
    public void initialize(final Bootstrap<simpleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final simpleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
