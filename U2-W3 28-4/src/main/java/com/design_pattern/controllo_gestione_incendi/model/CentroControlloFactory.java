package com.design_pattern.controllo_gestione_incendi.model;

import com.design_pattern.controllo_gestione_incendi.gestione_http.CentroControlloHttp;
import com.design_pattern.controllo_gestione_incendi.gestione_http.CentroControlloInterface;

public class CentroControlloFactory {

	private static int selectCentroControllo = 0;

	public static CentroControlloInterface createCentroControllo() {

		switch (selectCentroControllo) {
		case 0:
			return new CentroControlloHttp();
		default:
			throw new RuntimeException("impossibile evocare centro di controllo!");
		}
		
	}

	public static int getSelectCentroControllo() {
		return selectCentroControllo;
	}

	public static void setSelectCentroControllo(int select) {
		selectCentroControllo = select;
	}
	
}
