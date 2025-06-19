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

public val FluentIcons.Filled.TableResizeRow: ImageVector
    get() {
        if (_TableResizeRow != null) {
            return _TableResizeRow!!
        }
        _TableResizeRow = ImageVector.Builder(
            name = "Filled.TableResizeRow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(17.5f)
                horizontalLineTo(9.647f)
                lineTo(10.837f, 18.558f)
                curveTo(11.5f, 19.147f, 12.5f, 19.147f, 13.163f, 18.558f)
                lineTo(14.353f, 17.5f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                close()
                moveTo(8.442f, 14.087f)
                curveTo(8.908f, 13.563f, 9.619f, 13.385f, 10.25f, 13.573f)
                lineTo(10.25f, 10.427f)
                curveTo(9.619f, 10.615f, 8.908f, 10.437f, 8.442f, 9.913f)
                curveTo(7.961f, 9.372f, 7.877f, 8.615f, 8.168f, 8f)
                lineTo(3f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(8.168f)
                curveTo(7.877f, 15.385f, 7.961f, 14.628f, 8.442f, 14.087f)
                close()
                moveTo(13.75f, 10.427f)
                verticalLineTo(13.573f)
                curveTo(14.381f, 13.385f, 15.092f, 13.563f, 15.558f, 14.087f)
                curveTo(16.039f, 14.628f, 16.123f, 15.385f, 15.832f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                lineTo(15.832f, 8f)
                curveTo(16.123f, 8.615f, 16.039f, 9.372f, 15.558f, 9.913f)
                curveTo(15.092f, 10.437f, 14.381f, 10.615f, 13.75f, 10.427f)
                close()
                moveTo(14.353f, 6.5f)
                lineTo(21f, 6.5f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(6.5f)
                lineTo(9.647f, 6.5f)
                lineTo(10.837f, 5.442f)
                curveTo(11.5f, 4.853f, 12.5f, 4.853f, 13.163f, 5.442f)
                lineTo(14.353f, 6.5f)
                close()
                moveTo(12.75f, 15.58f)
                verticalLineTo(8.42f)
                lineTo(13.752f, 9.311f)
                curveTo(14.061f, 9.586f, 14.535f, 9.558f, 14.811f, 9.248f)
                curveTo(15.086f, 8.939f, 15.058f, 8.465f, 14.748f, 8.189f)
                lineTo(12.498f, 6.189f)
                curveTo(12.214f, 5.937f, 11.786f, 5.937f, 11.502f, 6.189f)
                lineTo(9.252f, 8.189f)
                curveTo(8.942f, 8.465f, 8.914f, 8.939f, 9.189f, 9.248f)
                curveTo(9.465f, 9.558f, 9.939f, 9.586f, 10.248f, 9.311f)
                lineTo(11.25f, 8.42f)
                verticalLineTo(15.58f)
                lineTo(10.248f, 14.689f)
                curveTo(9.939f, 14.414f, 9.465f, 14.442f, 9.189f, 14.752f)
                curveTo(8.914f, 15.061f, 8.942f, 15.535f, 9.252f, 15.811f)
                lineTo(11.502f, 17.811f)
                curveTo(11.506f, 17.814f, 11.51f, 17.818f, 11.514f, 17.821f)
                curveTo(11.638f, 17.927f, 11.797f, 17.993f, 11.971f, 18f)
                curveTo(11.99f, 18f, 12.008f, 18f, 12.027f, 18f)
                curveTo(12.209f, 17.993f, 12.374f, 17.922f, 12.501f, 17.808f)
                lineTo(14.748f, 15.811f)
                curveTo(15.058f, 15.535f, 15.086f, 15.061f, 14.811f, 14.752f)
                curveTo(14.535f, 14.442f, 14.061f, 14.414f, 13.752f, 14.689f)
                lineTo(12.75f, 15.58f)
                close()
            }
        }.build()

        return _TableResizeRow!!
    }

@Suppress("ObjectPropertyName")
private var _TableResizeRow: ImageVector? = null

@Preview
@Composable
private fun TableResizeRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableResizeRow, contentDescription = null)
    }
}
