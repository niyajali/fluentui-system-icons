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

public val FluentIcons.Filled.DataBarHorizontal: ImageVector
    get() {
        if (_DataBarHorizontal != null) {
            return _DataBarHorizontal!!
        }
        _DataBarHorizontal = ImageVector.Builder(
            name = "Filled.DataBarHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 18.251f)
                curveTo(21f, 17.009f, 19.993f, 16.002f, 18.751f, 16.002f)
                horizontalLineTo(5.249f)
                curveTo(4.007f, 16.002f, 3f, 17.009f, 3f, 18.251f)
                curveTo(3f, 19.493f, 4.007f, 20.5f, 5.249f, 20.5f)
                horizontalLineTo(18.751f)
                curveTo(19.993f, 20.5f, 21f, 19.493f, 21f, 18.251f)
                close()
                moveTo(17f, 11.751f)
                curveTo(17f, 10.509f, 15.993f, 9.502f, 14.751f, 9.502f)
                lineTo(5.249f, 9.502f)
                curveTo(4.007f, 9.502f, 3f, 10.509f, 3f, 11.751f)
                curveTo(3f, 12.993f, 4.007f, 14f, 5.249f, 14f)
                horizontalLineTo(14.751f)
                curveTo(15.993f, 14f, 17f, 12.993f, 17f, 11.751f)
                close()
                moveTo(13f, 5.251f)
                curveTo(13f, 4.009f, 11.993f, 3.002f, 10.751f, 3.002f)
                lineTo(5.249f, 3.002f)
                curveTo(4.007f, 3.002f, 3f, 4.009f, 3f, 5.251f)
                curveTo(3f, 6.493f, 4.007f, 7.5f, 5.249f, 7.5f)
                lineTo(10.751f, 7.5f)
                curveTo(11.993f, 7.5f, 13f, 6.493f, 13f, 5.251f)
                close()
            }
        }.build()

        return _DataBarHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _DataBarHorizontal: ImageVector? = null

@Preview
@Composable
private fun DataBarHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataBarHorizontal, contentDescription = null)
    }
}
