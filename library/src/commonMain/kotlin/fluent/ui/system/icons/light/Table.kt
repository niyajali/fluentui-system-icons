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

public val FluentUi.Light.Table: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Table",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(11.5f)
            horizontalLineTo(20.5f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(11.5f)
            verticalLineTo(20.5f)
            verticalLineTo(24.5f)
            curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
            horizontalLineTo(20.5f)
            horizontalLineTo(11.5f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(20.5f)
            verticalLineTo(11.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(4f, 21f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(11f)
            verticalLineTo(21f)
            horizontalLineTo(4f)
            close()
            moveTo(11f, 20f)
            verticalLineTo(12f)
            horizontalLineTo(4f)
            verticalLineTo(20f)
            horizontalLineTo(11f)
            close()
            moveTo(12f, 21f)
            verticalLineTo(28f)
            horizontalLineTo(20f)
            verticalLineTo(21f)
            lineTo(12f, 21f)
            close()
            moveTo(20f, 20f)
            verticalLineTo(12f)
            lineTo(12f, 12f)
            verticalLineTo(20f)
            lineTo(20f, 20f)
            close()
            moveTo(21f, 21f)
            verticalLineTo(28f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
            verticalLineTo(21f)
            horizontalLineTo(21f)
            close()
            moveTo(28f, 20f)
            verticalLineTo(12f)
            horizontalLineTo(21f)
            verticalLineTo(20f)
            horizontalLineTo(28f)
            close()
            moveTo(7.5f, 4f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(11f)
            horizontalLineTo(11f)
            verticalLineTo(4f)
            horizontalLineTo(7.5f)
            close()
            moveTo(20f, 4f)
            horizontalLineTo(12f)
            verticalLineTo(11f)
            lineTo(20f, 11f)
            verticalLineTo(4f)
            close()
            moveTo(21f, 4f)
            verticalLineTo(11f)
            lineTo(28f, 11f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineTo(21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Table, contentDescription = null)
    }
}
