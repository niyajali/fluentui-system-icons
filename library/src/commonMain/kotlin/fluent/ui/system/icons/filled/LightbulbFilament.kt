package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.LightbulbFilament: ImageVector
    get() {
        if (_LightbulbFilament != null) {
            return _LightbulbFilament!!
        }
        _LightbulbFilament = ImageVector.Builder(
            name = "Filled.LightbulbFilament",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.538f, 18.999f)
                lineTo(15.247f, 20.257f)
                curveTo(15.024f, 21.221f, 14.201f, 21.918f, 13.229f, 21.993f)
                lineTo(13.055f, 22f)
                horizontalLineTo(10.944f)
                curveTo(9.954f, 22f, 9.089f, 21.355f, 8.797f, 20.423f)
                lineTo(8.751f, 20.256f)
                lineTo(8.461f, 18.999f)
                horizontalLineTo(15.538f)
                close()
                moveTo(12f, 2.001f)
                curveTo(16.004f, 2.001f, 19.25f, 5.247f, 19.25f, 9.251f)
                curveTo(19.25f, 11.387f, 18.314f, 13.344f, 16.485f, 15.092f)
                curveTo(16.449f, 15.125f, 16.425f, 15.169f, 16.414f, 15.216f)
                lineTo(15.886f, 17.499f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.75f)
                curveTo(12.75f, 10.336f, 12.414f, 10f, 12f, 10f)
                curveTo(11.586f, 10f, 11.25f, 10.336f, 11.25f, 10.75f)
                verticalLineTo(17.499f)
                horizontalLineTo(8.114f)
                lineTo(7.588f, 15.216f)
                curveTo(7.577f, 15.169f, 7.552f, 15.125f, 7.517f, 15.092f)
                curveTo(5.686f, 13.344f, 4.75f, 11.387f, 4.75f, 9.251f)
                curveTo(4.75f, 5.247f, 7.996f, 2.001f, 12f, 2.001f)
                close()
                moveTo(11.25f, 6.751f)
                verticalLineTo(8.251f)
                curveTo(11.25f, 8.665f, 11.586f, 9.001f, 12f, 9.001f)
                curveTo(12.414f, 9.001f, 12.75f, 8.665f, 12.75f, 8.251f)
                verticalLineTo(6.751f)
                curveTo(12.75f, 6.337f, 12.414f, 6.001f, 12f, 6.001f)
                curveTo(11.586f, 6.001f, 11.25f, 6.337f, 11.25f, 6.751f)
                close()
                moveTo(16.28f, 8.216f)
                curveTo(15.987f, 7.923f, 15.513f, 7.923f, 15.22f, 8.216f)
                lineTo(14.159f, 9.277f)
                curveTo(13.866f, 9.57f, 13.866f, 10.045f, 14.159f, 10.337f)
                curveTo(14.452f, 10.63f, 14.927f, 10.63f, 15.22f, 10.337f)
                lineTo(16.28f, 9.277f)
                curveTo(16.573f, 8.984f, 16.573f, 8.509f, 16.28f, 8.216f)
                close()
                moveTo(8.78f, 8.216f)
                curveTo(8.487f, 7.923f, 8.013f, 7.923f, 7.72f, 8.216f)
                curveTo(7.427f, 8.509f, 7.427f, 8.984f, 7.72f, 9.277f)
                lineTo(8.78f, 10.337f)
                curveTo(9.073f, 10.63f, 9.548f, 10.63f, 9.841f, 10.337f)
                curveTo(10.134f, 10.045f, 10.134f, 9.57f, 9.841f, 9.277f)
                lineTo(8.78f, 8.216f)
                close()
            }
        }.build()

        return _LightbulbFilament!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbFilament: ImageVector? = null

@Preview
@Composable
private fun LightbulbFilamentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LightbulbFilament, contentDescription = null)
    }
}
