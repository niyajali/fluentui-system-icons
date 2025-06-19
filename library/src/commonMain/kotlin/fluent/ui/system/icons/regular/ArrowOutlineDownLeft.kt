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

public val FluentIcons.Regular.ArrowOutlineDownLeft: ImageVector
    get() {
        if (_ArrowOutlineDownLeft != null) {
            return _ArrowOutlineDownLeft!!
        }
        _ArrowOutlineDownLeft = ImageVector.Builder(
            name = "Regular.ArrowOutlineDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.503f, 19.998f)
                curveTo(3.471f, 20.285f, 3.713f, 20.527f, 4f, 20.495f)
                lineTo(16.062f, 19.155f)
                curveTo(16.437f, 19.114f, 16.597f, 18.657f, 16.33f, 18.39f)
                lineTo(14.532f, 16.592f)
                curveTo(14.24f, 16.299f, 14.24f, 15.824f, 14.532f, 15.531f)
                lineTo(20.366f, 9.697f)
                curveTo(20.542f, 9.522f, 20.542f, 9.237f, 20.366f, 9.061f)
                lineTo(14.937f, 3.632f)
                curveTo(14.762f, 3.456f, 14.477f, 3.456f, 14.301f, 3.632f)
                lineTo(8.467f, 9.466f)
                curveTo(8.174f, 9.759f, 7.699f, 9.759f, 7.406f, 9.466f)
                lineTo(5.609f, 7.668f)
                curveTo(5.342f, 7.402f, 4.885f, 7.562f, 4.843f, 7.937f)
                lineTo(3.503f, 19.998f)
                close()
                moveTo(4.166f, 21.986f)
                curveTo(2.924f, 22.124f, 1.874f, 21.075f, 2.012f, 19.833f)
                lineTo(3.352f, 7.771f)
                curveTo(3.533f, 6.146f, 5.513f, 5.451f, 6.669f, 6.608f)
                lineTo(7.937f, 7.875f)
                lineTo(13.24f, 2.571f)
                curveTo(14.002f, 1.81f, 15.236f, 1.81f, 15.998f, 2.571f)
                lineTo(21.427f, 8f)
                curveTo(22.188f, 8.762f, 22.188f, 9.996f, 21.427f, 10.758f)
                lineTo(16.123f, 16.062f)
                lineTo(17.391f, 17.329f)
                curveTo(18.547f, 18.485f, 17.852f, 20.465f, 16.227f, 20.646f)
                lineTo(4.166f, 21.986f)
                close()
            }
        }.build()

        return _ArrowOutlineDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOutlineDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowOutlineDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowOutlineDownLeft, contentDescription = null)
    }
}
