/*
 * Copyright 2012-2016 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.hub.collector;

import com.marklogic.hub.plugin.PluginType;

import java.util.Map;
import java.util.Vector;

public class QueryCollector extends ServerCollector {

    public static final String MODULE = "/com.marklogic.hub/collectors/query.xqy";

    public QueryCollector() {
        super(PluginType.XQUERY, MODULE);
    }

    @Override
    public Vector<String> run(Map<String, Object> options) {
        return null;
    }

}
