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

public val FluentIcons.Filled.ExpandUpLeft: ImageVector
    get() {
        if (_ExpandUpLeft != null) {
            return _ExpandUpLeft!!
        }
        _ExpandUpLeft = ImageVector.Builder(
            name = "Filled.ExpandUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 3.75f)
                curveTo(11f, 3.336f, 10.664f, 3f, 10.25f, 3f)
                horizontalLineTo(3.75f)
                curveTo(3.335f, 3f, 3f, 3.336f, 3f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(3f, 10.664f, 3.335f, 11f, 3.75f, 11f)
                curveTo(4.164f, 11f, 4.5f, 10.664f, 4.5f, 10.25f)
                verticalLineTo(5.561f)
                lineTo(9.72f, 10.78f)
                curveTo(10.013f, 11.073f, 10.487f, 11.073f, 10.78f, 10.78f)
                curveTo(11.073f, 10.487f, 11.073f, 10.012f, 10.78f, 9.72f)
                lineTo(5.56f, 4.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 4.5f, 11f, 4.164f, 11f, 3.75f)
                close()
                moveTo(17.75f, 4.5f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(12f)
                horizontalLineTo(14.75f)
                curveTo(13.231f, 12f, 12f, 13.231f, 12f, 14.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.283f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(4.5f, 13.336f, 4.164f, 13f, 3.75f, 13f)
                curveTo(3.336f, 13f, 3f, 13.336f, 3f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                lineTo(17.25f, 21f)
                lineTo(17.284f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 3f, 13f, 3.336f, 13f, 3.75f)
                curveTo(13f, 4.164f, 13.336f, 4.5f, 13.75f, 4.5f)
                horizontalLineTo(17.75f)
                close()
            }
        }.build()

        return _ExpandUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ExpandUpLeft: ImageVector? = null

@Preview
@Composable
private fun ExpandUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ExpandUpLeft, contentDescription = null)
    }
}
