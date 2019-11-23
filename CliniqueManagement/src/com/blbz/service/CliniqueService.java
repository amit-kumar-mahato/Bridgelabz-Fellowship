package com.blbz.service;

import org.json.simple.JSONArray;

public interface CliniqueService {

	JSONArray doctorDetails();

	void readDoctorData(String key, String value);

	void readPatientData(String key, String value);

}
