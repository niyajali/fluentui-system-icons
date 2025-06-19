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

public val FluentIcons.Filled.TableInsertColumn: ImageVector
    get() {
        if (_TableInsertColumn != null) {
            return _TableInsertColumn!!
        }
        _TableInsertColumn = ImageVector.Builder(
            name = "Filled.TableInsertColumn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 3.75f)
                lineTo(4.5f, 20.25f)
                curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
                curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
                close()
                moveTo(16f, 5.25f)
                curveTo(16f, 4.007f, 15.105f, 3f, 14f, 3f)
                horizontalLineTo(10f)
                curveTo(8.895f, 3f, 8f, 4.007f, 8f, 5.25f)
                verticalLineTo(8f)
                lineTo(16f, 8f)
                verticalLineTo(5.25f)
                close()
                moveTo(8f, 14.5f)
                verticalLineTo(9.5f)
                lineTo(16f, 9.5f)
                verticalLineTo(14.5f)
                lineTo(8f, 14.5f)
                close()
                moveTo(8f, 16f)
                verticalLineTo(18.75f)
                curveTo(8f, 19.993f, 8.895f, 21f, 10f, 21f)
                horizontalLineTo(14f)
                curveTo(15.105f, 21f, 16f, 19.993f, 16f, 18.75f)
                verticalLineTo(16f)
                lineTo(8f, 16f)
                close()
                moveTo(21f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                curveTo(19.836f, 3f, 19.5f, 3.336f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19.5f, 20.664f, 19.836f, 21f, 20.25f, 21f)
                curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
                close()
            }
        }.build()

        return _TableInsertColumn!!
    }

@Suppress("ObjectPropertyName")
private var _TableInsertColumn: ImageVector? = null

@Preview
@Composable
private fun TableInsertColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableInsertColumn, contentDescription = null)
    }
}
