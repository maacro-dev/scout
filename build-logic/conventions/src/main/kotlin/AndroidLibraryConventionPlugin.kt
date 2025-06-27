import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.maacro.scout.configureAndroidCompose
import com.maacro.scout.configureKotlinApplication
import com.maacro.scout.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidLibraryConventionPlugin: Plugin<Project> {
      override fun apply(project: Project) {
          with (project) {
              with(pluginManager) {
                  apply("com.android.library")
                  apply("org.jetbrains.kotlin.android")
              }
              extensions.configure<LibraryExtension> {
                  compileSdk = 36
                  defaultConfig.targetSdk = 36
                  configureKotlinApplication(this)
                  resourcePrefix =
                      path.split("""\W""".toRegex()).drop(1).distinct().joinToString(separator = "_")
                          .lowercase() + "_"
              }
          }
      }
}
