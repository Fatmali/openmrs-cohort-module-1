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
package org.openmrs.module.cohort.api;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.Form;
import org.openmrs.Location;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.Person;
import org.openmrs.PersonName;
import org.openmrs.User;
import org.openmrs.api.OpenmrsService;
import org.openmrs.api.context.Context;
import org.openmrs.module.cohort.CohortAttribute;
import org.openmrs.module.cohort.CohortAttributeType;
import org.openmrs.module.cohort.CohortEncounter;
import org.openmrs.module.cohort.CohortM;
import org.openmrs.module.cohort.CohortMember;
import org.openmrs.module.cohort.CohortMemberAttribute;
import org.openmrs.module.cohort.CohortMemberAttributeType;
import org.openmrs.module.cohort.CohortObs;
import org.openmrs.module.cohort.CohortProgram;
import org.openmrs.module.cohort.CohortRole;
import org.openmrs.module.cohort.CohortType;
import org.openmrs.module.cohort.CohortVisit;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean which is configured in moduleApplicationContext.xml.
 *
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(cohortService.class).someMethod();
 * </code>
 *
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface CohortService extends OpenmrsService {
	
	/*
	 * Add service methods here
	 * 
	 */
	public CohortM saveCohort(CohortM cohort);
	
	public List<CohortEncounter> findCohortEncounter(String cohort, String location);
	
	public List<CohortMember> findCohortMember(String name);
	
	public List<CohortMember> getCohortMember(Integer id);
	
	public CohortObs voidObs(CohortObs obs, String reason);
	
	public Long getCount(String name);
	
	public CohortEncounter voidEncounter(CohortEncounter encounter, String reason);
	
	public CohortRole saveCohortRole(CohortRole cohort);
	
	public List<CohortRole> findRoles(String name);
	
	public List<CohortRole> findCohortRoles(String name);
	
	public CohortObs saveCohortObs(CohortObs cobs);
	
	public void purgeCohortObs(CohortObs cobs);
	
	public List<CohortObs> findCohortObs();
	
	public List<CohortObs> findCohortObs(Integer id);
	
	public CohortObs getCohortObsUuid(String uuid);
	
	public CohortProgram saveCohortProgram(CohortProgram cohort);
	
	public void purgeCohortProgram(CohortProgram cvisit);
	
	public void purgeCohortRole(CohortRole crole);
	
	public List<CohortProgram> findCohortProg();
	
	public CohortVisit saveCohortVisit(CohortVisit cvisit);
	
	public void purgeCohortVisit(CohortVisit cvisit);
	
	public List<CohortVisit> findCohortVisit();
	
	public List<CohortProgram> findCohortProgram(String name);
	
	public CohortMemberAttribute saveCohortMemberAttribute(CohortMemberAttribute att);
	
	public List<CohortMemberAttributeType> findCohortMemberAttributes(String attribute_type_name);
	
	public CohortMemberAttributeType saveCohortMemberAttributeType(CohortMemberAttributeType at);
	
	public List<CohortMemberAttributeType> findCohortMemberAttributeType();
	
	public List<CohortMemberAttributeType> findCohortMemberAttributeType(String name);
	
	public void purgeCohortMemberAttribute(CohortMemberAttribute att);
	
	public void purgeCohortMemberAttributeType(CohortMemberAttributeType at);
	
	public CohortAttribute saveCohortAttributes(CohortAttribute att);
	
	public List<CohortAttribute> findCohortAtt(String name);
	
	public CohortMember saveCPatient(CohortMember cohort);
	
	public CohortAttributeType saveCohort(CohortAttributeType a);
	
	public CohortType saveCohort(CohortType cohort);
	
	public CohortType getCohortType(Integer id);
	
	public CohortEncounter getCohortEncounter(Integer id);
	
	public void purgeCohortType(CohortType type);
	
	public void purgeCohortAttributes(CohortAttributeType attributes);
	
	public void purgeCohortAtt(CohortAttribute att);
	
	public void purgeCohortEncounters(CohortEncounter cencounters);
	
	public List<CohortM> findCohorts();
	
	public List<CohortM> findCohorts(String cohort_name);
	
	public List<CohortType> getAllCohortTypes();
	
	public List<CohortType> findCohortType();
	
	public List<CohortType> findCohortType(String cohort_name);
	
	public List<CohortRole> findCohortRole(String cohort_name);
	
	public List<CohortAttributeType> findCohortAttributes();
	
	public List<CohortAttributeType> findCohortAttributes(String attribute_type_name);
	
	public List<CohortMemberAttribute> findCohortMemberAttribute(String name);
	
	public List<CohortEncounter> findCohortEncounters();
	
	public void purgeCohort(CohortM cohort);
	
	public List<CohortM> getCohort(Integer id);
	
	public CohortM getCohortId(Integer id);
	
	public CohortEncounter saveCohortEncounters(CohortEncounter cencounters);
	
	public CohortM getCohortUuid(String uuid);
	
	public CohortAttributeType getCohortAttributeTypeUuid(String uuid);
	
	public CohortMemberAttributeType getCohortMemberAttributeType(String uuid);
	
	
	public CohortVisit getCohortVisitUuid(String uuid);
	
	public CohortRole getCohortRoleUuid(String uuid);
	
	public CohortAttribute getCohortAttributeUuid(String uuid);
	
	public CohortEncounter getCohortEncUuid(String uuid);
	
	public CohortMember getCohortMemUuid(String uuid);
	
	public CohortType getCohortTypeUuid(String uuid);
	
	public CohortMemberAttribute getCohortMemberAttributeUuid(String uuid);
	
	public CohortProgram getCohortProgramUuid(String uuid);
	
	public List<CohortEncounter> findCohortEncounters(String name);
	
	public List<CohortVisit> findCohortVisit(String name);
	
	public List<CohortM> findCohort(Integer id);
	
	public List<CohortType> findCohortType(Integer id);
	
	public List<CohortAttribute> findCohortAtt(Integer id);
	
	public List<CohortAttributeType> findCohortAttType(Integer id);
	
	public List<CohortMemberAttributeType> findCohortMemAttType(Integer id);
	
	public List<CohortMemberAttribute> findCohortMemAtt(Integer id);
	
	public List<CohortEncounter> findCohortEnc(Integer id);
	
	public List<CohortVisit> findCohortVisit(Integer id);
	
	public List<CohortProgram> findCohortProgram(Integer id);
	
	public List<CohortRole> findCohortRole(Integer id);
	
	public List<CohortMember> findCohortMember();
	
	public List<CohortEncounter> getEncountersByCohort(String query, boolean includeVoided);
	
	public List<CohortEncounter> filterEncountersByViewPermissions(List<CohortEncounter> encounters, User user);
	
	public List<CohortEncounter> getEncounters(CohortM who, Location loc, Date fromDate, Date toDate,
			Collection<Form> enteredViaForms, Collection<EncounterType> encounterTypes, boolean includeVoided);
	
	public List<CohortEncounter> getEncounters(CohortM who, Location loc, Date fromDate, Date toDate,
			Collection<Form> enteredViaForms, Collection<EncounterType> encounterTypes, Collection<User> providers,
			boolean includeVoided);
	
	public List<CohortEncounter> getEncountersByCohort(CohortM cohort);
	
	public List<CohortObs> getObservationsByCohortAndConcept(CohortM who, Concept question);
	
	public List<CohortObs> getObservations(List<CohortM> whom, List<CohortEncounter> encounters, List<Concept> questions,
			List<Concept> answers, List<Location> locations, List<String> sort,
			Integer mostRecentN, Integer obsGroupId, Date fromDate, Date toDate, boolean includeVoidedObs);
	
	public List<CohortMember> findCohortMembersByCohortId (Integer cohortId);
}