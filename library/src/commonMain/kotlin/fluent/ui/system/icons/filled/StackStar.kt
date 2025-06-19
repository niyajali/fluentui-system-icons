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

public val FluentIcons.Filled.StackStar: ImageVector
    get() {
        if (_StackStar != null) {
            return _StackStar!!
        }
        _StackStar = ImageVector.Builder(
            name = "Filled.StackStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4f)
                curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
                verticalLineTo(13f)
                curveTo(2f, 14.105f, 2.895f, 15f, 4f, 15f)
                horizontalLineTo(15f)
                curveTo(16.105f, 15f, 17f, 14.105f, 17f, 13f)
                verticalLineTo(6f)
                curveTo(17f, 4.895f, 16.105f, 4f, 15f, 4f)
                horizontalLineTo(4f)
                close()
                moveTo(9.5f, 6.1f)
                curveTo(9.689f, 6.1f, 9.863f, 6.207f, 9.947f, 6.376f)
                lineTo(10.828f, 8.137f)
                lineTo(12.562f, 8.354f)
                curveTo(12.76f, 8.379f, 12.924f, 8.518f, 12.98f, 8.709f)
                curveTo(13.036f, 8.9f, 12.973f, 9.107f, 12.82f, 9.234f)
                lineTo(11.554f, 10.289f)
                lineTo(11.988f, 12.241f)
                curveTo(12.032f, 12.438f, 11.953f, 12.642f, 11.789f, 12.758f)
                curveTo(11.624f, 12.875f, 11.406f, 12.881f, 11.235f, 12.774f)
                lineTo(9.5f, 11.69f)
                lineTo(7.765f, 12.774f)
                curveTo(7.594f, 12.881f, 7.376f, 12.875f, 7.211f, 12.758f)
                curveTo(7.047f, 12.642f, 6.968f, 12.438f, 7.012f, 12.241f)
                lineTo(7.446f, 10.289f)
                lineTo(6.18f, 9.234f)
                curveTo(6.027f, 9.107f, 5.964f, 8.9f, 6.02f, 8.709f)
                curveTo(6.076f, 8.518f, 6.24f, 8.379f, 6.438f, 8.354f)
                lineTo(8.172f, 8.137f)
                lineTo(9.053f, 6.376f)
                curveTo(9.137f, 6.207f, 9.311f, 6.1f, 9.5f, 6.1f)
                close()
                moveTo(6.5f, 17.5f)
                curveTo(5.568f, 17.5f, 4.785f, 16.863f, 4.563f, 16f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 16f, 18f, 14.881f, 18f, 13.5f)
                verticalLineTo(6.563f)
                curveTo(18.863f, 6.785f, 19.5f, 7.568f, 19.5f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(19.5f, 15.709f, 17.709f, 17.5f, 15.5f, 17.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(9f, 20f)
                curveTo(8.068f, 20f, 7.285f, 19.363f, 7.063f, 18.5f)
                horizontalLineTo(16.25f)
                curveTo(18.597f, 18.5f, 20.5f, 16.597f, 20.5f, 14.25f)
                verticalLineTo(9.063f)
                curveTo(21.363f, 9.285f, 22f, 10.068f, 22f, 11f)
                verticalLineTo(14.25f)
                curveTo(22f, 17.426f, 19.426f, 20f, 16.25f, 20f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _StackStar!!
    }

@Suppress("ObjectPropertyName")
private var _StackStar: ImageVector? = null

@Preview
@Composable
private fun StackStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StackStar, contentDescription = null)
    }
}
