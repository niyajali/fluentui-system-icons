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

public val FluentIcons.Regular.BinFull: ImageVector
    get() {
        if (_BinFull != null) {
            return _BinFull!!
        }
        _BinFull = ImageVector.Builder(
            name = "Regular.BinFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.381f, 2.345f)
                curveTo(17.605f, 2.693f, 17.504f, 3.157f, 17.156f, 3.381f)
                lineTo(5.304f, 11f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.25f)
                curveTo(9.5f, 9.284f, 10.283f, 8.5f, 11.25f, 8.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(7.75f)
                curveTo(14.5f, 6.784f, 15.283f, 6f, 16.25f, 6f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 6f, 21f, 6.784f, 21f, 7.75f)
                verticalLineTo(11f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11f, 22f, 11.336f, 22f, 11.75f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
                verticalLineTo(11.75f)
                curveTo(2f, 11.495f, 2.13f, 11.257f, 2.344f, 11.119f)
                lineTo(16.344f, 2.119f)
                curveTo(16.693f, 1.895f, 17.157f, 1.996f, 17.381f, 2.345f)
                close()
                moveTo(19.5f, 11f)
                verticalLineTo(7.75f)
                curveTo(19.5f, 7.612f, 19.388f, 7.5f, 19.25f, 7.5f)
                horizontalLineTo(16.25f)
                curveTo(16.112f, 7.5f, 16f, 7.612f, 16f, 7.75f)
                verticalLineTo(11f)
                horizontalLineTo(19.5f)
                close()
                moveTo(14.5f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(11.25f)
                curveTo(11.112f, 10f, 11f, 10.112f, 11f, 10.25f)
                verticalLineTo(11f)
                horizontalLineTo(14.5f)
                close()
                moveTo(3.5f, 12.5f)
                verticalLineTo(18.75f)
                curveTo(3.5f, 19.717f, 4.284f, 20.5f, 5.25f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 20.5f, 20.5f, 19.717f, 20.5f, 18.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()

        return _BinFull!!
    }

@Suppress("ObjectPropertyName")
private var _BinFull: ImageVector? = null

@Preview
@Composable
private fun BinFullPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BinFull, contentDescription = null)
    }
}
