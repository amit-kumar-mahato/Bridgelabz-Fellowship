package com.blbz.service;

import org.json.simple.JSONArray;

public interface CliniqueService {

	void doctorDetails();

	void readDoctorData(String key, String value, String choice);

	void readPatientData(String key, String value);

}
