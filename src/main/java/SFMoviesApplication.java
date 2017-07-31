import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SFMoviesApplication extends Application<SFMoviesConfiguration> {
  public static void main(String[] args) throws Exception {
    new SFMoviesApplication().run(args);
  }

  @Override
  public String getName() {
    return "sf-movies";
  }

  @Override
  public void initialize(Bootstrap<SFMoviesConfiguration> bootstrap) {

  }

  public void run(SFMoviesConfiguration configuration, Environment environment) throws Exception {

  }
}
