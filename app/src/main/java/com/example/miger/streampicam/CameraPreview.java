//package com.example.miger.streampicam;
//
///**
// * Created by chipu on 11/04/19.
// */
//
//import android.content.Context;
//import android.hardware.Camera;
//import android.nfc.Tag;
//import android.util.Log;
//import android.view.SurfaceHolder;
//import android.view.SurfaceView;
//import java.io.IOException;
//import static android.content.ContentValues.TAG;
//
//
//public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
//    private SurfaceHolder mHolder;
//    private Camera mCamera;
//
//    public CameraPreview(Context context, Camera camera) {
//        super(context);
//        mCamera = camera;
//
//
//        mHolder = getHolder();
//        mHolder.addCallback(this);
//
//        mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
//    }
//
//    public void surfaceCreated(SurfaceHolder holder) {
//
//        try {
//            mCamera.setPreviewDisplay(holder);
//            mCamera.startPreview();
//        } catch (IOException e) {
//            Log.d(TAG, "Error setting camera preview: " + e.getMessage());
//        }
//    }
//
//    public void surfaceDestroyed(SurfaceHolder holder) {
//
//    }
//
//    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
//
//
//        if (mHolder.getSurface() == null){
//
//            return;
//        }
//
//
//        try {
//            mCamera.stopPreview();
//        } catch (Exception e){
//
//        }
//
//
//        try {
//            mCamera.setPreviewDisplay(mHolder);
//            mCamera.startPreview();
//
//        } catch (Exception e){
//            Log.d(TAG, "Error starting camera preview: " + e.getMessage());
//        }
//    }
//
//    public static Camera getCameraInstance(){
//        Camera c = null;
//        try {
//            c = Camera.open();
//        }
//        catch (Exception e){
//
//        }
//        return c;
//    }
//}
//
