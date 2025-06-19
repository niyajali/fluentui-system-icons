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

public val FluentIcons.Filled.LiveOff: ImageVector
    get() {
        if (_LiveOff != null) {
            return _LiveOff!!
        }
        _LiveOff = ImageVector.Builder(
            name = "Filled.LiveOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.281f, 2.22f)
                curveTo(2.988f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(4.423f, 5.483f)
                curveTo(1.03f, 9.413f, 1.199f, 15.355f, 4.929f, 19.084f)
                curveTo(5.319f, 19.475f, 5.952f, 19.475f, 6.343f, 19.084f)
                curveTo(6.733f, 18.694f, 6.733f, 18.061f, 6.343f, 17.67f)
                curveTo(3.395f, 14.722f, 3.228f, 10.046f, 5.842f, 6.902f)
                lineTo(7.362f, 8.423f)
                curveTo(5.6f, 10.743f, 5.777f, 14.067f, 7.895f, 16.185f)
                curveTo(8.286f, 16.575f, 8.919f, 16.575f, 9.31f, 16.185f)
                curveTo(9.7f, 15.794f, 9.7f, 15.161f, 9.31f, 14.77f)
                curveTo(7.975f, 13.436f, 7.804f, 11.377f, 8.797f, 9.857f)
                lineTo(10.632f, 11.693f)
                curveTo(10.599f, 11.817f, 10.582f, 11.947f, 10.582f, 12.082f)
                curveTo(10.582f, 12.91f, 11.253f, 13.582f, 12.082f, 13.582f)
                curveTo(12.216f, 13.582f, 12.346f, 13.564f, 12.47f, 13.531f)
                lineTo(20.72f, 21.781f)
                curveTo(21.013f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.281f, 2.22f)
                close()
                moveTo(19.028f, 15.846f)
                lineTo(20.49f, 17.308f)
                curveTo(22.904f, 13.446f, 22.432f, 8.296f, 19.074f, 4.939f)
                curveTo(18.684f, 4.548f, 18.051f, 4.548f, 17.66f, 4.939f)
                curveTo(17.27f, 5.329f, 17.27f, 5.962f, 17.66f, 6.353f)
                curveTo(20.231f, 8.924f, 20.687f, 12.809f, 19.028f, 15.846f)
                close()
                moveTo(15.93f, 12.748f)
                lineTo(17.521f, 14.339f)
                curveTo(18.45f, 12.178f, 18.033f, 9.577f, 16.268f, 7.812f)
                curveTo(15.877f, 7.422f, 15.244f, 7.422f, 14.854f, 7.812f)
                curveTo(14.463f, 8.203f, 14.463f, 8.836f, 14.854f, 9.226f)
                curveTo(15.811f, 10.183f, 16.17f, 11.512f, 15.93f, 12.748f)
                close()
            }
        }.build()

        return _LiveOff!!
    }

@Suppress("ObjectPropertyName")
private var _LiveOff: ImageVector? = null

@Preview
@Composable
private fun LiveOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LiveOff, contentDescription = null)
    }
}
