package jp.co.pds.PJ0002.dao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.PJ0002.dao.PJ0002DbSession;
import jp.co.pds.PJ0002.dao.dto.MsAccountTitle;
import jp.co.pds.PJ0002.dao.dto.MsCompanyAccountTitle;
import jp.co.pds.PJ0002.dao.dto.MsCompanyAccountTitleExample;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTime;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTimeExample;
import jp.co.pds.PJ0002.dao.dto.MsRestTime;
import jp.co.pds.PJ0002.dao.mapper.MsAccountTitleMapper;
import jp.co.pds.PJ0002.dao.mapper.MsCompanyAccountTitleMapper;
import jp.co.pds.PJ0002.dao.mapper.MsGroupRestTimeMapper;
import jp.co.pds.PJ0002.dao.mapper.MsRestTimeMapper;
import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsCompany;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.mapper.MsCompanyMapper;
import jp.co.pds.common.dao.mapper.MsGroupMapper;

public class MsCompanyUtil {

	MsCompany msCompany;

	List<MsAccountTitle> msAccountTitles = new ArrayList<MsAccountTitle>();

	public MsCompanyUtil(String companyCd) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	MsCompanyMapper msCompanyMapper = session.getMapper(MsCompanyMapper.class);
    	this.msCompany = msCompanyMapper.selectByPrimaryKey(companyCd);
    	session.close();
	}

	public MsCompanyUtil(MsCompany msCompany) {
		this.msCompany = msCompany;
	}

	/**
	 * 会社マスタを取得する
	 * @return
	 */
	public MsCompany getMsCompany() {
		return msCompany;
	}

	/**
	 * 関連している勘定科目マスタを取得する
	 * @return
	 */
	public List<MsAccountTitle> getMsAccountTitles() {
		if (msAccountTitles != null && ! msAccountTitles.isEmpty()) {
			return msAccountTitles;
		}

		PJ0002DbSession pj0002DbSession = new PJ0002DbSession();
    	SqlSession session = pj0002DbSession.open();

    	// 会社－勘定科目マスタ
    	MsCompanyAccountTitleMapper msCompanyAccountTitleMapper = session.getMapper(MsCompanyAccountTitleMapper.class);
    	MsCompanyAccountTitleExample msCompanyAccountTitleExample = new MsCompanyAccountTitleExample();
    	msCompanyAccountTitleExample.createCriteria().andCompanyCdEqualTo(msCompany.getCompanyCd());
    	List<MsCompanyAccountTitle> msCompanyAccountTitles = msCompanyAccountTitleMapper.selectByExample(msCompanyAccountTitleExample);

    	// 勘定科目マスタ
    	MsAccountTitleMapper msAccountTitleMapper = session.getMapper(MsAccountTitleMapper.class);
    	for (MsCompanyAccountTitle msCompanyAccountTitle : msCompanyAccountTitles) {
    		MsAccountTitle msAccountTitle = msAccountTitleMapper.selectByPrimaryKey(msCompanyAccountTitle.getAccountTitleId());
    		msAccountTitles.add(msAccountTitle);
    	}
    	
    	pj0002DbSession.close();

    	// ソート
    	Collections.sort(msAccountTitles,
    					new Comparator<MsAccountTitle>() {
    						public int compare(MsAccountTitle obj1, MsAccountTitle obj2) {
    							return obj1.getAccountTitleCd().compareTo(obj2.getAccountTitleCd());
    						}
        				}
    	);

    	return msAccountTitles;
	}
}
