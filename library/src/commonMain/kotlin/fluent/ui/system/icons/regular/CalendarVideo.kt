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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CalendarVideo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarVideo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 1.25f)
            curveTo(2.705f, 1.25f, 1.25f, 2.705f, 1.25f, 4.5f)
            verticalLineTo(13.5f)
            curveTo(1.25f, 15.295f, 2.705f, 16.75f, 4.5f, 16.75f)
            horizontalLineTo(5.25f)
            verticalLineTo(15.25f)
            horizontalLineTo(4.5f)
            curveTo(3.533f, 15.25f, 2.75f, 14.467f, 2.75f, 13.5f)
            verticalLineTo(7f)
            horizontalLineTo(15.25f)
            verticalLineTo(9.25f)
            horizontalLineTo(15.5f)
            curveTo(15.935f, 9.25f, 16.355f, 9.315f, 16.75f, 9.437f)
            verticalLineTo(4.5f)
            curveTo(16.75f, 2.705f, 15.295f, 1.25f, 13.5f, 1.25f)
            horizontalLineTo(4.5f)
            close()
            moveTo(15.25f, 5.5f)
            horizontalLineTo(2.75f)
            verticalLineTo(4.5f)
            curveTo(2.75f, 3.533f, 3.533f, 2.75f, 4.5f, 2.75f)
            horizontalLineTo(13.5f)
            curveTo(14.467f, 2.75f, 15.25f, 3.533f, 15.25f, 4.5f)
            verticalLineTo(5.5f)
            close()
            moveTo(9.5f, 10.25f)
            curveTo(7.705f, 10.25f, 6.25f, 11.705f, 6.25f, 13.5f)
            verticalLineTo(19.5f)
            curveTo(6.25f, 21.295f, 7.705f, 22.75f, 9.5f, 22.75f)
            horizontalLineTo(15.5f)
            curveTo(17.244f, 22.75f, 18.667f, 21.376f, 18.747f, 19.652f)
            lineTo(21.221f, 21.451f)
            curveTo(22.377f, 22.293f, 24f, 21.466f, 24f, 20.036f)
            verticalLineTo(12.964f)
            curveTo(24f, 11.533f, 22.377f, 10.707f, 21.221f, 11.549f)
            lineTo(18.747f, 13.348f)
            curveTo(18.667f, 11.624f, 17.244f, 10.25f, 15.5f, 10.25f)
            horizontalLineTo(9.5f)
            close()
            moveTo(18.75f, 15.2f)
            lineTo(22.103f, 12.762f)
            curveTo(22.268f, 12.641f, 22.5f, 12.759f, 22.5f, 12.964f)
            verticalLineTo(20.036f)
            curveTo(22.5f, 20.241f, 22.268f, 20.359f, 22.103f, 20.238f)
            lineTo(18.75f, 17.8f)
            verticalLineTo(15.2f)
            close()
            moveTo(7.75f, 13.5f)
            curveTo(7.75f, 12.533f, 8.533f, 11.75f, 9.5f, 11.75f)
            horizontalLineTo(15.5f)
            curveTo(16.466f, 11.75f, 17.25f, 12.533f, 17.25f, 13.5f)
            verticalLineTo(19.5f)
            curveTo(17.25f, 20.466f, 16.466f, 21.25f, 15.5f, 21.25f)
            horizontalLineTo(9.5f)
            curveTo(8.533f, 21.25f, 7.75f, 20.466f, 7.75f, 19.5f)
            verticalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarVideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarVideo, contentDescription = null)
    }
}
