package fluent.ui.system.icons.light

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

public val FluentUi.Light.CalendarPattern: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarPattern",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(29f, 24.5f)
            curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(24.5f)
            close()
            moveTo(24.5f, 4f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(28f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            close()
            moveTo(4f, 16.293f)
            lineTo(9.293f, 11f)
            horizontalLineTo(4f)
            verticalLineTo(16.293f)
            close()
            moveTo(4f, 17.707f)
            verticalLineTo(20f)
            horizontalLineTo(7.293f)
            lineTo(16.293f, 11f)
            horizontalLineTo(10.707f)
            lineTo(4f, 17.707f)
            close()
            moveTo(17.707f, 11f)
            lineTo(8.707f, 20f)
            horizontalLineTo(14.293f)
            lineTo(23.293f, 11f)
            horizontalLineTo(17.707f)
            close()
            moveTo(24.707f, 11f)
            lineTo(15.707f, 20f)
            horizontalLineTo(21.293f)
            lineTo(28f, 13.293f)
            verticalLineTo(11f)
            horizontalLineTo(24.707f)
            close()
            moveTo(28f, 14.707f)
            lineTo(22.707f, 20f)
            horizontalLineTo(28f)
            verticalLineTo(14.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarPatternPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.CalendarPattern, contentDescription = null)
    }
}
