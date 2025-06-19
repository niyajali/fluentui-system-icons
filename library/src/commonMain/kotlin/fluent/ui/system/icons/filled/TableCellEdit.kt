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

public val FluentIcons.Filled.TableCellEdit: ImageVector
    get() {
        if (_TableCellEdit != null) {
            return _TableCellEdit!!
        }
        _TableCellEdit = ImageVector.Builder(
            name = "Filled.TableCellEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 6.5f)
                curveTo(4.007f, 6.5f, 3f, 7.507f, 3f, 8.75f)
                verticalLineTo(13.25f)
                curveTo(3f, 14.493f, 4.007f, 15.5f, 5.25f, 15.5f)
                horizontalLineTo(8f)
                lineTo(8f, 6.5f)
                horizontalLineTo(5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.488f, 14.865f)
                curveTo(12.295f, 15.058f, 12.125f, 15.271f, 11.98f, 15.5f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 6.5f)
                horizontalLineTo(14.5f)
                lineTo(14.5f, 12.853f)
                lineTo(12.488f, 14.865f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.715f, 8f)
                curveTo(20.768f, 8f, 20.821f, 8.001f, 20.873f, 8.004f)
                curveTo(20.566f, 7.128f, 19.731f, 6.5f, 18.75f, 6.5f)
                horizontalLineTo(16f)
                lineTo(16f, 11.353f)
                lineTo(18.391f, 8.962f)
                curveTo(19.032f, 8.321f, 19.874f, 8f, 20.713f, 8f)
                horizontalLineTo(20.715f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.715f, 9f)
                horizontalLineTo(20.713f)
                curveTo(20.128f, 9f, 19.544f, 9.223f, 19.098f, 9.669f)
                lineTo(13.196f, 15.572f)
                curveTo(12.851f, 15.916f, 12.607f, 16.347f, 12.489f, 16.819f)
                lineTo(12.031f, 18.65f)
                curveTo(11.833f, 19.446f, 12.554f, 20.167f, 13.35f, 19.968f)
                lineTo(15.18f, 19.511f)
                curveTo(15.653f, 19.393f, 16.084f, 19.149f, 16.428f, 18.804f)
                lineTo(22.33f, 12.902f)
                curveTo(23.223f, 12.009f, 23.223f, 10.562f, 22.33f, 9.669f)
                curveTo(21.884f, 9.223f, 21.3f, 9f, 20.715f, 9f)
                close()
            }
        }.build()

        return _TableCellEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TableCellEdit: ImageVector? = null

@Preview
@Composable
private fun TableCellEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableCellEdit, contentDescription = null)
    }
}
