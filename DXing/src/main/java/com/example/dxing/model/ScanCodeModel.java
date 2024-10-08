package com.example.dxing.model;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.FloatRange;
import androidx.fragment.app.Fragment;

import com.example.dxing.ScanCodeConfig;
import com.example.dxing.bean.ScanRect;


/**
 *
 */
public class ScanCodeModel implements Parcelable {

    public Activity mActivity;
    public Fragment mFragment;
    private int style;
    private int scanMode;
    private boolean isPlayAudio;
    private int audioId;
    private boolean showFrame;
    private boolean isLimitRect;
    private ScanRect scanRect;
    private int scanSize;
    private int offsetX;
    private int offsetY;
    private boolean usePx;
    private long scanDuration;
    private int frameColor;
    private boolean showShadow;
    private int shadeColor;
    private int scanBitmapId;
    private int frameWith;
    private int frameLength;
    private int frameRadius;
    private boolean isIdentifyMultiple;
    private int qrCodeHintDrawableResource;
    private int qrCodeHintDrawableWidth;
    private int qrCodeHintDrawableHeight;
    private float qrCodeHintAlpha;
    private boolean isStartCodeHintAnimation;

    public ScanCodeModel(Activity mActivity) {
        this.mActivity = mActivity;
    }

    public ScanCodeModel(Activity mActivity, Fragment mFragment) {
        this.mActivity = mActivity;
        this.mFragment = mFragment;
    }

    protected ScanCodeModel(Parcel in) {
        style = in.readInt();
        scanMode = in.readInt();
        isPlayAudio = in.readByte() != 0;
        audioId = in.readInt();
        showFrame = in.readByte() != 0;
        isLimitRect = in.readByte() != 0;
        scanRect = in.readParcelable(ScanRect.class.getClassLoader());
        scanSize = in.readInt();
        offsetX = in.readInt();
        offsetY = in.readInt();
        usePx = in.readByte() != 0;
        scanDuration = in.readLong();
        frameColor = in.readInt();
        showShadow = in.readByte() != 0;
        shadeColor = in.readInt();
        scanBitmapId = in.readInt();
        frameWith = in.readInt();
        frameLength = in.readInt();
        frameRadius = in.readInt();
        isIdentifyMultiple = in.readByte() != 0;
        qrCodeHintDrawableResource = in.readInt();
        qrCodeHintDrawableWidth = in.readInt();
        qrCodeHintDrawableHeight = in.readInt();
        qrCodeHintAlpha = in.readFloat();
        isStartCodeHintAnimation = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(style);
        dest.writeInt(scanMode);
        dest.writeByte((byte) (isPlayAudio ? 1 : 0));
        dest.writeInt(audioId);
        dest.writeByte((byte) (showFrame ? 1 : 0));
        dest.writeByte((byte) (isLimitRect ? 1 : 0));
        dest.writeParcelable(scanRect, flags);
        dest.writeInt(scanSize);
        dest.writeInt(offsetX);
        dest.writeInt(offsetY);
        dest.writeByte((byte) (usePx ? 1 : 0));
        dest.writeLong(scanDuration);
        dest.writeInt(frameColor);
        dest.writeByte((byte) (showShadow ? 1 : 0));
        dest.writeInt(shadeColor);
        dest.writeInt(scanBitmapId);
        dest.writeInt(frameWith);
        dest.writeInt(frameLength);
        dest.writeInt(frameRadius);
        dest.writeByte((byte) (isIdentifyMultiple ? 1 : 0));
        dest.writeInt(qrCodeHintDrawableResource);
        dest.writeInt(qrCodeHintDrawableWidth);
        dest.writeInt(qrCodeHintDrawableHeight);
        dest.writeFloat(qrCodeHintAlpha);
        dest.writeByte((byte) (isStartCodeHintAnimation ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ScanCodeModel> CREATOR = new Creator<ScanCodeModel>() {
        @Override
        public ScanCodeModel createFromParcel(Parcel in) {
            return new ScanCodeModel(in);
        }

        @Override
        public ScanCodeModel[] newArray(int size) {
            return new ScanCodeModel[size];
        }
    };

    public ScanCodeModel setScanDuration(long scanDuration) {
        this.scanDuration = scanDuration;
        return this;
    }

    public long getScanDuration() {
        return scanDuration;
    }

    public ScanCodeModel setScanMode(int scanMode) {
        this.scanMode = scanMode;
        return this;
    }

    public int getScanMode() {
        return scanMode;
    }

    public int getStyle() {
        return style;
    }

    public ScanCodeModel setStyle(int style) {
        this.style = style;
        return this;
    }

    public boolean isPlayAudio() {
        return isPlayAudio;
    }

    public ScanCodeModel setPlayAudio(boolean playAudio) {
        isPlayAudio = playAudio;
        return this;
    }

    public int getAudioId() {
        return audioId;
    }

    public ScanCodeModel setAudioId(int audioId) {
        this.audioId = audioId;
        return this;
    }

    public boolean isShowFrame() {
        return showFrame;
    }

    public ScanCodeModel setShowFrame(boolean showFrame) {
        this.showFrame = showFrame;
        return this;
    }

    public boolean isLimitRect() {
        return isLimitRect;
    }

    public ScanCodeModel setLimitRect(boolean limitRect) {
        this.isLimitRect = limitRect;
        return this;
    }

    public ScanRect getScanRect() {
        return scanRect;
    }

    @Deprecated
    public ScanCodeModel setScanRect(ScanRect scanRect) {
        this.scanRect = scanRect;
        return this;
    }

    public int getScanSize() {
        return scanSize;
    }

    public ScanCodeModel setScanSize(int scanSize, int offsetX, int offsetY) {
        this.scanSize = scanSize;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        return this;
    }

    public int getOffsetX() {
        return offsetX;
    }

    public ScanCodeModel setOffsetX(int offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public int getOffsetY() {
        return offsetY;
    }

    public ScanCodeModel setOffsetY(int offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public ScanCodeModel setScanRect(ScanRect scanRect, boolean isUsePx) {
        this.scanRect = scanRect;
        this.usePx = isUsePx;
        return this;
    }

    public boolean isUsePx() {
        return usePx;
    }

    public void setUsePx(boolean usePx) {
        this.usePx = usePx;
    }

    public int getFrameColor() {
        return frameColor;
    }

    public ScanCodeModel setFrameColor(int frameColor) {
        this.frameColor = frameColor;
        return this;
    }

    public boolean isShowShadow() {
        return showShadow;
    }

    public ScanCodeModel setShowShadow(boolean showShadow) {
        this.showShadow = showShadow;
        return this;
    }

    public int getShadeColor() {
        return shadeColor;
    }

    public ScanCodeModel setShadeColor(int shadeColor) {
        this.shadeColor = shadeColor;
        return this;
    }

    public int getScanBitmapId() {
        return scanBitmapId;
    }

    public ScanCodeModel setScanBitmapId(int scanBitmapId) {
        this.scanBitmapId = scanBitmapId;
        return this;
    }

    public int getFrameWith() {
        return frameWith;
    }

    public ScanCodeModel setFrameWith(int frameWith) {
        this.frameWith = frameWith;
        return this;
    }

    public int getFrameLength() {
        return frameLength;
    }

    public ScanCodeModel setFrameLength(int frameLength) {
        this.frameLength = frameLength;
        return this;
    }

    public int getFrameRadius() {
        return frameRadius;
    }

    public ScanCodeModel setFrameRadius(int frameRadius) {
        this.frameRadius = frameRadius;
        return this;
    }

    public boolean isIdentifyMultiple() {
        return isIdentifyMultiple;
    }

    public ScanCodeModel setIdentifyMultiple(boolean identifyMultiple) {
        isIdentifyMultiple = identifyMultiple;
        return this;
    }

    public int getQrCodeHintDrawableResource() {
        return qrCodeHintDrawableResource;
    }

    public ScanCodeModel setQrCodeHintDrawableResource(int qrCodeHintDrawableResource) {
        this.qrCodeHintDrawableResource = qrCodeHintDrawableResource;
        return this;
    }

    public int getQrCodeHintDrawableWidth() {
        return qrCodeHintDrawableWidth;
    }

    public ScanCodeModel setQrCodeHintDrawableWidth(int qrCodeHintDrawableWidth) {
        this.qrCodeHintDrawableWidth = qrCodeHintDrawableWidth;
        return this;
    }

    public int getQrCodeHintDrawableHeight() {
        return qrCodeHintDrawableHeight;
    }

    public ScanCodeModel setQrCodeHintDrawableHeight(int qrCodeHintDrawableHeight) {
        this.qrCodeHintDrawableHeight = qrCodeHintDrawableHeight;
        return this;
    }

    public float getQrCodeHintAlpha() {
        return qrCodeHintAlpha;
    }


    public ScanCodeModel setQrCodeHintAlpha(@FloatRange(from = 0.0, to = 1.0) float qrCodeHintAlpha) {
        this.qrCodeHintAlpha = qrCodeHintAlpha;
        return this;
    }

    public boolean isStartCodeHintAnimation() {
        return isStartCodeHintAnimation;
    }

    public ScanCodeModel setStartCodeHintAnimation(boolean startCodeHintAnimation) {
        isStartCodeHintAnimation = startCodeHintAnimation;
        return this;
    }

    public ScanCodeConfig buidler() {
        return new ScanCodeConfig(this);
    }
}
