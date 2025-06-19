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

public val FluentIcons.Filled.CloudCheckmark: ImageVector
    get() {
        if (_CloudCheckmark != null) {
            return _CloudCheckmark!!
        }
        _CloudCheckmark = ImageVector.Builder(
            name = "Filled.CloudCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 12.666f, 21.991f, 12.831f, 21.973f, 12.993f)
                curveTo(20.817f, 11.193f, 18.798f, 10f, 16.5f, 10f)
                curveTo(12.91f, 10f, 10f, 12.91f, 10f, 16.5f)
                curveTo(10f, 16.668f, 10.006f, 16.835f, 10.019f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                close()
                moveTo(22f, 16.5f)
                curveTo(22f, 19.538f, 19.538f, 22f, 16.5f, 22f)
                curveTo(13.462f, 22f, 11f, 19.538f, 11f, 16.5f)
                curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
                curveTo(19.538f, 11f, 22f, 13.462f, 22f, 16.5f)
                close()
                moveTo(19.854f, 14.146f)
                curveTo(19.658f, 13.951f, 19.342f, 13.951f, 19.146f, 14.146f)
                lineTo(15.5f, 17.793f)
                lineTo(13.854f, 16.146f)
                curveTo(13.658f, 15.951f, 13.342f, 15.951f, 13.146f, 16.146f)
                curveTo(12.951f, 16.342f, 12.951f, 16.658f, 13.146f, 16.854f)
                lineTo(15.146f, 18.854f)
                curveTo(15.342f, 19.049f, 15.658f, 19.049f, 15.854f, 18.854f)
                lineTo(19.854f, 14.854f)
                curveTo(20.049f, 14.658f, 20.049f, 14.342f, 19.854f, 14.146f)
                close()
            }
        }.build()

        return _CloudCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCheckmark: ImageVector? = null

@Preview
@Composable
private fun CloudCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CloudCheckmark, contentDescription = null)
    }
}
