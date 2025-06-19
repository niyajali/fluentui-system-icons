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

public val FluentIcons.Filled.DockRow: ImageVector
    get() {
        if (_DockRow != null) {
            return _DockRow!!
        }
        _DockRow = ImageVector.Builder(
            name = "Filled.DockRow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 12.029f)
                curveTo(21.216f, 12.029f, 22f, 12.813f, 22f, 13.779f)
                verticalLineTo(16.279f)
                curveTo(22f, 17.246f, 21.216f, 18.029f, 20.25f, 18.029f)
                horizontalLineTo(17.75f)
                curveTo(16.784f, 18.029f, 16f, 17.246f, 16f, 16.279f)
                verticalLineTo(13.779f)
                curveTo(16f, 12.813f, 16.784f, 12.029f, 17.75f, 12.029f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.25f, 12.029f)
                curveTo(7.216f, 12.029f, 8f, 12.813f, 8f, 13.779f)
                verticalLineTo(16.279f)
                curveTo(8f, 17.246f, 7.216f, 18.029f, 6.25f, 18.029f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 18.029f, 2f, 17.246f, 2f, 16.279f)
                verticalLineTo(13.779f)
                curveTo(2f, 12.813f, 2.783f, 12.029f, 3.75f, 12.029f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.25f, 12.029f)
                curveTo(14.217f, 12.029f, 15f, 12.813f, 15f, 13.779f)
                verticalLineTo(16.279f)
                curveTo(15f, 17.246f, 14.217f, 18.029f, 13.25f, 18.029f)
                horizontalLineTo(10.75f)
                curveTo(9.783f, 18.029f, 9f, 17.246f, 9f, 16.279f)
                verticalLineTo(13.779f)
                curveTo(9f, 12.813f, 9.783f, 12.029f, 10.75f, 12.029f)
                horizontalLineTo(13.25f)
                close()
                moveTo(13.25f, 5.029f)
                curveTo(14.217f, 5.029f, 15f, 5.813f, 15f, 6.779f)
                verticalLineTo(9.279f)
                curveTo(15f, 10.246f, 14.217f, 11.029f, 13.25f, 11.029f)
                horizontalLineTo(10.75f)
                curveTo(9.783f, 11.029f, 9f, 10.246f, 9f, 9.279f)
                verticalLineTo(6.779f)
                curveTo(9f, 5.813f, 9.783f, 5.029f, 10.75f, 5.029f)
                horizontalLineTo(13.25f)
                close()
                moveTo(20.25f, 5.029f)
                curveTo(21.216f, 5.029f, 22f, 5.813f, 22f, 6.779f)
                verticalLineTo(9.279f)
                curveTo(22f, 10.246f, 21.216f, 11.029f, 20.25f, 11.029f)
                horizontalLineTo(17.75f)
                curveTo(16.784f, 11.029f, 16f, 10.246f, 16f, 9.279f)
                verticalLineTo(6.779f)
                curveTo(16f, 5.813f, 16.784f, 5.029f, 17.75f, 5.029f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.25f, 5.029f)
                curveTo(7.216f, 5.029f, 8f, 5.813f, 8f, 6.779f)
                verticalLineTo(9.279f)
                curveTo(8f, 10.246f, 7.216f, 11.029f, 6.25f, 11.029f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 11.029f, 2f, 10.246f, 2f, 9.279f)
                verticalLineTo(6.779f)
                curveTo(2f, 5.861f, 2.707f, 5.108f, 3.606f, 5.035f)
                lineTo(3.75f, 5.029f)
                horizontalLineTo(6.25f)
                close()
            }
        }.build()

        return _DockRow!!
    }

@Suppress("ObjectPropertyName")
private var _DockRow: ImageVector? = null

@Preview
@Composable
private fun DockRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DockRow, contentDescription = null)
    }
}
