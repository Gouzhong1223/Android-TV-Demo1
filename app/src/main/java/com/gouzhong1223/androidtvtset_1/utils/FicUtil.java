package com.gouzhong1223.androidtvtset_1.utils;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2022-03-15 14:41
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.androidtvtset_1.utils
 * @ProjectName : Android TV Tset-1
 * @Version : 1.0.0
 */
/*public class FicUtil {

    private final byte[] mFib = new byte[32];

    *//**
     * decode a complete frame, 32byte fic data
     *//*
    public void decode(byte[] bytes) {
        System.arraycopy(bytes, 0, mFib, 0, 32);
        *//* crc check *//*
        short dataCrc = crc16(mFib, 0, 30);
        short preferenceCrc = (short) ((mFib[30] << 8) | mFib[31] & 0x00ff);
        if (dataCrc != preferenceCrc) { *//* crc check fail frequently *//*
            return;
        }
        *//* if the data is encrypted, get the original data *//*
        if (mIsEncrypted) {
            for (int i = 0; i < 30; i++) {
                mFib[i] = (byte) (mFib[i] ^ DAB_ENCRYPT_CODE[i]);
            }
        }
        *//* find a FIG(fast information group), and decode it according to it's type *//*
        mFigHeader = 0;
        while (mFigHeader < 30 && mFib[mFigHeader] != (byte) 0xFF) { *//* check end mark *//*
            mFigType = (mFib[mFigHeader] >>> 5) & 0x07;
            mFigLength = mFib[mFigHeader] & 0x1f;
            switch (mFigType) {
                case 0: *//* standard fib type 0 *//*
                    fibType0();
                    break;
                case 1: *//* standard fib type 1 *//*
                    decodeLabel();
                    break;
                case 3:*//* custom types, id select check *//*
                    selectSubCh();
                    break;
                case 5:
                    decodeFidcData();
                    break;
                default:
                    break;
            }
            mFigHeader += mFigLength + 1; *//* point to next fig header *//*
        }
    }
}*/
