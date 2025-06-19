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

public val FluentIcons.Filled.ShieldGlobe: ImageVector
    get() {
        if (_ShieldGlobe != null) {
            return _ShieldGlobe!!
        }
        _ShieldGlobe = ImageVector.Builder(
            name = "Filled.ShieldGlobe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 5f)
                curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
                verticalLineTo(11f)
                curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
                curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
                curveTo(18.042f, 19.676f, 21f, 16.001f, 21f, 11f)
                verticalLineTo(5.75f)
                curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
                curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
                curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
                close()
                moveTo(10.074f, 15.507f)
                curveTo(9.784f, 14.736f, 9.587f, 13.789f, 9.523f, 12.75f)
                horizontalLineTo(8.07f)
                curveTo(8.296f, 13.939f, 9.047f, 14.942f, 10.074f, 15.507f)
                close()
                moveTo(11.598f, 15.268f)
                curveTo(11.318f, 14.654f, 11.099f, 13.78f, 11.026f, 12.75f)
                horizontalLineTo(12.974f)
                curveTo(12.901f, 13.78f, 12.682f, 14.654f, 12.402f, 15.268f)
                curveTo(12.233f, 15.64f, 12.091f, 15.829f, 12f, 15.923f)
                curveTo(11.909f, 15.829f, 11.767f, 15.64f, 11.598f, 15.268f)
                close()
                moveTo(11.598f, 8.732f)
                curveTo(11.318f, 9.346f, 11.099f, 10.22f, 11.026f, 11.25f)
                horizontalLineTo(12.974f)
                curveTo(12.901f, 10.22f, 12.682f, 9.346f, 12.402f, 8.732f)
                curveTo(12.233f, 8.36f, 12.091f, 8.171f, 12f, 8.077f)
                curveTo(11.909f, 8.171f, 11.767f, 8.36f, 11.598f, 8.732f)
                close()
                moveTo(13.926f, 15.507f)
                curveTo(14.216f, 14.736f, 14.413f, 13.789f, 14.477f, 12.75f)
                horizontalLineTo(15.93f)
                curveTo(15.704f, 13.939f, 14.953f, 14.942f, 13.926f, 15.507f)
                close()
                moveTo(14.477f, 11.25f)
                horizontalLineTo(15.93f)
                curveTo(15.704f, 10.061f, 14.953f, 9.058f, 13.926f, 8.493f)
                curveTo(14.216f, 9.264f, 14.413f, 10.211f, 14.477f, 11.25f)
                close()
                moveTo(8.07f, 11.25f)
                horizontalLineTo(9.523f)
                curveTo(9.587f, 10.211f, 9.784f, 9.264f, 10.074f, 8.493f)
                curveTo(9.047f, 9.058f, 8.296f, 10.061f, 8.07f, 11.25f)
                close()
                moveTo(12f, 6.5f)
                curveTo(15.038f, 6.5f, 17.5f, 8.962f, 17.5f, 12f)
                curveTo(17.5f, 15.038f, 15.038f, 17.5f, 12f, 17.5f)
                curveTo(8.962f, 17.5f, 6.5f, 15.038f, 6.5f, 12f)
                curveTo(6.5f, 8.962f, 8.962f, 6.5f, 12f, 6.5f)
                close()
            }
        }.build()

        return _ShieldGlobe!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldGlobe: ImageVector? = null

@Preview
@Composable
private fun ShieldGlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldGlobe, contentDescription = null)
    }
}
