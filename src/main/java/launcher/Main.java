package launcher;

// import org.cfg4j.provider.ConfigurationProvider;
import org.cfg4j.provider.ConfigurationProviderBuilder;
import org.cfg4j.source.ConfigurationSource;
import org.cfg4j.source.context.environment.Environment;
import org.cfg4j.source.context.environment.ImmutableEnvironment;
import org.cfg4j.source.files.FilesConfigurationSource;

public class Main {

  /** Entry point of the service. */
  public static void main(String[] args) {
    // Below points to 'application.properties' file.
    final ConfigurationSource configSource = new FilesConfigurationSource();

    // Below points to folder location of 'application.properties'
    final Environment environment = new ImmutableEnvironment("config/cfg4j/prod/");

    // Building the service configuration provider.
    // final ConfigurationProvider configProvider =
    new ConfigurationProviderBuilder()
        .withConfigurationSource(configSource)
        .withEnvironment(environment)
        .build();
  }
}
