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

public val FluentUi.Light.TableCellsMerge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TableCellsMerge",
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
            horizontalLineTo(24.5f)
            curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
            verticalLineTo(23.5f)
            verticalLineTo(8.5f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineTo(7.5f)
            close()
            moveTo(4f, 24.5f)
            verticalLineTo(24f)
            lineTo(28f, 24f)
            verticalLineTo(24.5f)
            curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            close()
            moveTo(4f, 23f)
            verticalLineTo(9f)
            lineTo(28f, 9f)
            verticalLineTo(23f)
            lineTo(4f, 23f)
            close()
            moveTo(28f, 8f)
            lineTo(4f, 8f)
            verticalLineTo(7.5f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
            verticalLineTo(8f)
            close()
            moveTo(23.293f, 16.5f)
            horizontalLineTo(8.707f)
            lineTo(11.354f, 19.146f)
            curveTo(11.549f, 19.342f, 11.549f, 19.658f, 11.354f, 19.854f)
            curveTo(11.158f, 20.049f, 10.842f, 20.049f, 10.646f, 19.854f)
            lineTo(7.146f, 16.354f)
            curveTo(7.053f, 16.26f, 7f, 16.133f, 7f, 16f)
            curveTo(7f, 15.867f, 7.053f, 15.74f, 7.146f, 15.646f)
            lineTo(10.646f, 12.146f)
            curveTo(10.842f, 11.951f, 11.158f, 11.951f, 11.354f, 12.146f)
            curveTo(11.549f, 12.342f, 11.549f, 12.658f, 11.354f, 12.854f)
            lineTo(8.707f, 15.5f)
            horizontalLineTo(23.293f)
            lineTo(20.646f, 12.854f)
            curveTo(20.451f, 12.658f, 20.451f, 12.342f, 20.646f, 12.146f)
            curveTo(20.842f, 11.951f, 21.158f, 11.951f, 21.354f, 12.146f)
            lineTo(24.854f, 15.646f)
            curveTo(24.947f, 15.74f, 25f, 15.867f, 25f, 16f)
            curveTo(25f, 16.133f, 24.947f, 16.26f, 24.854f, 16.354f)
            lineTo(21.354f, 19.854f)
            curveTo(21.158f, 20.049f, 20.842f, 20.049f, 20.646f, 19.854f)
            curveTo(20.451f, 19.658f, 20.451f, 19.342f, 20.646f, 19.146f)
            lineTo(23.293f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableCellsMergePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TableCellsMerge, contentDescription = null)
    }
}
