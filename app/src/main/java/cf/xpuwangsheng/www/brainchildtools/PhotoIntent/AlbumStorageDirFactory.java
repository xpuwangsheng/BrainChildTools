package cf.xpuwangsheng.www.brainchildtools.PhotoIntent;

import java.io.File;

/**
 * Created by ymwm on 17-1-6.
 */

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
