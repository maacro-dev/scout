import com.android.build.api.dsl.ApplicationExtension
import com.maacro.scout.configureKotlinApplication
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with (project) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<ApplicationExtension> {
                compileSdk = 36
                defaultConfig.targetSdk = 36
                configureKotlinApplication(this)
            }
        }
    }
}
