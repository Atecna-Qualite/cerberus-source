/**
 * Cerberus Copyright (C) 2013 - 2017 cerberustesting
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Cerberus.
 *
 * Cerberus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cerberus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.cerberus.crud.dao;

import java.util.List;
import java.util.Map;

import org.cerberus.crud.entity.TestCaseExecution;
import org.cerberus.crud.entity.TestCaseExecutionData;
import org.cerberus.exception.CerberusException;

/**
 * {Insert class description here}
 *
 * @author Tiago Bernardes
 * @version 1.0, 02/01/2013
 * @since 2.0.0
 */
public interface ITestCaseExecutionDataDAO {

    /**
     *
     * @param id
     * @param property
     * @param index
     * @return
     */
    TestCaseExecutionData readByKey(long id, String property, int index) throws CerberusException;

    /**
     *
     * @param id
     * @param start
     * @param amount
     * @param column
     * @param dir
     * @param searchTerm
     * @param individualSearch
     * @return
     */
    List<TestCaseExecutionData> readByIdByCriteria(long id, int start, int amount, String column, String dir, String searchTerm, Map<String, List<String>> individualSearch) throws CerberusException;

    /**
     *
     * @param system
     * @param environment
     * @param country
     * @param property
     * @param cacheExpire
     * @return
     */
    TestCaseExecutionData readLastCacheEntry(String system, String environment, String country, String property, int cacheExpire) throws CerberusException;

    /**
     * Get the list of values of past execution data on the property @propName
     * value in the given @test, @testcase, @build, @environment, @country
     * excluding the current one (specified in @id parameter)
     *
     * @param id
     * @param propName
     * @param test
     * @param testCase
     * @param build
     * @param environment
     * @param country
     * @return
     */
    List<String> getPastValuesOfProperty(long id, String propName, String test, String testCase, String build, String environment, String country) throws CerberusException;

    /**
     * Get the list of values currently in used in the given COUNTRY,
     * ENVIRONMENT, PROPERTY only STATUS = PE execution wil be used. Nb of
     * seconds in timeout will be used to remove too old executions. ID
     * execution will be excluded from the list.
     *
     * @param id
     * @param propName
     * @param environment
     * @param timeoutInSecond
     * @param country
     * @return
     */
    List<String> getInUseValuesOfProperty(long id, String propName, String environment, String country, Integer timeoutInSecond) throws CerberusException;

    /**
     *
     * @param object
     * @return
     */
    void create(TestCaseExecutionData object) throws CerberusException;

    /**
     *
     * @param object
     * @return
     */
    void delete(TestCaseExecutionData object) throws CerberusException;

    /**
     *
     * @param object
     * @return
     */
    void update(TestCaseExecutionData object) throws CerberusException;

    List<TestCaseExecutionData> readTestCasePropertiesHeritedByDependencies(TestCaseExecution tce)  throws CerberusException ;
}
