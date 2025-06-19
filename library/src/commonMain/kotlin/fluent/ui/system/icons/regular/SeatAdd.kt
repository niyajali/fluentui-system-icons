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

public val FluentIcons.Regular.SeatAdd: ImageVector
    get() {
        if (_SeatAdd != null) {
            return _SeatAdd!!
        }
        _SeatAdd = ImageVector.Builder(
            name = "Regular.SeatAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
                curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
                curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
                close()
                moveTo(18.001f, 7f)
                lineTo(18.001f, 9.504f)
                curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
                curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
                lineTo(17.001f, 7f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
                curveTo(13.996f, 6.224f, 14.22f, 6f, 14.496f, 6f)
                horizontalLineTo(17f)
                lineTo(17f, 3.499f)
                curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
                curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
                lineTo(18f, 6f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
                curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
                horizontalLineTo(18.001f)
                close()
                moveTo(19.5f, 14.5f)
                curveTo(19.5f, 13.841f, 19.181f, 13.256f, 18.689f, 12.892f)
                curveTo(19.527f, 12.737f, 20.308f, 12.421f, 21f, 11.978f)
                verticalLineTo(18.75f)
                curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 3.463f, 11.486f, 3.967f, 11.314f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(11.627f)
                curveTo(5.067f, 11.232f, 5.756f, 11f, 6.5f, 11f)
                curveTo(7.615f, 11f, 8.609f, 11.522f, 9.25f, 12.335f)
                curveTo(9.891f, 11.522f, 10.884f, 11f, 12f, 11f)
                curveTo(12.323f, 11f, 12.637f, 11.044f, 12.934f, 11.126f)
                curveTo(13.84f, 12.02f, 15.007f, 12.651f, 16.311f, 12.892f)
                curveTo(15.819f, 13.256f, 15.5f, 13.841f, 15.5f, 14.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 19.5f, 19.5f, 19.164f, 19.5f, 18.75f)
                verticalLineTo(14.5f)
                close()
                moveTo(14f, 14.5f)
                curveTo(14f, 13.395f, 13.105f, 12.5f, 12f, 12.5f)
                curveTo(10.895f, 12.5f, 10f, 13.395f, 10f, 14.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(14f)
                verticalLineTo(14.5f)
                close()
                moveTo(5.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(14.5f)
                curveTo(8.5f, 13.395f, 7.605f, 12.5f, 6.5f, 12.5f)
                curveTo(5.395f, 12.5f, 4.5f, 13.395f, 4.5f, 14.5f)
                verticalLineTo(18.75f)
                curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
                close()
            }
        }.build()

        return _SeatAdd!!
    }

@Suppress("ObjectPropertyName")
private var _SeatAdd: ImageVector? = null

@Preview
@Composable
private fun SeatAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SeatAdd, contentDescription = null)
    }
}
