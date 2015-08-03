/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zbum.example.socket.server.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Jibeom Jung
 */
@Configuration
@EnableAutoConfiguration
@PropertySource({"classpath:/properties/local/springjpa.properties"})
public class RepositoryConfiguration {
    @Configuration
    @Profile("production")
    @PropertySource("classpath:/properties/production/springjpa.properties")
    static class Production
    { }

    @Configuration
    @Profile("local")
    @PropertySource({"classpath:/properties/local/springjpa.properties"})
    static class Local
    { }
}
