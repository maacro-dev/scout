import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.maacro.scout.configureAndroidCompose
import com.maacro.scout.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeCompilerGradlePluginExtension

class AndroidApplicationComposeConventionPlugin: Plugin<Project> {
      override fun apply(project: Project) {
          with(project) {
              with(pluginManager) {
                  apply("com.android.application")
                  apply("org.jetbrains.kotlin.plugin.compose")
              }

              extensions.configure<ApplicationExtension> {
                  configureAndroidCompose(this)
              }
          }
      }
}


