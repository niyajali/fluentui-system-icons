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

public val FluentUi.Light.TableCellsSplit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TableCellsSplit",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(8.5f)
            verticalLineTo(23.5f)
            verticalLineTo(24.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(16f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
            verticalLineTo(23.5f)
            verticalLineTo(8.5f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineTo(16f)
            horizontalLineTo(7.5f)
            close()
            moveTo(16.5f, 28f)
            verticalLineTo(24f)
            horizontalLineTo(28f)
            verticalLineTo(24.5f)
            curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
            horizontalLineTo(16.5f)
            close()
            moveTo(15.5f, 24f)
            verticalLineTo(28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineTo(24f)
            horizontalLineTo(15.5f)
            close()
            moveTo(16f, 23f)
            horizontalLineTo(4f)
            verticalLineTo(9f)
            lineTo(15.999f, 9f)
            lineTo(16f, 9f)
            lineTo(16.001f, 9f)
            lineTo(28f, 9f)
            verticalLineTo(23f)
            lineTo(16f, 23f)
            close()
            moveTo(15.5f, 4f)
            verticalLineTo(8f)
            lineTo(4f, 8f)
            verticalLineTo(7.5f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineTo(15.5f)
            close()
            moveTo(16.5f, 8f)
            verticalLineTo(4f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
            verticalLineTo(8f)
            lineTo(16.5f, 8f)
            close()
            moveTo(16f, 10f)
            curveTo(16.276f, 10f, 16.5f, 10.224f, 16.5f, 10.5f)
            verticalLineTo(21.5f)
            curveTo(16.5f, 21.776f, 16.276f, 22f, 16f, 22f)
            curveTo(15.724f, 22f, 15.5f, 21.776f, 15.5f, 21.5f)
            verticalLineTo(10.5f)
            curveTo(15.5f, 10.224f, 15.724f, 10f, 16f, 10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableCellsSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TableCellsSplit, contentDescription = null)
    }
}
