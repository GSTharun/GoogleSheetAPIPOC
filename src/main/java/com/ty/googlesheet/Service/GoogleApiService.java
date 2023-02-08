package com.ty.googlesheet.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.googlesheet.Dao.GoogleSheetDto;
import com.ty.googlesheet.Dao.GoogleSheetresponseDTO;
import com.ty.googlesheet.Util.GoogleUtil;



@Service
public class GoogleApiService {

	@Autowired
	GoogleUtil googleUtil;
	
	public Map<Object, Object> readDataFromGoogleSheet() throws GeneralSecurityException, IOException  {
			return googleUtil.getDataFromSheet();
		
	}

	public GoogleSheetresponseDTO creategoogleSheet(GoogleSheetDto request) throws GeneralSecurityException, IOException {
		return googleUtil.createGoogleSheet(request);
	}

}
