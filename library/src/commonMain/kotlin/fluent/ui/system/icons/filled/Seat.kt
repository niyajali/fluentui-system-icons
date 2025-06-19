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

public val FluentIcons.Filled.Seat: ImageVector
    get() {
        if (_Seat != null) {
            return _Seat!!
        }
        _Seat = ImageVector.Builder(
            name = "Filled.Seat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(11.877f)
                curveTo(20.315f, 11.328f, 19.446f, 11f, 18.5f, 11f)
                curveTo(17.161f, 11f, 15.976f, 11.658f, 15.25f, 12.668f)
                curveTo(14.524f, 11.658f, 13.339f, 11f, 12f, 11f)
                curveTo(10.661f, 11f, 9.476f, 11.658f, 8.75f, 12.668f)
                curveTo(8.024f, 11.658f, 6.839f, 11f, 5.5f, 11f)
                curveTo(4.554f, 11f, 3.685f, 11.328f, 3f, 11.877f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.5f, 15f)
                curveTo(14.5f, 13.619f, 13.381f, 12.5f, 12f, 12.5f)
                curveTo(10.619f, 12.5f, 9.5f, 13.619f, 9.5f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(14.5f)
                verticalLineTo(15f)
                close()
                moveTo(16f, 21f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 21f, 21f, 19.993f, 21f, 18.75f)
                verticalLineTo(15f)
                curveTo(21f, 13.619f, 19.881f, 12.5f, 18.5f, 12.5f)
                curveTo(17.119f, 12.5f, 16f, 13.619f, 16f, 15f)
                verticalLineTo(21f)
                close()
                moveTo(8f, 21f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
                verticalLineTo(15f)
                curveTo(3f, 13.619f, 4.119f, 12.5f, 5.5f, 12.5f)
                curveTo(6.881f, 12.5f, 8f, 13.619f, 8f, 15f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _Seat!!
    }

@Suppress("ObjectPropertyName")
private var _Seat: ImageVector? = null

@Preview
@Composable
private fun SeatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Seat, contentDescription = null)
    }
}
