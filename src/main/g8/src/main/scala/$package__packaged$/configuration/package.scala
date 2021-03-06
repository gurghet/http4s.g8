package $package$

import zio.TaskR

package object configuration extends Configuration.Service[Configuration] {
  override def load: TaskR[Configuration, ServerConfig] = TaskR.accessM(_.configuration.load)
}
