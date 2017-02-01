package cf.xpuwangsheng.www.brainchildtools.PhotoIntent;

import android.os.Environment;

import java.io.File;

/**
 * Created by ymwm on 17-1-6.
 */

public final class BaseAlbumDirFactory extends AlbumStorageDirFactory {

    // Standard storage location for digital camera files
    private static final String CAMERA_DIR = "/dcim/";

    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File(
                Environment.getExternalStorageDirectory()
                + CAMERA_DIR
                + albumName
        );
    }
}
