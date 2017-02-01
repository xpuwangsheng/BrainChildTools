package cf.xpuwangsheng.www.brainchildtools.PhotoIntent;

import android.os.Environment;

import java.io.File;

/**
 * Created by ymwm on 17-1-6.
 */

public final class FroyoAlbumDirFactory extends AlbumStorageDirFactory {
    @Override
    public File getAlbumStorageDir(String albumName) {
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
                ),
                albumName
        );
    }
}
