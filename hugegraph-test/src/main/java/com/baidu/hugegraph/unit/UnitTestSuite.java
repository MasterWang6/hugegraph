/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.baidu.hugegraph.unit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.baidu.hugegraph.unit.cache.CacheManagerTest;
import com.baidu.hugegraph.unit.cache.CachedGraphTransactionTest;
import com.baidu.hugegraph.unit.cache.CachedSchemaTransactionTest;
import com.baidu.hugegraph.unit.cache.RamCacheTest;
import com.baidu.hugegraph.unit.core.AnalyzerTest;
import com.baidu.hugegraph.unit.core.BackendMutationTest;
import com.baidu.hugegraph.unit.core.CassandraTest;
import com.baidu.hugegraph.unit.core.ConditionQueryFlattenTest;
import com.baidu.hugegraph.unit.core.DataTypeTest;
import com.baidu.hugegraph.unit.core.DirectionsTest;
import com.baidu.hugegraph.unit.core.EdgeIdTest;
import com.baidu.hugegraph.unit.core.JsonUtilTest;
import com.baidu.hugegraph.unit.core.LocksTableTest;
import com.baidu.hugegraph.unit.core.SerialEnumTest;
import com.baidu.hugegraph.unit.core.StringUtilTest;
import com.baidu.hugegraph.unit.core.VersionTest;
import com.baidu.hugegraph.unit.rocksdb.RocksDBCountersTest;
import com.baidu.hugegraph.unit.rocksdb.RocksDBSessionsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    RamCacheTest.class,
    CachedSchemaTransactionTest.class,
    CachedGraphTransactionTest.class,
    CacheManagerTest.class,

    VersionTest.class,
    DataTypeTest.class,
    DirectionsTest.class,
    SerialEnumTest.class,
    BackendMutationTest.class,
    CassandraTest.class,
    ConditionQueryFlattenTest.class,
    EdgeIdTest.class,
    AnalyzerTest.class,
    JsonUtilTest.class,
    StringUtilTest.class,
    LocksTableTest.class,

    RocksDBSessionsTest.class,
    RocksDBCountersTest.class
})
public class UnitTestSuite {
}
