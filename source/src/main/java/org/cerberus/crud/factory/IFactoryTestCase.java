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
package org.cerberus.crud.factory;

import java.sql.Timestamp;
import java.util.List;

import org.cerberus.crud.entity.TestCase;
import org.cerberus.crud.entity.TestCaseCountry;
import org.cerberus.crud.entity.TestCaseCountryProperties;
import org.cerberus.crud.entity.TestCaseStep;
import org.cerberus.crud.entity.TestCaseStepBatch;
import org.json.JSONArray;

/**
 * @author bcivel
 */
public interface IFactoryTestCase {

    /**
     *
     * @param test
     * @param testCase
     * @param origine
     * @param refOrigine
     * @param usrCreated
     * @param implementer
     * @param executor
     * @param usrModif
     * @param function
     * @param application
     * @param activeQA
     * @param activeUAT
     * @param activePROD
     * @param priority
     * @param type
     * @param status
     * @param description
     * @param detailedDescription
     * @param howTo
     * @param tcActive
     * @param conditionOperator
     * @param conditionVal1
     * @param conditionVal2
     * @param conditionVal3
     * @param fromMajor
     * @param fromMinor
     * @param toMajor
     * @param toMinor
     * @param lastExecutionStatus
     * @param bugID
     * @param targetMajor
     * @param targetMinor
     * @param comment
     * @param userAgent
     * @param screenSize
     * @param testCaseCountry
     * @param testCaseCountryProperties
     * @param testCaseStep
     * @param testCaseStepBatch
     * @return
     */
    TestCase create(String test, String testCase, String origine, String refOrigine, String usrCreated,
            String implementer, String executor, String usrModif, String function, String application,
            String activeQA, String activeUAT, String activePROD, int priority, String type, String status,
            String description, String detailedDescription, String howTo, String tcActive, String conditionOperator, String conditionVal1, String conditionVal2, String conditionVal3, String fromMajor,
            String fromMinor, String toMajor, String toMinor, String lastExecutionStatus, JSONArray bugID,
            String targetMajor, String targetMinor, String comment, String userAgent, String screenSize, List<TestCaseCountry> testCaseCountry,
            List<TestCaseCountryProperties> testCaseCountryProperties, List<TestCaseStep> testCaseStep,
            List<TestCaseStepBatch> testCaseStepBatch);

    /**
     *
     * @param test
     * @param testCase
     * @param origine
     * @param refOrigine
     * @param usrCreated
     * @param implementer
     * @param executor
     * @param usrModif
     * @param function
     * @param application
     * @param activeQA
     * @param activeUAT
     * @param activePROD
     * @param priority
     * @param type
     * @param status
     * @param description
     * @param detailedDescription
     * @param howTo
     * @param tcActive
     * @param conditionOperator
     * @param conditionVal1
     * @param conditionVal2
     * @param conditionVal3
     * @param fromMajor
     * @param fromMinor
     * @param toMajor
     * @param toMinor
     * @param lastExecutionStatus
     * @param bigID
     * @param targetMajor
     * @param targetMinor
     * @param comment
     * @param dateCreated
     * @param userAgent
     * @param screenSize
     * @param dateModif
     * @param version
     * @return
     */
    TestCase create(String test, String testCase, String origine, String refOrigine, String usrCreated,
            String implementer, String executor, String usrModif, String function, String application,
            String activeQA, String activeUAT, String activePROD, int priority, String type, String status,
            String description, String detailedDescription, String howTo, String tcActive, String conditionOperator, String conditionVal1, String conditionVal2, String conditionVal3, String fromMajor,
            String fromMinor, String toMajor, String toMinor, String lastExecutionStatus, JSONArray bigID,
            String targetMajor, String targetMinor, String comment, String dateCreated, String userAgent, String screenSize, Timestamp dateModif, int version);

    /**
     *
     * @param test
     * @param testCase
     * @return
     */
    TestCase create(String test, String testCase);

    /**
     *
     * @param test
     * @param testCase
     * @param description
     * @return
     */
    TestCase create(String test, String testCase, String description);

}
