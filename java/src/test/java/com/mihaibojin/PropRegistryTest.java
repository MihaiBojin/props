package com.mihaibojin;

import com.mihaibojin.prop.PropRegistry;
import com.mihaibojin.resolvers.EnvResolver;
import com.mihaibojin.resolvers.PropertyFileResolver;
import com.mihaibojin.resolvers.SystemPropertyResolver;
import java.nio.file.Paths;
import org.testng.annotations.Test;

public class PropRegistryTest {
  @Test
  public void testRegistry() {
    PropRegistry registry =
        new PropRegistry(
            new SystemPropertyResolver(true),
            new EnvResolver(true),
            new PropertyFileResolver(Paths.get("config.properties"), true));
  }
}
