package com.ty.googlesheet.Controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.googlesheet.Dao.GoogleSheetDto;
import com.ty.googlesheet.Dao.GoogleSheetresponseDTO;
import com.ty.googlesheet.Service.GoogleApiService;


@RestController
public class Controller {

	@Autowired
	GoogleApiService apiService;

	@GetMapping("/getdata")
	public Map<Object, Object> dataFromSheet() throws GeneralSecurityException, IOException {
		return apiService.readDataFromGoogleSheet();
	}

	@PostMapping("/createsheet")
	public GoogleSheetresponseDTO createGoogleSheet(@RequestBody GoogleSheetDto dto)
			throws GeneralSecurityException, IOException {
		return apiService.creategoogleSheet(dto);
	}
}
