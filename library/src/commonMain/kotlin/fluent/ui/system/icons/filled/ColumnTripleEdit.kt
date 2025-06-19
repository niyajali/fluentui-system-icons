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

public val FluentIcons.Filled.ColumnTripleEdit: ImageVector
    get() {
        if (_ColumnTripleEdit != null) {
            return _ColumnTripleEdit!!
        }
        _ColumnTripleEdit = ImageVector.Builder(
            name = "Filled.ColumnTripleEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 18.5f)
                curveTo(2f, 19.881f, 3.119f, 21f, 4.5f, 21f)
                horizontalLineTo(5.5f)
                curveTo(6.881f, 21f, 8f, 19.881f, 8f, 18.5f)
                lineTo(8f, 5.5f)
                curveTo(8f, 4.119f, 6.881f, 3f, 5.5f, 3f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 3f, 2f, 4.119f, 2f, 5.5f)
                verticalLineTo(18.5f)
                close()
                moveTo(9f, 18.5f)
                curveTo(9f, 19.769f, 9.946f, 20.817f, 11.17f, 20.979f)
                lineTo(11.521f, 19.577f)
                curveTo(11.683f, 18.929f, 12.018f, 18.337f, 12.49f, 17.865f)
                lineTo(15f, 15.355f)
                verticalLineTo(5.5f)
                curveTo(15f, 4.119f, 13.881f, 3f, 12.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(10.119f, 3f, 9f, 4.119f, 9f, 5.5f)
                lineTo(9f, 18.5f)
                close()
                moveTo(19.5f, 21f)
                horizontalLineTo(18.648f)
                lineTo(22f, 17.648f)
                verticalLineTo(18.5f)
                curveTo(22f, 19.881f, 20.881f, 21f, 19.5f, 21f)
                close()
                moveTo(22f, 5.5f)
                verticalLineTo(11.26f)
                curveTo(20.804f, 10.753f, 19.368f, 10.987f, 18.393f, 11.962f)
                lineTo(16f, 14.355f)
                lineTo(16f, 5.5f)
                curveTo(16f, 4.119f, 17.119f, 3f, 18.5f, 3f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 3f, 22f, 4.119f, 22f, 5.5f)
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

        return _ColumnTripleEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ColumnTripleEdit: ImageVector? = null

@Preview
@Composable
private fun ColumnTripleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ColumnTripleEdit, contentDescription = null)
    }
}
