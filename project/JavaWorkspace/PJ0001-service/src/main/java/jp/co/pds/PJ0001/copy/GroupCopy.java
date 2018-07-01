package jp.co.pds.PJ0001.copy;

import jp.co.pds.PJ0001.dto.GroupDTO;
import jp.co.pds.common.dao.dto.MsGroup;

public class GroupCopy {

	public static void copy(MsGroup src, GroupDTO dst) {
		dst.setGroupId(String.valueOf(src.getGroupId()));
		dst.setGroupName(src.getGroupName());
	}

	public static void copy(GroupDTO src, MsGroup dst) {
		// TODO
	}
}
