package com.weds.antd.appserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;


public class InterfaceProperties {

    public InterfaceProperties() {
    }

    @ConfigurationProperties(prefix = "app.interface.eureka")
    public static class Eureka {
        @NotNull
        private String appsUrl;

        public Eureka() {
        }

        public String getAppsUrl() {
            return appsUrl;
        }

        public void setAppsUrl(String appsUrl) {
            this.appsUrl = appsUrl;
        }
    }

    @ConfigurationProperties(prefix = "app.interface.mq")
    public static class Mq {

        @NotNull
        private String vhostsUrl;

        @NotNull
        private String userName;

        @NotNull
        private String pwd;

        public Mq() {
        }

        public String getVhostsUrl() {
            return vhostsUrl;
        }

        public void setVhostsUrl(String vhostsUrl) {
            this.vhostsUrl = vhostsUrl;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
    }
}
