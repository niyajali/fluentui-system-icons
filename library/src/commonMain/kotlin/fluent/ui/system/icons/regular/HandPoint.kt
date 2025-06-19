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

public val FluentIcons.Regular.HandPoint: ImageVector
    get() {
        if (_HandPoint != null) {
            return _HandPoint!!
        }
        _HandPoint = ImageVector.Builder(
            name = "Regular.HandPoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.5f, 3.5f)
                curveTo(10.948f, 3.5f, 10.5f, 3.948f, 10.5f, 4.5f)
                verticalLineTo(12.002f)
                curveTo(10.5f, 12.249f, 10.378f, 12.48f, 10.175f, 12.62f)
                curveTo(9.971f, 12.76f, 9.711f, 12.791f, 9.481f, 12.702f)
                lineTo(6.967f, 11.736f)
                curveTo(5.787f, 11.282f, 4.471f, 11.666f, 3.713f, 12.631f)
                curveTo(9.201f, 15.092f, 11.27f, 17.441f, 12.19f, 19.464f)
                curveTo(12.52f, 20.189f, 13.167f, 20.577f, 13.768f, 20.484f)
                lineTo(17.224f, 19.952f)
                curveTo(17.722f, 19.875f, 18.125f, 19.507f, 18.246f, 19.018f)
                lineTo(19.399f, 14.385f)
                curveTo(19.86f, 12.534f, 18.634f, 10.686f, 16.75f, 10.39f)
                lineTo(13.133f, 9.821f)
                curveTo(12.769f, 9.764f, 12.5f, 9.45f, 12.5f, 9.08f)
                verticalLineTo(4.5f)
                curveTo(12.5f, 3.948f, 12.052f, 3.5f, 11.5f, 3.5f)
                close()
                moveTo(9f, 4.5f)
                curveTo(9f, 3.119f, 10.119f, 2f, 11.5f, 2f)
                curveTo(12.881f, 2f, 14f, 3.119f, 14f, 4.5f)
                verticalLineTo(8.439f)
                lineTo(16.983f, 8.908f)
                curveTo(19.737f, 9.341f, 21.528f, 12.042f, 20.855f, 14.747f)
                lineTo(19.702f, 19.38f)
                curveTo(19.434f, 20.456f, 18.548f, 21.265f, 17.452f, 21.434f)
                lineTo(13.997f, 21.967f)
                curveTo(12.554f, 22.189f, 11.351f, 21.242f, 10.824f, 20.085f)
                curveTo(10.089f, 18.468f, 8.297f, 16.251f, 2.635f, 13.795f)
                curveTo(2.088f, 13.558f, 1.822f, 12.89f, 2.123f, 12.332f)
                curveTo(3.158f, 10.406f, 5.464f, 9.551f, 7.505f, 10.336f)
                lineTo(9f, 10.91f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()

        return _HandPoint!!
    }

@Suppress("ObjectPropertyName")
private var _HandPoint: ImageVector? = null

@Preview
@Composable
private fun HandPointPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HandPoint, contentDescription = null)
    }
}
