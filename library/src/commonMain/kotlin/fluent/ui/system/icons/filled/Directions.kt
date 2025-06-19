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

public val FluentIcons.Filled.Directions: ImageVector
    get() {
        if (_Directions != null) {
            return _Directions!!
        }
        _Directions = ImageVector.Builder(
            name = "Filled.Directions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.952f, 14.299f)
                curveTo(1.683f, 13.029f, 1.683f, 10.972f, 2.952f, 9.702f)
                lineTo(9.702f, 2.952f)
                curveTo(10.972f, 1.683f, 13.029f, 1.683f, 14.299f, 2.952f)
                lineTo(21.049f, 9.702f)
                curveTo(22.318f, 10.972f, 22.318f, 13.029f, 21.049f, 14.299f)
                lineTo(14.299f, 21.049f)
                curveTo(13.029f, 22.318f, 10.972f, 22.318f, 9.702f, 21.049f)
                lineTo(2.952f, 14.299f)
                close()
                moveTo(13.78f, 7.22f)
                curveTo(13.487f, 6.927f, 13.013f, 6.927f, 12.72f, 7.22f)
                curveTo(12.427f, 7.513f, 12.427f, 7.987f, 12.72f, 8.28f)
                lineTo(13.439f, 9f)
                horizontalLineTo(11.75f)
                curveTo(10.231f, 9f, 9f, 10.231f, 9f, 11.75f)
                verticalLineTo(15.25f)
                curveTo(9f, 15.664f, 9.336f, 16f, 9.75f, 16f)
                curveTo(10.164f, 16f, 10.5f, 15.664f, 10.5f, 15.25f)
                verticalLineTo(11.75f)
                curveTo(10.5f, 11.06f, 11.06f, 10.5f, 11.75f, 10.5f)
                horizontalLineTo(13.439f)
                lineTo(12.72f, 11.22f)
                curveTo(12.427f, 11.513f, 12.427f, 11.987f, 12.72f, 12.28f)
                curveTo(13.013f, 12.573f, 13.487f, 12.573f, 13.78f, 12.28f)
                lineTo(15.78f, 10.28f)
                curveTo(16.073f, 9.987f, 16.073f, 9.513f, 15.78f, 9.22f)
                lineTo(13.78f, 7.22f)
                close()
            }
        }.build()

        return _Directions!!
    }

@Suppress("ObjectPropertyName")
private var _Directions: ImageVector? = null

@Preview
@Composable
private fun DirectionsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Directions, contentDescription = null)
    }
}
