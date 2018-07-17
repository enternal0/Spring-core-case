package com.dan.springcore.spel.springInnerBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class SystemPropertiesBean {

    @Value(value = "#{systemProperties['java.class.path']}")
    private String classPath;
    @Value(value = "#{systemProperties['java.home']}")
    private String javaHome;
    @Value(value = "#{systemProperties['java.class.version']}")
    private String javaVersion;
    @Value(value = "#{systemProperties['os.name']}")
    private String osName;
    @Value(value = "#{systemProperties['file.encoding']}")
    private String fileEncoding;
    @Value(value = "#{systemProperties['file.separator']}")
    private String fileSeparator;
    @Value(value = "#{systemProperties['path.separator']}")
    private String pathSeparator;

}
