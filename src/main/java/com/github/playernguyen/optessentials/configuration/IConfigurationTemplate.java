package com.github.playernguyen.optessentials.configuration;

/**
 * The template is a form to define and get the config in a clearly way.
 *
 */
public interface IConfigurationTemplate {

    /**
     * A path for configuration
     * @return a path configuration
     */
    String getPath();

    /**
     * A object to define as init
     * @return a init definition object
     */
    Object getDefine();

}
