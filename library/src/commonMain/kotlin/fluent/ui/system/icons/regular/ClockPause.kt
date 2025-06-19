package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ClockPause: ImageVector
    get() {
        if (_ClockPause != null) {
            return _ClockPause!!
        }
        _ClockPause = ImageVector.Builder(
            name = "Regular.ClockPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 11f)
                curveTo(4.5f, 6.306f, 8.306f, 2.5f, 13f, 2.5f)
                curveTo(17.694f, 2.5f, 21.5f, 6.306f, 21.5f, 11f)
                curveTo(21.5f, 15.694f, 17.694f, 19.5f, 13f, 19.5f)
                curveTo(12.896f, 19.5f, 12.792f, 19.498f, 12.688f, 19.494f)
                curveTo(12.522f, 20.011f, 12.292f, 20.5f, 12.009f, 20.951f)
                curveTo(12.335f, 20.984f, 12.666f, 21f, 13f, 21f)
                curveTo(18.523f, 21f, 23f, 16.523f, 23f, 11f)
                curveTo(23f, 5.477f, 18.523f, 1f, 13f, 1f)
                curveTo(7.477f, 1f, 3f, 5.477f, 3f, 11f)
                curveTo(3f, 11.334f, 3.016f, 11.665f, 3.048f, 11.991f)
                curveTo(3.5f, 11.708f, 3.989f, 11.478f, 4.506f, 11.312f)
                curveTo(4.502f, 11.208f, 4.5f, 11.104f, 4.5f, 11f)
                close()
                moveTo(12.993f, 5.648f)
                curveTo(12.943f, 5.282f, 12.63f, 5f, 12.25f, 5f)
                curveTo(11.836f, 5f, 11.5f, 5.336f, 11.5f, 5.75f)
                verticalLineTo(11.75f)
                lineTo(11.507f, 11.852f)
                curveTo(11.557f, 12.218f, 11.87f, 12.5f, 12.25f, 12.5f)
                horizontalLineTo(16.25f)
                lineTo(16.352f, 12.493f)
                curveTo(16.718f, 12.443f, 17f, 12.13f, 17f, 11.75f)
                curveTo(17f, 11.336f, 16.664f, 11f, 16.25f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(5.75f)
                lineTo(12.993f, 5.648f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(4.5f, 20.5f)
                curveTo(4.776f, 20.5f, 5f, 20.276f, 5f, 20f)
                verticalLineTo(15f)
                curveTo(5f, 14.724f, 4.776f, 14.5f, 4.5f, 14.5f)
                curveTo(4.224f, 14.5f, 4f, 14.724f, 4f, 15f)
                verticalLineTo(20f)
                curveTo(4f, 20.276f, 4.224f, 20.5f, 4.5f, 20.5f)
                close()
                moveTo(8.5f, 20.5f)
                curveTo(8.776f, 20.5f, 9f, 20.276f, 9f, 20f)
                verticalLineTo(15f)
                curveTo(9f, 14.724f, 8.776f, 14.5f, 8.5f, 14.5f)
                curveTo(8.224f, 14.5f, 8f, 14.724f, 8f, 15f)
                verticalLineTo(20f)
                curveTo(8f, 20.276f, 8.224f, 20.5f, 8.5f, 20.5f)
                close()
            }
        }.build()

        return _ClockPause!!
    }

@Suppress("ObjectPropertyName")
private var _ClockPause: ImageVector? = null

@Preview
@Composable
private fun ClockPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClockPause, contentDescription = null)
    }
}
