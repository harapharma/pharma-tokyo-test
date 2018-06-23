package jp.co.pds.common.dao.util;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.mapper.MsSeqMapper;
import jp.co.pds.common.enums.SeqNameEnum;

public class MsSeqUtil {

	String seqName;

	public MsSeqUtil(SeqNameEnum seqNameEnum) {
    	this.seqName = seqNameEnum.getCode();
	}

	/**
	 * シーケンスの次値を取得する
	 * @return
	 */
	public int getNextValue() {
		int nextVal = 0;
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	MsSeqMapper seqMapper = session.getMapper(MsSeqMapper.class);
    	nextVal = seqMapper.nextValue(seqName);
    	session.close();
    	return nextVal;
	}

	/**
	 * シーケンスの現在値を取得する
	 * @return
	 */
	public int getCurrValue() {
		int currVal = 0;
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	MsSeqMapper seqMapper = session.getMapper(MsSeqMapper.class);
    	currVal = seqMapper.currValue(seqName);
    	session.close();
    	return currVal;
	}
}
