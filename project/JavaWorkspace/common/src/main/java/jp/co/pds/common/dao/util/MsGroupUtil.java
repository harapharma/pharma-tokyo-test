package jp.co.pds.common.dao.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.co.pds.common.dao.CommonDbSession;
import jp.co.pds.common.dao.dto.MsCompany;
import jp.co.pds.common.dao.dto.MsCompanyGroup;
import jp.co.pds.common.dao.dto.MsCompanyGroupExample;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.mapper.MsCompanyGroupMapper;
import jp.co.pds.common.dao.mapper.MsCompanyMapper;
import jp.co.pds.common.dao.mapper.MsGroupMapper;

public class MsGroupUtil {
	MsGroup msGroup;

	public MsGroupUtil(Integer groupId) {
		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();
    	// MS_GROUP
		try {
			MsGroupMapper msGroupMapper = session.getMapper(MsGroupMapper.class);
			msGroup = msGroupMapper.selectByPrimaryKey(groupId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}
	}

	public MsGroupUtil(MsGroup msGroup) {
		this.msGroup = msGroup;
	}
	
	/**
	 * 関連している会社マスタを取得する
	 * @return
	 */
	public MsCompany getMsCompany() {
		MsCompany msCompany = null;
		if (this.msGroup == null) {
			return msCompany;
		}

		CommonDbSession commonDbSession = new CommonDbSession();
    	SqlSession session = commonDbSession.open();

		try {
	    	// MS_COMPANY_GROUP
			MsCompanyGroupMapper msCompanyGroupMapper = session.getMapper(MsCompanyGroupMapper.class);
			MsCompanyGroupExample msCompanyGroupExample = new MsCompanyGroupExample();
			msCompanyGroupExample.createCriteria().andGroupIdEqualTo(this.msGroup.getGroupId());
			List<MsCompanyGroup> msCompanyGroups = msCompanyGroupMapper.selectByExample(msCompanyGroupExample);

			// MS_COMPANY
			for (MsCompanyGroup msCompanyGroup : msCompanyGroups) {
				MsCompanyMapper msCompanyMapper = session.getMapper(MsCompanyMapper.class);
				msCompany = msCompanyMapper.selectByPrimaryKey(msCompanyGroup.getCompanyCd());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
			commonDbSession.close();
		}
		return msCompany;
	}
}
