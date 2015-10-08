package by.sideproject.videocaster.services.storage.base.dao

import by.sideproject.videocaster.model.auth.Profile

trait ProfileDAO extends BaseDAO[Profile, Int]{
  def findByDropboxId(dropboxId: String) : Option[Profile]
}
