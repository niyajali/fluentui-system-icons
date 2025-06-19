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

public val FluentIcons.Filled.TableInsertRow: ImageVector
    get() {
        if (_TableInsertRow != null) {
            return _TableInsertRow!!
        }
        _TableInsertRow = ImageVector.Builder(
            name = "Filled.TableInsertRow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 4.5f)
                lineTo(3.75f, 4.5f)
                curveTo(3.336f, 4.5f, 3f, 4.164f, 3f, 3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
                curveTo(21f, 4.164f, 20.664f, 4.5f, 20.25f, 4.5f)
                close()
                moveTo(8f, 8f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 8f, 3f, 8.895f, 3f, 10f)
                verticalLineTo(14f)
                curveTo(3f, 15.105f, 4.007f, 16f, 5.25f, 16f)
                horizontalLineTo(8f)
                lineTo(8f, 8f)
                close()
                moveTo(9.5f, 16f)
                horizontalLineTo(14.5f)
                lineTo(14.5f, 8f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 16f)
                close()
                moveTo(18.75f, 16f)
                horizontalLineTo(16f)
                lineTo(16f, 8f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 8f, 21f, 8.895f, 21f, 10f)
                verticalLineTo(14f)
                curveTo(21f, 15.105f, 19.993f, 16f, 18.75f, 16f)
                close()
                moveTo(3.75f, 21f)
                lineTo(20.25f, 21f)
                curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
                curveTo(21f, 19.836f, 20.664f, 19.5f, 20.25f, 19.5f)
                lineTo(3.75f, 19.5f)
                curveTo(3.336f, 19.5f, 3f, 19.836f, 3f, 20.25f)
                curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
                close()
            }
        }.build()

        return _TableInsertRow!!
    }

@Suppress("ObjectPropertyName")
private var _TableInsertRow: ImageVector? = null

@Preview
@Composable
private fun TableInsertRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableInsertRow, contentDescription = null)
    }
}
