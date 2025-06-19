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

public val FluentIcons.Filled.DocumentArrowRight: ImageVector
    get() {
        if (_DocumentArrowRight != null) {
            return _DocumentArrowRight!!
        }
        _DocumentArrowRight = ImageVector.Builder(
            name = "Filled.DocumentArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(11.19f)
                curveTo(12.311f, 20.832f, 13f, 19.247f, 13f, 17.5f)
                curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
                curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
                verticalLineTo(4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(3.5f, 17f)
                curveTo(3.224f, 17f, 3f, 17.224f, 3f, 17.5f)
                curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
                horizontalLineTo(8.293f)
                lineTo(6.646f, 19.646f)
                curveTo(6.451f, 19.842f, 6.451f, 20.158f, 6.646f, 20.354f)
                curveTo(6.842f, 20.549f, 7.158f, 20.549f, 7.354f, 20.354f)
                lineTo(9.854f, 17.854f)
                curveTo(10.049f, 17.658f, 10.049f, 17.342f, 9.854f, 17.146f)
                lineTo(7.354f, 14.646f)
                curveTo(7.158f, 14.451f, 6.842f, 14.451f, 6.646f, 14.646f)
                curveTo(6.451f, 14.842f, 6.451f, 15.158f, 6.646f, 15.354f)
                lineTo(8.293f, 17f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()

        return _DocumentArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentArrowRight: ImageVector? = null

@Preview
@Composable
private fun DocumentArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentArrowRight, contentDescription = null)
    }
}
