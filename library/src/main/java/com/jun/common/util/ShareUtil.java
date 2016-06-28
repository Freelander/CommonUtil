package com.jun.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;

import com.jun.library.R;

import java.util.List;

/**
 * Created by Jun on 2016/4/21.
 *
 * 描述：系统分享工具类
 *
 * @author Jun
 * @version v0.1.3
 */
public class ShareUtil {

    /**
     * 分享
     */
    public static void share(Context context, String content){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.share));
        intent.putExtra(Intent.EXTRA_TEXT, content);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.share)));
    }

    /**
     * 反馈
     */
    public static void feedback(Context context, String email) {
        Uri uri = Uri.parse("mailto:" + email);
        final Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        PackageManager pm = context.getPackageManager();
        List<ResolveInfo> infos = pm.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        if (infos == null || infos.size() <= 0){
            Toast.makeText(context, context.getString(R.string.no_email), Toast.LENGTH_SHORT).show();
            return;
        }
        context.startActivity(intent);
    }

}
