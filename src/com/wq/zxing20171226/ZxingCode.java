package com.wq.zxing20171226;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * 利用zxingcode生成二维码
 * Created by wuqingvika on 2017/12/26.
 */
public class ZxingCode {
    public static void main(String args[]) throws WriterException, IOException {
       Path file=new File("D:\\shabi\\wqone.png").toPath();
       int width=300;
       int height=300;
       String format="png";
       String content="祝陈振华&崔沙沙新婚快乐，幸福永远！";
        HashMap hints=new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//纠错级别；纠错能力越高可存储越少
        hints.put(EncodeHintType.MARGIN,2);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hints);
        MatrixToImageWriter.writeToPath(bitMatrix,format,file);
    }
}
