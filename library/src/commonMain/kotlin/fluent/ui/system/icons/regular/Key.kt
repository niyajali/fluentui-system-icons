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

public val FluentIcons.Regular.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Regular.Key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.249f, 7f)
                curveTo(18.249f, 7.69f, 17.69f, 8.25f, 16.999f, 8.25f)
                curveTo(16.309f, 8.25f, 15.749f, 7.69f, 15.749f, 7f)
                curveTo(15.749f, 6.309f, 16.309f, 5.75f, 16.999f, 5.75f)
                curveTo(17.69f, 5.75f, 18.249f, 6.309f, 18.249f, 7f)
                close()
                moveTo(15.499f, 2.05f)
                curveTo(11.885f, 2.05f, 8.949f, 4.986f, 8.949f, 8.6f)
                curveTo(8.949f, 8.987f, 8.999f, 9.36f, 9.06f, 9.704f)
                curveTo(9.077f, 9.805f, 9.045f, 9.893f, 8.99f, 9.948f)
                lineTo(2.755f, 16.184f)
                curveTo(2.239f, 16.699f, 1.949f, 17.399f, 1.949f, 18.128f)
                verticalLineTo(20.3f)
                curveTo(1.949f, 21.266f, 2.733f, 22.05f, 3.699f, 22.05f)
                horizontalLineTo(6.199f)
                curveTo(7.166f, 22.05f, 7.949f, 21.266f, 7.949f, 20.3f)
                verticalLineTo(19.05f)
                horizontalLineTo(9.699f)
                curveTo(10.39f, 19.05f, 10.949f, 18.49f, 10.949f, 17.8f)
                verticalLineTo(16.05f)
                horizontalLineTo(12.699f)
                curveTo(13.374f, 16.05f, 13.924f, 15.515f, 13.948f, 14.846f)
                curveTo(14.445f, 14.974f, 14.969f, 15.05f, 15.499f, 15.05f)
                curveTo(19.113f, 15.05f, 22.049f, 12.114f, 22.049f, 8.5f)
                curveTo(22.049f, 4.869f, 19.096f, 2.05f, 15.499f, 2.05f)
                close()
                moveTo(10.449f, 8.6f)
                curveTo(10.449f, 5.814f, 12.713f, 3.55f, 15.499f, 3.55f)
                curveTo(18.302f, 3.55f, 20.549f, 5.731f, 20.549f, 8.5f)
                curveTo(20.549f, 11.286f, 18.285f, 13.55f, 15.499f, 13.55f)
                curveTo(14.82f, 13.55f, 14.121f, 13.379f, 13.495f, 13.11f)
                curveTo(13.263f, 13.011f, 12.997f, 13.035f, 12.786f, 13.174f)
                curveTo(12.576f, 13.313f, 12.449f, 13.548f, 12.449f, 13.8f)
                verticalLineTo(14.55f)
                horizontalLineTo(10.699f)
                curveTo(10.009f, 14.55f, 9.449f, 15.109f, 9.449f, 15.8f)
                verticalLineTo(17.55f)
                horizontalLineTo(7.699f)
                curveTo(7.009f, 17.55f, 6.449f, 18.109f, 6.449f, 18.8f)
                verticalLineTo(20.3f)
                curveTo(6.449f, 20.438f, 6.337f, 20.55f, 6.199f, 20.55f)
                horizontalLineTo(3.699f)
                curveTo(3.561f, 20.55f, 3.449f, 20.438f, 3.449f, 20.3f)
                verticalLineTo(18.128f)
                curveTo(3.449f, 17.797f, 3.581f, 17.479f, 3.815f, 17.244f)
                lineTo(10.051f, 11.009f)
                curveTo(10.469f, 10.59f, 10.635f, 10.002f, 10.537f, 9.445f)
                curveTo(10.483f, 9.139f, 10.449f, 8.862f, 10.449f, 8.6f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null

@Preview
@Composable
private fun KeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Key, contentDescription = null)
    }
}
