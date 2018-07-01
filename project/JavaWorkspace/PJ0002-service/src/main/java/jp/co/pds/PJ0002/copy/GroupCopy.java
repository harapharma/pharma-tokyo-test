package jp.co.pds.PJ0002.copy;

import jp.co.pds.PJ0002.dto.GroupDTO;
import jp.co.pds.common.dao.dto.MsGroup;

public class GroupCopy {

	public static void copy(MsGroup src, GroupDTO dst) {
		dst.setGroupId(String.valueOf(src.getGroupId()));
		dst.setGroupName(src.getGroupName());
		dst.setWorkStartTime(src.getWorkStartTime());
		dst.setWorkEndTime(src.getWorkEndTime());
		dst.setWorkTimeTruncUnit(String.valueOf(src.getWorkTimeTruncUnit()));
	}

	public static void copy(GroupDTO src, MsGroup dst) {
		// TODO
	}
}
