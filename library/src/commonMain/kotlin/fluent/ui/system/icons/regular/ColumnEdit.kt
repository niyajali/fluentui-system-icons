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

public val FluentIcons.Regular.ColumnEdit: ImageVector
    get() {
        if (_ColumnEdit != null) {
            return _ColumnEdit!!
        }
        _ColumnEdit = ImageVector.Builder(
            name = "Regular.ColumnEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.25f, 3f)
                curveTo(2.836f, 3f, 2.5f, 3.336f, 2.5f, 3.75f)
                curveTo(2.5f, 4.164f, 2.836f, 4.5f, 3.25f, 4.5f)
                horizontalLineTo(3.75f)
                curveTo(4.44f, 4.5f, 5f, 5.06f, 5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5f, 18.94f, 4.44f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(3.25f)
                curveTo(2.836f, 19.5f, 2.5f, 19.836f, 2.5f, 20.25f)
                curveTo(2.5f, 20.664f, 2.836f, 21f, 3.25f, 21f)
                horizontalLineTo(3.75f)
                curveTo(5.269f, 21f, 6.5f, 19.769f, 6.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(6.5f, 4.231f, 5.269f, 3f, 3.75f, 3f)
                horizontalLineTo(3.25f)
                close()
                moveTo(10.75f, 3f)
                curveTo(9.231f, 3f, 8f, 4.231f, 8f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(8f, 19.769f, 9.231f, 21f, 10.75f, 21f)
                horizontalLineTo(11.165f)
                lineTo(11.521f, 19.577f)
                curveTo(11.527f, 19.551f, 11.534f, 19.525f, 11.541f, 19.5f)
                horizontalLineTo(10.75f)
                curveTo(10.06f, 19.5f, 9.5f, 18.94f, 9.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(9.5f, 5.06f, 10.06f, 4.5f, 10.75f, 4.5f)
                horizontalLineTo(13.25f)
                curveTo(13.94f, 4.5f, 14.5f, 5.06f, 14.5f, 5.75f)
                verticalLineTo(15.855f)
                lineTo(16f, 14.355f)
                verticalLineTo(5.75f)
                curveTo(16f, 4.231f, 14.769f, 3f, 13.25f, 3f)
                horizontalLineTo(10.75f)
                close()
                moveTo(19f, 11.483f)
                curveTo(18.784f, 11.615f, 18.58f, 11.775f, 18.393f, 11.962f)
                lineTo(17.5f, 12.855f)
                verticalLineTo(5.75f)
                curveTo(17.5f, 4.231f, 18.731f, 3f, 20.25f, 3f)
                horizontalLineTo(20.75f)
                curveTo(21.164f, 3f, 21.5f, 3.336f, 21.5f, 3.75f)
                curveTo(21.5f, 4.164f, 21.164f, 4.5f, 20.75f, 4.5f)
                horizontalLineTo(20.25f)
                curveTo(19.56f, 4.5f, 19f, 5.06f, 19f, 5.75f)
                verticalLineTo(11.483f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
                curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _ColumnEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ColumnEdit: ImageVector? = null

@Preview
@Composable
private fun ColumnEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ColumnEdit, contentDescription = null)
    }
}
