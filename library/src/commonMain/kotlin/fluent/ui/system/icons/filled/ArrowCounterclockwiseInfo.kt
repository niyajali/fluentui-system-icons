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

public val FluentIcons.Filled.ArrowCounterclockwiseInfo: ImageVector
    get() {
        if (_ArrowCounterclockwiseInfo != null) {
            return _ArrowCounterclockwiseInfo!!
        }
        _ArrowCounterclockwiseInfo = ImageVector.Builder(
            name = "Filled.ArrowCounterclockwiseInfo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 12.022f)
                curveTo(20.381f, 11.625f, 19.689f, 11.331f, 18.95f, 11.162f)
                curveTo(18.537f, 7.691f, 15.583f, 5f, 12f, 5f)
                curveTo(10.68f, 5f, 9.446f, 5.365f, 8.392f, 6f)
                horizontalLineTo(9f)
                curveTo(9.552f, 6f, 10f, 6.448f, 10f, 7f)
                curveTo(10f, 7.552f, 9.552f, 8f, 9f, 8f)
                horizontalLineTo(6f)
                curveTo(5.448f, 8f, 5f, 7.552f, 5f, 7f)
                verticalLineTo(4f)
                curveTo(5f, 3.448f, 5.448f, 3f, 6f, 3f)
                curveTo(6.552f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(4.516f)
                curveTo(8.43f, 3.559f, 10.15f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                lineTo(21f, 12.022f)
                close()
                moveTo(12f, 21f)
                lineTo(12.022f, 21f)
                curveTo(11.625f, 20.381f, 11.331f, 19.689f, 11.162f, 18.95f)
                curveTo(7.691f, 18.537f, 5f, 15.583f, 5f, 12f)
                curveTo(5f, 11.703f, 5.018f, 11.41f, 5.054f, 11.124f)
                curveTo(5.123f, 10.576f, 4.734f, 10.076f, 4.186f, 10.008f)
                curveTo(3.638f, 9.939f, 3.138f, 10.328f, 3.07f, 10.876f)
                curveTo(3.024f, 11.245f, 3f, 11.62f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                close()
                moveTo(17.5f, 21f)
                curveTo(17.776f, 21f, 18f, 20.776f, 18f, 20.5f)
                lineTo(18f, 16.5f)
                curveTo(18f, 16.224f, 17.776f, 16f, 17.5f, 16f)
                curveTo(17.224f, 16f, 17f, 16.224f, 17f, 16.5f)
                lineTo(17f, 20.5f)
                curveTo(17f, 20.776f, 17.224f, 21f, 17.5f, 21f)
                close()
                moveTo(17.5f, 13.875f)
                curveTo(17.155f, 13.875f, 16.875f, 14.155f, 16.875f, 14.5f)
                curveTo(16.875f, 14.845f, 17.155f, 15.125f, 17.5f, 15.125f)
                curveTo(17.845f, 15.125f, 18.125f, 14.845f, 18.125f, 14.5f)
                curveTo(18.125f, 14.155f, 17.845f, 13.875f, 17.5f, 13.875f)
                close()
            }
        }.build()

        return _ArrowCounterclockwiseInfo!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCounterclockwiseInfo: ImageVector? = null

@Preview
@Composable
private fun ArrowCounterclockwiseInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCounterclockwiseInfo, contentDescription = null)
    }
}
