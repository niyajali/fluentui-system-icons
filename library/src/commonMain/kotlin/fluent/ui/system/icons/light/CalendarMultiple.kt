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

public val FluentUi.Light.CalendarMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarMultiple",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(22.5f)
            curveTo(24.985f, 3f, 27f, 5.015f, 27f, 7.5f)
            verticalLineTo(22.5f)
            curveTo(27f, 24.985f, 24.985f, 27f, 22.5f, 27f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 27f, 3f, 24.985f, 3f, 22.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(22.5f, 4f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(9f)
            horizontalLineTo(26f)
            verticalLineTo(7.5f)
            curveTo(26f, 5.567f, 24.433f, 4f, 22.5f, 4f)
            close()
            moveTo(26f, 10f)
            horizontalLineTo(4f)
            verticalLineTo(22.5f)
            curveTo(4f, 24.433f, 5.567f, 26f, 7.5f, 26f)
            horizontalLineTo(22.5f)
            curveTo(24.433f, 26f, 26f, 24.433f, 26f, 22.5f)
            verticalLineTo(10f)
            close()
            moveTo(7.671f, 29f)
            curveTo(8.444f, 29.625f, 9.428f, 30f, 10.5f, 30f)
            horizontalLineTo(22.5f)
            curveTo(26.642f, 30f, 30f, 26.642f, 30f, 22.5f)
            verticalLineTo(10.5f)
            curveTo(30f, 9.428f, 29.625f, 8.444f, 29f, 7.671f)
            verticalLineTo(10.473f)
            lineTo(29f, 10.5f)
            verticalLineTo(22.5f)
            curveTo(29f, 26.09f, 26.09f, 29f, 22.5f, 29f)
            horizontalLineTo(18.052f)
            lineTo(18f, 29f)
            horizontalLineTo(7.671f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.CalendarMultiple, contentDescription = null)
    }
}
