/*
 *
 *  * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *  *
 *  * WSO2 LLC. licenses this file to you under the Apache License,
 *  * Version 2.0 (the "License"); you may not use this file except
 *  * in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied. See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package io.ballerina.sonar;

public class Constants {
    private Constants() {
    }

    static final String PLATFORM_NAME = "sonarqube";
    static final String ISSUE_FILE_PATH = "ballerina-analysis-results.json";
    static final String RULE_PREFIX = "B";
    static final String FORWARD_SLASH = "/";
    static final String START_LINE = "startLine";
    static final String START_LINE_OFFSET = "startLineOffset";
    static final String END_LINE = "endLine";
    static final String END_LINE_OFFSET = "endLineOffset";
    static final String RULE_ID = "ruleID";
    static final String MESSAGE = "message";
    static final String RULE_KIND = "ruleKind";
    static final String SOURCE = "source";
    static final String FILE_NAME = "fileName";
    static final String FILE_PATH = "filePath";
}
