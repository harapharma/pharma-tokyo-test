// ログアウト
function OnLogoutClick(loginURL) {
	if(window.confirm('Logout?')){
		location.href = loginURL;
	} else {
		// 何もしない
	}
}

// 数値判定
function IsNumber(str) {
	var num = true;
	for (var i = 0; i < str.length; i++) {
		if (parseInt(str.charAt(i)) < 0 || 9 < parseInt(str.charAt(i))) {
			num = false;
		}
	}
	return num;
}

// 時間表示に:を追加
function addColon(str) {
	if (parseInt(str) == 0) {
		return "00:00";
	} else if (parseInt(str) < 10) {
		return "0" + str + ":00";
	} else 	if (parseInt(str) < 33) {
		return str + ":00";
	} else if (str.length == 3) {
		if (parseInt(str.substr(1, 2)) > 59) {
			return "";
		}
		return "0" + str.substr(0, 1) + ":" + str.substr(1, 2);
	} else if (str.length == 4) {
		if (parseInt(str.substr(2, 2)) > 59) {
			return "";
		}
		return str.substr(0, 2) + ":" + str.substr(2, 2);
	} else if (str.length == 5) {
		if (parseInt(str.substr(3, 2)) > 59) {
			return "";
		}
		return str.substr(0, 3) + ":" + str.substr(3, 2);
	}
	return "";
}

//時間表示から:を削除
function removeColon(str) {
	if (str == null || str.length == 0) {
		return "";
	}
	var splited = str.split(":");
	return splited[0] + splited[1];
}

function convHourToMin(str) {
	var hour = 0;
	var min = 0;
	if (str == null || str.length == 0) {
		return 0;
	} else if (str.length == 5) {
		var splited = str.split(":");
		hour = splited[0];
		min = splited[1];
	} else if (str.length == 4) {
		hour = str.substr(0, 2);
		min = str.substr(2, 2);
	} else {
		return 0;
	}
	return parseInt(hour) * 60 + parseInt(min);
}

function convMinToHour(min) {
	var hour = Math.floor(min / 60);
	minute = min % 60;
	var hourStr = "" + hour;
	var minuteStr = "" + minute;
	if (hourStr.length == 1) {hourStr = "0" + hourStr;}
	if (minuteStr.length == 1) {minuteStr = "0" + minuteStr;}
	return hourStr + minuteStr;
}

function timeCutOff(time, cutOff, isTrunc) {
	if (time == null || time.length == 0) {
		return "";
	}
	var t = removeColon(time);
	var hour = parseInt(t.substr(0, 2));
	var minute = parseInt(t.substr(2, 2));
	var total = hour * 60  + minute;
	if (isTrunc) {
		total = Math.floor(total / parseInt(cutOff));
	} else {
		total = Math.ceil(total / parseInt(cutOff));
	}
	total = total * parseInt(cutOff);

	return convMinToHour(total);
}

// 時刻差分を算出する
function calcTimeDiff(fromTime, toTime) {
	var startMin = parseInt(fromTime.substr(0, 2)) * 60 + parseInt(fromTime.substr(2, 2));
	var endMin = parseInt(toTime.substr(0, 2)) * 60 + parseInt(toTime.substr(2, 2));
	return endMin - startMin;
}

// 休憩時間を除いた時刻差分を算出する
function calcTimeDiffWithoutRest(fromTime, toTime, restTimeList) {
	if (fromTime.length < 4 || toTime.length < 4) {
		return 0;
	}
	var splitedRest = restTimeList.split(",");
	splitedRest.push(9999);
	var isRest = false;
	var posRest = 0;

	var diff = 0;
	var startMin = parseInt(fromTime.substr(0, 2)) * 60 + parseInt(fromTime.substr(2, 2));
	var endMin = parseInt(toTime.substr(0, 2)) * 60 + parseInt(toTime.substr(2, 2));

	// 開始時刻と休憩時間との関係
	for (posRest = 0; posRest < splitedRest.length; posRest++) {
		if (startMin < splitedRest[posRest]) {
			if (posRest % 2 == 1) {isRest = true;}
			break;
		}
	}
	
	for (var i = startMin; i < endMin; i++) {
		if (splitedRest[posRest] <= i) {
			isRest = ! isRest;
			posRest++;
		}
		if (! isRest) {
			diff++;
		}
	}

	return diff;
}

function getJQueryName(str) {
	var retVal = str; //"$%&'*+/;<=>?@\^`|~
	retVal = retVal.replace('\[','\\\[');
	retVal = retVal.replace('\]','\\\]');
	retVal = retVal.replace('\(','\\\(');
	retVal = retVal.replace('\)','\\\)');
	retVal = retVal.replace('\.','\\\.');
	retVal = retVal.replace('\,','\\\,');
	retVal = retVal.replace('\{','\\\{');
	retVal = retVal.replace('\}','\\\}');
	retVal = retVal.replace('\:','\\\:');
	return retVal;
}