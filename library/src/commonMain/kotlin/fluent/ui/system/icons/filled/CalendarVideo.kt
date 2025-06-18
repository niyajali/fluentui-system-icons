package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.CalendarVideo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarVideo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(1.25f, 4.5f)
            curveTo(1.25f, 2.705f, 2.705f, 1.25f, 4.5f, 1.25f)
            horizontalLineTo(13.5f)
            curveTo(15.295f, 1.25f, 16.75f, 2.705f, 16.75f, 4.5f)
            lineTo(1.25f, 4.5f)
            close()
            moveTo(1.25f, 6f)
            verticalLineTo(13.5f)
            curveTo(1.25f, 15.295f, 2.705f, 16.75f, 4.5f, 16.75f)
            horizontalLineTo(5.25f)
            verticalLineTo(13.5f)
            curveTo(5.25f, 11.153f, 7.153f, 9.25f, 9.5f, 9.25f)
            horizontalLineTo(15.5f)
            curveTo(15.935f, 9.25f, 16.355f, 9.315f, 16.75f, 9.437f)
            verticalLineTo(6f)
            horizontalLineTo(1.25f)
            close()
            moveTo(15.5f, 10.25f)
            curveTo(15.943f, 10.25f, 16.365f, 10.339f, 16.75f, 10.499f)
            curveTo(17.88f, 10.97f, 18.687f, 12.061f, 18.747f, 13.348f)
            lineTo(21.221f, 11.548f)
            curveTo(22.377f, 10.707f, 24f, 11.533f, 24f, 12.964f)
            verticalLineTo(20.036f)
            curveTo(24f, 21.466f, 22.377f, 22.293f, 21.221f, 21.451f)
            lineTo(18.747f, 19.652f)
            curveTo(18.667f, 21.376f, 17.244f, 22.75f, 15.5f, 22.75f)
            horizontalLineTo(9.5f)
            curveTo(7.705f, 22.75f, 6.25f, 21.295f, 6.25f, 19.5f)
            verticalLineTo(13.5f)
            curveTo(6.25f, 11.705f, 7.705f, 10.25f, 9.5f, 10.25f)
            horizontalLineTo(15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarVideoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarVideo, contentDescription = null)
    }
}
