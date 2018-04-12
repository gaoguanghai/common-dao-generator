/*
 * $Id: codetemplates.xml ver yyyy-mm-dd rb $
 */
package com.xxx.generator;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class DaoGenerator {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        URL url = DaoGenerator.class.getClassLoader().getResource("generatorConfig.xml");
        File configFile = new File(url.toURI());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
