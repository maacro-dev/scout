import com.maacro.scout.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {

        pluginManager.apply("com.google.devtools.ksp")

        val hiltCompiler = libs.findLibrary("hilt.compiler").get()
        val hiltCore = libs.findLibrary("hilt.core").get()
        val hiltAndroid = libs.findLibrary("hilt.android").get()

        dependencies {
            add("ksp", hiltCompiler)
        }

        pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
            dependencies {
                add("implementation", hiltCore)
            }
        }

        pluginManager.withPlugin("com.android.base") {
            pluginManager.apply("dagger.hilt.android.plugin")
            dependencies {
                add("implementation", hiltAndroid)
            }
        }
    }
}
