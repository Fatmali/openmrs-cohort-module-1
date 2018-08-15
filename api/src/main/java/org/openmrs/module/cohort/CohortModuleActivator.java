/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.cohort;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;

/**
 * This class contains the logic that is run every time this module is either started or stopped.
 */
public class CohortModuleActivator extends BaseModuleActivator {
	
	protected Log log = LogFactory.getLog(getClass());
	
	
	public void willRefreshContext() {
		log.info("Refreshing cohort Module");
	}
	

	public void contextRefreshed() {
		log.info("cohort Module refreshed");
	}

	@Override
	public void willStart() {
		log.info("Starting cohort Module");
	}
	
	@Override
	public void started() {
		log.info("cohort Module started");
	}
	
	@Override
	public void willStop() {
		log.info("Stopping cohort Module");
	}
	
	@Override
	public void stopped() {
		log.info("cohort Module stopped");
	}

	
}