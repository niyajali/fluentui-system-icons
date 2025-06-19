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

public val FluentIcons.Filled.LocationCheckmark: ImageVector
    get() {
        if (_LocationCheckmark != null) {
            return _LocationCheckmark!!
        }
        _LocationCheckmark = ImageVector.Builder(
            name = "Filled.LocationCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.966f, 18.047f)
                lineTo(18.153f, 16.873f)
                curveTo(21.554f, 13.473f, 21.554f, 7.96f, 18.153f, 4.559f)
                curveTo(14.753f, 1.159f, 9.24f, 1.159f, 5.839f, 4.559f)
                curveTo(2.439f, 7.96f, 2.439f, 13.473f, 5.839f, 16.873f)
                curveTo(6.135f, 17.169f, 6.502f, 17.532f, 6.941f, 17.963f)
                lineTo(10.432f, 21.359f)
                curveTo(11.304f, 22.202f, 12.688f, 22.202f, 13.561f, 21.359f)
                curveTo(14.956f, 20.01f, 16.091f, 18.906f, 16.966f, 18.047f)
                close()
                moveTo(15.22f, 7.961f)
                curveTo(15.513f, 7.668f, 15.987f, 7.668f, 16.28f, 7.961f)
                curveTo(16.547f, 8.227f, 16.571f, 8.644f, 16.353f, 8.937f)
                lineTo(16.28f, 9.022f)
                lineTo(11.28f, 14.021f)
                curveTo(11.014f, 14.288f, 10.597f, 14.312f, 10.304f, 14.094f)
                lineTo(10.22f, 14.021f)
                lineTo(7.72f, 11.521f)
                curveTo(7.427f, 11.229f, 7.427f, 10.754f, 7.72f, 10.461f)
                curveTo(7.986f, 10.195f, 8.403f, 10.17f, 8.696f, 10.388f)
                lineTo(8.78f, 10.461f)
                lineTo(10.75f, 12.431f)
                lineTo(15.22f, 7.961f)
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
        Image(imageVector = FluentIcons.Filled.LocationCheckmark, contentDescription = null)
    }
}
