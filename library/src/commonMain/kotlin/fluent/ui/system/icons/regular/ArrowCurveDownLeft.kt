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

public val FluentIcons.Regular.ArrowCurveDownLeft: ImageVector
    get() {
        if (_ArrowCurveDownLeft != null) {
            return _ArrowCurveDownLeft!!
        }
        _ArrowCurveDownLeft = ImageVector.Builder(
            name = "Regular.ArrowCurveDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.401f, 3.378f)
                curveTo(16.196f, 3.018f, 15.738f, 2.893f, 15.378f, 3.099f)
                curveTo(13.109f, 4.395f, 11.987f, 6.052f, 11.457f, 7.809f)
                curveTo(10.989f, 9.361f, 10.994f, 10.974f, 10.999f, 12.351f)
                curveTo(11f, 12.487f, 11f, 12.62f, 11f, 12.75f)
                verticalLineTo(18.439f)
                lineTo(7.28f, 14.72f)
                curveTo(6.987f, 14.427f, 6.513f, 14.427f, 6.22f, 14.72f)
                curveTo(5.927f, 15.013f, 5.927f, 15.488f, 6.22f, 15.78f)
                lineTo(11.22f, 20.78f)
                curveTo(11.513f, 21.073f, 11.987f, 21.073f, 12.28f, 20.78f)
                lineTo(17.28f, 15.78f)
                curveTo(17.573f, 15.488f, 17.573f, 15.013f, 17.28f, 14.72f)
                curveTo(16.987f, 14.427f, 16.513f, 14.427f, 16.22f, 14.72f)
                lineTo(12.5f, 18.439f)
                verticalLineTo(12.75f)
                curveTo(12.5f, 12.623f, 12.5f, 12.497f, 12.499f, 12.37f)
                curveTo(12.496f, 10.959f, 12.493f, 9.568f, 12.893f, 8.242f)
                curveTo(13.313f, 6.848f, 14.191f, 5.505f, 16.122f, 4.401f)
                curveTo(16.482f, 4.196f, 16.607f, 3.738f, 16.401f, 3.378f)
                close()
            }
        }.build()

        return _ArrowCurveDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCurveDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowCurveDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCurveDownLeft, contentDescription = null)
    }
}
