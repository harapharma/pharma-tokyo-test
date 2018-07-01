package jp.co.pds.PJ0002.copy;

import jp.co.pds.PJ0002.dto.TransExpDTO;
import jp.co.pds.common.util.StringUtil;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;

public class TransExpCopy {

	public static void copy(DtTransportExpense src, TransExpDTO dst) {
		dst.setCompanyCd(src.getCompanyCd());
		dst.setUserId(src.getUserId());
		dst.setCalendarYy(String.valueOf(src.getCalendarYy()));
		dst.setCalendarMm(String.valueOf(src.getCalendarMm()));
		dst.setCalendarDd(String.valueOf(src.getCalendarDd()));
		dst.setExpenseAmount(StringUtil.addComma(String.valueOf(src.getExpenseAmount())));
		dst.setTemporaryMoney(StringUtil.addComma(String.valueOf(src.getTemporaryMoney())));
		dst.setDestination(src.getDestination());
		dst.setBusiness(src.getBusiness());
		dst.setTransportFacility(src.getTransportFacility());
		dst.setDeparture(src.getDeparture());
		dst.setArrival(src.getArrival());
		dst.setOneRoundCd(src.getOneRoundCd());
	}

	public static void copy(TransExpDTO src, DtTransportExpense dst) {
		dst.setCompanyCd(src.getCompanyCd());
		dst.setUserId(src.getUserId());
		dst.setCalendarYy(Integer.valueOf(src.getCalendarYy()));
		dst.setCalendarMm(Integer.valueOf(src.getCalendarMm()));
		dst.setCalendarDd(Integer.valueOf(src.getCalendarDd()));
		if (src.getExpenseAmount() == null) {
			dst.setExpenseAmount(0);
		} else {
			dst.setExpenseAmount(Integer.valueOf(StringUtil.delComma(src.getExpenseAmount())));
		}
		if (src.getTemporaryMoney() == null) {
			dst.setTemporaryMoney(0);
		} else {
			dst.setTemporaryMoney(Integer.valueOf(StringUtil.delComma(src.getTemporaryMoney())));
		}
		dst.setDestination(src.getDestination());
		dst.setBusiness(src.getBusiness());
		dst.setTransportFacility(src.getTransportFacility());
		dst.setDeparture(src.getDeparture());
		dst.setArrival(src.getArrival());
		dst.setOneRoundCd(src.getOneRoundCd());
	}
}
