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

public val FluentIcons.Regular.LocationCheckmark: ImageVector
    get() {
        if (_LocationCheckmark != null) {
            return _LocationCheckmark!!
        }
        _LocationCheckmark = ImageVector.Builder(
            name = "Regular.LocationCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.22f, 7.97f)
                lineTo(10.75f, 12.439f)
                lineTo(8.78f, 10.47f)
                lineTo(8.696f, 10.397f)
                curveTo(8.403f, 10.179f, 7.986f, 10.203f, 7.72f, 10.47f)
                curveTo(7.427f, 10.763f, 7.427f, 11.237f, 7.72f, 11.53f)
                lineTo(10.22f, 14.03f)
                lineTo(10.304f, 14.103f)
                curveTo(10.597f, 14.321f, 11.014f, 14.297f, 11.28f, 14.03f)
                lineTo(16.28f, 9.03f)
                lineTo(16.353f, 8.946f)
                curveTo(16.571f, 8.653f, 16.547f, 8.236f, 16.28f, 7.97f)
                curveTo(15.987f, 7.677f, 15.513f, 7.677f, 15.22f, 7.97f)
                close()
                moveTo(18.157f, 4.568f)
                curveTo(14.757f, 1.168f, 9.244f, 1.168f, 5.843f, 4.568f)
                curveTo(2.443f, 7.969f, 2.443f, 13.482f, 5.843f, 16.882f)
                curveTo(6.139f, 17.178f, 6.506f, 17.541f, 6.945f, 17.972f)
                lineTo(10.436f, 21.368f)
                curveTo(11.308f, 22.212f, 12.692f, 22.212f, 13.564f, 21.368f)
                curveTo(14.96f, 20.019f, 16.095f, 18.915f, 16.97f, 18.056f)
                lineTo(18.157f, 16.882f)
                curveTo(21.558f, 13.482f, 21.558f, 7.969f, 18.157f, 4.568f)
                close()
                moveTo(6.904f, 5.629f)
                curveTo(9.719f, 2.814f, 14.282f, 2.814f, 17.097f, 5.629f)
                curveTo(19.911f, 8.444f, 19.911f, 13.007f, 17.097f, 15.822f)
                curveTo(16.779f, 16.139f, 16.386f, 16.528f, 15.917f, 16.989f)
                lineTo(12.522f, 20.29f)
                curveTo(12.231f, 20.571f, 11.77f, 20.571f, 11.479f, 20.29f)
                curveTo(10.239f, 19.091f, 9.21f, 18.09f, 8.391f, 17.289f)
                lineTo(6.904f, 15.822f)
                curveTo(4.089f, 13.007f, 4.089f, 8.444f, 6.904f, 5.629f)
                close()
            }
        }.build()

        return _LocationCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCheckmark: ImageVector? = null

@Preview
@Composable
private fun LocationCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationCheckmark, contentDescription = null)
    }
}
