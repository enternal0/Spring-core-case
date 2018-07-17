package com.dan.springcore.spel.springInnerBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "environmentBean")
public class SystemEnvironmentBean {
    @Value(value = "#{systemEnvironment['Path']}")
    private String path;
    @Value(value = "#{systemEnvironment['SystemDrive']}")
    private String systemDrive;
    @Value(value = "#{systemEnvironment['AppData']}")
    private String appData;
}
