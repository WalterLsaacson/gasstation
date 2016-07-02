package com.gasstation.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Const {
	/** TODO 正式发布之前改为false */
	public static final boolean debug = true;

	public static boolean firstLoadYear = true;
	public static boolean firstLoadMonth = true;

	/** 登录接口 */
	public static final String serverurl = "http://139.129.19.236/xauto/app_interface/index.php";

	public static final String apiRouteLogin = "station/station/login";
	public static final String apiRouteJournal = "station/station/search_station_journal";
	public static final String apiRouteRecharge = "station/station/stationRecharge";
	public static final String apiRouteRechargeInfo = "station/station/RechargeInfo";
	public static final String apiRouteMonthInfo = "station/station/journal_monthInfo";
	public static final String apiRouteUpdate = "station/station/station_journal_update";

	public static final void showToast(final Context context,
			final String contents) {

		Toast.makeText(context, contents, Toast.LENGTH_SHORT).show();
	}

	public static void log(String TAG, String message) {
		if (debug) {
			Log.e(TAG, message);
		}
	}

	// 获取系统时间
	public static String Date() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd ");
		Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
		String date = formatter.format(curDate);
		return date;

	}

}
