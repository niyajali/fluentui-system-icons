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

public val FluentIcons.Filled.TableStackRight: ImageVector
    get() {
        if (_TableStackRight != null) {
            return _TableStackRight!!
        }
        _TableStackRight = ImageVector.Builder(
            name = "Filled.TableStackRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(8f)
                lineTo(8f, 8f)
                lineTo(8f, 3f)
                close()
                moveTo(8f, 9.5f)
                lineTo(3f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                lineTo(8f, 9.5f)
                close()
                moveTo(9.5f, 14.5f)
                lineTo(9.5f, 9.5f)
                lineTo(14.5f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(8f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(8f)
                lineTo(8f, 16f)
                close()
                moveTo(9.5f, 21f)
                lineTo(9.5f, 16f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.25f)
                curveTo(14.5f, 20.449f, 14.421f, 20.64f, 14.28f, 20.78f)
                curveTo(14.14f, 20.921f, 13.949f, 21f, 13.75f, 21f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9.5f, 8f)
                lineTo(9.5f, 3f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3f, 14.5f, 3.336f, 14.5f, 3.75f)
                verticalLineTo(8f)
                lineTo(9.5f, 8f)
                close()
                moveTo(19.5f, 20.25f)
                curveTo(19.5f, 20.664f, 19.836f, 21f, 20.25f, 21f)
                curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                curveTo(19.836f, 3f, 19.5f, 3.336f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                close()
            }
        }.build()

        return _TableStackRight!!
    }

@Suppress("ObjectPropertyName")
private var _TableStackRight: ImageVector? = null

@Preview
@Composable
private fun TableStackRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableStackRight, contentDescription = null)
    }
}
