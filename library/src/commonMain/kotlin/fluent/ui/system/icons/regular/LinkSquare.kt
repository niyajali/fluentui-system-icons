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

public val FluentIcons.Regular.LinkSquare: ImageVector
    get() {
        if (_LinkSquare != null) {
            return _LinkSquare!!
        }
        _LinkSquare = ImageVector.Builder(
            name = "Regular.LinkSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(12.25f)
                curveTo(3f, 14.045f, 4.455f, 15.5f, 6.25f, 15.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(14f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 14f, 4.5f, 13.217f, 4.5f, 12.25f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(12.25f)
                curveTo(13.217f, 4.5f, 14f, 5.284f, 14f, 6.25f)
                verticalLineTo(12.25f)
                curveTo(14f, 13.217f, 13.217f, 14f, 12.25f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(15.5f)
                horizontalLineTo(12.25f)
                curveTo(14.045f, 15.5f, 15.5f, 14.045f, 15.5f, 12.25f)
                verticalLineTo(6.25f)
                curveTo(15.5f, 4.455f, 14.045f, 3f, 12.25f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(10f, 11.75f)
                curveTo(10f, 10.783f, 10.783f, 10f, 11.75f, 10f)
                horizontalLineTo(12.998f)
                verticalLineTo(8.5f)
                horizontalLineTo(11.75f)
                curveTo(9.955f, 8.5f, 8.5f, 9.955f, 8.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(8.5f, 19.545f, 9.955f, 21f, 11.75f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(11.75f)
                curveTo(21f, 9.955f, 19.545f, 8.5f, 17.75f, 8.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 10f, 19.5f, 10.783f, 19.5f, 11.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(11.75f)
                curveTo(10.783f, 19.5f, 10f, 18.716f, 10f, 17.75f)
                verticalLineTo(11.75f)
                close()
            }
        }.build()

        return _LinkSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSquare: ImageVector? = null

@Preview
@Composable
private fun LinkSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LinkSquare, contentDescription = null)
    }
}
