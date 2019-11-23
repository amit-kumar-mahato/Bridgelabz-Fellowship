package com.blbz.serviceimpl;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.controller.ClinicController;
import com.blbz.model.DoctorDetails;
import com.blbz.model.PatientDetails;
import com.blbz.repository.CliniqueRepository;
import com.blbz.service.CliniqueService;
import com.blbz.util.Utility;

public class CliniqueServiceImpl implements CliniqueService {
	JSONArray jsonArray = new JSONArray();
	JSONObject jsonObject = new JSONObject();

	static String doctor = "JsonFile/doctor.json";
	static String patient = "JsonFile/patient.json";

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray doctorDetails() {

		jsonArray = CliniqueRepository.readData(doctor);

		DoctorDetails doctorDetails = new DoctorDetails();
		System.out.println("Enter Doctor Name");
		String doctorName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(doctorName)) {
			doctorDetails.setDoctorName(doctorName);
		}

		System.out.println("Enter Doctor Specialization");
		String specialization = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(specialization)) {
			doctorDetails.setSpecialization(specialization);
		}

		System.out.println("Enter Doctor Availability");
		String availability = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(availability)) {
			doctorDetails.setAvailability(availability);
		}

		doctorDetails.setDoctorId(Utility.doctorId());
		doctorDetails.setNumberOfPatients(0);

		jsonObject.put("Id", doctorDetails.getDoctorId());
		jsonObject.put("Name", doctorDetails.getDoctorName());
		jsonObject.put("Specialization", doctorDetails.getSpecialization());
		jsonObject.put("Availability", doctorDetails.getAvailability());
		jsonObject.put("Patients", doctorDetails.getNumberOfPatients());

		jsonArray.add(jsonObject);

		System.out.println(jsonArray);
		CliniqueRepository.writeData(doctor, jsonArray);
		return jsonArray;

	}


	/** Reads doctor's data from json file **/
	@Override
	public void readDoctorData(String key, String value) {

		// adds json data to json array
		JSONArray jsonArray = CliniqueRepository.readData(doctor);
		// iterator to iterate json data
		Iterator iterator = jsonArray.iterator();
		// json objects top store json data from array
		JSONObject jsonObject, lastJasonObject = null;

		// iterates over json array
		while (iterator.hasNext()) {
			// checks if data given by user matches with any json object
			// and if present prints it
			if ((jsonObject = (JSONObject) iterator.next()).get(key).equals(value)) {
				lastJasonObject = jsonObject;
				System.out.println("\nDoctor Information:");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Specialization: " + jsonObject.get("Specialization") + "\t");
				System.out.println("Availability: " + jsonObject.get("Availability") + "\t");
				System.out.println("Number of Patients: " + jsonObject.get("Patients") + "\n");
			}
		}

		// asks user if want to take an appointment
		System.out.println("Do you want to take an appointment?[y/n]");
		String response = Utility.inputString().toLowerCase();
		if (response.equals("y")) {
			makeAppointment(lastJasonObject);
		}
	}

	private void makeAppointment(JSONObject doctorJsonObject) {
		long patients = (long) doctorJsonObject.get("Patients");
		//long patients = Long.parseLong(numberOfPatients);
		if (patients == 5) { // doctor is busy
			System.out.println("Sorry!!! Doctor is busy today. Make an appointment tomorrow.");
		} else { // doctor is not busy. Increases number of patients and updates json file
			String id = Utility.patientId(); // generates random id
			// updatePatientData(id); // updates patient json file
			patientDetailsNew(id);
			//numberOfPatients = String.valueOf((patients + 1));
			doctorJsonObject.put("Patients", patients+1);
			updateDoctorData(doctorJsonObject);
			System.out.println("Congratulation You got an appointment. Your Patient ID is " + id + "\n");
			ClinicController.menu();
		}

	}

	private void updateDoctorData(JSONObject doctorJsonObject) {

		jsonArray = CliniqueRepository.readData(doctor);

		JSONArray updatedArray = new JSONArray(); // new array with updated elements
		Iterator iterator = jsonArray.iterator();

		// iterates over array
		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();
			if (object.get("Id").equals(doctorJsonObject.get("Id"))) {
				updatedArray.add(doctorJsonObject);
			} else {
				updatedArray.add(object);
			}
		}

		CliniqueRepository.writeData(doctor, updatedArray);

	}

	@SuppressWarnings("unchecked")
	public void patientDetailsNew(String id) {

		jsonArray = CliniqueRepository.readData(patient);

		PatientDetails patientDetails = new PatientDetails();
		System.out.println("Enter Patient Name");
		String patientName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(patientName)) {
			patientDetails.setPatientName(patientName);
		}

		System.out.println("Enter Mobile Number");
		String mobile = Utility.inputString();
		if (Utility.mobileNumberValidator(mobile)) {
			System.out.println("Mobile :" + mobile);
			patientDetails.setMobile(Long.parseLong(mobile));
		}

		System.out.println("Enter Age");
		int age = Utility.inputinteger();
		patientDetails.setAge(age);

		patientDetails.setId(Utility.patientId());

		jsonObject.put("Id", patientDetails.getId());
		jsonObject.put("Name", patientDetails.getPatientName());
		jsonObject.put("Mobile", patientDetails.getMobile());
		jsonObject.put("Age", patientDetails.getAge());

		jsonArray.add(jsonObject);
		System.out.println(jsonArray);
		CliniqueRepository.writeData(patient, jsonArray);
	}

	@Override
	public void readPatientData(String key, String value) {
		jsonArray = CliniqueRepository.readData(patient);
		Iterator iterator = jsonArray.iterator();
		JSONObject jsonObject;
		while (iterator.hasNext()) {
			if ((jsonObject = (JSONObject) iterator.next()).containsValue(value)) {
				System.out.println("\nPatient Information:");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Mobile Number: " + jsonObject.get("Mobile") + "\t");
				System.out.println("Age: " + jsonObject.get("Age") + "\n");
			}
		}
	}

}
