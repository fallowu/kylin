/*
 * Copyright 2013-2014 eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kylinolap.kylin.jdbc;

import java.sql.ResultSetMetaData;
import java.util.TimeZone;

import net.hydromatic.avatica.AvaticaPrepareResult;
import net.hydromatic.avatica.AvaticaResultSet;
import net.hydromatic.avatica.AvaticaStatement;

import com.kylinolap.kylin.jdbc.KylinPrepare.PrepareResult;

/**
 * Kylin query result set
 * 
 * @author xduo
 * 
 */
public class KylinResultSet extends AvaticaResultSet {

    public KylinResultSet(AvaticaStatement statement, AvaticaPrepareResult prepareResult, ResultSetMetaData resultSetMetaData, TimeZone timeZone) {
        super(statement, prepareResult, resultSetMetaData, timeZone);
    }

    public KylinPrepare.PrepareResult getPrepareResult() {
        return (PrepareResult) prepareResult;
    }
}
