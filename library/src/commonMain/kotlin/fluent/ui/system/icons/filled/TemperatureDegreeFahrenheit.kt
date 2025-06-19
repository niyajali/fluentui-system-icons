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

public val FluentIcons.Filled.TemperatureDegreeFahrenheit: ImageVector
    get() {
        if (_TemperatureDegreeFahrenheit != null) {
            return _TemperatureDegreeFahrenheit!!
        }
        _TemperatureDegreeFahrenheit = ImageVector.Builder(
            name = "Filled.TemperatureDegreeFahrenheit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 8.5f)
                curveTo(5f, 7.672f, 5.672f, 7f, 6.5f, 7f)
                curveTo(7.328f, 7f, 8f, 7.672f, 8f, 8.5f)
                curveTo(8f, 9.328f, 7.328f, 10f, 6.5f, 10f)
                curveTo(5.672f, 10f, 5f, 9.328f, 5f, 8.5f)
                close()
                moveTo(6.5f, 5f)
                curveTo(4.567f, 5f, 3f, 6.567f, 3f, 8.5f)
                curveTo(3f, 10.433f, 4.567f, 12f, 6.5f, 12f)
                curveTo(8.433f, 12f, 10f, 10.433f, 10f, 8.5f)
                curveTo(10f, 6.567f, 8.433f, 5f, 6.5f, 5f)
                close()
                moveTo(13f, 5f)
                curveTo(12.448f, 5f, 12f, 5.448f, 12f, 6f)
                verticalLineTo(18f)
                curveTo(12f, 18.552f, 12.448f, 19f, 13f, 19f)
                curveTo(13.552f, 19f, 14f, 18.552f, 14f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(19.5f)
                curveTo(20.052f, 13f, 20.5f, 12.552f, 20.5f, 12f)
                curveTo(20.5f, 11.448f, 20.052f, 11f, 19.5f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
                curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _TemperatureDegreeFahrenheit!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureDegreeFahrenheit: ImageVector? = null

@Preview
@Composable
private fun TemperatureDegreeFahrenheitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TemperatureDegreeFahrenheit, contentDescription = null)
    }
}
