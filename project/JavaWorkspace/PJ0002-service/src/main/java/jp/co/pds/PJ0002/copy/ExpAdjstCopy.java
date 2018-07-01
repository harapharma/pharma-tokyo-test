package jp.co.pds.PJ0002.copy;

import jp.co.pds.PJ0002.dto.ExpAdjstDTO;
import jp.co.pds.PJ0002.dto.TransExpDTO;
import jp.co.pds.PJ0002.dao.dto.DtExpenseAdjstmnt;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;

public class ExpAdjstCopy {

	public static void copy(DtExpenseAdjstmnt src, ExpAdjstDTO dst) {
		dst.setCompanyCd(src.getCompanyCd());
		dst.setUserId(src.getUserId());
		dst.setAccountTitleId(String.valueOf(src.getAccountTitleId()));
		dst.setCalendarYy(String.valueOf(src.getCalendarYy()));
		dst.setCalendarMm(String.valueOf(src.getCalendarMm()));
		dst.setCalendarDd(String.valueOf(src.getCalendarDd()));
		dst.setExpenseAmount(String.valueOf(src.getExpenseAmount()));
		dst.setTemporaryMoney(String.valueOf(src.getTemporaryMoney()));
		dst.setRemark(src.getRemark());
	}

	public static void copy(ExpAdjstDTO src, DtExpenseAdjstmnt dst) {
		dst.setCompanyCd(src.getCompanyCd());
		dst.setUserId(src.getUserId());
		dst.setAccountTitleId(Integer.valueOf(src.getAccountTitleId()));
		dst.setCalendarYy(Integer.valueOf(src.getCalendarYy()));
		dst.setCalendarMm(Integer.valueOf(src.getCalendarMm()));
		dst.setCalendarDd(Integer.valueOf(src.getCalendarDd()));
		dst.setExpenseAmount(Integer.valueOf(src.getExpenseAmount()));
		dst.setTemporaryMoney(Integer.valueOf(src.getTemporaryMoney()));
		dst.setRemark(src.getRemark());
	}
}
