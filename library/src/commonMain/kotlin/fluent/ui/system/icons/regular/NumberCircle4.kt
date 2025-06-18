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

public val FluentUi.Regular.NumberCircle4: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle4",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(14.5f, 7.688f)
            curveTo(14.5f, 6.591f, 13.07f, 6.17f, 12.476f, 7.092f)
            lineTo(8.319f, 13.535f)
            curveTo(7.911f, 14.167f, 8.365f, 15f, 9.117f, 15f)
            horizontalLineTo(13f)
            verticalLineTo(16.25f)
            curveTo(13f, 16.664f, 13.336f, 17f, 13.75f, 17f)
            curveTo(14.164f, 17f, 14.5f, 16.664f, 14.5f, 16.25f)
            verticalLineTo(15f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 15f, 16f, 14.664f, 16f, 14.25f)
            curveTo(16f, 13.836f, 15.664f, 13.5f, 15.25f, 13.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.688f)
            close()
            moveTo(13f, 9.046f)
            verticalLineTo(13.5f)
            horizontalLineTo(10.126f)
            lineTo(13f, 9.046f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle4Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NumberCircle4, contentDescription = null)
    }
}
